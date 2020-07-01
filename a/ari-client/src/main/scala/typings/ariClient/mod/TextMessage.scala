package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMessage extends js.Object {
  /**
    * The text of the message.
    */
  var body: String
  /**
    * A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection
    * being used to send the message.
    */
  var from: String
  /**
    * A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint.
    */
  var to: String
  /**
    * Technology specific key/value pairs (JSON object) associated with the message.
    */
  var variables: js.UndefOr[IndexableObject] = js.undefined
}

object TextMessage {
  @scala.inline
  def apply(body: String, from: String, to: String, variables: IndexableObject = null): TextMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMessage]
  }
}

