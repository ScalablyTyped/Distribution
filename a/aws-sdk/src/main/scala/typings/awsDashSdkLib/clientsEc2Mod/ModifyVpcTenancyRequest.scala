package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpcTenancyRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The instance tenancy attribute for the VPC. 
    */
  var InstanceTenancy: VpcTenancy
  /**
    * The ID of the VPC.
    */
  var VpcId: String
}

object ModifyVpcTenancyRequest {
  @scala.inline
  def apply(InstanceTenancy: VpcTenancy, VpcId: String, DryRun: js.UndefOr[Boolean] = js.undefined): ModifyVpcTenancyRequest = {
    val __obj = js.Dynamic.literal(InstanceTenancy = InstanceTenancy.asInstanceOf[js.Any], VpcId = VpcId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ModifyVpcTenancyRequest]
  }
}

