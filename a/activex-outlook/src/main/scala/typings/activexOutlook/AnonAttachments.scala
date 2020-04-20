package typings.activexOutlook

import typings.activexOutlook.Outlook.AttachmentSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachments extends js.Object {
  val Attachments: AttachmentSelection
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
}

object AnonAttachments {
  @scala.inline
  def apply(
    Attachments: AttachmentSelection,
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  ): AnonAttachments = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], CommandBar = CommandBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachments]
  }
}

