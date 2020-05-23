package typings.applicationinsightsJs.AI

import typings.applicationinsightsJs.Microsoft.Telemetry.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageData extends Domain {
  var message: String
  var properties: js.Any
  var severityLevel: SeverityLevel
  var ver: Double
}

object MessageData {
  @scala.inline
  def apply(message: String, properties: js.Any, severityLevel: SeverityLevel, ver: Double): MessageData = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], severityLevel = severityLevel.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageData]
  }
}

