package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresenceMessage extends js.Object {
  var action: PresenceAction
  var clientId: String
  var connectionId: String
  var data: js.Any
  var encoding: String
  var id: String
  var timestamp: Double
}

object PresenceMessage {
  @scala.inline
  def apply(
    action: PresenceAction,
    clientId: String,
    connectionId: String,
    data: js.Any,
    encoding: String,
    id: String,
    timestamp: Double
  ): PresenceMessage = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], clientId = clientId, connectionId = connectionId, data = data, encoding = encoding, id = id, timestamp = timestamp)
  
    __obj.asInstanceOf[PresenceMessage]
  }
}

