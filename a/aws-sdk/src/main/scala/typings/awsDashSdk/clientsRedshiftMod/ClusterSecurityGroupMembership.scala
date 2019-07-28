package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSecurityGroupMembership extends js.Object {
  /**
    * The name of the cluster security group.
    */
  var ClusterSecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * The status of the cluster security group.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object ClusterSecurityGroupMembership {
  @scala.inline
  def apply(ClusterSecurityGroupName: String = null, Status: String = null): ClusterSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (ClusterSecurityGroupName != null) __obj.updateDynamic("ClusterSecurityGroupName")(ClusterSecurityGroupName)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[ClusterSecurityGroupMembership]
  }
}

