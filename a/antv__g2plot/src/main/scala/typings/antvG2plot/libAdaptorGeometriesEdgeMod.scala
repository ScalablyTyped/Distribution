package typings.antvG2plot

import typings.antvG2plot.libAdaptorGeometriesBaseMod.GeometryOptions
import typings.antvG2plot.libAdaptorGeometriesBaseMod.MappingOptions
import typings.antvG2plot.libCoreAdaptorMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorGeometriesEdgeMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/geometries/edge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def edge[O /* <: EdgeGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("edge")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  trait EdgeGeometryOptions
    extends StObject
       with GeometryOptions {
    
    /** edge 图形映射规则 */
    val edge: js.UndefOr[MappingOptions] = js.undefined
    
    /** 分组颜色字段 */
    val seriesField: js.UndefOr[String] = js.undefined
  }
  object EdgeGeometryOptions {
    
    inline def apply(): EdgeGeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EdgeGeometryOptions]
    }
    
    extension [Self <: EdgeGeometryOptions](x: Self) {
      
      inline def setEdge(value: MappingOptions): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
    }
  }
}
