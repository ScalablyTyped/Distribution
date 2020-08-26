package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextMessageReceived extends Event {
  /**
    * Endpoint.
    */
  var endpoint: js.UndefOr[Endpoint] = js.native
  /**
    * Message.
    */
  var message: TextMessage = js.native
}

object TextMessageReceived {
  @scala.inline
  def apply(application: String, message: TextMessage, timestamp: Date, `type`: String): TextMessageReceived = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMessageReceived]
  }
  @scala.inline
  implicit class TextMessageReceivedOps[Self <: TextMessageReceived] (val x: Self) extends AnyVal {
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
    def setMessage(value: TextMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpoint(value: Endpoint): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
  }
  
}

