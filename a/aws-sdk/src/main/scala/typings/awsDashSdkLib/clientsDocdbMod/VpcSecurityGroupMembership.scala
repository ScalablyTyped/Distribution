package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcSecurityGroupMembership extends js.Object {
  /**
    * The status of the VPC security group.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The name of the VPC security group.
    */
  var VpcSecurityGroupId: js.UndefOr[String] = js.undefined
}

object VpcSecurityGroupMembership {
  @scala.inline
  def apply(Status: String = null, VpcSecurityGroupId: String = null): VpcSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (VpcSecurityGroupId != null) __obj.updateDynamic("VpcSecurityGroupId")(VpcSecurityGroupId)
    __obj.asInstanceOf[VpcSecurityGroupMembership]
  }
}

