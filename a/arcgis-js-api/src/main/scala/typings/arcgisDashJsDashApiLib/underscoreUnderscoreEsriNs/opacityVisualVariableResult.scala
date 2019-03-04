package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait opacityVisualVariableResult
  extends stdLib.Object {
  /**
    * Authoring information related to the creation of the visual variable. This includes information related to UI inputs from sliders and selected themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#VisualVariableResult)
    */
  var authoringInfo: AuthoringInfo
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#VisualVariableResult)
    */
  var defaultValuesUsed: scala.Boolean
  /**
    * Basic statistics returned from a query to the service for the given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#VisualVariableResult)
    */
  var statistics: SummaryStatisticsResult
  /**
    * An opacity visual variable configured based on the statistics of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-opacity.html#VisualVariableResult)
    */
  var visualVariable: OpacityVariable
}

object opacityVisualVariableResult {
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfo,
    constructor: js.Function,
    defaultValuesUsed: scala.Boolean,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    statistics: SummaryStatisticsResult,
    visualVariable: OpacityVariable
  ): opacityVisualVariableResult = {
    val __obj = js.Dynamic.literal(authoringInfo = authoringInfo, constructor = constructor, defaultValuesUsed = defaultValuesUsed, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, statistics = statistics, visualVariable = visualVariable)
  
    __obj.asInstanceOf[opacityVisualVariableResult]
  }
}

