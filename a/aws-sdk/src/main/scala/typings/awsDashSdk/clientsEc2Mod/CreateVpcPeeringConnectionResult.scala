package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcPeeringConnectionResult extends js.Object {
  /**
    * Information about the VPC peering connection.
    */
  var VpcPeeringConnection: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpcPeeringConnection] = js.undefined
}

object CreateVpcPeeringConnectionResult {
  @scala.inline
  def apply(VpcPeeringConnection: VpcPeeringConnection = null): CreateVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (VpcPeeringConnection != null) __obj.updateDynamic("VpcPeeringConnection")(VpcPeeringConnection)
    __obj.asInstanceOf[CreateVpcPeeringConnectionResult]
  }
}

