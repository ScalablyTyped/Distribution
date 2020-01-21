package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeInfo
  extends Accessor
     with JSONSupport {
  /**
    * The name of the field containing the end time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField)
    */
  var endField: String = js.native
  /**
    * The time extent defines the start time and end time for all data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent)
    *
    * @default null
    */
  var fullTimeExtent: TimeExtent = js.native
  /**
    * The time interval defines the granularity of the temporal data and allows you to visualize the data at specified intervals using the [time slider widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html). Usually temporal data is collected at regular intervals such as every hour or every day.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#interval)
    */
  var interval: TimeInterval = js.native
  /**
    * The name of the field containing the start time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField)
    */
  var startField: String = js.native
}

@JSGlobal("__esri.TimeInfo")
@js.native
object TimeInfo extends TopLevel[TimeInfoConstructor]

