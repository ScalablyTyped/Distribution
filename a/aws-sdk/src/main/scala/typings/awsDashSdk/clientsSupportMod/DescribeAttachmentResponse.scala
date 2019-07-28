package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAttachmentResponse extends js.Object {
  /**
    * The attachment content and file name.
    */
  var attachment: js.UndefOr[Attachment] = js.undefined
}

object DescribeAttachmentResponse {
  @scala.inline
  def apply(attachment: Attachment = null): DescribeAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment)
    __obj.asInstanceOf[DescribeAttachmentResponse]
  }
}

