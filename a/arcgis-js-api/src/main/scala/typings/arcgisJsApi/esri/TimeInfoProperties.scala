package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeInfoProperties extends js.Object {
  /**
    * The name of the field containing the end time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField)
    */
  var endField: js.UndefOr[String] = js.undefined
  /**
    * The time extent defines the start time and end time for all data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent)
    *
    * @default null
    */
  var fullTimeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  /**
    * The time interval defines the granularity of the temporal data and allows you to visualize the data at specified intervals using the [time slider widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html). Usually temporal data is collected at regular intervals such as every hour or every day.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#interval)
    */
  var interval: js.UndefOr[TimeIntervalProperties] = js.undefined
  /**
    * The name of the field containing the start time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField)
    */
  var startField: js.UndefOr[String] = js.undefined
  /**
    * The name of the field used to join or group discrete locations. For example, for hurricane tracks, trackIdField can be the hurricane name field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#trackIdField)
    */
  var trackIdField: js.UndefOr[String] = js.undefined
}

object TimeInfoProperties {
  @scala.inline
  def apply(
    endField: String = null,
    fullTimeExtent: TimeExtentProperties = null,
    interval: TimeIntervalProperties = null,
    startField: String = null,
    trackIdField: String = null
  ): TimeInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (endField != null) __obj.updateDynamic("endField")(endField.asInstanceOf[js.Any])
    if (fullTimeExtent != null) __obj.updateDynamic("fullTimeExtent")(fullTimeExtent.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (startField != null) __obj.updateDynamic("startField")(startField.asInstanceOf[js.Any])
    if (trackIdField != null) __obj.updateDynamic("trackIdField")(trackIdField.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInfoProperties]
  }
}

