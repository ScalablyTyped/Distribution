package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveAddressToVpcResult extends js.Object {
  /**
    * The allocation ID for the Elastic IP address.
    */
  var AllocationId: js.UndefOr[String] = js.native
  /**
    * The status of the move of the IP address.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Status] = js.native
}

object MoveAddressToVpcResult {
  @scala.inline
  def apply(AllocationId: String = null, Status: Status = null): MoveAddressToVpcResult = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveAddressToVpcResult]
  }
}

