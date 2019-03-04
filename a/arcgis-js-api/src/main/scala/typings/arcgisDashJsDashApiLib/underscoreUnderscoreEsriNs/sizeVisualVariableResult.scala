package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sizeVisualVariableResult
  extends stdLib.Object {
  /**
    * Authoring information related to the creation of the visual variable. This includes information related to UI inputs from sliders and selected themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var authoringInfo: AuthoringInfo
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var basemapId: java.lang.String
  /**
    * Indicates whether default values were used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var defaultValuesUsed: scala.Boolean
  /**
    * The size scheme used by the main visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var sizeScheme: SizeScheme
  /**
    * Basic statistics returned from a query to the service for the given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var statistics: SummaryStatisticsResult
  /**
    * An array of size visual variables configured based on the statistics of the data and the view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#VisualVariableResult)
    */
  var visualVariables: js.Array[SizeVariable]
}

object sizeVisualVariableResult {
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfo,
    basemapId: java.lang.String,
    constructor: js.Function,
    defaultValuesUsed: scala.Boolean,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    sizeScheme: SizeScheme,
    statistics: SummaryStatisticsResult,
    visualVariables: js.Array[SizeVariable]
  ): sizeVisualVariableResult = {
    val __obj = js.Dynamic.literal(authoringInfo = authoringInfo, basemapId = basemapId, constructor = constructor, defaultValuesUsed = defaultValuesUsed, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, sizeScheme = sizeScheme, statistics = statistics, visualVariables = visualVariables)
  
    __obj.asInstanceOf[sizeVisualVariableResult]
  }
}

