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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("connectionId")(connectionId)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[PresenceMessage]
  }
}

