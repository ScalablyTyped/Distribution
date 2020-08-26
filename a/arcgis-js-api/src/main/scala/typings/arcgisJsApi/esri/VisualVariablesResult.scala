package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisualVariablesResult extends Object {
  /**
    * Authoring information related to the creation of the visual variables. This includes inforamation related to UI inputs from sliders and selected themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var authoringInfo: AuthoringInfo = js.native
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var basemapId: String = js.native
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var basemapTheme: String = js.native
  /**
    * Object containing visual variable and scheme information for the color portion of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var color: VisualVariablesResultColor = js.native
  /**
    * Indicates whether default values were used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var defaultValuesUsed: Boolean = js.native
  /**
    * Object containing visual variable and scheme information for the size portion of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var size: VisualVariablesResultSize = js.native
  /**
    * Basic statistics returned from a query to the service for the given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var statistics: SummaryStatisticsResult = js.native
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
  @scala.inline
  implicit class VisualVariablesResultOps[Self <: VisualVariablesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthoringInfo(value: AuthoringInfo): Self = this.set("authoringInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemapId(value: String): Self = this.set("basemapId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemapTheme(value: String): Self = this.set("basemapTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: VisualVariablesResultColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValuesUsed(value: Boolean): Self = this.set("defaultValuesUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: VisualVariablesResultSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatistics(value: SummaryStatisticsResult): Self = this.set("statistics", value.asInstanceOf[js.Any])
  }
  
}

