package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/dax", "DAX")
@js.native
object DAXNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Cluster extends js.Object {
    /**
      * The number of nodes in the cluster that are active (i.e., capable of serving requests).
      */
    var ActiveNodes: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
      */
    var ClusterArn: js.UndefOr[String] = js.undefined
    /**
      * The configuration endpoint for this DAX cluster, consisting of a DNS name and a port number. Client applications can specify this endpoint, rather than an individual node endpoint, and allow the DAX client software to intelligently route requests and responses to nodes in the DAX cluster.
      */
    var ClusterDiscoveryEndpoint: js.UndefOr[Endpoint] = js.undefined
    /**
      * The name of the DAX cluster.
      */
    var ClusterName: js.UndefOr[String] = js.undefined
    /**
      * The description of the cluster.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on your behalf.
      */
    var IamRoleArn: js.UndefOr[String] = js.undefined
    /**
      * A list of nodes to be removed from the cluster.
      */
    var NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.undefined
    /**
      * The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
      */
    var NodeType: js.UndefOr[String] = js.undefined
    /**
      * A list of nodes that are currently in the cluster.
      */
    var Nodes: js.UndefOr[NodeList] = js.undefined
    /**
      * Describes a notification topic and its status. Notification topics are used for publishing DAX events to subscribers using Amazon Simple Notification Service (SNS).
      */
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
    /**
      * The parameter group being used by nodes in the cluster.
      */
    var ParameterGroup: js.UndefOr[ParameterGroupStatus] = js.undefined
    /**
      * A range of time when maintenance of DAX cluster software will be performed. For example: sun:01:00-sun:09:00. Cluster maintenance normally takes less than 30 minutes, and is performed automatically within the maintenance window.
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * The description of the server-side encryption status on the specified DAX cluster.
      */
    var SSEDescription: js.UndefOr[SSEDescription] = js.undefined
    /**
      * A list of security groups, and the status of each, for the nodes in the cluster.
      */
    var SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.undefined
    /**
      * The current status of the cluster.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The subnet group where the DAX cluster is running.
      */
    var SubnetGroup: js.UndefOr[String] = js.undefined
    /**
      * The total number of nodes in the cluster.
      */
    var TotalNodes: js.UndefOr[IntegerOptional] = js.undefined
  }
  
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
  
  trait CreateClusterResponse extends js.Object {
    /**
      * A description of the DAX cluster that you have created.
      */
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait CreateParameterGroupRequest extends js.Object {
    /**
      * A description of the parameter group.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The name of the parameter group to apply to all of the clusters in this replication group.
      */
    var ParameterGroupName: String
  }
  
  trait CreateParameterGroupResponse extends js.Object {
    /**
      * Represents the output of a CreateParameterGroup action.
      */
    var ParameterGroup: js.UndefOr[ParameterGroup] = js.undefined
  }
  
  trait CreateSubnetGroupRequest extends js.Object {
    /**
      * A description for the subnet group
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * A name for the subnet group. This value is stored as a lowercase string. 
      */
    var SubnetGroupName: String
    /**
      * A list of VPC subnet IDs for the subnet group.
      */
    var SubnetIds: SubnetIdentifierList
  }
  
  trait CreateSubnetGroupResponse extends js.Object {
    /**
      * Represents the output of a CreateSubnetGroup operation.
      */
    var SubnetGroup: js.UndefOr[SubnetGroup] = js.undefined
  }
  
  trait DecreaseReplicationFactorRequest extends js.Object {
    /**
      * The Availability Zone(s) from which to remove nodes.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    /**
      * The name of the DAX cluster from which you want to remove nodes.
      */
    var ClusterName: String
    /**
      * The new number of nodes for the DAX cluster.
      */
    var NewReplicationFactor: Integer
    /**
      * The unique identifiers of the nodes to be removed from the cluster.
      */
    var NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.undefined
  }
  
  trait DecreaseReplicationFactorResponse extends js.Object {
    /**
      * A description of the DAX cluster, after you have decreased its replication factor.
      */
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait DeleteClusterRequest extends js.Object {
    /**
      * The name of the cluster to be deleted.
      */
    var ClusterName: String
  }
  
  trait DeleteClusterResponse extends js.Object {
    /**
      * A description of the DAX cluster that is being deleted.
      */
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait DeleteParameterGroupRequest extends js.Object {
    /**
      * The name of the parameter group to delete.
      */
    var ParameterGroupName: String
  }
  
  trait DeleteParameterGroupResponse extends js.Object {
    /**
      * A user-specified message for this action (i.e., a reason for deleting the parameter group).
      */
    var DeletionMessage: js.UndefOr[String] = js.undefined
  }
  
  trait DeleteSubnetGroupRequest extends js.Object {
    /**
      * The name of the subnet group to delete.
      */
    var SubnetGroupName: String
  }
  
  trait DeleteSubnetGroupResponse extends js.Object {
    /**
      * A user-specified message for this action (i.e., a reason for deleting the subnet group).
      */
    var DeletionMessage: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeClustersRequest extends js.Object {
    /**
      * The names of the DAX clusters being described.
      */
    var ClusterNames: js.UndefOr[ClusterNameList] = js.undefined
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
      */
    var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeClustersResponse extends js.Object {
    /**
      * The descriptions of your DAX clusters, in response to a DescribeClusters request.
      */
    var Clusters: js.UndefOr[ClusterList] = js.undefined
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeDefaultParametersRequest extends js.Object {
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
      */
    var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeDefaultParametersResponse extends js.Object {
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * A list of parameters. Each element in the list represents one parameter.
      */
    var Parameters: js.UndefOr[ParameterList] = js.undefined
  }
  
  trait DescribeEventsRequest extends js.Object {
    /**
      * The number of minutes' worth of events to retrieve.
      */
    var Duration: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The end of the time interval for which to retrieve events, specified in ISO 8601 format.
      */
    var EndTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
      */
    var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the event source for which events will be returned. If not specified, then all sources are included in the response.
      */
    var SourceName: js.UndefOr[String] = js.undefined
    /**
      * The event source to retrieve events for. If no value is specified, all events are returned.
      */
    var SourceType: js.UndefOr[SourceType] = js.undefined
    /**
      * The beginning of the time interval to retrieve events for, specified in ISO 8601 format.
      */
    var StartTime: js.UndefOr[TStamp] = js.undefined
  }
  
  trait DescribeEventsResponse extends js.Object {
    /**
      * An array of events. Each element in the array represents one event.
      */
    var Events: js.UndefOr[EventList] = js.undefined
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeParameterGroupsRequest extends js.Object {
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
      */
    var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The names of the parameter groups.
      */
    var ParameterGroupNames: js.UndefOr[ParameterGroupNameList] = js.undefined
  }
  
  trait DescribeParameterGroupsResponse extends js.Object {
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * An array of parameter groups. Each element in the array represents one parameter group.
      */
    var ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined
  }
  
  trait DescribeParametersRequest extends js.Object {
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
      */
    var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the parameter group.
      */
    var ParameterGroupName: String
    /**
      * How the parameter is defined. For example, system denotes a system-defined parameter.
      */
    var Source: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeParametersResponse extends js.Object {
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * A list of parameters within a parameter group. Each element in the list represents one parameter.
      */
    var Parameters: js.UndefOr[ParameterList] = js.undefined
  }
  
  trait DescribeSubnetGroupsRequest extends js.Object {
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
      */
    var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the subnet group.
      */
    var SubnetGroupNames: js.UndefOr[SubnetGroupNameList] = js.undefined
  }
  
  trait DescribeSubnetGroupsResponse extends js.Object {
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * An array of subnet groups. Each element in the array represents a single subnet group.
      */
    var SubnetGroups: js.UndefOr[SubnetGroupList] = js.undefined
  }
  
  trait Endpoint extends js.Object {
    /**
      * The DNS hostname of the endpoint.
      */
    var Address: js.UndefOr[String] = js.undefined
    /**
      * The port number that applications should use to connect to the endpoint.
      */
    var Port: js.UndefOr[Integer] = js.undefined
  }
  
  trait Event extends js.Object {
    /**
      * The date and time when the event occurred.
      */
    var Date: js.UndefOr[TStamp] = js.undefined
    /**
      * A user-defined message associated with the event.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      * The source of the event. For example, if the event occurred at the node level, the source would be the node ID.
      */
    var SourceName: js.UndefOr[String] = js.undefined
    /**
      * Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
      */
    var SourceType: js.UndefOr[SourceType] = js.undefined
  }
  
  trait IncreaseReplicationFactorRequest extends js.Object {
    /**
      * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    /**
      * The name of the DAX cluster that will receive additional nodes.
      */
    var ClusterName: String
    /**
      * The new number of nodes for the DAX cluster.
      */
    var NewReplicationFactor: Integer
  }
  
  trait IncreaseReplicationFactorResponse extends js.Object {
    /**
      * A description of the DAX cluster. with its new replication factor.
      */
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait ListTagsRequest extends js.Object {
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the DAX resource to which the tags belong.
      */
    var ResourceName: String
  }
  
  trait ListTagsResponse extends js.Object {
    /**
      * If this value is present, there are additional results to be displayed. To retrieve them, call ListTags again, with NextToken set to this value.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * A list of tags currently associated with the DAX cluster.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait Node extends js.Object {
    /**
      * The Availability Zone (AZ) in which the node has been deployed.
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect directly to a node endpoint, if desired (as an alternative to allowing DAX client software to intelligently route requests and responses to nodes in the DAX cluster.
      */
    var Endpoint: js.UndefOr[Endpoint] = js.undefined
    /**
      * The date and time (in UNIX epoch format) when the node was launched.
      */
    var NodeCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * A system-generated identifier for the node.
      */
    var NodeId: js.UndefOr[String] = js.undefined
    /**
      * The current status of the node. For example: available.
      */
    var NodeStatus: js.UndefOr[String] = js.undefined
    /**
      * The status of the parameter group associated with this node. For example, in-sync.
      */
    var ParameterGroupStatus: js.UndefOr[String] = js.undefined
  }
  
  trait NodeTypeSpecificValue extends js.Object {
    /**
      * A node type to which the parameter value applies.
      */
    var NodeType: js.UndefOr[String] = js.undefined
    /**
      * The parameter value for this node type.
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait NotificationConfiguration extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that identifies the topic. 
      */
    var TopicArn: js.UndefOr[String] = js.undefined
    /**
      * The current state of the topic.
      */
    var TopicStatus: js.UndefOr[String] = js.undefined
  }
  
  trait Parameter extends js.Object {
    /**
      * A range of values within which the parameter can be set.
      */
    var AllowedValues: js.UndefOr[String] = js.undefined
    /**
      * The conditions under which changes to this parameter can be applied. For example, requires-reboot indicates that a new value for this parameter will only take effect if a node is rebooted.
      */
    var ChangeType: js.UndefOr[ChangeType] = js.undefined
    /**
      * The data type of the parameter. For example, integer:
      */
    var DataType: js.UndefOr[String] = js.undefined
    /**
      * A description of the parameter
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * Whether the customer is allowed to modify the parameter.
      */
    var IsModifiable: js.UndefOr[IsModifiable] = js.undefined
    /**
      * A list of node types, and specific parameter values for each node.
      */
    var NodeTypeSpecificValues: js.UndefOr[NodeTypeSpecificValueList] = js.undefined
    /**
      * The name of the parameter.
      */
    var ParameterName: js.UndefOr[String] = js.undefined
    /**
      * Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
      */
    var ParameterType: js.UndefOr[ParameterType] = js.undefined
    /**
      * The value for the parameter.
      */
    var ParameterValue: js.UndefOr[String] = js.undefined
    /**
      * How the parameter is defined. For example, system denotes a system-defined parameter.
      */
    var Source: js.UndefOr[String] = js.undefined
  }
  
  trait ParameterGroup extends js.Object {
    /**
      * A description of the parameter group.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The name of the parameter group.
      */
    var ParameterGroupName: js.UndefOr[String] = js.undefined
  }
  
  trait ParameterGroupStatus extends js.Object {
    /**
      * The node IDs of one or more nodes to be rebooted.
      */
    var NodeIdsToReboot: js.UndefOr[NodeIdentifierList] = js.undefined
    /**
      * The status of parameter updates. 
      */
    var ParameterApplyStatus: js.UndefOr[String] = js.undefined
    /**
      * The name of the parameter group.
      */
    var ParameterGroupName: js.UndefOr[String] = js.undefined
  }
  
  trait ParameterNameValue extends js.Object {
    /**
      * The name of the parameter.
      */
    var ParameterName: js.UndefOr[String] = js.undefined
    /**
      * The value of the parameter.
      */
    var ParameterValue: js.UndefOr[String] = js.undefined
  }
  
  trait RebootNodeRequest extends js.Object {
    /**
      * The name of the DAX cluster containing the node to be rebooted.
      */
    var ClusterName: String
    /**
      * The system-assigned ID of the node to be rebooted.
      */
    var NodeId: String
  }
  
  trait RebootNodeResponse extends js.Object {
    /**
      * A description of the DAX cluster after a node has been rebooted.
      */
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait SSEDescription extends js.Object {
    /**
      * The current state of server-side encryption:    ENABLING - Server-side encryption is being enabled.    ENABLED - Server-side encryption is enabled.    DISABLING - Server-side encryption is being disabled.    DISABLED - Server-side encryption is disabled.  
      */
    var Status: js.UndefOr[SSEStatus] = js.undefined
  }
  
  trait SSESpecification extends js.Object {
    /**
      * Indicates whether server-side encryption is enabled (true) or disabled (false) on the cluster.
      */
    var Enabled: SSEEnabled
  }
  
  trait SecurityGroupMembership extends js.Object {
    /**
      * The unique ID for this security group.
      */
    var SecurityGroupIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The status of this security group.
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait Subnet extends js.Object {
    /**
      * The Availability Zone (AZ) for subnet subnet.
      */
    var SubnetAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The system-assigned identifier for the subnet.
      */
    var SubnetIdentifier: js.UndefOr[String] = js.undefined
  }
  
  trait SubnetGroup extends js.Object {
    /**
      * The description of the subnet group.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The name of the subnet group.
      */
    var SubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of subnets associated with the subnet group. 
      */
    var Subnets: js.UndefOr[SubnetList] = js.undefined
    /**
      * The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The key for the tag. Tag keys are case sensitive. Every DAX cluster can only have one tag with the same key. If you try to add an existing tag (same key), the existing tag value will be updated to the new value.
      */
    var Key: js.UndefOr[String] = js.undefined
    /**
      * The value of the tag. Tag values are case-sensitive and can be null. 
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The name of the DAX resource to which tags should be added.
      */
    var ResourceName: String
    /**
      * The tags to be assigned to the DAX resource. 
      */
    var Tags: TagList
  }
  
  trait TagResourceResponse extends js.Object {
    /**
      * The list of tags that are associated with the DAX resource.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
      */
    def createCluster(): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
      */
    def createCluster(params: CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCluster(
      params: CreateClusterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes in a DAX cluster.
      */
    def createParameterGroup(): awsDashSdkLib.libRequestMod.Request[CreateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateParameterGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes in a DAX cluster.
      */
    def createParameterGroup(params: CreateParameterGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createParameterGroup(
      params: CreateParameterGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateParameterGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new subnet group.
      */
    def createSubnetGroup(): awsDashSdkLib.libRequestMod.Request[CreateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new subnet group.
      */
    def createSubnetGroup(params: CreateSubnetGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSubnetGroup(
      params: CreateSubnetGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more nodes from a DAX cluster.  You cannot use DecreaseReplicationFactor to remove the last node in a DAX cluster. If you need to do this, use DeleteCluster instead. 
      */
    def decreaseReplicationFactor(): awsDashSdkLib.libRequestMod.Request[DecreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def decreaseReplicationFactor(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DecreaseReplicationFactorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DecreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more nodes from a DAX cluster.  You cannot use DecreaseReplicationFactor to remove the last node in a DAX cluster. If you need to do this, use DeleteCluster instead. 
      */
    def decreaseReplicationFactor(params: DecreaseReplicationFactorRequest): awsDashSdkLib.libRequestMod.Request[DecreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def decreaseReplicationFactor(
      params: DecreaseReplicationFactorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DecreaseReplicationFactorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DecreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously provisioned DAX cluster. DeleteCluster deletes all associated nodes, node endpoints and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins deleting the cluster; you cannot cancel or revert this action.
      */
    def deleteCluster(): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously provisioned DAX cluster. DeleteCluster deletes all associated nodes, node endpoints and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins deleting the cluster; you cannot cancel or revert this action.
      */
    def deleteCluster(params: DeleteClusterRequest): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCluster(
      params: DeleteClusterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX clusters.
      */
    def deleteParameterGroup(): awsDashSdkLib.libRequestMod.Request[DeleteParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteParameterGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX clusters.
      */
    def deleteParameterGroup(params: DeleteParameterGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteParameterGroup(
      params: DeleteParameterGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteParameterGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a subnet group.  You cannot delete a subnet group if it is associated with any DAX clusters. 
      */
    def deleteSubnetGroup(): awsDashSdkLib.libRequestMod.Request[DeleteSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a subnet group.  You cannot delete a subnet group if it is associated with any DAX clusters. 
      */
    def deleteSubnetGroup(params: DeleteSubnetGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSubnetGroup(
      params: DeleteSubnetGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific DAX cluster if a cluster identifier is supplied. If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes are successfully provisioned. If the cluster is in the DELETING state, only cluster level information will be displayed. If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is available, the cluster is ready for use. If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is displayed.
      */
    def describeClusters(): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClustersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific DAX cluster if a cluster identifier is supplied. If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes are successfully provisioned. If the cluster is in the DELETING state, only cluster level information will be displayed. If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is available, the cluster is ready for use. If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is displayed.
      */
    def describeClusters(params: DescribeClustersRequest): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusters(
      params: DescribeClustersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClustersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the default system parameter information for the DAX caching software.
      */
    def describeDefaultParameters(): awsDashSdkLib.libRequestMod.Request[DescribeDefaultParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDefaultParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDefaultParametersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDefaultParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the default system parameter information for the DAX caching software.
      */
    def describeDefaultParameters(params: DescribeDefaultParametersRequest): awsDashSdkLib.libRequestMod.Request[DescribeDefaultParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDefaultParameters(
      params: DescribeDefaultParametersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDefaultParametersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDefaultParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX cluster or parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
      */
    def describeEvents(): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX cluster or parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
      */
    def describeEvents(params: DescribeEventsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      params: DescribeEventsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain only the descriptions for that group.
      */
    def describeParameterGroups(): awsDashSdkLib.libRequestMod.Request[DescribeParameterGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeParameterGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeParameterGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeParameterGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain only the descriptions for that group.
      */
    def describeParameterGroups(params: DescribeParameterGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeParameterGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeParameterGroups(
      params: DescribeParameterGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeParameterGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeParameterGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the detailed parameter list for a particular parameter group.
      */
    def describeParameters(): awsDashSdkLib.libRequestMod.Request[DescribeParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeParametersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the detailed parameter list for a particular parameter group.
      */
    def describeParameters(params: DescribeParametersRequest): awsDashSdkLib.libRequestMod.Request[DescribeParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeParameters(
      params: DescribeParametersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeParametersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the description of that group.
      */
    def describeSubnetGroups(): awsDashSdkLib.libRequestMod.Request[DescribeSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSubnetGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSubnetGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the description of that group.
      */
    def describeSubnetGroups(params: DescribeSubnetGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSubnetGroups(
      params: DescribeSubnetGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSubnetGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more nodes to a DAX cluster.
      */
    def increaseReplicationFactor(): awsDashSdkLib.libRequestMod.Request[IncreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def increaseReplicationFactor(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ IncreaseReplicationFactorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[IncreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more nodes to a DAX cluster.
      */
    def increaseReplicationFactor(params: IncreaseReplicationFactorRequest): awsDashSdkLib.libRequestMod.Request[IncreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def increaseReplicationFactor(
      params: IncreaseReplicationFactorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ IncreaseReplicationFactorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[IncreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all of the tags for a DAX cluster. You can call ListTags up to 10 times per second, per account.
      */
    def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all of the tags for a DAX cluster. You can call ListTags up to 10 times per second, per account.
      */
    def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      params: ListTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the node status is set to REBOOTING.
      */
    def rebootNode(): awsDashSdkLib.libRequestMod.Request[RebootNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootNode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootNodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the node status is set to REBOOTING.
      */
    def rebootNode(params: RebootNodeRequest): awsDashSdkLib.libRequestMod.Request[RebootNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootNode(
      params: RebootNodeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootNodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a set of tags with a DAX resource. You can call TagResource up to 5 times per second, per account. 
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a set of tags with a DAX resource. You can call TagResource up to 5 times per second, per account. 
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the association of tags from a DAX resource. You can call UntagResource up to 5 times per second, per account. 
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the association of tags from a DAX resource. You can call UntagResource up to 5 times per second, per account. 
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration parameters by specifying the parameters and the new values.
      */
    def updateCluster(): awsDashSdkLib.libRequestMod.Request[UpdateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration parameters by specifying the parameters and the new values.
      */
    def updateCluster(params: UpdateClusterRequest): awsDashSdkLib.libRequestMod.Request[UpdateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCluster(
      params: UpdateClusterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
      */
    def updateParameterGroup(): awsDashSdkLib.libRequestMod.Request[UpdateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateParameterGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
      */
    def updateParameterGroup(params: UpdateParameterGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateParameterGroup(
      params: UpdateParameterGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateParameterGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing subnet group.
      */
    def updateSubnetGroup(): awsDashSdkLib.libRequestMod.Request[UpdateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing subnet group.
      */
    def updateSubnetGroup(params: UpdateSubnetGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSubnetGroup(
      params: UpdateSubnetGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The name of the DAX resource from which the tags should be removed.
      */
    var ResourceName: String
    /**
      * A list of tag keys. If the DAX cluster has any tags with these keys, then the tags are removed from the cluster.
      */
    var TagKeys: KeyList
  }
  
  trait UntagResourceResponse extends js.Object {
    /**
      * The tag keys that have been removed from the cluster.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
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
  
  trait UpdateClusterResponse extends js.Object {
    /**
      * A description of the DAX cluster, after it has been modified.
      */
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait UpdateParameterGroupRequest extends js.Object {
    /**
      * The name of the parameter group.
      */
    var ParameterGroupName: String
    /**
      * An array of name-value pairs for the parameters in the group. Each element in the array represents a single parameter.
      */
    var ParameterNameValues: ParameterNameValueList
  }
  
  trait UpdateParameterGroupResponse extends js.Object {
    /**
      * The parameter group that has been modified.
      */
    var ParameterGroup: js.UndefOr[ParameterGroup] = js.undefined
  }
  
  trait UpdateSubnetGroupRequest extends js.Object {
    /**
      * A description of the subnet group.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The name of the subnet group.
      */
    var SubnetGroupName: String
    /**
      * A list of subnet IDs in the subnet group.
      */
    var SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
  }
  
  trait UpdateSubnetGroupResponse extends js.Object {
    /**
      * The subnet group that has been modified.
      */
    var SubnetGroup: js.UndefOr[SubnetGroup] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AvailabilityZoneList = js.Array[String]
  type ChangeType = awsDashSdkLib.awsDashSdkLibStrings.IMMEDIATE | awsDashSdkLib.awsDashSdkLibStrings.REQUIRES_REBOOT | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterList = js.Array[Cluster]
  type ClusterNameList = js.Array[String]
  type EventList = js.Array[Event]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type IsModifiable = awsDashSdkLib.awsDashSdkLibStrings.TRUE | awsDashSdkLib.awsDashSdkLibStrings.FALSE | awsDashSdkLib.awsDashSdkLibStrings.CONDITIONAL | java.lang.String
  type KeyList = js.Array[String]
  type NodeIdentifierList = js.Array[String]
  type NodeList = js.Array[Node]
  type NodeTypeSpecificValueList = js.Array[NodeTypeSpecificValue]
  type ParameterGroupList = js.Array[ParameterGroup]
  type ParameterGroupNameList = js.Array[String]
  type ParameterList = js.Array[Parameter]
  type ParameterNameValueList = js.Array[ParameterNameValue]
  type ParameterType = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | awsDashSdkLib.awsDashSdkLibStrings.NODE_TYPE_SPECIFIC | java.lang.String
  type SSEEnabled = scala.Boolean
  type SSEStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLING | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLING | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type SecurityGroupIdentifierList = js.Array[String]
  type SecurityGroupMembershipList = js.Array[SecurityGroupMembership]
  type SourceType = awsDashSdkLib.awsDashSdkLibStrings.CLUSTER | awsDashSdkLib.awsDashSdkLibStrings.PARAMETER_GROUP | awsDashSdkLib.awsDashSdkLibStrings.SUBNET_GROUP | java.lang.String
  type String = java.lang.String
  type SubnetGroupList = js.Array[SubnetGroup]
  type SubnetGroupNameList = js.Array[String]
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = stdLib.Date
  type TagList = js.Array[Tag]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-04-19` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

