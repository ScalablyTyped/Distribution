package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDefaultVpcResult extends js.Object {
  /**
    * Information about the VPC.
    */
  var Vpc: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Vpc] = js.undefined
}

object CreateDefaultVpcResult {
  @scala.inline
  def apply(Vpc: Vpc = null): CreateDefaultVpcResult = {
    val __obj = js.Dynamic.literal()
    if (Vpc != null) __obj.updateDynamic("Vpc")(Vpc)
    __obj.asInstanceOf[CreateDefaultVpcResult]
  }
}

