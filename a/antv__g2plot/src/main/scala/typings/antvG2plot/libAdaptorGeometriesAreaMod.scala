package typings.antvG2plot

import typings.antvG2plot.libAdaptorGeometriesBaseMod.GeometryOptions
import typings.antvG2plot.libAdaptorGeometriesBaseMod.MappingOptions
import typings.antvG2plot.libCoreAdaptorMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorGeometriesAreaMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/geometries/area", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def area[O /* <: AreaGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  trait AreaGeometryOptions
    extends StObject
       with GeometryOptions {
    
    /** area 图形的样式设置 */
    val area: js.UndefOr[MappingOptions] = js.undefined
    
    /** 分组字段 */
    val seriesField: js.UndefOr[String] = js.undefined
    
    /** 是否平滑 */
    val smooth: js.UndefOr[Boolean] = js.undefined
  }
  object AreaGeometryOptions {
    
    inline def apply(): AreaGeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AreaGeometryOptions]
    }
    
    extension [Self <: AreaGeometryOptions](x: Self) {
      
      inline def setArea(value: MappingOptions): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    }
  }
}
