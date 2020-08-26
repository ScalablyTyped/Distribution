package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typings.applicationinsightsJs.AI.MessageData
import typings.applicationinsightsJs.AI.SeverityLevel
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typings.applicationinsightsJs.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trace
  extends MessageData
     with ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_Trace: Message = js.native
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
  @scala.inline
  implicit class TraceOps[Self <: Trace] (val x: Self) extends AnyVal {
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
    def setAiDataContract(value: Message): Self = this.set("aiDataContract", value.asInstanceOf[js.Any])
  }
  
}

