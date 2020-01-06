package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovingAddressStatus extends js.Object {
  /**
    * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic platform.
    */
  var MoveStatus: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.MoveStatus] = js.native
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
}

object MovingAddressStatus {
  @scala.inline
  def apply(MoveStatus: MoveStatus = null, PublicIp: String = null): MovingAddressStatus = {
    val __obj = js.Dynamic.literal()
    if (MoveStatus != null) __obj.updateDynamic("MoveStatus")(MoveStatus.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovingAddressStatus]
  }
}

