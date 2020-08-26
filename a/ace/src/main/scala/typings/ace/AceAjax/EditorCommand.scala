package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorCommand extends js.Object {
  var bindKey: js.Any = js.native
  var exec: js.Function = js.native
  var name: String = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
}

object EditorCommand {
  @scala.inline
  def apply(bindKey: js.Any, exec: js.Function, name: String): EditorCommand = {
    val __obj = js.Dynamic.literal(bindKey = bindKey.asInstanceOf[js.Any], exec = exec.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorCommand]
  }
  @scala.inline
  implicit class EditorCommandOps[Self <: EditorCommand] (val x: Self) extends AnyVal {
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
    def setBindKey(value: js.Any): Self = this.set("bindKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setExec(value: js.Function): Self = this.set("exec", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
  
}

