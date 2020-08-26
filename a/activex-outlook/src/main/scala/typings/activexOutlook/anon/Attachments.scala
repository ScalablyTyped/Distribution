package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.AttachmentSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachments extends js.Object {
  val Attachments: AttachmentSelection = js.native
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any = js.native
}

object Attachments {
  @scala.inline
  def apply(
    Attachments: AttachmentSelection,
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  ): Attachments = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], CommandBar = CommandBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachments]
  }
  @scala.inline
  implicit class AttachmentsOps[Self <: Attachments] (val x: Self) extends AnyVal {
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
    def setAttachments(value: AttachmentSelection): Self = this.set("Attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
    ): Self = this.set("CommandBar", value.asInstanceOf[js.Any])
  }
  
}

