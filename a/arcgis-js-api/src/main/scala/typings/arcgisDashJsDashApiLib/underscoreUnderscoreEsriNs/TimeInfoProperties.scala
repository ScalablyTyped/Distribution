package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeInfoProperties extends js.Object {
  /**
    * The name of the field containing the end time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField)
    */
  var endField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the field containing the start time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField)
    */
  var startField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time extent defines the start time and end time for all data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#timeExtent)
    *
    * @default null
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
}

object TimeInfoProperties {
  @scala.inline
  def apply(
    endField: java.lang.String = null,
    startField: java.lang.String = null,
    timeExtent: TimeExtentProperties = null
  ): TimeInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (endField != null) __obj.updateDynamic("endField")(endField)
    if (startField != null) __obj.updateDynamic("startField")(startField)
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent)
    __obj.asInstanceOf[TimeInfoProperties]
  }
}

