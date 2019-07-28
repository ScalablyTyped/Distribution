package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2SecurityGroup extends js.Object {
  /**
    * The name of the EC2 Security Group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * The AWS ID of the owner of the EC2 security group specified in the EC2SecurityGroupName field. 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  /**
    * The status of the EC2 security group.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The list of tags for the EC2 security group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object EC2SecurityGroup {
  @scala.inline
  def apply(
    EC2SecurityGroupName: String = null,
    EC2SecurityGroupOwnerId: String = null,
    Status: String = null,
    Tags: TagList = null
  ): EC2SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (EC2SecurityGroupName != null) __obj.updateDynamic("EC2SecurityGroupName")(EC2SecurityGroupName)
    if (EC2SecurityGroupOwnerId != null) __obj.updateDynamic("EC2SecurityGroupOwnerId")(EC2SecurityGroupOwnerId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[EC2SecurityGroup]
  }
}

