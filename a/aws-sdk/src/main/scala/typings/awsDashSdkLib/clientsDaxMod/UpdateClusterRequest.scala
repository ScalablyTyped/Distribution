package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClusterRequest extends js.Object {
  /**
    * The name of the DAX cluster to be modified.
    */
  var ClusterName: String
  /**
    * A description of the changes being made to the cluster.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that identifies the topic.
    */
  var NotificationTopicArn: js.UndefOr[String] = js.undefined
  /**
    * The current state of the topic.
    */
  var NotificationTopicStatus: js.UndefOr[String] = js.undefined
  /**
    * The name of a parameter group for this cluster.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * A range of time when maintenance of DAX cluster software will be performed. For example: sun:01:00-sun:09:00. Cluster maintenance normally takes less than 30 minutes, and is performed automatically within the maintenance window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * A list of user-specified security group IDs to be assigned to each node in the DAX cluster. If this parameter is not specified, DAX assigns the default VPC security group to each node.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdentifierList] = js.undefined
}

object UpdateClusterRequest {
  @scala.inline
  def apply(
    ClusterName: String,
    Description: String = null,
    NotificationTopicArn: String = null,
    NotificationTopicStatus: String = null,
    ParameterGroupName: String = null,
    PreferredMaintenanceWindow: String = null,
    SecurityGroupIds: SecurityGroupIdentifierList = null
  ): UpdateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (NotificationTopicArn != null) __obj.updateDynamic("NotificationTopicArn")(NotificationTopicArn)
    if (NotificationTopicStatus != null) __obj.updateDynamic("NotificationTopicStatus")(NotificationTopicStatus)
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    __obj.asInstanceOf[UpdateClusterRequest]
  }
}

