package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sizeAgeRendererResult
  extends stdLib.Object {
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#AgeRendererResult)
    */
  var basemapId: java.lang.String
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#AgeRendererResult)
    */
  var defaultValuesUsed: scala.Boolean
  /**
    * The renderer object configured to best match the given basemap and the spread of the data. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#AgeRendererResult)
    */
  var renderer: ClassBreaksRenderer
  /**
    * The size scheme used by the visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#AgeRendererResult)
    */
  var sizeScheme: SizeScheme
  /**
    * Basic statistics returned from a query for the generated expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#AgeRendererResult)
    */
  var statistics: SummaryStatisticsResult
  /**
    * The time unit used to represent age in the output `renderer`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#AgeRendererResult)
    */
  var unit: java.lang.String
  /**
    * Size visual variables configured based on the statistics of the data and the given basemap and scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#AgeRendererResult)
    */
  var visualVariables: js.Array[SizeVariable]
}

object sizeAgeRendererResult {
  @scala.inline
  def apply(
    basemapId: java.lang.String,
    constructor: js.Function,
    defaultValuesUsed: scala.Boolean,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    renderer: ClassBreaksRenderer,
    sizeScheme: SizeScheme,
    statistics: SummaryStatisticsResult,
    unit: java.lang.String,
    visualVariables: js.Array[SizeVariable]
  ): sizeAgeRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, defaultValuesUsed = defaultValuesUsed, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer, sizeScheme = sizeScheme, statistics = statistics, unit = unit, visualVariables = visualVariables)
  
    __obj.asInstanceOf[sizeAgeRendererResult]
  }
}

