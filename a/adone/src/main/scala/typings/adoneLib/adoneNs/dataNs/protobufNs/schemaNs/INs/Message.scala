package typings
package adoneLib.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var enums: js.Array[Enum]
  var `extends`: js.Array[Extend]
  var extensions: adoneLib.Anon_FromTo | scala.Null
  var fields: js.Array[Field]
  var messages: js.Array[Message]
  var name: java.lang.String
}

object Message {
  @scala.inline
  def apply(
    enums: js.Array[Enum],
    `extends`: js.Array[Extend],
    fields: js.Array[Field],
    messages: js.Array[Message],
    name: java.lang.String,
    extensions: adoneLib.Anon_FromTo = null
  ): Message = {
    val __obj = js.Dynamic.literal(enums = enums, fields = fields, messages = messages, name = name)
    __obj.updateDynamic("extends")(`extends`)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[Message]
  }
}

