package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClustersRequest extends js.Object {
  /**
    * A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not specify a cluster, the default cluster is assumed.
    */
  var clusters: js.UndefOr[StringList] = js.native
  /**
    * Whether to include additional information about your clusters in the response. If this field is omitted, the attachments, statistics, and tags are not included. If ATTACHMENTS is specified, the attachments for the container instances or tasks within the cluster are included. If SETTINGS is specified, the settings for the cluster are included. If STATISTICS is specified, the following additional information, separated by launch type, is included:   runningEC2TasksCount   runningFargateTasksCount   pendingEC2TasksCount   pendingFargateTasksCount   activeEC2ServiceCount   activeFargateServiceCount   drainingEC2ServiceCount   drainingFargateServiceCount   If TAGS is specified, the metadata tags associated with the cluster are included.
    */
  var include: js.UndefOr[ClusterFieldList] = js.native
}

object DescribeClustersRequest {
  @scala.inline
  def apply(clusters: StringList = null, include: ClusterFieldList = null): DescribeClustersRequest = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClustersRequest]
  }
}

