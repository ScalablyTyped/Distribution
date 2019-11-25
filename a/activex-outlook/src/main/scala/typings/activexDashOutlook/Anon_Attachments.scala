package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.AttachmentSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachments extends js.Object {
  val Attachments: AttachmentSelection
  val CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
}

object Anon_Attachments {
  @scala.inline
  def apply(
    Attachments: AttachmentSelection,
    CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  ): Anon_Attachments = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], CommandBar = CommandBar.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Attachments]
  }
}

