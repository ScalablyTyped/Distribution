package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheSecurityGroupMembership extends js.Object {
  /**
    * The name of the cache security group.
    */
  var CacheSecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * The membership status in the cache security group. The status changes when a cache security group is modified, or when the cache security groups assigned to a cluster are modified.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object CacheSecurityGroupMembership {
  @scala.inline
  def apply(CacheSecurityGroupName: String = null, Status: String = null): CacheSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (CacheSecurityGroupName != null) __obj.updateDynamic("CacheSecurityGroupName")(CacheSecurityGroupName)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[CacheSecurityGroupMembership]
  }
}

