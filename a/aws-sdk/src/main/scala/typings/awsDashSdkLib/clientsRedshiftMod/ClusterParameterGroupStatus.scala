package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterGroupStatus extends js.Object {
  /**
    * The list of parameter statuses.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  var ClusterParameterStatusList: js.UndefOr[ClusterParameterStatusList] = js.undefined
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.undefined
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
}

object ClusterParameterGroupStatus {
  @scala.inline
  def apply(
    ClusterParameterStatusList: ClusterParameterStatusList = null,
    ParameterApplyStatus: String = null,
    ParameterGroupName: String = null
  ): ClusterParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (ClusterParameterStatusList != null) __obj.updateDynamic("ClusterParameterStatusList")(ClusterParameterStatusList)
    if (ParameterApplyStatus != null) __obj.updateDynamic("ParameterApplyStatus")(ParameterApplyStatus)
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName)
    __obj.asInstanceOf[ClusterParameterGroupStatus]
  }
}

