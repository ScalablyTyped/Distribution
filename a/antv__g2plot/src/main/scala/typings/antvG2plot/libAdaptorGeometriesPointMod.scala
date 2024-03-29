package typings.antvG2plot

import typings.antvG2plot.libAdaptorGeometriesBaseMod.GeometryOptions
import typings.antvG2plot.libAdaptorGeometriesBaseMod.MappingOptions
import typings.antvG2plot.libCoreAdaptorMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorGeometriesPointMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/geometries/point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def point[O /* <: PointGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("point")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  trait PointGeometryOptions
    extends StObject
       with GeometryOptions {
    
    /** point 图形映射规则 */
    val point: js.UndefOr[MappingOptions] = js.undefined
    
    /** 分组字段 */
    val seriesField: js.UndefOr[String] = js.undefined
  }
  object PointGeometryOptions {
    
    inline def apply(): PointGeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointGeometryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointGeometryOptions] (val x: Self) extends AnyVal {
      
      inline def setPoint(value: MappingOptions): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
    }
  }
}
