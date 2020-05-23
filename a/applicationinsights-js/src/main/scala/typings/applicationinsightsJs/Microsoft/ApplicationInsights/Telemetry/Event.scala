package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typings.applicationinsightsJs.anon.Measurements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_Event: Measurements
  var measurements: js.Any
  var name: String
  var properties: js.Any
  var ver: Double
}

object Event {
  @scala.inline
  def apply(aiDataContract: Measurements, measurements: js.Any, name: String, properties: js.Any, ver: Double): Event = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

