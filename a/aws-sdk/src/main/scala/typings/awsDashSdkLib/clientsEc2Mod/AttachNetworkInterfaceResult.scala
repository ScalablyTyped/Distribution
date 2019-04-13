package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachNetworkInterfaceResult extends js.Object {
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.undefined
}

object AttachNetworkInterfaceResult {
  @scala.inline
  def apply(AttachmentId: String = null): AttachNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    if (AttachmentId != null) __obj.updateDynamic("AttachmentId")(AttachmentId)
    __obj.asInstanceOf[AttachNetworkInterfaceResult]
  }
}

