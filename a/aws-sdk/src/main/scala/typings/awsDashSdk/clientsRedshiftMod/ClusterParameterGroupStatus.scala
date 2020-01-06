package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroupStatus extends js.Object {
  /**
    * The list of parameter statuses.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  var ClusterParameterStatusList: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ClusterParameterStatusList] = js.native
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.native
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
}

object ClusterParameterGroupStatus {
  @scala.inline
  def apply(
    ClusterParameterStatusList: ClusterParameterStatusList = null,
    ParameterApplyStatus: String = null,
    ParameterGroupName: String = null
  ): ClusterParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (ClusterParameterStatusList != null) __obj.updateDynamic("ClusterParameterStatusList")(ClusterParameterStatusList.asInstanceOf[js.Any])
    if (ParameterApplyStatus != null) __obj.updateDynamic("ParameterApplyStatus")(ParameterApplyStatus.asInstanceOf[js.Any])
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterParameterGroupStatus]
  }
}

