package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait sizeContinuousRendererResult extends StObject {
  
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var basemapId: String
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var basemapTheme: String
  
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var defaultValuesUsed: Boolean
  
  /**
    * The renderer object configured to best match the background of the view and the spread of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var renderer: ClassBreaksRenderer
  
  /**
    * The size scheme used by the visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var sizeScheme: SizeScheme
  
  /**
    * Basic statistics returned from a query to the service for data from the given field name or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var statistics: SummaryStatisticsResult
  
  /**
    * Size visual variables configured based on the statistics of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var visualVariables: js.Array[SizeVariable]
}
object sizeContinuousRendererResult {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    defaultValuesUsed: Boolean,
    renderer: ClassBreaksRenderer,
    sizeScheme: SizeScheme,
    statistics: SummaryStatisticsResult,
    visualVariables: js.Array[SizeVariable]
  ): sizeContinuousRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], sizeScheme = sizeScheme.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], visualVariables = visualVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeContinuousRendererResult]
  }
  
  extension [Self <: sizeContinuousRendererResult](x: Self) {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuesUsed(value: Boolean): Self = StObject.set(x, "defaultValuesUsed", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: ClassBreaksRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setSizeScheme(value: SizeScheme): Self = StObject.set(x, "sizeScheme", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setVisualVariables(value: js.Array[SizeVariable]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    inline def setVisualVariablesVarargs(value: SizeVariable*): Self = StObject.set(x, "visualVariables", js.Array(value*))
  }
}
