package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMessageReceived extends Event {
  var endpoint: js.UndefOr[Endpoint] = js.undefined
  /* Properties */
  var message: TextMessage
}

object TextMessageReceived {
  @scala.inline
  def apply(
    application: String,
    message: TextMessage,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null,
    endpoint: Endpoint = null
  ): TextMessageReceived = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMessageReceived]
  }
}

