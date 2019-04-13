package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterSecurityGroupResult extends js.Object {
  var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
}

object CreateClusterSecurityGroupResult {
  @scala.inline
  def apply(ClusterSecurityGroup: ClusterSecurityGroup = null): CreateClusterSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterSecurityGroup != null) __obj.updateDynamic("ClusterSecurityGroup")(ClusterSecurityGroup)
    __obj.asInstanceOf[CreateClusterSecurityGroupResult]
  }
}

