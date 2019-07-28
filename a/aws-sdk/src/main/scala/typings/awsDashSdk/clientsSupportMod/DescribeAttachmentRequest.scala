package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAttachmentRequest extends js.Object {
  /**
    * The ID of the attachment to return. Attachment IDs are returned by the DescribeCommunications operation.
    */
  var attachmentId: AttachmentId
}

object DescribeAttachmentRequest {
  @scala.inline
  def apply(attachmentId: AttachmentId): DescribeAttachmentRequest = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId)
  
    __obj.asInstanceOf[DescribeAttachmentRequest]
  }
}

