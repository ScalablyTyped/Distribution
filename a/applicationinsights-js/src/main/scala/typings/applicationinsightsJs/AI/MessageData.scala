package typings.applicationinsightsJs.AI

import typings.applicationinsightsJs.Microsoft.Telemetry.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageData extends Domain {
  var message: String = js.native
  var properties: js.Any = js.native
  var severityLevel: SeverityLevel = js.native
  var ver: Double = js.native
}

object MessageData {
  @scala.inline
  def apply(message: String, properties: js.Any, severityLevel: SeverityLevel, ver: Double): MessageData = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], severityLevel = severityLevel.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageData]
  }
  @scala.inline
  implicit class MessageDataOps[Self <: MessageData] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverityLevel(value: SeverityLevel): Self = this.set("severityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: Double): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

