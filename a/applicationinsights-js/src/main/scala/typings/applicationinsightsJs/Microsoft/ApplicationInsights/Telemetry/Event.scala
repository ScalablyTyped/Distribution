package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typings.applicationinsightsJs.anon.Measurements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_Event: Measurements = js.native
  var measurements: js.Any = js.native
  var name: String = js.native
  var properties: js.Any = js.native
  var ver: Double = js.native
}

object Event {
  @scala.inline
  def apply(aiDataContract: Measurements, measurements: js.Any, name: String, properties: js.Any, ver: Double): Event = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setAiDataContract(value: Measurements): Self = this.set("aiDataContract", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeasurements(value: js.Any): Self = this.set("measurements", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: Double): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

