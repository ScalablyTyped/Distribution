package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.Attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachmentCancel extends js.Object {
  val Attachment: typings.activexDashOutlook.Outlook.Attachment
  var Cancel: Boolean
}

object Anon_AttachmentCancel {
  @scala.inline
  def apply(Attachment: Attachment, Cancel: Boolean): Anon_AttachmentCancel = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AttachmentCancel]
  }
}

