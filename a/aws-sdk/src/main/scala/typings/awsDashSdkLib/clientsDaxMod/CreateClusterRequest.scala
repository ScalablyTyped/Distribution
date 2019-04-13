package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterRequest extends js.Object {
  /**
    * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  /**
    * The cluster identifier. This parameter is stored as a lowercase string.  Constraints:    A name must contain from 1 to 20 alphanumeric characters or hyphens.   The first character must be a letter.   A name cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ClusterName: String
  /**
    * A description of the cluster.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on your behalf.
    */
  var IamRoleArn: String
  /**
    * The compute and memory capacity of the nodes in the cluster.
    */
  var NodeType: String
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.  The Amazon SNS topic owner must be same as the DAX cluster owner. 
    */
  var NotificationTopicArn: js.UndefOr[String] = js.undefined
  /**
    * The parameter group to be associated with the DAX cluster.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * Specifies the weekly time range during which maintenance on the DAX cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:05:00-sun:09:00   If you don't specify a preferred maintenance window when you create or modify a cache cluster, DAX assigns a 60-minute maintenance window on a randomly selected day of the week. 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * The number of nodes in the DAX cluster. A replication factor of 1 will create a single-node cluster, without any read replicas. For additional fault tolerance, you can create a multiple node cluster with one or more read replicas. To do this, set ReplicationFactor to 2 or more.  AWS recommends that you have at least two read replicas per cluster. 
    */
  var ReplicationFactor: Integer
  /**
    * Represents the settings used to enable server-side encryption on the cluster.
    */
  var SSESpecification: js.UndefOr[SSESpecification] = js.undefined
  /**
    * A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group ID is system-generated.) If this parameter is not specified, DAX assigns the default VPC security group to each node.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdentifierList] = js.undefined
  /**
    * The name of the subnet group to be used for the replication group.  DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify in a subnet group must exist in the same VPC. 
    */
  var SubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * A set of tags to associate with the DAX cluster. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateClusterRequest {
  @scala.inline
  def apply(
    ClusterName: String,
    IamRoleArn: String,
    NodeType: String,
    ReplicationFactor: Integer,
    AvailabilityZones: AvailabilityZoneList = null,
    Description: String = null,
    NotificationTopicArn: String = null,
    ParameterGroupName: String = null,
    PreferredMaintenanceWindow: String = null,
    SSESpecification: SSESpecification = null,
    SecurityGroupIds: SecurityGroupIdentifierList = null,
    SubnetGroupName: String = null,
    Tags: TagList = null
  ): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName, IamRoleArn = IamRoleArn, NodeType = NodeType, ReplicationFactor = ReplicationFactor)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (NotificationTopicArn != null) __obj.updateDynamic("NotificationTopicArn")(NotificationTopicArn)
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (SSESpecification != null) __obj.updateDynamic("SSESpecification")(SSESpecification)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SubnetGroupName != null) __obj.updateDynamic("SubnetGroupName")(SubnetGroupName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateClusterRequest]
  }
}

