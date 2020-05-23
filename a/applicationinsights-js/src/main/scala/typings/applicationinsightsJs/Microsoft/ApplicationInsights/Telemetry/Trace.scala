package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typings.applicationinsightsJs.AI.MessageData
import typings.applicationinsightsJs.AI.SeverityLevel
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typings.applicationinsightsJs.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trace
  extends MessageData
     with ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_Trace: Message
}

object Trace {
  @scala.inline
  def apply(
    aiDataContract: Message,
    message: String,
    properties: js.Any,
    severityLevel: SeverityLevel,
    ver: Double
  ): Trace = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], severityLevel = severityLevel.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trace]
  }
}

