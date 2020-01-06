package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreAddressToClassicResult extends js.Object {
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * The move status for the IP address.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Status] = js.native
}

object RestoreAddressToClassicResult {
  @scala.inline
  def apply(PublicIp: String = null, Status: Status = null): RestoreAddressToClassicResult = {
    val __obj = js.Dynamic.literal()
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreAddressToClassicResult]
  }
}

