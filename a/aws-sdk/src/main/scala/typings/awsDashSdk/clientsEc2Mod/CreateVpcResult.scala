package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcResult extends js.Object {
  /**
    * Information about the VPC.
    */
  var Vpc: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Vpc] = js.native
}

object CreateVpcResult {
  @scala.inline
  def apply(Vpc: Vpc = null): CreateVpcResult = {
    val __obj = js.Dynamic.literal()
    if (Vpc != null) __obj.updateDynamic("Vpc")(Vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcResult]
  }
}

