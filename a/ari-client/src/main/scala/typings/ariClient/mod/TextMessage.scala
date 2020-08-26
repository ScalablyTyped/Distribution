package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextMessage extends js.Object {
  /**
    * The text of the message.
    */
  var body: String = js.native
  /**
    * A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection
    * being used to send the message.
    */
  var from: String = js.native
  /**
    * A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint.
    */
  var to: String = js.native
  /**
    * Technology specific key/value pairs (JSON object) associated with the message.
    */
  var variables: js.UndefOr[IndexableObject] = js.native
}

object TextMessage {
  @scala.inline
  def apply(body: String, from: String, to: String): TextMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMessage]
  }
  @scala.inline
  implicit class TextMessageOps[Self <: TextMessage] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: IndexableObject): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

