package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitAttachmentStateChangesRequest extends js.Object {
  /**
    * Any attachments associated with the state change request.
    */
  var attachments: AttachmentStateChanges
  /**
    * The short name or full ARN of the cluster that hosts the container instance the attachment belongs to.
    */
  var cluster: js.UndefOr[String] = js.undefined
}

object SubmitAttachmentStateChangesRequest {
  @scala.inline
  def apply(attachments: AttachmentStateChanges, cluster: String = null): SubmitAttachmentStateChangesRequest = {
    val __obj = js.Dynamic.literal(attachments = attachments)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    __obj.asInstanceOf[SubmitAttachmentStateChangesRequest]
  }
}

