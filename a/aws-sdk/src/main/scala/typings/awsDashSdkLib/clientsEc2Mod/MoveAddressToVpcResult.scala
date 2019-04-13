package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveAddressToVpcResult extends js.Object {
  /**
    * The allocation ID for the Elastic IP address.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  /**
    * The status of the move of the IP address.
    */
  var Status: js.UndefOr[Status] = js.undefined
}

object MoveAddressToVpcResult {
  @scala.inline
  def apply(AllocationId: String = null, Status: Status = null): MoveAddressToVpcResult = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveAddressToVpcResult]
  }
}

