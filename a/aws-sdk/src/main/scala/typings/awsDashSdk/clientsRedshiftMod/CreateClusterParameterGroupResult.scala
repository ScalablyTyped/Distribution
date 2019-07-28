package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterParameterGroupResult extends js.Object {
  var ClusterParameterGroup: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ClusterParameterGroup] = js.undefined
}

object CreateClusterParameterGroupResult {
  @scala.inline
  def apply(ClusterParameterGroup: ClusterParameterGroup = null): CreateClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterParameterGroup != null) __obj.updateDynamic("ClusterParameterGroup")(ClusterParameterGroup)
    __obj.asInstanceOf[CreateClusterParameterGroupResult]
  }
}

