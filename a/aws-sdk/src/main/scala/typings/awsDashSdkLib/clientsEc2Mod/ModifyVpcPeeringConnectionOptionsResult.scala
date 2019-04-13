package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpcPeeringConnectionOptionsResult extends js.Object {
  /**
    * Information about the VPC peering connection options for the accepter VPC.
    */
  var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.undefined
  /**
    * Information about the VPC peering connection options for the requester VPC.
    */
  var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.undefined
}

object ModifyVpcPeeringConnectionOptionsResult {
  @scala.inline
  def apply(
    AccepterPeeringConnectionOptions: PeeringConnectionOptions = null,
    RequesterPeeringConnectionOptions: PeeringConnectionOptions = null
  ): ModifyVpcPeeringConnectionOptionsResult = {
    val __obj = js.Dynamic.literal()
    if (AccepterPeeringConnectionOptions != null) __obj.updateDynamic("AccepterPeeringConnectionOptions")(AccepterPeeringConnectionOptions)
    if (RequesterPeeringConnectionOptions != null) __obj.updateDynamic("RequesterPeeringConnectionOptions")(RequesterPeeringConnectionOptions)
    __obj.asInstanceOf[ModifyVpcPeeringConnectionOptionsResult]
  }
}

