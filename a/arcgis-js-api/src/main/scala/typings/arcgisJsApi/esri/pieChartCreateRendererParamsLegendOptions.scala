package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pieChartCreateRendererParamsLegendOptions extends StObject {
  
  /**
    * The title used to describe the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
    */
  var title: js.UndefOr[String] = js.undefined
}
object pieChartCreateRendererParamsLegendOptions {
  
  inline def apply(): pieChartCreateRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pieChartCreateRendererParamsLegendOptions]
  }
  
  extension [Self <: pieChartCreateRendererParamsLegendOptions](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
