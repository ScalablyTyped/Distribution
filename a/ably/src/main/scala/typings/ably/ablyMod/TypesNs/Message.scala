package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var clientId: String
  var connectionId: String
  var data: js.Any
  var encoding: String
  var extras: js.Any
  var id: String
  var name: String
  var timestamp: Double
}

object Message {
  @scala.inline
  def apply(
    clientId: String,
    connectionId: String,
    data: js.Any,
    encoding: String,
    extras: js.Any,
    id: String,
    name: String,
    timestamp: Double
  ): Message = {
    val __obj = js.Dynamic.literal(clientId = clientId, connectionId = connectionId, data = data, encoding = encoding, extras = extras, id = id, name = name, timestamp = timestamp)
  
    __obj.asInstanceOf[Message]
  }
}

