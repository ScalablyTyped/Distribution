package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pieChartRendererResult
  extends StObject
     with Object {
  
  /**
    * The ID of the basemap used to determine the optimal color schemes for the charts.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#RendererResult)
    */
  var basemapId: String
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#RendererResult)
    */
  var basemapTheme: String
  
  /**
    * The color scheme used by the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#RendererResult)
    */
  var pieChartScheme: PieChartScheme
  
  /**
    * The generated pie chart renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#RendererResult)
    */
  var renderer: PieChartRenderer
  
  /**
    * A size visual variable representing the sum of all attributes included in the pie chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#RendererResult)
    */
  var size: js.UndefOr[sizeVisualVariableResult] = js.undefined
  
  /**
    * Contains the total counts of each attribute used in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#RendererResult)
    */
  var statistics: UniqueValuesResult
}
object pieChartRendererResult {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    pieChartScheme: PieChartScheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: PieChartRenderer,
    statistics: UniqueValuesResult
  ): pieChartRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), pieChartScheme = pieChartScheme.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[pieChartRendererResult]
  }
  
  extension [Self <: pieChartRendererResult](x: Self) {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setPieChartScheme(value: PieChartScheme): Self = StObject.set(x, "pieChartScheme", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: PieChartRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setSize(value: sizeVisualVariableResult): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStatistics(value: UniqueValuesResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
  }
}
