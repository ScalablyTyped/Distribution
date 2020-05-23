package typings.applicationinsightsJs.AI

import typings.applicationinsightsJs.Microsoft.Telemetry.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends Domain {
  var measurements: js.Any
  var name: String
  var properties: js.Any
  var ver: Double
}

object EventData {
  @scala.inline
  def apply(measurements: js.Any, name: String, properties: js.Any, ver: Double): EventData = {
    val __obj = js.Dynamic.literal(measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}

