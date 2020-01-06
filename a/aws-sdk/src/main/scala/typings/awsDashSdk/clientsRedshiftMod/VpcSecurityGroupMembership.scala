package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcSecurityGroupMembership extends js.Object {
  /**
    * The status of the VPC security group.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The identifier of the VPC security group.
    */
  var VpcSecurityGroupId: js.UndefOr[String] = js.native
}

object VpcSecurityGroupMembership {
  @scala.inline
  def apply(Status: String = null, VpcSecurityGroupId: String = null): VpcSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (VpcSecurityGroupId != null) __obj.updateDynamic("VpcSecurityGroupId")(VpcSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcSecurityGroupMembership]
  }
}

