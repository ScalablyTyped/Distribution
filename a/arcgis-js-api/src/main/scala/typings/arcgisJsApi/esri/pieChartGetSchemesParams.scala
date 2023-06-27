package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dark
import typings.arcgisJsApi.arcgisJsApiStrings.light
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pieChartGetSchemesParams extends StObject {
  
  /**
  		 * The Esri basemap to pair with the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#getSchemes)
  		 */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  
  /**
  		 * If you have a non-Esri basemap (e.g.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#getSchemes)
  		 */
  var basemapTheme: js.UndefOr[light | dark] = js.undefined
  
  /**
  		 * The geometry type of the features to visualize.
  		 *
  		 * [Read more...](global.html#geometryType)
  		 */
  var geometryType: point | polygon
  
  /**
  		 * The number of unique values to include in the pie chart visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-pieChart.html#getSchemes)
  		 */
  var numColors: Double
}
object pieChartGetSchemesParams {
  
  inline def apply(geometryType: point | polygon, numColors: Double): pieChartGetSchemesParams = {
    val __obj = js.Dynamic.literal(geometryType = geometryType.asInstanceOf[js.Any], numColors = numColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[pieChartGetSchemesParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: pieChartGetSchemesParams] (val x: Self) extends AnyVal {
    
    inline def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: light | dark): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setBasemapThemeUndefined: Self = StObject.set(x, "basemapTheme", js.undefined)
    
    inline def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    inline def setGeometryType(value: point | polygon): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setNumColors(value: Double): Self = StObject.set(x, "numColors", value.asInstanceOf[js.Any])
  }
}
