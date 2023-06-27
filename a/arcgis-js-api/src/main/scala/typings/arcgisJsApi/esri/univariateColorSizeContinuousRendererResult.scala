package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeContinuousRendererResult extends StObject {
  
  /**
  		 * The ID of the basemap used to determine the optimal fill color of the features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult)
  		 */
  var basemapId: String
  
  /**
  		 * Indicates whether the average color of the input view's basemap is `light` or `dark`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult)
  		 */
  var basemapTheme: String
  
  /**
  		 * Object containing visual variable and scheme information for the color portion of the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult)
  		 */
  var color: ContinuousRendererResultColor
  
  /**
  		 * Indicates whether default values were used in the absence of sufficient data and/or statistics from the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult)
  		 */
  var defaultValuesUsed: Boolean
  
  /**
  		 * The renderer object configured to best match the view's background and the spread of the data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult)
  		 */
  var renderer: ClassBreaksRenderer
  
  /**
  		 * Object containing visual variable and scheme information for the size portion of the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult)
  		 */
  var size: ContinuousRendererResultSize
  
  /**
  		 * Basic statistics returned from a query to the service for the given field or expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult)
  		 */
  var statistics: SummaryStatisticsResult
}
object univariateColorSizeContinuousRendererResult {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    color: ContinuousRendererResultColor,
    defaultValuesUsed: Boolean,
    renderer: ClassBreaksRenderer,
    size: ContinuousRendererResultSize,
    statistics: SummaryStatisticsResult
  ): univariateColorSizeContinuousRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[univariateColorSizeContinuousRendererResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: univariateColorSizeContinuousRendererResult] (val x: Self) extends AnyVal {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setColor(value: ContinuousRendererResultColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuesUsed(value: Boolean): Self = StObject.set(x, "defaultValuesUsed", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: ClassBreaksRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setSize(value: ContinuousRendererResultSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
  }
}
