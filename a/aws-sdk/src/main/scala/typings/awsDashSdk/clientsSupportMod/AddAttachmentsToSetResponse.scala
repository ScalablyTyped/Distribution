package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAttachmentsToSetResponse extends js.Object {
  /**
    * The ID of the attachment set. If an attachmentSetId was not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId was specified, the attachments are added to the specified set, if it exists.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
  /**
    * The time and date when the attachment set expires.
    */
  var expiryTime: js.UndefOr[ExpiryTime] = js.undefined
}

object AddAttachmentsToSetResponse {
  @scala.inline
  def apply(attachmentSetId: AttachmentSetId = null, expiryTime: ExpiryTime = null): AddAttachmentsToSetResponse = {
    val __obj = js.Dynamic.literal()
    if (attachmentSetId != null) __obj.updateDynamic("attachmentSetId")(attachmentSetId)
    if (expiryTime != null) __obj.updateDynamic("expiryTime")(expiryTime)
    __obj.asInstanceOf[AddAttachmentsToSetResponse]
  }
}

