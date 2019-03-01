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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("connectionId")(connectionId)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("extras")(extras)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[Message]
  }
}

