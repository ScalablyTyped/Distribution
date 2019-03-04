package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgeRendererResult
  extends stdLib.Object {
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#AgeRendererResult)
    */
  var basemapId: java.lang.String
  /**
    * The color scheme used by the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#AgeRendererResult)
    */
  var colorScheme: ColorScheme
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#AgeRendererResult)
    */
  var defaultValuesUsed: scala.Boolean
  /**
    * The renderer object configured to best match the given basemap and the spread of the data. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#AgeRendererResult)
    */
  var renderer: ClassBreaksRenderer
  /**
    * Basic statistics returned from a query to the service for data from the given field name or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#AgeRendererResult)
    */
  var statistics: SummaryStatisticsResult
  /**
    * The time unit used to represent age in the output `renderer`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#AgeRendererResult)
    */
  var unit: java.lang.String
  /**
    * A color visual variable configured based on the statistics of the data and the given basemap and scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#AgeRendererResult)
    */
  var visualVariable: ColorVariable
}

object AgeRendererResult {
  @scala.inline
  def apply(
    basemapId: java.lang.String,
    colorScheme: ColorScheme,
    constructor: js.Function,
    defaultValuesUsed: scala.Boolean,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    renderer: ClassBreaksRenderer,
    statistics: SummaryStatisticsResult,
    unit: java.lang.String,
    visualVariable: ColorVariable
  ): AgeRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, colorScheme = colorScheme, constructor = constructor, defaultValuesUsed = defaultValuesUsed, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, renderer = renderer, statistics = statistics, unit = unit, visualVariable = visualVariable)
  
    __obj.asInstanceOf[AgeRendererResult]
  }
}

