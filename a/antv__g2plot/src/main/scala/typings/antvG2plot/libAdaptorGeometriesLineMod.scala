package typings.antvG2plot

import typings.antvG2plot.libAdaptorGeometriesBaseMod.GeometryOptions
import typings.antvG2plot.libAdaptorGeometriesBaseMod.MappingOptions
import typings.antvG2plot.libCoreAdaptorMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorGeometriesLineMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/geometries/line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def line[O /* <: LineGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  trait LineGeometryOptions
    extends StObject
       with GeometryOptions {
    
    /** 是否连接空数据 */
    val connectNulls: js.UndefOr[Boolean] = js.undefined
    
    /** line 映射配置 */
    val line: js.UndefOr[MappingOptions] = js.undefined
    
    /** 分组字段 */
    val seriesField: js.UndefOr[String] = js.undefined
    
    /** 是否平滑 */
    val smooth: js.UndefOr[Boolean] = js.undefined
    
    /** 阶梯折线图类型 */
    val stepType: js.UndefOr[String] = js.undefined
  }
  object LineGeometryOptions {
    
    inline def apply(): LineGeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineGeometryOptions]
    }
    
    extension [Self <: LineGeometryOptions](x: Self) {
      
      inline def setConnectNulls(value: Boolean): Self = StObject.set(x, "connectNulls", value.asInstanceOf[js.Any])
      
      inline def setConnectNullsUndefined: Self = StObject.set(x, "connectNulls", js.undefined)
      
      inline def setLine(value: MappingOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      inline def setStepType(value: String): Self = StObject.set(x, "stepType", value.asInstanceOf[js.Any])
      
      inline def setStepTypeUndefined: Self = StObject.set(x, "stepType", js.undefined)
    }
  }
}
