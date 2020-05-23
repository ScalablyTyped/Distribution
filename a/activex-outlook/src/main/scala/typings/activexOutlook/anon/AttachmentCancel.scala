package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentCancel extends js.Object {
  val Attachment: typings.activexOutlook.Outlook.Attachment
  var Cancel: Boolean
}

object AttachmentCancel {
  @scala.inline
  def apply(Attachment: typings.activexOutlook.Outlook.Attachment, Cancel: Boolean): AttachmentCancel = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCancel]
  }
}

