package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2SecurityGroup extends js.Object {
  /**
    * The name of the Amazon EC2 security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * The AWS account ID of the Amazon EC2 security group owner.
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  /**
    * The status of the Amazon EC2 security group.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object EC2SecurityGroup {
  @scala.inline
  def apply(EC2SecurityGroupName: String = null, EC2SecurityGroupOwnerId: String = null, Status: String = null): EC2SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (EC2SecurityGroupName != null) __obj.updateDynamic("EC2SecurityGroupName")(EC2SecurityGroupName)
    if (EC2SecurityGroupOwnerId != null) __obj.updateDynamic("EC2SecurityGroupOwnerId")(EC2SecurityGroupOwnerId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[EC2SecurityGroup]
  }
}

