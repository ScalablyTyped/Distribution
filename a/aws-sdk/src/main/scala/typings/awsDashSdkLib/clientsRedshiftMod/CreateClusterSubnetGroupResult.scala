package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterSubnetGroupResult extends js.Object {
  var ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup] = js.undefined
}

object CreateClusterSubnetGroupResult {
  @scala.inline
  def apply(ClusterSubnetGroup: ClusterSubnetGroup = null): CreateClusterSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterSubnetGroup != null) __obj.updateDynamic("ClusterSubnetGroup")(ClusterSubnetGroup)
    __obj.asInstanceOf[CreateClusterSubnetGroupResult]
  }
}

