package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait opacityVisualVariableResult extends Object {
  /**
    * Authoring information related to the creation of the visual variable. This includes information related to UI inputs from sliders and selected themes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#VisualVariableResult)
    */
  var authoringInfo: AuthoringInfo = js.native
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#VisualVariableResult)
    */
  var defaultValuesUsed: Boolean = js.native
  /**
    * Basic statistics returned from a query to the service for the given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#VisualVariableResult)
    */
  var statistics: SummaryStatisticsResult = js.native
  /**
    * An opacity visual variable configured based on the statistics of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#VisualVariableResult)
    */
  var visualVariable: OpacityVariable = js.native
}

object opacityVisualVariableResult {
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfo,
    constructor: js.Function,
    defaultValuesUsed: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    statistics: SummaryStatisticsResult,
    visualVariable: OpacityVariable
  ): opacityVisualVariableResult = {
    val __obj = js.Dynamic.literal(authoringInfo = authoringInfo.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), statistics = statistics.asInstanceOf[js.Any], visualVariable = visualVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[opacityVisualVariableResult]
  }
  @scala.inline
  implicit class opacityVisualVariableResultOps[Self <: opacityVisualVariableResult] (val x: Self) extends AnyVal {
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
    def setDefaultValuesUsed(value: Boolean): Self = this.set("defaultValuesUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatistics(value: SummaryStatisticsResult): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualVariable(value: OpacityVariable): Self = this.set("visualVariable", value.asInstanceOf[js.Any])
  }
  
}

