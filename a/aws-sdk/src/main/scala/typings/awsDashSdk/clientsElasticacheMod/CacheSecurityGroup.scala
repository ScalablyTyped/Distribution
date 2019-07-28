package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheSecurityGroup extends js.Object {
  /**
    * The name of the cache security group.
    */
  var CacheSecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * The description of the cache security group.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * A list of Amazon EC2 security groups that are associated with this cache security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined
  /**
    * The AWS account ID of the cache security group owner.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
}

object CacheSecurityGroup {
  @scala.inline
  def apply(
    CacheSecurityGroupName: String = null,
    Description: String = null,
    EC2SecurityGroups: EC2SecurityGroupList = null,
    OwnerId: String = null
  ): CacheSecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (CacheSecurityGroupName != null) __obj.updateDynamic("CacheSecurityGroupName")(CacheSecurityGroupName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EC2SecurityGroups != null) __obj.updateDynamic("EC2SecurityGroups")(EC2SecurityGroups)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    __obj.asInstanceOf[CacheSecurityGroup]
  }
}

