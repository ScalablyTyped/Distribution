package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`above-and-below`
import typings.arcgisJsApi.arcgisJsApiStrings.`centered-on`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typings.arcgisJsApi.arcgisJsApiStrings.`percent-of-total`
import typings.arcgisJsApi.arcgisJsApiStrings.days
import typings.arcgisJsApi.arcgisJsApiStrings.extremes
import typings.arcgisJsApi.arcgisJsApiStrings.hours
import typings.arcgisJsApi.arcgisJsApiStrings.minutes
import typings.arcgisJsApi.arcgisJsApiStrings.months
import typings.arcgisJsApi.arcgisJsApiStrings.percent
import typings.arcgisJsApi.arcgisJsApiStrings.ratio
import typings.arcgisJsApi.arcgisJsApiStrings.seconds
import typings.arcgisJsApi.arcgisJsApiStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthoringInfoVisualVariableProperties extends js.Object {
  /**
    * If an age or timeline renderer was generated, indicates the end time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#endTime)
    */
  var endTime: js.UndefOr[String | Double] = js.undefined
  /**
    * Indicates the field name used for generating the data-driven visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * Indicates the value of the upper handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#maxSliderValue)
    */
  var maxSliderValue: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the value of the lower handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#minSliderValue)
    */
  var minSliderValue: js.UndefOr[Double] = js.undefined
  /**
    * If an age or timeline renderer was generated, indicates the start time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#startTime)
    */
  var startTime: js.UndefOr[String | Double] = js.undefined
  /**
    * If the UI offers the option to display values based on a ratio or percentage, this indicates which selection was made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#style)
    */
  var style: js.UndefOr[percent | `percent-of-total` | ratio] = js.undefined
  /**
    * Indicates the theme selected by the user when generating a renderer or visual variable with one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#theme)
    */
  var theme: js.UndefOr[`above-and-below` | `centered-on` | extremes | `high-to-low`] = js.undefined
  /**
    * The type of visual variable generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#type)
    */
  var `type`: js.UndefOr[
    typings.arcgisJsApi.arcgisJsApiStrings.color | typings.arcgisJsApi.arcgisJsApiStrings.size | typings.arcgisJsApi.arcgisJsApiStrings.opacity
  ] = js.undefined
  /**
    * If an age or timeline renderer was generated, indicates the time units used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#units)
    */
  var units: js.UndefOr[seconds | minutes | hours | days | months | years] = js.undefined
}

object AuthoringInfoVisualVariableProperties {
  @scala.inline
  def apply(
    endTime: String | Double = null,
    field: String = null,
    maxSliderValue: Int | Double = null,
    minSliderValue: Int | Double = null,
    startTime: String | Double = null,
    style: percent | `percent-of-total` | ratio = null,
    theme: `above-and-below` | `centered-on` | extremes | `high-to-low` = null,
    `type`: typings.arcgisJsApi.arcgisJsApiStrings.color | typings.arcgisJsApi.arcgisJsApiStrings.size | typings.arcgisJsApi.arcgisJsApiStrings.opacity = null,
    units: seconds | minutes | hours | days | months | years = null
  ): AuthoringInfoVisualVariableProperties = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (maxSliderValue != null) __obj.updateDynamic("maxSliderValue")(maxSliderValue.asInstanceOf[js.Any])
    if (minSliderValue != null) __obj.updateDynamic("minSliderValue")(minSliderValue.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthoringInfoVisualVariableProperties]
  }
}

