package typings.apolloServerErrors.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  extensions :std.Record<string, any>} */
@js.native
trait ErrorextensionsRecordstriExtensions extends js.Object {
  var extensions: Record[String, _] = js.native
  var message: String = js.native
  var name: String = js.native
  var stack: js.UndefOr[String] = js.native
}

object ErrorextensionsRecordstriExtensions {
  @scala.inline
  def apply(extensions: Record[String, _], message: String, name: String): ErrorextensionsRecordstriExtensions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorextensionsRecordstriExtensions]
  }
  @scala.inline
  implicit class ErrorextensionsRecordstriExtensionsOps[Self <: ErrorextensionsRecordstriExtensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtensions(value: Record[String, _]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

