package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAttachmentsToSetRequest extends js.Object {
  /**
    * The ID of the attachment set. If an attachmentSetId is not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId is specified, the attachments are added to the specified set, if it exists.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
  /**
    * One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB per attachment.
    */
  var attachments: Attachments
}

object AddAttachmentsToSetRequest {
  @scala.inline
  def apply(attachments: Attachments, attachmentSetId: AttachmentSetId = null): AddAttachmentsToSetRequest = {
    val __obj = js.Dynamic.literal(attachments = attachments)
    if (attachmentSetId != null) __obj.updateDynamic("attachmentSetId")(attachmentSetId)
    __obj.asInstanceOf[AddAttachmentsToSetRequest]
  }
}

