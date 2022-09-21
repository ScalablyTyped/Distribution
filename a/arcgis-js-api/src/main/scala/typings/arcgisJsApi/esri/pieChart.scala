package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for generating a pie chart for every feature.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html)
  */
trait pieChart extends StObject {
  
  /**
    * Generates a [PieChartRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html) based on a set of numeric fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
    */
  def createRenderer(params: pieChartCreateRendererParams): js.Promise[pieChartRendererResult]
}
object pieChart {
  
  inline def apply(createRenderer: pieChartCreateRendererParams => js.Promise[pieChartRendererResult]): pieChart = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[pieChart]
  }
  
  extension [Self <: pieChart](x: Self) {
    
    inline def setCreateRenderer(value: pieChartCreateRendererParams => js.Promise[pieChartRendererResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
