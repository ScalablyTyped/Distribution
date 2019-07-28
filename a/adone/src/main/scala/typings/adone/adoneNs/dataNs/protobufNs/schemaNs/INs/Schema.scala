package typings.adone.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var enums: js.Array[Enum]
  var `extends`: js.Array[Extend]
  var imports: js.Array[String]
  var messages: js.Array[Message]
  var options: js.Object
   // ??
  var `package`: String | Null
  var services: js.UndefOr[js.Array[Service]] = js.undefined
  var syntax: js.Any
}

object Schema {
  @scala.inline
  def apply(
    enums: js.Array[Enum],
    `extends`: js.Array[Extend],
    imports: js.Array[String],
    messages: js.Array[Message],
    options: js.Object,
    syntax: js.Any,
    `package`: String = null,
    services: js.Array[Service] = null
  ): Schema = {
    val __obj = js.Dynamic.literal(enums = enums, imports = imports, messages = messages, options = options, syntax = syntax)
    __obj.updateDynamic("extends")(`extends`)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[Schema]
  }
}

