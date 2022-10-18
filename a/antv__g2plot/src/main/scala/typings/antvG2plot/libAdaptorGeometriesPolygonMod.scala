package typings.antvG2plot

import typings.antvG2plot.libAdaptorGeometriesBaseMod.GeometryOptions
import typings.antvG2plot.libAdaptorGeometriesBaseMod.MappingOptions
import typings.antvG2plot.libCoreAdaptorMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorGeometriesPolygonMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/geometries/polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def polygon[O /* <: PolygonGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  trait PolygonGeometryOptions
    extends StObject
       with GeometryOptions {
    
    /** point 图形映射规则 */
    val polygon: js.UndefOr[MappingOptions] = js.undefined
    
    /** 分组字段 */
    val seriesField: js.UndefOr[String] = js.undefined
  }
  object PolygonGeometryOptions {
    
    inline def apply(): PolygonGeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolygonGeometryOptions]
    }
    
    extension [Self <: PolygonGeometryOptions](x: Self) {
      
      inline def setPolygon(value: MappingOptions): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
    }
  }
}
