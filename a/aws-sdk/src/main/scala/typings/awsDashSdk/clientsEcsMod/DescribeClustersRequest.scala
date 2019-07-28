package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClustersRequest extends js.Object {
  /**
    * A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not specify a cluster, the default cluster is assumed.
    */
  var clusters: js.UndefOr[StringList] = js.undefined
  /**
    * Additional information about your clusters to be separated by launch type, including:   runningEC2TasksCount   runningFargateTasksCount   pendingEC2TasksCount   pendingFargateTasksCount   activeEC2ServiceCount   activeFargateServiceCount   drainingEC2ServiceCount   drainingFargateServiceCount  
    */
  var include: js.UndefOr[ClusterFieldList] = js.undefined
}

object DescribeClustersRequest {
  @scala.inline
  def apply(clusters: StringList = null, include: ClusterFieldList = null): DescribeClustersRequest = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[DescribeClustersRequest]
  }
}

