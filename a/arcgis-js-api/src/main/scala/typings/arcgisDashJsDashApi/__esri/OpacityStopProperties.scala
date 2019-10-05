package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacityStopProperties extends js.Object {
  /**
    * A string value used to label the stop in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-OpacityStop.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The opacity value (between `0.0` and `1.0`) used to render features with the given [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-OpacityStop.html#value).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-OpacityStop.html#opacity)
    */
  var opacity: js.UndefOr[Double | js.Array[Double] | String] = js.undefined
  /**
    * Specifies the data value to map to the given [opacity value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-OpacityStop.html#opacity).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-OpacityStop.html#value)
    */
  var value: js.UndefOr[Double] = js.undefined
}

object OpacityStopProperties {
  @scala.inline
  def apply(
    label: String = null,
    opacity: Double | js.Array[Double] | String = null,
    value: Int | Double = null
  ): OpacityStopProperties = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityStopProperties]
  }
}

