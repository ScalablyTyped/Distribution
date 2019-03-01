package typings
package adoneLib.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var enums: js.Array[Enum]
  var `extends`: js.Array[Extend]
  var imports: js.Array[java.lang.String]
  var messages: js.Array[Message]
  var options: js.Object
   // ??
  var `package`: java.lang.String | scala.Null
  var services: js.UndefOr[js.Array[Service]] = js.undefined
  var syntax: js.Any
}

object Schema {
  @scala.inline
  def apply(
    enums: js.Array[Enum],
    `extends`: js.Array[Extend],
    imports: js.Array[java.lang.String],
    messages: js.Array[Message],
    options: js.Object,
    syntax: js.Any,
    `package`: java.lang.String = null,
    services: js.Array[Service] = null
  ): Schema = {
    val __obj = js.Dynamic.literal(`extends` = `extends`)
    __obj.updateDynamic("enums")(enums)
    __obj.updateDynamic("imports")(imports)
    __obj.updateDynamic("messages")(messages)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("syntax")(syntax)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[Schema]
  }
}

