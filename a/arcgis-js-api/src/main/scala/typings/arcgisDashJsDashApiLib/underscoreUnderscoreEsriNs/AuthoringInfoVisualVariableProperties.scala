package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthoringInfoVisualVariableProperties extends js.Object {
  /**
    * If an age or timeline renderer was generated, indicates the end time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#endTime)
    */
  var endTime: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Indicates the field name used for generating the data-driven visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#field)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates the value of the upper handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#maxSliderValue)
    */
  var maxSliderValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the value of the lower handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#minSliderValue)
    */
  var minSliderValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * If an age or timeline renderer was generated, indicates the start time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#startTime)
    */
  var startTime: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * If the UI offers the option to display values based on a ratio or percentage, this indicates which selection was made.  **Possible Values:** percent | percent-of-total | ratio
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#style)
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates the theme selected by the user when generating a renderer or visual variable with one of the Smart Mapping functions.  **Possible Values:** above-and-below | centered-on | extremes | high-to-low
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#theme)
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of visual variable generated.  **Possible Values:** color | size | opacity
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#type)
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If an age or timeline renderer was generated, indicates the time units used.  **Possible Values:** seconds | minutes | hours | days | months | years
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#units)
    */
  var units: js.UndefOr[java.lang.String] = js.undefined
}

object AuthoringInfoVisualVariableProperties {
  @scala.inline
  def apply(
    endTime: java.lang.String | scala.Double = null,
    field: java.lang.String = null,
    maxSliderValue: scala.Int | scala.Double = null,
    minSliderValue: scala.Int | scala.Double = null,
    startTime: java.lang.String | scala.Double = null,
    style: java.lang.String = null,
    theme: java.lang.String = null,
    `type`: java.lang.String = null,
    units: java.lang.String = null
  ): AuthoringInfoVisualVariableProperties = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field)
    if (maxSliderValue != null) __obj.updateDynamic("maxSliderValue")(maxSliderValue.asInstanceOf[js.Any])
    if (minSliderValue != null) __obj.updateDynamic("minSliderValue")(minSliderValue.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[AuthoringInfoVisualVariableProperties]
  }
}

