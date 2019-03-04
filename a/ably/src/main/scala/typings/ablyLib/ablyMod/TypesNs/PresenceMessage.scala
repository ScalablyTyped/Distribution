package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresenceMessage extends js.Object {
  var action: PresenceAction
  var clientId: java.lang.String
  var connectionId: java.lang.String
  var data: js.Any
  var encoding: java.lang.String
  var id: java.lang.String
  var timestamp: scala.Double
}

object PresenceMessage {
  @scala.inline
  def apply(
    action: PresenceAction,
    clientId: java.lang.String,
    connectionId: java.lang.String,
    data: js.Any,
    encoding: java.lang.String,
    id: java.lang.String,
    timestamp: scala.Double
  ): PresenceMessage = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], clientId = clientId, connectionId = connectionId, data = data, encoding = encoding, id = id, timestamp = timestamp)
  
    __obj.asInstanceOf[PresenceMessage]
  }
}

