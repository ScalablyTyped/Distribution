package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptVpcPeeringConnectionResult extends js.Object {
  /**
    * Information about the VPC peering connection.
    */
  var VpcPeeringConnection: js.UndefOr[VpcPeeringConnection] = js.undefined
}

object AcceptVpcPeeringConnectionResult {
  @scala.inline
  def apply(VpcPeeringConnection: VpcPeeringConnection = null): AcceptVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (VpcPeeringConnection != null) __obj.updateDynamic("VpcPeeringConnection")(VpcPeeringConnection)
    __obj.asInstanceOf[AcceptVpcPeeringConnectionResult]
  }
}

