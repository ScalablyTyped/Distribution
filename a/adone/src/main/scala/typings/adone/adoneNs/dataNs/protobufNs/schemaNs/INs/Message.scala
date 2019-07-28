package typings.adone.adoneNs.dataNs.protobufNs.schemaNs.INs

import typings.adone.Anon_FromTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var enums: js.Array[Enum]
  var `extends`: js.Array[Extend]
  var extensions: Anon_FromTo | Null
  var fields: js.Array[Field]
  var messages: js.Array[Message]
  var name: String
}

object Message {
  @scala.inline
  def apply(
    enums: js.Array[Enum],
    `extends`: js.Array[Extend],
    fields: js.Array[Field],
    messages: js.Array[Message],
    name: String,
    extensions: Anon_FromTo = null
  ): Message = {
    val __obj = js.Dynamic.literal(enums = enums, fields = fields, messages = messages, name = name)
    __obj.updateDynamic("extends")(`extends`)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[Message]
  }
}

