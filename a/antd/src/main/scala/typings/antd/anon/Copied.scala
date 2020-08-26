package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Copied extends js.Object {
  var copied: String = js.native
  var copy: String = js.native
  var edit: String = js.native
  var expand: String = js.native
}

object Copied {
  @scala.inline
  def apply(copied: String, copy: String, edit: String, expand: String): Copied = {
    val __obj = js.Dynamic.literal(copied = copied.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copied]
  }
  @scala.inline
  implicit class CopiedOps[Self <: Copied] (val x: Self) extends AnyVal {
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
    def setCopied(value: String): Self = this.set("copied", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopy(value: String): Self = this.set("copy", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdit(value: String): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpand(value: String): Self = this.set("expand", value.asInstanceOf[js.Any])
  }
  
}

