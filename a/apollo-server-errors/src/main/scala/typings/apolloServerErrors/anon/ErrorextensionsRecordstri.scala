package typings.apolloServerErrors.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  extensions ? :std.Record<string, any>} */
trait ErrorextensionsRecordstri extends js.Object {
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
}

object ErrorextensionsRecordstri {
  @scala.inline
  def apply(message: String, name: String, extensions: Record[String, _] = null, stack: String = null): ErrorextensionsRecordstri = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorextensionsRecordstri]
  }
}

