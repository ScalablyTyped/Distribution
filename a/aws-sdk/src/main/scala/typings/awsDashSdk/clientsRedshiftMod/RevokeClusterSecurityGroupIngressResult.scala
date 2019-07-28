package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeClusterSecurityGroupIngressResult extends js.Object {
  var ClusterSecurityGroup: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ClusterSecurityGroup] = js.undefined
}

object RevokeClusterSecurityGroupIngressResult {
  @scala.inline
  def apply(ClusterSecurityGroup: ClusterSecurityGroup = null): RevokeClusterSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterSecurityGroup != null) __obj.updateDynamic("ClusterSecurityGroup")(ClusterSecurityGroup)
    __obj.asInstanceOf[RevokeClusterSecurityGroupIngressResult]
  }
}

