package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sizeContinuousRendererResult extends Object {
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ContinuousRendererResult)
    */
  var basemapId: String
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ContinuousRendererResult)
    */
  var defaultValuesUsed: Boolean
  /**
    * The renderer object configured to best match the given basemap and the spread of the data. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ContinuousRendererResult)
    */
  var renderer: ClassBreaksRenderer
  /**
    * The size scheme used by the visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ContinuousRendererResult)
    */
  var sizeScheme: SizeScheme
  /**
    * Basic statistics returned from a query to the service for data from the given field name or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ContinuousRendererResult)
    */
  var statistics: SummaryStatisticsResult
  /**
    * Size visual variables configured based on the statistics of the data and the given basemap and scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ContinuousRendererResult)
    */
  var visualVariables: js.Array[SizeVariable]
}

object sizeContinuousRendererResult {
  @scala.inline
  def apply(
    basemapId: String,
    constructor: js.Function,
    defaultValuesUsed: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: ClassBreaksRenderer,
    sizeScheme: SizeScheme,
    statistics: SummaryStatisticsResult,
    visualVariables: js.Array[SizeVariable]
  ): sizeContinuousRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, defaultValuesUsed = defaultValuesUsed, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer, sizeScheme = sizeScheme, statistics = statistics, visualVariables = visualVariables)
  
    __obj.asInstanceOf[sizeContinuousRendererResult]
  }
}

