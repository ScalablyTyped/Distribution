package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var clientId: java.lang.String
  var connectionId: java.lang.String
  var data: js.Any
  var encoding: java.lang.String
  var extras: js.Any
  var id: java.lang.String
  var name: java.lang.String
  var timestamp: scala.Double
}

object Message {
  @scala.inline
  def apply(
    clientId: java.lang.String,
    connectionId: java.lang.String,
    data: js.Any,
    encoding: java.lang.String,
    extras: js.Any,
    id: java.lang.String,
    name: java.lang.String,
    timestamp: scala.Double
  ): Message = {
    val __obj = js.Dynamic.literal(clientId = clientId, connectionId = connectionId, data = data, encoding = encoding, extras = extras, id = id, name = name, timestamp = timestamp)
  
    __obj.asInstanceOf[Message]
  }
}

