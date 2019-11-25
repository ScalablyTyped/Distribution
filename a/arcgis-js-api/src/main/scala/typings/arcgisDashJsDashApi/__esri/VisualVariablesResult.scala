package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualVariablesResult extends Object {
  /**
    * Authoring information related to the creation of the visual variables. This includes inforamation related to UI inputs from sliders and selected themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var authoringInfo: AuthoringInfo
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var basemapId: String
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var basemapTheme: String
  /**
    * Object containing visual variable and scheme information for the color portion of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var color: VisualVariablesResultColor
  /**
    * Indicates whether default values were used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var defaultValuesUsed: Boolean
  /**
    * Object containing visual variable and scheme information for the size portion of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var size: VisualVariablesResultSize
  /**
    * Basic statistics returned from a query to the service for the given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var statistics: SummaryStatisticsResult
}

object VisualVariablesResult {
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfo,
    basemapId: String,
    basemapTheme: String,
    color: VisualVariablesResultColor,
    constructor: js.Function,
    defaultValuesUsed: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: VisualVariablesResultSize,
    statistics: SummaryStatisticsResult
  ): VisualVariablesResult = {
    val __obj = js.Dynamic.literal(authoringInfo = authoringInfo.asInstanceOf[js.Any], basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisualVariablesResult]
  }
}

