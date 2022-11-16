package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartRendererLegendOptions extends StObject {
  
  /**
    * Describes the data used by the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#legendOptions)
    */
  var title: js.UndefOr[String] = js.undefined
}
object PieChartRendererLegendOptions {
  
  inline def apply(): PieChartRendererLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartRendererLegendOptions]
  }
  
  extension [Self <: PieChartRendererLegendOptions](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
