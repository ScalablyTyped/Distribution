package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupMembership extends js.Object {
  /**
    * The identifier of the cache security group.
    */
  var SecurityGroupId: js.UndefOr[String] = js.native
  /**
    * The status of the cache security group membership. The status changes whenever a cache security group is modified, or when the cache security groups assigned to a cluster are modified.
    */
  var Status: js.UndefOr[String] = js.native
}

object SecurityGroupMembership {
  @scala.inline
  def apply(SecurityGroupId: String = null, Status: String = null): SecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupId != null) __obj.updateDynamic("SecurityGroupId")(SecurityGroupId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupMembership]
  }
}

