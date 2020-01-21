package typings.ably.mod.Types

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
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Message]
  }
}

