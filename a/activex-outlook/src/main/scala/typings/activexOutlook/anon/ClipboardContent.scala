package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipboardContent extends js.Object {
  var Cancel: Boolean = js.native
  val ClipboardContent: js.Any = js.native
  val Target: typings.activexOutlook.Outlook.Folder = js.native
}

object ClipboardContent {
  @scala.inline
  def apply(Cancel: Boolean, ClipboardContent: js.Any, Target: typings.activexOutlook.Outlook.Folder): ClipboardContent = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ClipboardContent = ClipboardContent.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardContent]
  }
  @scala.inline
  implicit class ClipboardContentOps[Self <: ClipboardContent] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setClipboardContent(value: js.Any): Self = this.set("ClipboardContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: typings.activexOutlook.Outlook.Folder): Self = this.set("Target", value.asInstanceOf[js.Any])
  }
  
}

