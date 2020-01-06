package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachNetworkInterfaceResult extends js.Object {
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.native
}

object AttachNetworkInterfaceResult {
  @scala.inline
  def apply(AttachmentId: String = null): AttachNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    if (AttachmentId != null) __obj.updateDynamic("AttachmentId")(AttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachNetworkInterfaceResult]
  }
}

