package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualVariableResult
  extends stdLib.Object {
  /**
    * Authoring information related to the creation of the visual variable. This includes information related to UI inputs from sliders and selected themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#VisualVariableResult)
    */
  var authoringInfo: AuthoringInfo
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#VisualVariableResult)
    */
  var basemapId: java.lang.String
  /**
    * The color scheme used by the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#VisualVariableResult)
    */
  var colorScheme: ColorScheme
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#VisualVariableResult)
    */
  var defaultValuesUsed: scala.Boolean
  /**
    * Basic statistics returned from a query to the service for the given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#VisualVariableResult)
    */
  var statistics: SummaryStatisticsResult
  /**
    * A color visual variable configured based on the statistics of the data and the given basemap and scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#VisualVariableResult)
    */
  var visualVariable: ColorVariable
}

object VisualVariableResult {
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfo,
    basemapId: java.lang.String,
    colorScheme: ColorScheme,
    constructor: js.Function,
    defaultValuesUsed: scala.Boolean,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    statistics: SummaryStatisticsResult,
    visualVariable: ColorVariable
  ): VisualVariableResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authoringInfo")(authoringInfo)
    __obj.updateDynamic("basemapId")(basemapId)
    __obj.updateDynamic("colorScheme")(colorScheme)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("defaultValuesUsed")(defaultValuesUsed)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("statistics")(statistics)
    __obj.updateDynamic("visualVariable")(visualVariable)
    __obj.asInstanceOf[VisualVariableResult]
  }
}

