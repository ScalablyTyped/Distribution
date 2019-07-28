package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentStateChange extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the attachment.
    */
  var attachmentArn: String
  /**
    * The status of the attachment.
    */
  var status: String
}

object AttachmentStateChange {
  @scala.inline
  def apply(attachmentArn: String, status: String): AttachmentStateChange = {
    val __obj = js.Dynamic.literal(attachmentArn = attachmentArn, status = status)
  
    __obj.asInstanceOf[AttachmentStateChange]
  }
}

