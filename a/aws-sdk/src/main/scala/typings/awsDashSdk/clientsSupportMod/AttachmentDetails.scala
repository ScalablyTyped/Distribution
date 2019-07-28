package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentDetails extends js.Object {
  /**
    * The ID of the attachment.
    */
  var attachmentId: js.UndefOr[AttachmentId] = js.undefined
  /**
    * The file name of the attachment.
    */
  var fileName: js.UndefOr[FileName] = js.undefined
}

object AttachmentDetails {
  @scala.inline
  def apply(attachmentId: AttachmentId = null, fileName: FileName = null): AttachmentDetails = {
    val __obj = js.Dynamic.literal()
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    __obj.asInstanceOf[AttachmentDetails]
  }
}

