package typings.antvG2plot

import typings.antvG2plot.libAdaptorGeometriesBaseMod.GeometryOptions
import typings.antvG2plot.libAdaptorGeometriesBaseMod.MappingOptions
import typings.antvG2plot.libCoreAdaptorMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorGeometriesViolinMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/geometries/violin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def violin[O /* <: ViolinGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("violin")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  trait ViolinGeometryOptions
    extends StObject
       with GeometryOptions {
    
    /** 分组字段 */
    val seriesField: js.UndefOr[String] = js.undefined
    
    /** violin 图形映射规则 */
    val violin: js.UndefOr[MappingOptions] = js.undefined
  }
  object ViolinGeometryOptions {
    
    inline def apply(): ViolinGeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViolinGeometryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViolinGeometryOptions] (val x: Self) extends AnyVal {
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
      
      inline def setViolin(value: MappingOptions): Self = StObject.set(x, "violin", value.asInstanceOf[js.Any])
      
      inline def setViolinUndefined: Self = StObject.set(x, "violin", js.undefined)
    }
  }
}
