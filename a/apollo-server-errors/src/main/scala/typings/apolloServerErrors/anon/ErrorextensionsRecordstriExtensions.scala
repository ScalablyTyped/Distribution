package typings.apolloServerErrors.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  extensions  :std.Record<string, any>} */
trait ErrorextensionsRecordstriExtensions extends js.Object {
  var extensions: Record[String, _]
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
}

object ErrorextensionsRecordstriExtensions {
  @scala.inline
  def apply(extensions: Record[String, _], message: String, name: String, stack: String = null): ErrorextensionsRecordstriExtensions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorextensionsRecordstriExtensions]
  }
}

