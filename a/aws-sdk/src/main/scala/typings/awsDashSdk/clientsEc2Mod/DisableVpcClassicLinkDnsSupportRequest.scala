package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableVpcClassicLinkDnsSupportRequest extends js.Object {
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object DisableVpcClassicLinkDnsSupportRequest {
  @scala.inline
  def apply(VpcId: String = null): DisableVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[DisableVpcClassicLinkDnsSupportRequest]
  }
}

