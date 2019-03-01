package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/elasticache", "ElastiCache")
@js.native
object ElastiCacheNs extends js.Object {
  trait AddTagsToResourceMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource to which the tags are to be added, for example arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster or arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot. ElastiCache resources are cluster and snapshot. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
      */
    var ResourceName: String
    /**
      * A list of cost allocation tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value.
      */
    var Tags: TagList
  }
  
  trait AllowedNodeTypeModificationsMessage extends js.Object {
    /**
      * A string list, each element of which specifies a cache node type which you can use to scale your cluster or replication group. When scaling up a Redis cluster or replication group using ModifyCacheCluster or ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
      */
    var ScaleUpModifications: js.UndefOr[NodeTypeList] = js.undefined
  }
  
  trait AuthorizeCacheSecurityGroupIngressMessage extends js.Object {
    /**
      * The cache security group that allows network ingress.
      */
    var CacheSecurityGroupName: String
    /**
      * The Amazon EC2 security group to be authorized for ingress to the cache security group.
      */
    var EC2SecurityGroupName: String
    /**
      * The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an AWS access key ID - you must provide a valid AWS account number for this parameter.
      */
    var EC2SecurityGroupOwnerId: String
  }
  
  trait AuthorizeCacheSecurityGroupIngressResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
  }
  
  trait AvailabilityZone extends js.Object {
    /**
      * The name of the Availability Zone.
      */
    var Name: js.UndefOr[String] = js.undefined
  }
  
  trait CacheCluster extends js.Object {
    /**
      * A flag that enables encryption at-rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the cluster is created. To enable at-rest encryption on a cluster you must set AtRestEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6 or 4.x. Default: false 
      */
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * A flag that enables using an AuthToken (password) when issuing Redis commands. Default: false 
      */
    var AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * This parameter is currently disabled.
      */
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
    /**
      * The date and time when the cluster was created.
      */
    var CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The user-supplied identifier of the cluster. This identifier is a unique key that identifies a cluster.
      */
    var CacheClusterId: js.UndefOr[String] = js.undefined
    /**
      * The current state of this cluster, one of the following values: available, creating, deleted, deleting, incompatible-network, modifying, rebooting cluster nodes, restore-failed, or snapshotting.
      */
    var CacheClusterStatus: js.UndefOr[String] = js.undefined
    /**
      * The name of the compute and memory capacity node type for the cluster. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge   R4 node types; cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge       Notes:    All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).   Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.    Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.   Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.   For a complete listing of node types and specifications, see:    Amazon ElastiCache Product Features and Details     Cache Node Type-Specific Parameters for Memcached     Cache Node Type-Specific Parameters for Redis   
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * A list of cache nodes that are members of the cluster.
      */
    var CacheNodes: js.UndefOr[CacheNodeList] = js.undefined
    /**
      * Status of the cache parameter group.
      */
    var CacheParameterGroup: js.UndefOr[CacheParameterGroupStatus] = js.undefined
    /**
      * A list of cache security group elements, composed of name and status sub-elements.
      */
    var CacheSecurityGroups: js.UndefOr[CacheSecurityGroupMembershipList] = js.undefined
    /**
      * The name of the cache subnet group associated with the cluster.
      */
    var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * The URL of the web page where you can download the latest ElastiCache client library.
      */
    var ClientDownloadLandingPage: js.UndefOr[String] = js.undefined
    /**
      * Represents a Memcached cluster endpoint which, if Automatic Discovery is enabled on the cluster, can be used by an application to connect to any node in the cluster. The configuration endpoint will always have .cfg in it. Example: mem-3.9dvc4r.cfg.usw2.cache.amazonaws.com:11211 
      */
    var ConfigurationEndpoint: js.UndefOr[Endpoint] = js.undefined
    /**
      * The name of the cache engine (memcached or redis) to be used for this cluster.
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * The version of the cache engine that is used in this cluster.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to subscribers using Amazon Simple Notification Service (SNS). 
      */
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
    /**
      * The number of cache nodes in the cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
      */
    var NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined
    /**
      * The name of the Availability Zone in which the cluster is located or "Multiple" if the cache nodes are located in different Availability Zones.
      */
    var PreferredAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * The replication group to which this cluster belongs. If this field is empty, the cluster is not associated with any replication group.
      */
    var ReplicationGroupId: js.UndefOr[String] = js.undefined
    /**
      * A list of VPC Security Groups associated with the cluster.
      */
    var SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.undefined
    /**
      * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.   If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. 
      */
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster. Example: 05:00-09:00 
      */
    var SnapshotWindow: js.UndefOr[String] = js.undefined
    /**
      * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6 or 4.x. Default: false 
      */
    var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  trait CacheClusterMessage extends js.Object {
    /**
      * A list of clusters. Each item in the list contains detailed information about one cluster.
      */
    var CacheClusters: js.UndefOr[CacheClusterList] = js.undefined
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait CacheEngineVersion extends js.Object {
    /**
      * The description of the cache engine.
      */
    var CacheEngineDescription: js.UndefOr[String] = js.undefined
    /**
      * The description of the cache engine version.
      */
    var CacheEngineVersionDescription: js.UndefOr[String] = js.undefined
    /**
      * The name of the cache parameter group family associated with this cache engine. Valid values are: memcached1.4 | redis2.6 | redis2.8 | redis3.2 | redis4.0 
      */
    var CacheParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * The name of the cache engine.
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * The version number of the cache engine.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
  }
  
  trait CacheEngineVersionMessage extends js.Object {
    /**
      * A list of cache engine version details. Each element in the list contains detailed information about one cache engine version.
      */
    var CacheEngineVersions: js.UndefOr[CacheEngineVersionList] = js.undefined
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait CacheNode extends js.Object {
    /**
      * The date and time when the cache node was created.
      */
    var CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of cluster ID and node ID uniquely identifies every cache node used in a customer's AWS account.
      */
    var CacheNodeId: js.UndefOr[String] = js.undefined
    /**
      * The current state of this cache node.
      */
    var CacheNodeStatus: js.UndefOr[String] = js.undefined
    /**
      * The Availability Zone where this node was created and now resides.
      */
    var CustomerAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The hostname for connecting to this cache node.
      */
    var Endpoint: js.UndefOr[Endpoint] = js.undefined
    /**
      * The status of the parameter group applied to this cache node.
      */
    var ParameterGroupStatus: js.UndefOr[String] = js.undefined
    /**
      * The ID of the primary node to which this read replica node is synchronized. If this field is empty, this node is not associated with a primary cluster.
      */
    var SourceCacheNodeId: js.UndefOr[String] = js.undefined
  }
  
  trait CacheNodeTypeSpecificParameter extends js.Object {
    /**
      * The valid range of values for the parameter.
      */
    var AllowedValues: js.UndefOr[String] = js.undefined
    /**
      * A list of cache node types and their corresponding values for this parameter.
      */
    var CacheNodeTypeSpecificValues: js.UndefOr[CacheNodeTypeSpecificValueList] = js.undefined
    /**
      * Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to be applied. You can force a reboot or wait until the next maintenance window's reboot. For more information, see Rebooting a Cluster.
      */
    var ChangeType: js.UndefOr[ChangeType] = js.undefined
    /**
      * The valid data type for the parameter.
      */
    var DataType: js.UndefOr[String] = js.undefined
    /**
      * A description of the parameter.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * Indicates whether (true) or not (false) the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed.
      */
    var IsModifiable: js.UndefOr[Boolean] = js.undefined
    /**
      * The earliest cache engine version to which the parameter can apply.
      */
    var MinimumEngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The name of the parameter.
      */
    var ParameterName: js.UndefOr[String] = js.undefined
    /**
      * The source of the parameter value.
      */
    var Source: js.UndefOr[String] = js.undefined
  }
  
  trait CacheNodeTypeSpecificValue extends js.Object {
    /**
      * The cache node type for which this value applies.
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * The value for the cache node type.
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait CacheParameterGroup extends js.Object {
    /**
      * The name of the cache parameter group family that this cache parameter group is compatible with. Valid values are: memcached1.4 | redis2.6 | redis2.8 | redis3.2 | redis4.0 
      */
    var CacheParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * The name of the cache parameter group.
      */
    var CacheParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * The description for this cache parameter group.
      */
    var Description: js.UndefOr[String] = js.undefined
  }
  
  trait CacheParameterGroupDetails extends js.Object {
    /**
      * A list of parameters specific to a particular cache node type. Each element in the list contains detailed information about one parameter.
      */
    var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of Parameter instances.
      */
    var Parameters: js.UndefOr[ParametersList] = js.undefined
  }
  
  trait CacheParameterGroupNameMessage extends js.Object {
    /**
      * The name of the cache parameter group.
      */
    var CacheParameterGroupName: js.UndefOr[String] = js.undefined
  }
  
  trait CacheParameterGroupStatus extends js.Object {
    /**
      * A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a numeric identifier (0001, 0002, etc.).
      */
    var CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.undefined
    /**
      * The name of the cache parameter group.
      */
    var CacheParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * The status of parameter updates.
      */
    var ParameterApplyStatus: js.UndefOr[String] = js.undefined
  }
  
  trait CacheParameterGroupsMessage extends js.Object {
    /**
      * A list of cache parameter groups. Each element in the list contains detailed information about one cache parameter group.
      */
    var CacheParameterGroups: js.UndefOr[CacheParameterGroupList] = js.undefined
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait CacheSecurityGroup extends js.Object {
    /**
      * The name of the cache security group.
      */
    var CacheSecurityGroupName: js.UndefOr[String] = js.undefined
    /**
      * The description of the cache security group.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * A list of Amazon EC2 security groups that are associated with this cache security group.
      */
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined
    /**
      * The AWS account ID of the cache security group owner.
      */
    var OwnerId: js.UndefOr[String] = js.undefined
  }
  
  trait CacheSecurityGroupMembership extends js.Object {
    /**
      * The name of the cache security group.
      */
    var CacheSecurityGroupName: js.UndefOr[String] = js.undefined
    /**
      * The membership status in the cache security group. The status changes when a cache security group is modified, or when the cache security groups assigned to a cluster are modified.
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait CacheSecurityGroupMessage extends js.Object {
    /**
      * A list of cache security groups. Each element in the list contains detailed information about one group.
      */
    var CacheSecurityGroups: js.UndefOr[CacheSecurityGroups] = js.undefined
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait CacheSubnetGroup extends js.Object {
    /**
      * The description of the cache subnet group.
      */
    var CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined
    /**
      * The name of the cache subnet group.
      */
    var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of subnets associated with the cache subnet group.
      */
    var Subnets: js.UndefOr[SubnetList] = js.undefined
    /**
      * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait CacheSubnetGroupMessage extends js.Object {
    /**
      * A list of cache subnet groups. Each element in the list contains detailed information about one group.
      */
    var CacheSubnetGroups: js.UndefOr[CacheSubnetGroups] = js.undefined
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ConfigureShard extends js.Object {
    /**
      * The number of replicas you want in this node group at the end of this operation. The maximum value for NewReplicaCount is 5. The minimum value depends upon the type of Redis replication group you are working with. The minimum number of replicas in a shard or replication group is:   Redis (cluster mode disabled)   If Multi-AZ with Automatic Failover is enabled: 1   If Multi-AZ with Automatic Failover is not enable: 0     Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)  
      */
    var NewReplicaCount: Integer
    /**
      * The 4-digit id for the node group you are configuring. For Redis (cluster mode disabled) replication groups, the node group id is always 0001. To find a Redis (cluster mode enabled)'s node group's (shard's) id, see Finding a Shard's Id.
      */
    var NodeGroupId: AllowedNodeGroupId
    /**
      * A list of PreferredAvailabilityZone strings that specify which availability zones the replication group's nodes are to be in. The nummber of PreferredAvailabilityZone values must equal the value of NewReplicaCount plus 1 to account for the primary node. If this member of ReplicaConfiguration is omitted, ElastiCache for Redis selects the availability zone for each of the replicas.
      */
    var PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined
  }
  
  trait CopySnapshotMessage extends js.Object {
    /**
      * The name of an existing snapshot from which to make a copy.
      */
    var SourceSnapshotName: String
    /**
      * The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a snapshot for external access. When using this parameter to export a snapshot, be sure Amazon ElastiCache has the needed permissions to this S3 bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the Amazon ElastiCache User Guide. For more information, see Exporting a Snapshot in the Amazon ElastiCache User Guide.
      */
    var TargetBucket: js.UndefOr[String] = js.undefined
    /**
      * A name for the snapshot copy. ElastiCache does not permit overwriting a snapshot, therefore this name must be unique within its context - ElastiCache or an Amazon S3 bucket if exporting.
      */
    var TargetSnapshotName: String
  }
  
  trait CopySnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot] = js.undefined
  }
  
  trait CreateCacheClusterMessage extends js.Object {
    /**
      * Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone or created across multiple Availability Zones in the cluster's region. This parameter is only supported for Memcached clusters. If the AZMode and PreferredAvailabilityZones are not specified, ElastiCache assumes single-az mode.
      */
    var AZMode: js.UndefOr[AZMode] = js.undefined
    /**
      *  Reserved parameter. The password used to access a password protected server. Password constraints:   Must be only printable ASCII characters.   Must be at least 16 characters and no more than 128 characters in length.   Cannot contain any of the following characters: '/', '"', or '@'.    For more information, see AUTH password at http://redis.io/commands/AUTH.
      */
    var AuthToken: js.UndefOr[String] = js.undefined
    /**
      * This parameter is currently disabled.
      */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The node group (shard) identifier. This parameter is stored as a lowercase string.  Constraints:    A name must contain from 1 to 20 alphanumeric characters or hyphens.   The first character must be a letter.   A name cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var CacheClusterId: String
    /**
      * The compute and memory capacity of the nodes in the node group (shard). The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge   R4 node types; cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge       Notes:    All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).   Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.    Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.   Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.   For a complete listing of node types and specifications, see:    Amazon ElastiCache Product Features and Details     Cache Node Type-Specific Parameters for Memcached     Cache Node Type-Specific Parameters for Redis   
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * The name of the parameter group to associate with this cluster. If this argument is omitted, the default parameter group for the specified engine is used. You cannot use any parameter group which has cluster-enabled='yes' when creating a cluster.
      */
    var CacheParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of security group names to associate with this cluster. Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC).
      */
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined
    /**
      * The name of the subnet group to be used for the cluster. Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).  If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group before you start creating a cluster. For more information, see Subnets and Subnet Groups. 
      */
    var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * The name of the cache engine to be used for this cluster. Valid values for this parameter are: memcached | redis 
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * The version number of the cache engine to be used for this cluster. To view the supported cache engine versions, use the DescribeCacheEngineVersions operation.  Important: You can upgrade to a newer engine version (see Selecting a Cache Engine and Version), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the existing cluster or replication group and create it anew with the earlier engine version. 
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are sent.  The Amazon SNS topic owner must be the same as the cluster owner. 
      */
    var NotificationTopicArn: js.UndefOr[String] = js.undefined
    /**
      * The initial number of cache nodes that the cluster has. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20. If you need more than 20 nodes for your Memcached cluster, please fill out the ElastiCache Limit Increase Request form at http://aws.amazon.com/contact-us/elasticache-node-limit-request/.
      */
    var NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The port number on which each of the cache nodes accepts connections.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The EC2 Availability Zone in which the cluster is created. All nodes belonging to this Memcached cluster are placed in the preferred Availability Zone. If you want to create your nodes across multiple Availability Zones, use PreferredAvailabilityZones. Default: System chosen Availability Zone.
      */
    var PreferredAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * A list of the Availability Zones in which cache nodes are created. The order of the zones in the list is not important. This option is only supported on Memcached.  If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in Availability Zones that are associated with the subnets in the selected subnet group. The number of Availability Zones listed must equal the value of NumCacheNodes.  If you want all the nodes in the same Availability Zone, use PreferredAvailabilityZone instead, or repeat the Availability Zone multiple times in the list. Default: System chosen Availability Zones.
      */
    var PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined
    /**
      * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are: Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * The ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary that is not part of any replication group. If the specified replication group is Multi-AZ enabled and the Availability Zone is not specified, the cluster is created in Availability Zones that provide the best spread of read replicas across Availability Zones.  This parameter is only valid if the Engine parameter is redis. 
      */
    var ReplicationGroupId: js.UndefOr[String] = js.undefined
    /**
      * One or more VPC security groups associated with the cluster. Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
      */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined
    /**
      * A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies a Redis RDB snapshot file stored in Amazon S3. The snapshot file is used to populate the node group (shard). The Amazon S3 object name in the ARN cannot contain any commas.  This parameter is only valid if the Engine parameter is redis.  Example of an Amazon S3 ARN: arn:aws:s3:::my_bucket/snapshot1.rdb 
      */
    var SnapshotArns: js.UndefOr[SnapshotArnsList] = js.undefined
    /**
      * The name of a Redis snapshot from which to restore data into the new node group (shard). The snapshot status changes to restoring while the new node group (shard) is being created.  This parameter is only valid if the Engine parameter is redis. 
      */
    var SnapshotName: js.UndefOr[String] = js.undefined
    /**
      * The number of days for which ElastiCache retains automatic snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot taken today is retained for 5 days before being deleted.  This parameter is only valid if the Engine parameter is redis.  Default: 0 (i.e., automatic backups are disabled for this cache cluster).
      */
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard). Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.  This parameter is only valid if the Engine parameter is redis. 
      */
    var SnapshotWindow: js.UndefOr[String] = js.undefined
    /**
      * A list of cost allocation tags to be added to this resource.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster] = js.undefined
  }
  
  trait CreateCacheParameterGroupMessage extends js.Object {
    /**
      * The name of the cache parameter group family that the cache parameter group can be used with. Valid values are: memcached1.4 | redis2.6 | redis2.8 | redis3.2 | redis4.0 
      */
    var CacheParameterGroupFamily: String
    /**
      * A user-specified name for the cache parameter group.
      */
    var CacheParameterGroupName: String
    /**
      * A user-specified description for the cache parameter group.
      */
    var Description: String
  }
  
  trait CreateCacheParameterGroupResult extends js.Object {
    var CacheParameterGroup: js.UndefOr[CacheParameterGroup] = js.undefined
  }
  
  trait CreateCacheSecurityGroupMessage extends js.Object {
    /**
      * A name for the cache security group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default". Example: mysecuritygroup 
      */
    var CacheSecurityGroupName: String
    /**
      * A description for the cache security group.
      */
    var Description: String
  }
  
  trait CreateCacheSecurityGroupResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
  }
  
  trait CreateCacheSubnetGroupMessage extends js.Object {
    /**
      * A description for the cache subnet group.
      */
    var CacheSubnetGroupDescription: String
    /**
      * A name for the cache subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters or hyphens. Example: mysubnetgroup 
      */
    var CacheSubnetGroupName: String
    /**
      * A list of VPC subnet IDs for the cache subnet group.
      */
    var SubnetIds: SubnetIdentifierList
  }
  
  trait CreateCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: js.UndefOr[CacheSubnetGroup] = js.undefined
  }
  
  trait CreateReplicationGroupMessage extends js.Object {
    /**
      * A flag that enables encryption at rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the replication group is created. To enable encryption at rest on a replication group you must set AtRestEncryptionEnabled to true when you create the replication group.   Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6 or 4.x. Default: false 
      */
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      *  Reserved parameter. The password used to access a password protected server.  AuthToken can be specified only on replication groups where TransitEncryptionEnabled is true.  For HIPAA compliance, you must specify TransitEncryptionEnabled as true, an AuthToken, and a CacheSubnetGroup.  Password constraints:   Must be only printable ASCII characters.   Must be at least 16 characters and no more than 128 characters in length.   Cannot contain any of the following characters: '/', '"', or '@'.    For more information, see AUTH password at http://redis.io/commands/AUTH.
      */
    var AuthToken: js.UndefOr[String] = js.undefined
    /**
      * This parameter is currently disabled.
      */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * Specifies whether a read-only replica is automatically promoted to read/write primary if the existing primary fails. If true, Multi-AZ is enabled for this replication group. If false, Multi-AZ is disabled for this replication group.  AutomaticFailoverEnabled must be enabled for Redis (cluster mode enabled) replication groups. Default: false Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 and T2 cache node types.   Redis (cluster mode enabled): T1 node types.  
      */
    var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The compute and memory capacity of the nodes in the node group (shard). The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge   R4 node types; cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge       Notes:    All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).   Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.    Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.   Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.   For a complete listing of node types and specifications, see:    Amazon ElastiCache Product Features and Details     Cache Node Type-Specific Parameters for Memcached     Cache Node Type-Specific Parameters for Redis   
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * The name of the parameter group to associate with this replication group. If this argument is omitted, the default cache parameter group for the specified engine is used. If you are running Redis version 3.2.4 or later, only one node group (shard), and want to use a default parameter group, we recommend that you specify the parameter group by name.    To create a Redis (cluster mode disabled) replication group, use CacheParameterGroupName=default.redis3.2.   To create a Redis (cluster mode enabled) replication group, use CacheParameterGroupName=default.redis3.2.cluster.on.  
      */
    var CacheParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of cache security group names to associate with this replication group.
      */
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined
    /**
      * The name of the cache subnet group to be used for the replication group.  If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group before you start creating a cluster. For more information, see Subnets and Subnet Groups. 
      */
    var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * The name of the cache engine to be used for the clusters in this replication group.
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * The version number of the cache engine to be used for the clusters in this replication group. To view the supported cache engine versions, use the DescribeCacheEngineVersions operation.  Important: You can upgrade to a newer engine version (see Selecting a Cache Engine and Version) in the ElastiCache User Guide, but you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the existing cluster or replication group and create it anew with the earlier engine version. 
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * A list of node group (shard) configuration options. Each node group (shard) configuration has the following members: PrimaryAvailabilityZone, ReplicaAvailabilityZones, ReplicaCount, and Slots. If you're creating a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group, you can use this parameter to individually configure each node group (shard), or you can omit this parameter. However, when seeding a Redis (cluster mode enabled) cluster from a S3 rdb file, you must configure each node group (shard) using this parameter because you must specify the slots for each node group.
      */
    var NodeGroupConfiguration: js.UndefOr[NodeGroupConfigurationList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are sent.  The Amazon SNS topic owner must be the same as the cluster owner. 
      */
    var NotificationTopicArn: js.UndefOr[String] = js.undefined
    /**
      * The number of clusters this replication group initially has. This parameter is not used if there is more than one node group (shard). You should use ReplicasPerNodeGroup instead. If AutomaticFailoverEnabled is true, the value of this parameter must be at least 2. If AutomaticFailoverEnabled is false you can omit this parameter (it will default to 1), or you can explicitly set it to a value between 2 and 6. The maximum permitted value for NumCacheClusters is 6 (1 primary plus 5 replicas).
      */
    var NumCacheClusters: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * An optional parameter that specifies the number of node groups (shards) for this Redis (cluster mode enabled) replication group. For Redis (cluster mode disabled) either omit this parameter or set it to 1. Default: 1
      */
    var NumNodeGroups: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The port number on which each member of the replication group accepts connections.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A list of EC2 Availability Zones in which the replication group's clusters are created. The order of the Availability Zones in the list is the order in which clusters are allocated. The primary cluster is created in the first AZ in the list. This parameter is not used if there is more than one node group (shard). You should use NodeGroupConfiguration instead.  If you are creating your replication group in an Amazon VPC (recommended), you can only locate clusters in Availability Zones associated with the subnets in the selected subnet group. The number of Availability Zones listed must equal the value of NumCacheClusters.  Default: system chosen Availability Zones.
      */
    var PreferredCacheClusterAZs: js.UndefOr[AvailabilityZonesList] = js.undefined
    /**
      * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are: Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the cluster that serves as the primary for this replication group. This cluster must already exist and have a status of available. This parameter is not required if NumCacheClusters, NumNodeGroups, or ReplicasPerNodeGroup is specified.
      */
    var PrimaryClusterId: js.UndefOr[String] = js.undefined
    /**
      * An optional parameter that specifies the number of replica nodes in each node group (shard). Valid values are 0 to 5.
      */
    var ReplicasPerNodeGroup: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A user-created description for the replication group.
      */
    var ReplicationGroupDescription: String
    /**
      * The replication group identifier. This parameter is stored as a lowercase string. Constraints:   A name must contain from 1 to 20 alphanumeric characters or hyphens.   The first character must be a letter.   A name cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var ReplicationGroupId: String
    /**
      * One or more Amazon VPC security groups associated with this replication group. Use this parameter only when you are creating a replication group in an Amazon Virtual Private Cloud (Amazon VPC).
      */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined
    /**
      * A list of Amazon Resource Names (ARN) that uniquely identify the Redis RDB snapshot files stored in Amazon S3. The snapshot files are used to populate the new replication group. The Amazon S3 object name in the ARN cannot contain any commas. The new replication group will have the number of node groups (console: shards) specified by the parameter NumNodeGroups or the number of node groups configured by NodeGroupConfiguration regardless of the number of ARNs specified here. Example of an Amazon S3 ARN: arn:aws:s3:::my_bucket/snapshot1.rdb 
      */
    var SnapshotArns: js.UndefOr[SnapshotArnsList] = js.undefined
    /**
      * The name of a snapshot from which to restore data into the new replication group. The snapshot status changes to restoring while the new replication group is being created.
      */
    var SnapshotName: js.UndefOr[String] = js.undefined
    /**
      * The number of days for which ElastiCache retains automatic snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted. Default: 0 (i.e., automatic backups are disabled for this cluster).
      */
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard). Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
      */
    var SnapshotWindow: js.UndefOr[String] = js.undefined
    /**
      * A list of cost allocation tags to be added to this resource. A tag is a key-value pair.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster. This parameter is valid only if the Engine parameter is redis, the EngineVersion parameter is 3.2.6 or 4.x, and the cluster is being created in an Amazon VPC. If you enable in-transit encryption, you must also specify a value for CacheSubnetGroup.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6 or 4.x. Default: false   For HIPAA compliance, you must specify TransitEncryptionEnabled as true, an AuthToken, and a CacheSubnetGroup. 
      */
    var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  trait CreateReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
  }
  
  trait CreateSnapshotMessage extends js.Object {
    /**
      * The identifier of an existing cluster. The snapshot is created from this cluster.
      */
    var CacheClusterId: js.UndefOr[String] = js.undefined
    /**
      * The identifier of an existing replication group. The snapshot is created from this replication group.
      */
    var ReplicationGroupId: js.UndefOr[String] = js.undefined
    /**
      * A name for the snapshot being created.
      */
    var SnapshotName: String
  }
  
  trait CreateSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot] = js.undefined
  }
  
  trait DecreaseReplicaCountMessage extends js.Object {
    /**
      * If True, the number of replica nodes is decreased immediately. If False, the number of replica nodes is decreased during the next maintenance window.
      */
    var ApplyImmediately: Boolean
    /**
      * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled) replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups. The minimum number of replicas in a shard or replication group is:   Redis (cluster mode disabled)   If Multi-AZ with Automatic Failover is enabled: 1   If Multi-AZ with Automatic Failover is not enabled: 0     Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)  
      */
    var NewReplicaCount: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A list of ConfigureShard objects that can be used to configure each shard in a Redis (cluster mode enabled) replication group. The ConfigureShard has three members: NewReplicaCount, NodeGroupId, and PreferredAvailabilityZones.
      */
    var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.undefined
    /**
      * A list of the node ids to remove from the replication group or node group (shard).
      */
    var ReplicasToRemove: js.UndefOr[RemoveReplicasList] = js.undefined
    /**
      * The id of the replication group from which you want to remove replica nodes.
      */
    var ReplicationGroupId: String
  }
  
  trait DecreaseReplicaCountResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
  }
  
  trait DeleteCacheClusterMessage extends js.Object {
    /**
      * The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
      */
    var CacheClusterId: String
    /**
      * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot. ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
      */
    var FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined
  }
  
  trait DeleteCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster] = js.undefined
  }
  
  trait DeleteCacheParameterGroupMessage extends js.Object {
    /**
      * The name of the cache parameter group to delete.  The specified cache security group must not be associated with any clusters. 
      */
    var CacheParameterGroupName: String
  }
  
  trait DeleteCacheSecurityGroupMessage extends js.Object {
    /**
      * The name of the cache security group to delete.  You cannot delete the default security group. 
      */
    var CacheSecurityGroupName: String
  }
  
  trait DeleteCacheSubnetGroupMessage extends js.Object {
    /**
      * The name of the cache subnet group to delete. Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
      */
    var CacheSubnetGroupName: String
  }
  
  trait DeleteReplicationGroupMessage extends js.Object {
    /**
      * The name of a final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in the cluster, rather than one of the replicas; this is to ensure that it captures the freshest data. After the final snapshot is taken, the replication group is immediately deleted.
      */
    var FinalSnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The identifier for the cluster to be deleted. This parameter is not case sensitive.
      */
    var ReplicationGroupId: String
    /**
      * If set to true, all of the read replicas are deleted, but the primary node is retained.
      */
    var RetainPrimaryCluster: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  trait DeleteReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
  }
  
  trait DeleteSnapshotMessage extends js.Object {
    /**
      * The name of the snapshot to be deleted.
      */
    var SnapshotName: String
  }
  
  trait DeleteSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot] = js.undefined
  }
  
  trait DescribeCacheClustersMessage extends js.Object {
    /**
      * The user-supplied cluster identifier. If this parameter is specified, only information about that specific cluster is returned. This parameter isn't case sensitive.
      */
    var CacheClusterId: js.UndefOr[String] = js.undefined
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * An optional flag that can be included in the DescribeCacheCluster request to show only nodes (API/CLI: clusters) that are not members of a replication group. In practice, this mean Memcached and single node Redis clusters.
      */
    var ShowCacheClustersNotInReplicationGroups: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * An optional flag that can be included in the DescribeCacheCluster request to retrieve information about the individual cache nodes.
      */
    var ShowCacheNodeInfo: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  trait DescribeCacheEngineVersionsMessage extends js.Object {
    /**
      * The name of a specific cache parameter group family to return details for. Valid values are: memcached1.4 | redis2.6 | redis2.8 | redis3.2 | redis4.0  Constraints:   Must be 1 to 255 alphanumeric characters   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens  
      */
    var CacheParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * If true, specifies that only the default version of the specified engine or engine and major version combination is to be returned.
      */
    var DefaultOnly: js.UndefOr[Boolean] = js.undefined
    /**
      * The cache engine to return. Valid values: memcached | redis 
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * The cache engine version to return. Example: 1.4.14 
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeCacheParameterGroupsMessage extends js.Object {
    /**
      * The name of a specific cache parameter group to return details for.
      */
    var CacheParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeCacheParametersMessage extends js.Object {
    /**
      * The name of a specific cache parameter group to return details for.
      */
    var CacheParameterGroupName: String
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The parameter types to return. Valid values: user | system | engine-default 
      */
    var Source: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeCacheSecurityGroupsMessage extends js.Object {
    /**
      * The name of the cache security group to return details for.
      */
    var CacheSecurityGroupName: js.UndefOr[String] = js.undefined
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeCacheSubnetGroupsMessage extends js.Object {
    /**
      * The name of the cache subnet group to return details for.
      */
    var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeEngineDefaultParametersMessage extends js.Object {
    /**
      * The name of the cache parameter group family. Valid values are: memcached1.4 | redis2.6 | redis2.8 | redis3.2 | redis4.0 
      */
    var CacheParameterGroupFamily: String
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeEngineDefaultParametersResult extends js.Object {
    var EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined
  }
  
  trait DescribeEventsMessage extends js.Object {
    /**
      * The number of minutes worth of events to retrieve.
      */
    var Duration: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The end of the time interval for which to retrieve events, specified in ISO 8601 format.  Example: 2017-03-30T07:03:49.555Z
      */
    var EndTime: js.UndefOr[TStamp] = js.undefined
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The identifier of the event source for which events are returned. If not specified, all sources are included in the response.
      */
    var SourceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The event source to retrieve events for. If no value is specified, all events are returned.
      */
    var SourceType: js.UndefOr[SourceType] = js.undefined
    /**
      * The beginning of the time interval to retrieve events for, specified in ISO 8601 format.  Example: 2017-03-30T07:03:49.555Z
      */
    var StartTime: js.UndefOr[TStamp] = js.undefined
  }
  
  trait DescribeReplicationGroupsMessage extends js.Object {
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The identifier for the replication group to be described. This parameter is not case sensitive. If you do not specify this parameter, information about all replication groups is returned.
      */
    var ReplicationGroupId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeReservedCacheNodesMessage extends js.Object {
    /**
      * The cache node type filter value. Use this parameter to show only those reservations matching the specified cache node type. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge   R4 node types; cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge       Notes:    All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).   Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.    Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.   Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.   For a complete listing of node types and specifications, see:    Amazon ElastiCache Product Features and Details     Cache Node Type-Specific Parameters for Memcached     Cache Node Type-Specific Parameters for Redis   
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * The duration filter value, specified in years or seconds. Use this parameter to show only reservations for this duration. Valid Values: 1 | 3 | 31536000 | 94608000 
      */
    var Duration: js.UndefOr[String] = js.undefined
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The offering type filter value. Use this parameter to show only the available offerings matching the specified offering type. Valid values: "Light Utilization"|"Medium Utilization"|"Heavy Utilization" 
      */
    var OfferingType: js.UndefOr[String] = js.undefined
    /**
      * The product description filter value. Use this parameter to show only those reservations matching the specified product description.
      */
    var ProductDescription: js.UndefOr[String] = js.undefined
    /**
      * The reserved cache node identifier filter value. Use this parameter to show only the reservation that matches the specified reservation ID.
      */
    var ReservedCacheNodeId: js.UndefOr[String] = js.undefined
    /**
      * The offering identifier filter value. Use this parameter to show only purchased reservations matching the specified offering identifier.
      */
    var ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeReservedCacheNodesOfferingsMessage extends js.Object {
    /**
      * The cache node type filter value. Use this parameter to show only the available offerings matching the specified cache node type. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge   R4 node types; cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge       Notes:    All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).   Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.    Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.   Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.   For a complete listing of node types and specifications, see:    Amazon ElastiCache Product Features and Details     Cache Node Type-Specific Parameters for Memcached     Cache Node Type-Specific Parameters for Redis   
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * Duration filter value, specified in years or seconds. Use this parameter to show only reservations for a given duration. Valid Values: 1 | 3 | 31536000 | 94608000 
      */
    var Duration: js.UndefOr[String] = js.undefined
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The offering type filter value. Use this parameter to show only the available offerings matching the specified offering type. Valid Values: "Light Utilization"|"Medium Utilization"|"Heavy Utilization" 
      */
    var OfferingType: js.UndefOr[String] = js.undefined
    /**
      * The product description filter value. Use this parameter to show only the available offerings matching the specified product description.
      */
    var ProductDescription: js.UndefOr[String] = js.undefined
    /**
      * The offering identifier filter value. Use this parameter to show only the available offering that matches the specified reservation identifier. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706 
      */
    var ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeSnapshotsListMessage extends js.Object {
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of snapshots. Each item in the list contains detailed information about one snapshot.
      */
    var Snapshots: js.UndefOr[SnapshotList] = js.undefined
  }
  
  trait DescribeSnapshotsMessage extends js.Object {
    /**
      * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific cluster are described.
      */
    var CacheClusterId: js.UndefOr[String] = js.undefined
    /**
      * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 50 Constraints: minimum 20; maximum 50.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A user-supplied replication group identifier. If this parameter is specified, only snapshots associated with that specific replication group are described.
      */
    var ReplicationGroupId: js.UndefOr[String] = js.undefined
    /**
      * A Boolean value which if true, the node group (shard) configuration is included in the snapshot description.
      */
    var ShowNodeGroupConfig: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * A user-supplied name of the snapshot. If this parameter is specified, only this snapshot are described.
      */
    var SnapshotName: js.UndefOr[String] = js.undefined
    /**
      * If set to system, the output shows snapshots that were automatically created by ElastiCache. If set to user the output shows snapshots that were manually created. If omitted, the output shows both automatically and manually created snapshots.
      */
    var SnapshotSource: js.UndefOr[String] = js.undefined
  }
  
  trait EC2SecurityGroup extends js.Object {
    /**
      * The name of the Amazon EC2 security group.
      */
    var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
    /**
      * The AWS account ID of the Amazon EC2 security group owner.
      */
    var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    /**
      * The status of the Amazon EC2 security group.
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait Endpoint extends js.Object {
    /**
      * The DNS hostname of the cache node.
      */
    var Address: js.UndefOr[String] = js.undefined
    /**
      * The port number that the cache engine is listening on.
      */
    var Port: js.UndefOr[Integer] = js.undefined
  }
  
  trait EngineDefaults extends js.Object {
    /**
      * A list of parameters specific to a particular cache node type. Each element in the list contains detailed information about one parameter.
      */
    var CacheNodeTypeSpecificParameters: js.UndefOr[CacheNodeTypeSpecificParametersList] = js.undefined
    /**
      * Specifies the name of the cache parameter group family to which the engine default parameters apply. Valid values are: memcached1.4 | redis2.6 | redis2.8 | redis3.2 | redis4.0 
      */
    var CacheParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * Contains a list of engine default parameters.
      */
    var Parameters: js.UndefOr[ParametersList] = js.undefined
  }
  
  trait Event extends js.Object {
    /**
      * The date and time when the event occurred.
      */
    var Date: js.UndefOr[TStamp] = js.undefined
    /**
      * The text of the event.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      * The identifier for the source of the event. For example, if the event occurred at the cluster level, the identifier would be the name of the cluster.
      */
    var SourceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * Specifies the origin of this event - a cluster, a parameter group, a security group, etc.
      */
    var SourceType: js.UndefOr[SourceType] = js.undefined
  }
  
  trait EventsMessage extends js.Object {
    /**
      * A list of events. Each element in the list contains detailed information about one event.
      */
    var Events: js.UndefOr[EventList] = js.undefined
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait IncreaseReplicaCountMessage extends js.Object {
    /**
      * If True, the number of replica nodes is increased immediately. If False, the number of replica nodes is increased during the next maintenance window.
      */
    var ApplyImmediately: Boolean
    /**
      * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled) replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups.
      */
    var NewReplicaCount: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A list of ConfigureShard objects that can be used to configure each shard in a Redis (cluster mode enabled) replication group. The ConfigureShard has three members: NewReplicaCount, NodeGroupId, and PreferredAvailabilityZones.
      */
    var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.undefined
    /**
      * The id of the replication group to which you want to add replica nodes.
      */
    var ReplicationGroupId: String
  }
  
  trait IncreaseReplicaCountResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
  }
  
  trait ListAllowedNodeTypeModificationsMessage extends js.Object {
    /**
      * The name of the cluster you want to scale up to a larger node instanced type. ElastiCache uses the cluster id to identify the current node type of this cluster and from that to create a list of node types you can scale up to.  You must provide a value for either the CacheClusterId or the ReplicationGroupId. 
      */
    var CacheClusterId: js.UndefOr[String] = js.undefined
    /**
      * The name of the replication group want to scale up to a larger node type. ElastiCache uses the replication group id to identify the current node type being used by this replication group, and from that to create a list of node types you can scale up to.  You must provide a value for either the CacheClusterId or the ReplicationGroupId. 
      */
    var ReplicationGroupId: js.UndefOr[String] = js.undefined
  }
  
  trait ListTagsForResourceMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource for which you want the list of tags, for example arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster or arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
      */
    var ResourceName: String
  }
  
  trait ModifyCacheClusterMessage extends js.Object {
    /**
      * Specifies whether the new nodes in this Memcached cluster are all created in a single Availability Zone or created across multiple Availability Zones. Valid values: single-az | cross-az. This option is only supported for Memcached clusters.  You cannot specify single-az if the Memcached cluster already has cache nodes in different Availability Zones. If cross-az is specified, existing Memcached nodes remain in their current Availability Zone. Only newly created nodes are located in different Availability Zones. For instructions on how to move existing Memcached nodes to different Availability Zones, see the Availability Zone Considerations section of Cache Node Considerations for Memcached. 
      */
    var AZMode: js.UndefOr[AZMode] = js.undefined
    /**
      * If true, this parameter causes the modifications in this request and any pending modifications to be applied, asynchronously and as soon as possible, regardless of the PreferredMaintenanceWindow setting for the cluster. If false, changes to the cluster are applied on the next maintenance reboot, or the next failure reboot, whichever occurs first.  If you perform a ModifyCacheCluster before a pending modification is applied, the pending modification is replaced by the newer modification.  Valid values: true | false  Default: false 
      */
    var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
    /**
      * This parameter is currently disabled.
      */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The cluster identifier. This value is stored as a lowercase string.
      */
    var CacheClusterId: String
    /**
      * A list of cache node IDs to be removed. A node ID is a numeric identifier (0001, 0002, etc.). This parameter is only valid when NumCacheNodes is less than the existing number of cache nodes. The number of cache node IDs supplied in this parameter must match the difference between the existing number of cache nodes in the cluster or pending cache nodes, whichever is greater, and the value of NumCacheNodes in the request. For example: If you have 3 active cache nodes, 7 pending cache nodes, and the number of cache nodes in this ModifyCacheCluster call is 5, you must list 2 (7 - 5) cache node IDs to remove.
      */
    var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.undefined
    /**
      * A valid cache node type that you want to scale this cluster up to.
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * The name of the cache parameter group to apply to this cluster. This change is asynchronously applied as soon as possible for parameters when the ApplyImmediately parameter is specified as true for this request.
      */
    var CacheParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of cache security group names to authorize on this cluster. This change is asynchronously applied as soon as possible. You can use this parameter only with clusters that are created outside of an Amazon Virtual Private Cloud (Amazon VPC). Constraints: Must contain no more than 255 alphanumeric characters. Must not be "Default".
      */
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined
    /**
      * The upgraded version of the cache engine to be run on the cache nodes.  Important: You can upgrade to a newer engine version (see Selecting a Cache Engine and Version), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the existing cluster and create it anew with the earlier engine version. 
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The list of Availability Zones where the new Memcached cache nodes are created. This parameter is only valid when NumCacheNodes in the request is greater than the sum of the number of active cache nodes and the number of cache nodes pending creation (which may be zero). The number of Availability Zones supplied in this list must match the cache nodes being added in this request. This option is only supported on Memcached clusters. Scenarios:    Scenario 1: You have 3 active nodes and wish to add 2 nodes. Specify NumCacheNodes=5 (3 + 2) and optionally specify two Availability Zones for the two new nodes.    Scenario 2: You have 3 active nodes and 2 nodes pending creation (from the scenario 1 call) and want to add 1 more node. Specify NumCacheNodes=6 ((3 + 2) + 1) and optionally specify an Availability Zone for the new node.    Scenario 3: You want to cancel all pending operations. Specify NumCacheNodes=3 to cancel all pending operations.   The Availability Zone placement of nodes pending creation cannot be modified. If you wish to cancel any nodes pending creation, add 0 nodes by setting NumCacheNodes to the number of current nodes. If cross-az is specified, existing Memcached nodes remain in their current Availability Zone. Only newly created nodes can be located in different Availability Zones. For guidance on how to move existing Memcached nodes to different Availability Zones, see the Availability Zone Considerations section of Cache Node Considerations for Memcached.  Impact of new add/remove requests upon pending requests    Scenario-1   Pending Action: Delete   New Request: Delete   Result: The new delete, pending or immediate, replaces the pending delete.     Scenario-2   Pending Action: Delete   New Request: Create   Result: The new create, pending or immediate, replaces the pending delete.     Scenario-3   Pending Action: Create   New Request: Delete   Result: The new delete, pending or immediate, replaces the pending create.     Scenario-4   Pending Action: Create   New Request: Create   Result: The new create is added to the pending create.   Important: If the new create request is Apply Immediately - Yes, all creates are performed immediately. If the new create request is Apply Immediately - No, all creates are pending.     
      */
    var NewAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.  The Amazon SNS topic owner must be same as the cluster owner. 
      */
    var NotificationTopicArn: js.UndefOr[String] = js.undefined
    /**
      * The status of the Amazon SNS notification topic. Notifications are sent only if the status is active. Valid values: active | inactive 
      */
    var NotificationTopicStatus: js.UndefOr[String] = js.undefined
    /**
      * The number of cache nodes that the cluster should have. If the value for NumCacheNodes is greater than the sum of the number of current cache nodes and the number of cache nodes pending creation (which may be zero), more nodes are added. If the value is less than the number of existing cache nodes, nodes are removed. If the value is equal to the number of current cache nodes, any pending add or remove requests are canceled. If you are removing cache nodes, you must use the CacheNodeIdsToRemove parameter to provide the IDs of the specific cache nodes to remove. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.  Adding or removing Memcached cache nodes can be applied immediately or as a pending operation (see ApplyImmediately). A pending operation to modify the number of cache nodes in a cluster during its maintenance window, whether by adding or removing nodes in accordance with the scale out architecture, is not queued. The customer's latest request to add or remove nodes to the cluster overrides any previous pending operations to modify the number of cache nodes in the cluster. For example, a request to remove 2 nodes would override a previous pending operation to remove 3 nodes. Similarly, a request to add 2 nodes would override a previous pending operation to remove 3 nodes and vice versa. As Memcached cache nodes may now be provisioned in different Availability Zones with flexible cache node placement, a request to add nodes does not automatically override a previous pending operation to add nodes. The customer can modify the previous pending operation to add more nodes or explicitly cancel the pending request and retry the new request. To cancel pending operations to modify the number of cache nodes in a cluster, use the ModifyCacheCluster request and set NumCacheNodes equal to the number of cache nodes currently in the cluster. 
      */
    var NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * Specifies the VPC Security Groups associated with the cluster. This parameter can be used only with clusters that are created in an Amazon Virtual Private Cloud (Amazon VPC).
      */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined
    /**
      * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.  If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. 
      */
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster. 
      */
    var SnapshotWindow: js.UndefOr[String] = js.undefined
  }
  
  trait ModifyCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster] = js.undefined
  }
  
  trait ModifyCacheParameterGroupMessage extends js.Object {
    /**
      * The name of the cache parameter group to modify.
      */
    var CacheParameterGroupName: String
    /**
      * An array of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
      */
    var ParameterNameValues: ParameterNameValueList
  }
  
  trait ModifyCacheSubnetGroupMessage extends js.Object {
    /**
      * A description of the cache subnet group.
      */
    var CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined
    /**
      * The name for the cache subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters or hyphens. Example: mysubnetgroup 
      */
    var CacheSubnetGroupName: String
    /**
      * The EC2 subnet IDs for the cache subnet group.
      */
    var SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
  }
  
  trait ModifyCacheSubnetGroupResult extends js.Object {
    var CacheSubnetGroup: js.UndefOr[CacheSubnetGroup] = js.undefined
  }
  
  trait ModifyReplicationGroupMessage extends js.Object {
    /**
      * If true, this parameter causes the modifications in this request and any pending modifications to be applied, asynchronously and as soon as possible, regardless of the PreferredMaintenanceWindow setting for the replication group. If false, changes to the nodes in the replication group are applied on the next maintenance reboot, or the next failure reboot, whichever occurs first. Valid values: true | false  Default: false 
      */
    var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
    /**
      * This parameter is currently disabled.
      */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * Determines whether a read replica is automatically promoted to read/write primary if the existing primary encounters a failure. Valid values: true | false  Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 and T2 cache node types.   Redis (cluster mode enabled): T1 node types.  
      */
    var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * A valid cache node type that you want to scale this replication group to.
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * The name of the cache parameter group to apply to all of the clusters in this replication group. This change is asynchronously applied as soon as possible for parameters when the ApplyImmediately parameter is specified as true for this request.
      */
    var CacheParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of cache security group names to authorize for the clusters in this replication group. This change is asynchronously applied as soon as possible. This parameter can be used only with replication group containing clusters running outside of an Amazon Virtual Private Cloud (Amazon VPC). Constraints: Must contain no more than 255 alphanumeric characters. Must not be Default.
      */
    var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.undefined
    /**
      * The upgraded version of the cache engine to be run on the clusters in the replication group.  Important: You can upgrade to a newer engine version (see Selecting a Cache Engine and Version), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the existing replication group and create it anew with the earlier engine version. 
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * Deprecated. This parameter is not used.
      */
    var NodeGroupId: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.  The Amazon SNS topic owner must be same as the replication group owner.  
      */
    var NotificationTopicArn: js.UndefOr[String] = js.undefined
    /**
      * The status of the Amazon SNS notification topic for the replication group. Notifications are sent only if the status is active. Valid values: active | inactive 
      */
    var NotificationTopicStatus: js.UndefOr[String] = js.undefined
    /**
      * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * For replication groups with a single primary, if this parameter is specified, ElastiCache promotes the specified cluster in the specified replication group to the primary role. The nodes of all other clusters in the replication group are read replicas.
      */
    var PrimaryClusterId: js.UndefOr[String] = js.undefined
    /**
      * A description for the replication group. Maximum length is 255 characters.
      */
    var ReplicationGroupDescription: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the replication group to modify.
      */
    var ReplicationGroupId: String
    /**
      * Specifies the VPC Security Groups associated with the clusters in the replication group. This parameter can be used only with replication group containing clusters running in an Amazon Virtual Private Cloud (Amazon VPC).
      */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.undefined
    /**
      * The number of days for which ElastiCache retains automatic node group (shard) snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.  Important If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
      */
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of the node group (shard) specified by SnapshottingClusterId. Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
      */
    var SnapshotWindow: js.UndefOr[String] = js.undefined
    /**
      * The cluster ID that is used as the daily snapshot source for the replication group. This parameter cannot be set for Redis (cluster mode enabled) replication groups.
      */
    var SnapshottingClusterId: js.UndefOr[String] = js.undefined
  }
  
  trait ModifyReplicationGroupResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
  }
  
  trait ModifyReplicationGroupShardConfigurationMessage extends js.Object {
    /**
      * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for this parameter is true. Value: true
      */
    var ApplyImmediately: Boolean
    /**
      * The number of node groups (shards) that results from the modification of the shard configuration.
      */
    var NodeGroupCount: Integer
    /**
      * If the value of NodeGroupCount is less than the current number of node groups (shards), the NodeGroupsToRemove or NodeGroupsToRetain is a required list of node group ids to remove from or retain in the cluster. ElastiCache for Redis will attempt to remove all node groups listed by NodeGroupsToRemove from the cluster.
      */
    var NodeGroupsToRemove: js.UndefOr[NodeGroupsToRemoveList] = js.undefined
    /**
      * If the value of NodeGroupCount is less than the current number of node groups (shards), the NodeGroupsToRemove or NodeGroupsToRetain is a required list of node group ids to remove from or retain in the cluster. ElastiCache for Redis will attempt to remove all node groups except those listed by NodeGroupsToRetain from the cluster.
      */
    var NodeGroupsToRetain: js.UndefOr[NodeGroupsToRetainList] = js.undefined
    /**
      * The name of the Redis (cluster mode enabled) cluster (replication group) on which the shards are to be configured.
      */
    var ReplicationGroupId: String
    /**
      * Specifies the preferred availability zones for each node group in the cluster. If the value of NodeGroupCount is greater than the current number of node groups (shards), you can use this parameter to specify the preferred availability zones of the cluster's shards. If you omit this parameter ElastiCache selects availability zones for you. You can specify this parameter only if the value of NodeGroupCount is greater than the current number of node groups (shards).
      */
    var ReshardingConfiguration: js.UndefOr[ReshardingConfigurationList] = js.undefined
  }
  
  trait ModifyReplicationGroupShardConfigurationResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
  }
  
  trait NodeGroup extends js.Object {
    /**
      * The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains only 1 node group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group contains 1 to 15 node groups numbered 0001 to 0015. 
      */
    var NodeGroupId: js.UndefOr[String] = js.undefined
    /**
      * A list containing information about individual nodes within the node group (shard).
      */
    var NodeGroupMembers: js.UndefOr[NodeGroupMemberList] = js.undefined
    /**
      * The endpoint of the primary node in this node group (shard).
      */
    var PrimaryEndpoint: js.UndefOr[Endpoint] = js.undefined
    /**
      * The keyspace for this node group (shard).
      */
    var Slots: js.UndefOr[String] = js.undefined
    /**
      * The current state of this replication group - creating, available, etc.
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait NodeGroupConfiguration extends js.Object {
    /**
      * The 4-digit id for the node group these configuration values apply to.
      */
    var NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined
    /**
      * The Availability Zone where the primary node of this node group (shard) is launched.
      */
    var PrimaryAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this list must match the value of ReplicaCount or ReplicasPerNodeGroup if not specified.
      */
    var ReplicaAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined
    /**
      * The number of read replica nodes in this node group (shard).
      */
    var ReplicaCount: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is in the format startkey-endkey. Example: "0-3999" 
      */
    var Slots: js.UndefOr[String] = js.undefined
  }
  
  trait NodeGroupMember extends js.Object {
    /**
      * The ID of the cluster to which the node belongs.
      */
    var CacheClusterId: js.UndefOr[String] = js.undefined
    /**
      * The ID of the node within its cluster. A node ID is a numeric identifier (0001, 0002, etc.).
      */
    var CacheNodeId: js.UndefOr[String] = js.undefined
    /**
      * The role that is currently assigned to the node - primary or replica. This member is only applicable for Redis (cluster mode disabled) replication groups.
      */
    var CurrentRole: js.UndefOr[String] = js.undefined
    /**
      * The name of the Availability Zone in which the node is located.
      */
    var PreferredAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The information required for client programs to connect to a node for read operations. The read endpoint is only applicable on Redis (cluster mode disabled) clusters.
      */
    var ReadEndpoint: js.UndefOr[Endpoint] = js.undefined
  }
  
  trait NodeSnapshot extends js.Object {
    /**
      * A unique identifier for the source cluster.
      */
    var CacheClusterId: js.UndefOr[String] = js.undefined
    /**
      * The date and time when the cache node was created in the source cluster.
      */
    var CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The cache node identifier for the node in the source cluster.
      */
    var CacheNodeId: js.UndefOr[String] = js.undefined
    /**
      * The size of the cache on the source cache node.
      */
    var CacheSize: js.UndefOr[String] = js.undefined
    /**
      * The configuration for the source node group (shard).
      */
    var NodeGroupConfiguration: js.UndefOr[NodeGroupConfiguration] = js.undefined
    /**
      * A unique identifier for the source node group (shard).
      */
    var NodeGroupId: js.UndefOr[String] = js.undefined
    /**
      * The date and time when the source node's metadata and cache data set was obtained for the snapshot.
      */
    var SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
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
      * The valid range of values for the parameter.
      */
    var AllowedValues: js.UndefOr[String] = js.undefined
    /**
      * Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to be applied. You can force a reboot or wait until the next maintenance window's reboot. For more information, see Rebooting a Cluster.
      */
    var ChangeType: js.UndefOr[ChangeType] = js.undefined
    /**
      * The valid data type for the parameter.
      */
    var DataType: js.UndefOr[String] = js.undefined
    /**
      * A description of the parameter.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * Indicates whether (true) or not (false) the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed.
      */
    var IsModifiable: js.UndefOr[Boolean] = js.undefined
    /**
      * The earliest cache engine version to which the parameter can apply.
      */
    var MinimumEngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The name of the parameter.
      */
    var ParameterName: js.UndefOr[String] = js.undefined
    /**
      * The value of the parameter.
      */
    var ParameterValue: js.UndefOr[String] = js.undefined
    /**
      * The source of the parameter.
      */
    var Source: js.UndefOr[String] = js.undefined
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
  
  trait PendingModifiedValues extends js.Object {
    /**
      * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit numeric identifier (0001, 0002, etc.).
      */
    var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.undefined
    /**
      * The cache node type that this cluster or replication group is scaled to.
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * The new cache engine version that the cluster runs.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The new number of cache nodes for the cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
      */
    var NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait PurchaseReservedCacheNodesOfferingMessage extends js.Object {
    /**
      * The number of cache node instances to reserve. Default: 1 
      */
    var CacheNodeCount: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A customer-specified identifier to track this reservation.  The Reserved Cache Node ID is an unique customer-specified identifier to track this reservation. If this parameter is not specified, ElastiCache automatically generates an identifier for the reservation.  Example: myreservationID
      */
    var ReservedCacheNodeId: js.UndefOr[String] = js.undefined
    /**
      * The ID of the reserved cache node offering to purchase. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706 
      */
    var ReservedCacheNodesOfferingId: String
  }
  
  trait PurchaseReservedCacheNodesOfferingResult extends js.Object {
    var ReservedCacheNode: js.UndefOr[ReservedCacheNode] = js.undefined
  }
  
  trait RebootCacheClusterMessage extends js.Object {
    /**
      * The cluster identifier. This parameter is stored as a lowercase string.
      */
    var CacheClusterId: String
    /**
      * A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an entire cluster, specify all of the cache node IDs.
      */
    var CacheNodeIdsToReboot: CacheNodeIdsList
  }
  
  trait RebootCacheClusterResult extends js.Object {
    var CacheCluster: js.UndefOr[CacheCluster] = js.undefined
  }
  
  trait RecurringCharge extends js.Object {
    /**
      * The monetary amount of the recurring charge.
      */
    var RecurringChargeAmount: js.UndefOr[Double] = js.undefined
    /**
      * The frequency of the recurring charge.
      */
    var RecurringChargeFrequency: js.UndefOr[String] = js.undefined
  }
  
  trait RemoveTagsFromResourceMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource from which you want the tags removed, for example arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster or arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
      */
    var ResourceName: String
    /**
      * A list of TagKeys identifying the tags you want removed from the named resource.
      */
    var TagKeys: KeyList
  }
  
  trait ReplicationGroup extends js.Object {
    /**
      * A flag that enables encryption at-rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the cluster is created. To enable encryption at-rest on a cluster you must set AtRestEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6 or 4.x. Default: false 
      */
    var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * A flag that enables using an AuthToken (password) when issuing Redis commands. Default: false 
      */
    var AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * Indicates the status of Multi-AZ with automatic failover for this Redis replication group. Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 and T2 cache node types.   Redis (cluster mode enabled): T1 node types.  
      */
    var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined
    /**
      * The name of the compute and memory capacity node type for each node in the replication group.
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be partitioned across multiple shards (API/CLI: node groups). Valid values: true | false 
      */
    var ClusterEnabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The configuration endpoint for this replication group. Use the configuration endpoint to connect to this replication group.
      */
    var ConfigurationEndpoint: js.UndefOr[Endpoint] = js.undefined
    /**
      * The user supplied description of the replication group.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The names of all the cache clusters that are part of this replication group.
      */
    var MemberClusters: js.UndefOr[ClusterIdList] = js.undefined
    /**
      * A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups, this is a single-element list. For Redis (cluster mode enabled) replication groups, the list contains an entry for each node group (shard).
      */
    var NodeGroups: js.UndefOr[NodeGroupList] = js.undefined
    /**
      * A group of settings to be applied to the replication group, either immediately or during the next maintenance window.
      */
    var PendingModifiedValues: js.UndefOr[ReplicationGroupPendingModifiedValues] = js.undefined
    /**
      * The identifier for the replication group.
      */
    var ReplicationGroupId: js.UndefOr[String] = js.undefined
    /**
      * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.   If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. 
      */
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard). Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.  This parameter is only valid if the Engine parameter is redis. 
      */
    var SnapshotWindow: js.UndefOr[String] = js.undefined
    /**
      * The cluster ID that is used as the daily snapshot source for the replication group.
      */
    var SnapshottingClusterId: js.UndefOr[String] = js.undefined
    /**
      * The current state of this replication group - creating, available, modifying, deleting, create-failed, snapshotting.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6 or 4.x. Default: false 
      */
    var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  trait ReplicationGroupMessage extends js.Object {
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of replication groups. Each item in the list contains detailed information about one replication group.
      */
    var ReplicationGroups: js.UndefOr[ReplicationGroupList] = js.undefined
  }
  
  trait ReplicationGroupPendingModifiedValues extends js.Object {
    /**
      * Indicates the status of Multi-AZ with automatic failover for this Redis replication group. Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 and T2 cache node types.   Redis (cluster mode enabled): T1 node types.  
      */
    var AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus] = js.undefined
    /**
      * The primary cluster ID that is applied immediately (if --apply-immediately was specified), or during the next maintenance window.
      */
    var PrimaryClusterId: js.UndefOr[String] = js.undefined
    /**
      * The status of an online resharding operation.
      */
    var Resharding: js.UndefOr[ReshardingStatus] = js.undefined
  }
  
  trait ReservedCacheNode extends js.Object {
    /**
      * The number of cache nodes that have been reserved.
      */
    var CacheNodeCount: js.UndefOr[Integer] = js.undefined
    /**
      * The cache node type for the reserved cache nodes. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge   R4 node types; cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge       Notes:    All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).   Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.    Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.   Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.   For a complete listing of node types and specifications, see:    Amazon ElastiCache Product Features and Details     Cache Node Type-Specific Parameters for Memcached     Cache Node Type-Specific Parameters for Redis   
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * The duration of the reservation in seconds.
      */
    var Duration: js.UndefOr[Integer] = js.undefined
    /**
      * The fixed price charged for this reserved cache node.
      */
    var FixedPrice: js.UndefOr[Double] = js.undefined
    /**
      * The offering type of this reserved cache node.
      */
    var OfferingType: js.UndefOr[String] = js.undefined
    /**
      * The description of the reserved cache node.
      */
    var ProductDescription: js.UndefOr[String] = js.undefined
    /**
      * The recurring price charged to run this reserved cache node.
      */
    var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the reserved cache node. Example: arn:aws:elasticache:us-east-1:123456789012:reserved-instance:ri-2017-03-27-08-33-25-582 
      */
    var ReservationARN: js.UndefOr[String] = js.undefined
    /**
      * The unique identifier for the reservation.
      */
    var ReservedCacheNodeId: js.UndefOr[String] = js.undefined
    /**
      * The offering identifier.
      */
    var ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
    /**
      * The time the reservation started.
      */
    var StartTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The state of the reserved cache node.
      */
    var State: js.UndefOr[String] = js.undefined
    /**
      * The hourly price charged for this reserved cache node.
      */
    var UsagePrice: js.UndefOr[Double] = js.undefined
  }
  
  trait ReservedCacheNodeMessage extends js.Object {
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of reserved cache nodes. Each element in the list contains detailed information about one node.
      */
    var ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList] = js.undefined
  }
  
  trait ReservedCacheNodesOffering extends js.Object {
    /**
      * The cache node type for the reserved cache node. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge   R4 node types; cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge       Notes:    All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).   Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.    Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.   Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.   For a complete listing of node types and specifications, see:    Amazon ElastiCache Product Features and Details     Cache Node Type-Specific Parameters for Memcached     Cache Node Type-Specific Parameters for Redis   
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * The duration of the offering. in seconds.
      */
    var Duration: js.UndefOr[Integer] = js.undefined
    /**
      * The fixed price charged for this offering.
      */
    var FixedPrice: js.UndefOr[Double] = js.undefined
    /**
      * The offering type.
      */
    var OfferingType: js.UndefOr[String] = js.undefined
    /**
      * The cache engine used by the offering.
      */
    var ProductDescription: js.UndefOr[String] = js.undefined
    /**
      * The recurring price charged to run this reserved cache node.
      */
    var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
    /**
      * A unique identifier for the reserved cache node offering.
      */
    var ReservedCacheNodesOfferingId: js.UndefOr[String] = js.undefined
    /**
      * The hourly price charged for this offering.
      */
    var UsagePrice: js.UndefOr[Double] = js.undefined
  }
  
  trait ReservedCacheNodesOfferingMessage extends js.Object {
    /**
      * Provides an identifier to allow retrieval of paginated results.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of reserved cache node offerings. Each element in the list contains detailed information about one offering.
      */
    var ReservedCacheNodesOfferings: js.UndefOr[ReservedCacheNodesOfferingList] = js.undefined
  }
  
  trait ResetCacheParameterGroupMessage extends js.Object {
    /**
      * The name of the cache parameter group to reset.
      */
    var CacheParameterGroupName: String
    /**
      * An array of parameter names to reset to their default values. If ResetAllParameters is true, do not use ParameterNameValues. If ResetAllParameters is false, you must specify the name of at least one parameter to reset.
      */
    var ParameterNameValues: js.UndefOr[ParameterNameValueList] = js.undefined
    /**
      * If true, all parameters in the cache parameter group are reset to their default values. If false, only the parameters listed by ParameterNameValues are reset to their default values. Valid values: true | false 
      */
    var ResetAllParameters: js.UndefOr[Boolean] = js.undefined
  }
  
  trait ReshardingConfiguration extends js.Object {
    /**
      * The 4-digit id for the node group these configuration values apply to.
      */
    var NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined
    /**
      * A list of preferred availability zones for the nodes in this cluster.
      */
    var PreferredAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined
  }
  
  trait ReshardingStatus extends js.Object {
    /**
      * Represents the progress of an online resharding operation.
      */
    var SlotMigration: js.UndefOr[SlotMigration] = js.undefined
  }
  
  trait RevokeCacheSecurityGroupIngressMessage extends js.Object {
    /**
      * The name of the cache security group to revoke ingress from.
      */
    var CacheSecurityGroupName: String
    /**
      * The name of the Amazon EC2 security group to revoke access from.
      */
    var EC2SecurityGroupName: String
    /**
      * The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an AWS access key ID - you must provide a valid AWS account number for this parameter.
      */
    var EC2SecurityGroupOwnerId: String
  }
  
  trait RevokeCacheSecurityGroupIngressResult extends js.Object {
    var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
  }
  
  trait SecurityGroupMembership extends js.Object {
    /**
      * The identifier of the cache security group.
      */
    var SecurityGroupId: js.UndefOr[String] = js.undefined
    /**
      * The status of the cache security group membership. The status changes whenever a cache security group is modified, or when the cache security groups assigned to a cluster are modified.
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait SlotMigration extends js.Object {
    /**
      * The percentage of the slot migration that is complete.
      */
    var ProgressPercentage: js.UndefOr[Double] = js.undefined
  }
  
  trait Snapshot extends js.Object {
    /**
      * This parameter is currently disabled.
      */
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
    /**
      * Indicates the status of Multi-AZ with automatic failover for the source Redis replication group. Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 and T2 cache node types.   Redis (cluster mode enabled): T1 node types.  
      */
    var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined
    /**
      * The date and time when the source cluster was created.
      */
    var CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The user-supplied identifier of the source cluster.
      */
    var CacheClusterId: js.UndefOr[String] = js.undefined
    /**
      * The name of the compute and memory capacity node type for the source cluster. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge   R4 node types; cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge       Notes:    All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).   Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.    Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.   Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.   For a complete listing of node types and specifications, see:    Amazon ElastiCache Product Features and Details     Cache Node Type-Specific Parameters for Memcached     Cache Node Type-Specific Parameters for Redis   
      */
    var CacheNodeType: js.UndefOr[String] = js.undefined
    /**
      * The cache parameter group that is associated with the source cluster.
      */
    var CacheParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * The name of the cache subnet group associated with the source cluster.
      */
    var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * The name of the cache engine (memcached or redis) used by the source cluster.
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * The version of the cache engine version that is used by the source cluster.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * A list of the cache nodes in the source cluster.
      */
    var NodeSnapshots: js.UndefOr[NodeSnapshotList] = js.undefined
    /**
      * The number of cache nodes in the source cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
      */
    var NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The number of node groups (shards) in this snapshot. When restoring from a snapshot, the number of node groups (shards) in the snapshot and in the restored replication group must be the same.
      */
    var NumNodeGroups: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The port number used by each cache nodes in the source cluster.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The name of the Availability Zone in which the source cluster is located.
      */
    var PreferredAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * A description of the source replication group.
      */
    var ReplicationGroupDescription: js.UndefOr[String] = js.undefined
    /**
      * The unique identifier of the source replication group.
      */
    var ReplicationGroupId: js.UndefOr[String] = js.undefined
    /**
      * The name of a snapshot. For an automatic snapshot, the name is system-generated. For a manual snapshot, this is the user-provided name.
      */
    var SnapshotName: js.UndefOr[String] = js.undefined
    /**
      * For an automatic snapshot, the number of days for which ElastiCache retains the snapshot before deleting it. For manual snapshots, this field reflects the SnapshotRetentionLimit for the source cluster when the snapshot was created. This field is otherwise ignored: Manual snapshots do not expire, and can only be deleted using the DeleteSnapshot operation.   Important If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
      */
    var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
      */
    var SnapshotSource: js.UndefOr[String] = js.undefined
    /**
      * The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
      */
    var SnapshotStatus: js.UndefOr[String] = js.undefined
    /**
      * The daily time range during which ElastiCache takes daily snapshots of the source cluster.
      */
    var SnapshotWindow: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the topic used by the source cluster for publishing notifications.
      */
    var TopicArn: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group for the source cluster.
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait Subnet extends js.Object {
    /**
      * The Availability Zone associated with the subnet.
      */
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
    /**
      * The unique identifier for the subnet.
      */
    var SubnetIdentifier: js.UndefOr[String] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The key for the tag. May not be null.
      */
    var Key: js.UndefOr[String] = js.undefined
    /**
      * The tag's value. May be null.
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait TagListMessage extends js.Object {
    /**
      * A list of cost allocation tags as key-value pairs.
      */
    var TagList: js.UndefOr[TagList] = js.undefined
  }
  
  trait TestFailoverMessage extends js.Object {
    /**
      * The name of the node group (called shard in the console) in this replication group on which automatic failover is to be tested. You may test automatic failover on up to 5 node groups in any rolling 24-hour period.
      */
    var NodeGroupId: AllowedNodeGroupId
    /**
      * The name of the replication group (console: cluster) whose automatic failover is being tested by this operation.
      */
    var ReplicationGroupId: String
  }
  
  trait TestFailoverResult extends js.Object {
    var ReplicationGroup: js.UndefOr[ReplicationGroup] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds up to 50 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.  When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business categories (such as cost centers, application names, or owners) to organize your costs across multiple services. For more information, see Using Cost Allocation Tags in Amazon ElastiCache in the ElastiCache User Guide.
      */
    def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds up to 50 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.  When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business categories (such as cost centers, application names, or owners) to organize your costs across multiple services. For more information, see Using Cost Allocation Tags in Amazon ElastiCache in the ElastiCache User Guide.
      */
    def addTagsToResource(params: AddTagsToResourceMessage): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      params: AddTagsToResourceMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2, and Amazon EC2 security groups are used as the authorization mechanism.  You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another region. 
      */
    def authorizeCacheSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[AuthorizeCacheSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def authorizeCacheSecurityGroupIngress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AuthorizeCacheSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AuthorizeCacheSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2, and Amazon EC2 security groups are used as the authorization mechanism.  You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another region. 
      */
    def authorizeCacheSecurityGroupIngress(params: AuthorizeCacheSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[AuthorizeCacheSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def authorizeCacheSecurityGroupIngress(
      params: AuthorizeCacheSecurityGroupIngressMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AuthorizeCacheSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AuthorizeCacheSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Makes a copy of an existing snapshot.  This operation is valid for Redis only.   Users or groups that have permissions to use the CopySnapshot operation can create their own Amazon S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has the ability to use the CopySnapshot operation. For more information about using IAM to control the use of ElastiCache operations, see Exporting Snapshots and Authentication &amp; Access Control.  You could receive the following error messages.  Error Messages     Error Message: The S3 bucket %s is outside of the region.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s does not exist.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s is not owned by the authenticated user.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The authenticated user does not have sufficient permissions to perform the desired activity.  Solution: Contact your system administrator to get the needed permissions.    Error Message: The S3 bucket %s already contains an object with key %s.  Solution: Give the TargetSnapshotName a new and unique value. If exporting a snapshot, you could alternatively create a new Amazon S3 bucket and use this same value for TargetSnapshotName.    Error Message:  ElastiCache has not been granted READ permissions %s on the S3 Bucket.  Solution: Add List and Read permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.  Solution: Add Upload/Delete permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.  Solution: Add View Permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.  
      */
    def copySnapshot(): awsDashSdkLib.libRequestMod.Request[CopySnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copySnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopySnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopySnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Makes a copy of an existing snapshot.  This operation is valid for Redis only.   Users or groups that have permissions to use the CopySnapshot operation can create their own Amazon S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has the ability to use the CopySnapshot operation. For more information about using IAM to control the use of ElastiCache operations, see Exporting Snapshots and Authentication &amp; Access Control.  You could receive the following error messages.  Error Messages     Error Message: The S3 bucket %s is outside of the region.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s does not exist.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s is not owned by the authenticated user.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The authenticated user does not have sufficient permissions to perform the desired activity.  Solution: Contact your system administrator to get the needed permissions.    Error Message: The S3 bucket %s already contains an object with key %s.  Solution: Give the TargetSnapshotName a new and unique value. If exporting a snapshot, you could alternatively create a new Amazon S3 bucket and use this same value for TargetSnapshotName.    Error Message:  ElastiCache has not been granted READ permissions %s on the S3 Bucket.  Solution: Add List and Read permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.  Solution: Add Upload/Delete permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.  Solution: Add View Permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.  
      */
    def copySnapshot(params: CopySnapshotMessage): awsDashSdkLib.libRequestMod.Request[CopySnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copySnapshot(
      params: CopySnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopySnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopySnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either Memcached or Redis. This operation is not supported for Redis (cluster mode enabled) clusters.
      */
    def createCacheCluster(): awsDashSdkLib.libRequestMod.Request[CreateCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCacheCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCacheClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either Memcached or Redis. This operation is not supported for Redis (cluster mode enabled) clusters.
      */
    def createCacheCluster(params: CreateCacheClusterMessage): awsDashSdkLib.libRequestMod.Request[CreateCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCacheCluster(
      params: CreateCacheClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCacheClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache parameter group is a collection of parameters and their values that are applied to all of the nodes in any cluster or replication group using the CacheParameterGroup. A newly created CacheParameterGroup is an exact duplicate of the default parameter group for the CacheParameterGroupFamily. To customize the newly created CacheParameterGroup you can change the values of specific parameters. For more information, see:    ModifyCacheParameterGroup in the ElastiCache API Reference.    Parameters and Parameter Groups in the ElastiCache User Guide.  
      */
    def createCacheParameterGroup(): awsDashSdkLib.libRequestMod.Request[CreateCacheParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCacheParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCacheParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCacheParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache parameter group is a collection of parameters and their values that are applied to all of the nodes in any cluster or replication group using the CacheParameterGroup. A newly created CacheParameterGroup is an exact duplicate of the default parameter group for the CacheParameterGroupFamily. To customize the newly created CacheParameterGroup you can change the values of specific parameters. For more information, see:    ModifyCacheParameterGroup in the ElastiCache API Reference.    Parameters and Parameter Groups in the ElastiCache User Guide.  
      */
    def createCacheParameterGroup(params: CreateCacheParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateCacheParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCacheParameterGroup(
      params: CreateCacheParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCacheParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCacheParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new cache security group. Use a cache security group to control access to one or more clusters. Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more information, see CreateCacheSubnetGroup.
      */
    def createCacheSecurityGroup(): awsDashSdkLib.libRequestMod.Request[CreateCacheSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCacheSecurityGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCacheSecurityGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCacheSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new cache security group. Use a cache security group to control access to one or more clusters. Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more information, see CreateCacheSubnetGroup.
      */
    def createCacheSecurityGroup(params: CreateCacheSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateCacheSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCacheSecurityGroup(
      params: CreateCacheSecurityGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCacheSecurityGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCacheSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new cache subnet group. Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
      */
    def createCacheSubnetGroup(): awsDashSdkLib.libRequestMod.Request[CreateCacheSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCacheSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCacheSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCacheSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new cache subnet group. Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
      */
    def createCacheSubnetGroup(params: CreateCacheSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateCacheSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCacheSubnetGroup(
      params: CreateCacheSubnetGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCacheSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCacheSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group. A Redis (cluster mode disabled) replication group is a collection of clusters, where one of the clusters is a read/write primary and the others are read-only replicas. Writes to the primary are asynchronously propagated to the replicas. A Redis (cluster mode enabled) replication group is a collection of 1 to 15 node groups (shards). Each node group (shard) has one read/write primary node and up to 5 read-only replica nodes. Writes to the primary are asynchronously propagated to the replicas. Redis (cluster mode enabled) replication groups partition the data across node groups (shards). When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more read replicas to it, up to a total of 5 read replicas. You cannot alter a Redis (cluster mode enabled) replication group after it has been created. However, if you need to increase or decrease the number of node groups (console: shards), you can avail yourself of ElastiCache for Redis' enhanced backup and restore. For more information, see Restoring From a Backup with Cluster Resizing in the ElastiCache User Guide.  This operation is valid for Redis only. 
      */
    def createReplicationGroup(): awsDashSdkLib.libRequestMod.Request[CreateReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReplicationGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReplicationGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group. A Redis (cluster mode disabled) replication group is a collection of clusters, where one of the clusters is a read/write primary and the others are read-only replicas. Writes to the primary are asynchronously propagated to the replicas. A Redis (cluster mode enabled) replication group is a collection of 1 to 15 node groups (shards). Each node group (shard) has one read/write primary node and up to 5 read-only replica nodes. Writes to the primary are asynchronously propagated to the replicas. Redis (cluster mode enabled) replication groups partition the data across node groups (shards). When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more read replicas to it, up to a total of 5 read replicas. You cannot alter a Redis (cluster mode enabled) replication group after it has been created. However, if you need to increase or decrease the number of node groups (console: shards), you can avail yourself of ElastiCache for Redis' enhanced backup and restore. For more information, see Restoring From a Backup with Cluster Resizing in the ElastiCache User Guide.  This operation is valid for Redis only. 
      */
    def createReplicationGroup(params: CreateReplicationGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReplicationGroup(
      params: CreateReplicationGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReplicationGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a copy of an entire cluster or replication group at a specific moment in time.  This operation is valid for Redis only. 
      */
    def createSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a copy of an entire cluster or replication group at a specific moment in time.  This operation is valid for Redis only. 
      */
    def createSnapshot(params: CreateSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshot(
      params: CreateSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Dynamically decreases the number of replics in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
      */
    def decreaseReplicaCount(): awsDashSdkLib.libRequestMod.Request[DecreaseReplicaCountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def decreaseReplicaCount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DecreaseReplicaCountResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DecreaseReplicaCountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Dynamically decreases the number of replics in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
      */
    def decreaseReplicaCount(params: DecreaseReplicaCountMessage): awsDashSdkLib.libRequestMod.Request[DecreaseReplicaCountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def decreaseReplicaCount(
      params: DecreaseReplicaCountMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DecreaseReplicaCountResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DecreaseReplicaCountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously provisioned cluster. DeleteCacheCluster deletes all associated cache nodes, node endpoints and the cluster itself. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the cluster; you cannot cancel or revert this operation. This operation cannot be used to delete a cluster that is the last read replica of a replication group or node group (shard) that has Multi-AZ mode enabled or a cluster from a Redis (cluster mode enabled) replication group. This operation is not valid for Redis (cluster mode enabled) clusters.
      */
    def deleteCacheCluster(): awsDashSdkLib.libRequestMod.Request[DeleteCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCacheCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCacheClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously provisioned cluster. DeleteCacheCluster deletes all associated cache nodes, node endpoints and the cluster itself. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the cluster; you cannot cancel or revert this operation. This operation cannot be used to delete a cluster that is the last read replica of a replication group or node group (shard) that has Multi-AZ mode enabled or a cluster from a Redis (cluster mode enabled) replication group. This operation is not valid for Redis (cluster mode enabled) clusters.
      */
    def deleteCacheCluster(params: DeleteCacheClusterMessage): awsDashSdkLib.libRequestMod.Request[DeleteCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCacheCluster(
      params: DeleteCacheClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCacheClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with any cache clusters.
      */
    def deleteCacheParameterGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCacheParameterGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with any cache clusters.
      */
    def deleteCacheParameterGroup(params: DeleteCacheParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCacheParameterGroup(
      params: DeleteCacheParameterGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a cache security group.  You cannot delete a cache security group if it is associated with any clusters. 
      */
    def deleteCacheSecurityGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCacheSecurityGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a cache security group.  You cannot delete a cache security group if it is associated with any clusters. 
      */
    def deleteCacheSecurityGroup(params: DeleteCacheSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCacheSecurityGroup(
      params: DeleteCacheSecurityGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a cache subnet group.  You cannot delete a cache subnet group if it is associated with any clusters. 
      */
    def deleteCacheSubnetGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCacheSubnetGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a cache subnet group.  You cannot delete a cache subnet group if it is associated with any clusters. 
      */
    def deleteCacheSubnetGroup(params: DeleteCacheSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCacheSubnetGroup(
      params: DeleteCacheSubnetGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing replication group. By default, this operation deletes the entire replication group, including the primary/primaries and all of the read replicas. If the replication group has only one primary, you can optionally delete only the read replicas, while retaining the primary by setting RetainPrimaryCluster=true. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the selected resources; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
      */
    def deleteReplicationGroup(): awsDashSdkLib.libRequestMod.Request[DeleteReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReplicationGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReplicationGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing replication group. By default, this operation deletes the entire replication group, including the primary/primaries and all of the read replicas. If the replication group has only one primary, you can optionally delete only the read replicas, while retaining the primary by setting RetainPrimaryCluster=true. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the selected resources; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
      */
    def deleteReplicationGroup(params: DeleteReplicationGroupMessage): awsDashSdkLib.libRequestMod.Request[DeleteReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReplicationGroup(
      params: DeleteReplicationGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReplicationGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately begins deleting the snapshot; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
      */
    def deleteSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately begins deleting the snapshot; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
      */
    def deleteSnapshot(params: DeleteSnapshotMessage): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSnapshot(
      params: DeleteSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific cache cluster if a cluster identifier is supplied. By default, abbreviated information about the clusters is returned. You can use the optional ShowCacheNodeInfo flag to retrieve detailed information about the cache nodes associated with the clusters. These details include the DNS address and port for the cache node endpoint. If the cluster is in the creating state, only cluster-level information is displayed until all of the nodes are successfully provisioned. If the cluster is in the deleting state, only cluster-level information is displayed. If cache nodes are currently being added to the cluster, node endpoint information and creation time for the additional nodes are not displayed until they are completely provisioned. When the cluster state is available, the cluster is ready for use. If cache nodes are currently being removed from the cluster, no endpoint information for the removed nodes is displayed.
      */
    def describeCacheClusters(): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheClusters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheClusterMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific cache cluster if a cluster identifier is supplied. By default, abbreviated information about the clusters is returned. You can use the optional ShowCacheNodeInfo flag to retrieve detailed information about the cache nodes associated with the clusters. These details include the DNS address and port for the cache node endpoint. If the cluster is in the creating state, only cluster-level information is displayed until all of the nodes are successfully provisioned. If the cluster is in the deleting state, only cluster-level information is displayed. If cache nodes are currently being added to the cluster, node endpoint information and creation time for the additional nodes are not displayed until they are completely provisioned. When the cluster state is available, the cluster is ready for use. If cache nodes are currently being removed from the cluster, no endpoint information for the removed nodes is displayed.
      */
    def describeCacheClusters(params: DescribeCacheClustersMessage): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheClusters(
      params: DescribeCacheClustersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheClusterMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the available cache engines and their versions.
      */
    def describeCacheEngineVersions(): awsDashSdkLib.libRequestMod.Request[CacheEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheEngineVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheEngineVersionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the available cache engines and their versions.
      */
    def describeCacheEngineVersions(params: DescribeCacheEngineVersionsMessage): awsDashSdkLib.libRequestMod.Request[CacheEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheEngineVersions(
      params: DescribeCacheEngineVersionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheEngineVersionMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list contains only the descriptions for that group.
      */
    def describeCacheParameterGroups(): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheParameterGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheParameterGroupsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list contains only the descriptions for that group.
      */
    def describeCacheParameterGroups(params: DescribeCacheParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheParameterGroups(
      params: DescribeCacheParameterGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheParameterGroupsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the detailed parameter list for a particular cache parameter group.
      */
    def describeCacheParameters(): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheParameterGroupDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the detailed parameter list for a particular cache parameter group.
      */
    def describeCacheParameters(params: DescribeCacheParametersMessage): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheParameters(
      params: DescribeCacheParametersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheParameterGroupDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of cache security group descriptions. If a cache security group name is specified, the list contains only the description of that group.
      */
    def describeCacheSecurityGroups(): awsDashSdkLib.libRequestMod.Request[CacheSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheSecurityGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheSecurityGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of cache security group descriptions. If a cache security group name is specified, the list contains only the description of that group.
      */
    def describeCacheSecurityGroups(params: DescribeCacheSecurityGroupsMessage): awsDashSdkLib.libRequestMod.Request[CacheSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheSecurityGroups(
      params: DescribeCacheSecurityGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheSecurityGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only the description of that group.
      */
    def describeCacheSubnetGroups(): awsDashSdkLib.libRequestMod.Request[CacheSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheSubnetGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheSubnetGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only the description of that group.
      */
    def describeCacheSubnetGroups(params: DescribeCacheSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[CacheSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCacheSubnetGroups(
      params: DescribeCacheSubnetGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheSubnetGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the default engine and system parameter information for the specified cache engine.
      */
    def describeEngineDefaultParameters(): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEngineDefaultParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEngineDefaultParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the default engine and system parameter information for the specified cache engine.
      */
    def describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEngineDefaultParameters(
      params: DescribeEngineDefaultParametersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEngineDefaultParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events specific to a particular cluster, cache security group, or cache parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
      */
    def describeEvents(): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EventsMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events specific to a particular cluster, cache security group, or cache parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
      */
    def describeEvents(params: DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      params: DescribeEventsMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EventsMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a particular replication group. If no identifier is specified, DescribeReplicationGroups returns information about all replication groups.  This operation is valid for Redis only. 
      */
    def describeReplicationGroups(): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReplicationGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReplicationGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a particular replication group. If no identifier is specified, DescribeReplicationGroups returns information about all replication groups.  This operation is valid for Redis only. 
      */
    def describeReplicationGroups(params: DescribeReplicationGroupsMessage): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReplicationGroups(
      params: DescribeReplicationGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReplicationGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about reserved cache nodes for this account, or about a specified reserved cache node.
      */
    def describeReservedCacheNodes(): awsDashSdkLib.libRequestMod.Request[ReservedCacheNodeMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReservedCacheNodes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedCacheNodeMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedCacheNodeMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about reserved cache nodes for this account, or about a specified reserved cache node.
      */
    def describeReservedCacheNodes(params: DescribeReservedCacheNodesMessage): awsDashSdkLib.libRequestMod.Request[ReservedCacheNodeMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReservedCacheNodes(
      params: DescribeReservedCacheNodesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedCacheNodeMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedCacheNodeMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists available reserved cache node offerings.
      */
    def describeReservedCacheNodesOfferings(): awsDashSdkLib.libRequestMod.Request[ReservedCacheNodesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReservedCacheNodesOfferings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedCacheNodesOfferingMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedCacheNodesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists available reserved cache node offerings.
      */
    def describeReservedCacheNodesOfferings(params: DescribeReservedCacheNodesOfferingsMessage): awsDashSdkLib.libRequestMod.Request[ReservedCacheNodesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReservedCacheNodesOfferings(
      params: DescribeReservedCacheNodesOfferingsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedCacheNodesOfferingMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedCacheNodesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about cluster or replication group snapshots. By default, DescribeSnapshots lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with a particular cache cluster.  This operation is valid for Redis only. 
      */
    def describeSnapshots(): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSnapshots(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSnapshotsListMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about cluster or replication group snapshots. By default, DescribeSnapshots lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with a particular cache cluster.  This operation is valid for Redis only. 
      */
    def describeSnapshots(params: DescribeSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSnapshots(
      params: DescribeSnapshotsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSnapshotsListMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Dynamically increases the number of replics in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
      */
    def increaseReplicaCount(): awsDashSdkLib.libRequestMod.Request[IncreaseReplicaCountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def increaseReplicaCount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ IncreaseReplicaCountResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[IncreaseReplicaCountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Dynamically increases the number of replics in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
      */
    def increaseReplicaCount(params: IncreaseReplicaCountMessage): awsDashSdkLib.libRequestMod.Request[IncreaseReplicaCountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def increaseReplicaCount(
      params: IncreaseReplicaCountMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ IncreaseReplicaCountResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[IncreaseReplicaCountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all available node types that you can scale your Redis cluster's or replication group's current node type up to. When you use the ModifyCacheCluster or ModifyReplicationGroup operations to scale up your cluster or replication group, the value of the CacheNodeType parameter must be one of the node types returned by this operation.
      */
    def listAllowedNodeTypeModifications(): awsDashSdkLib.libRequestMod.Request[AllowedNodeTypeModificationsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAllowedNodeTypeModifications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AllowedNodeTypeModificationsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AllowedNodeTypeModificationsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all available node types that you can scale your Redis cluster's or replication group's current node type up to. When you use the ModifyCacheCluster or ModifyReplicationGroup operations to scale up your cluster or replication group, the value of the CacheNodeType parameter must be one of the node types returned by this operation.
      */
    def listAllowedNodeTypeModifications(params: ListAllowedNodeTypeModificationsMessage): awsDashSdkLib.libRequestMod.Request[AllowedNodeTypeModificationsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAllowedNodeTypeModifications(
      params: ListAllowedNodeTypeModificationsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AllowedNodeTypeModificationsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AllowedNodeTypeModificationsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all cost allocation tags currently on the named resource. A cost allocation tag is a key-value pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize and track your AWS costs. If the cluster is not in the available state, ListTagsForResource returns an error. You can have a maximum of 50 cost allocation tags on an ElastiCache resource. For more information, see Monitoring Costs with Tags.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all cost allocation tags currently on the named resource. A cost allocation tag is a key-value pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize and track your AWS costs. If the cluster is not in the available state, ListTagsForResource returns an error. You can have a maximum of 50 cost allocation tags on an ElastiCache resource. For more information, see Monitoring Costs with Tags.
      */
    def listTagsForResource(params: ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration parameters by specifying the parameters and the new values.
      */
    def modifyCacheCluster(): awsDashSdkLib.libRequestMod.Request[ModifyCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyCacheCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyCacheClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration parameters by specifying the parameters and the new values.
      */
    def modifyCacheCluster(params: ModifyCacheClusterMessage): awsDashSdkLib.libRequestMod.Request[ModifyCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyCacheCluster(
      params: ModifyCacheClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyCacheClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
      */
    def modifyCacheParameterGroup(): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyCacheParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
      */
    def modifyCacheParameterGroup(params: ModifyCacheParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyCacheParameterGroup(
      params: ModifyCacheParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing cache subnet group.
      */
    def modifyCacheSubnetGroup(): awsDashSdkLib.libRequestMod.Request[ModifyCacheSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyCacheSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyCacheSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyCacheSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing cache subnet group.
      */
    def modifyCacheSubnetGroup(params: ModifyCacheSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[ModifyCacheSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyCacheSubnetGroup(
      params: ModifyCacheSubnetGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyCacheSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyCacheSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a replication group. For Redis (cluster mode enabled) clusters, this operation cannot be used to change a cluster's node type or engine version. For more information, see:    Scaling for Amazon ElastiCache for Redis—Redis (cluster mode enabled) in the ElastiCache User Guide    ModifyReplicationGroupShardConfiguration in the ElastiCache API Reference    This operation is valid for Redis only. 
      */
    def modifyReplicationGroup(): awsDashSdkLib.libRequestMod.Request[ModifyReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyReplicationGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyReplicationGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a replication group. For Redis (cluster mode enabled) clusters, this operation cannot be used to change a cluster's node type or engine version. For more information, see:    Scaling for Amazon ElastiCache for Redis—Redis (cluster mode enabled) in the ElastiCache User Guide    ModifyReplicationGroupShardConfiguration in the ElastiCache API Reference    This operation is valid for Redis only. 
      */
    def modifyReplicationGroup(params: ModifyReplicationGroupMessage): awsDashSdkLib.libRequestMod.Request[ModifyReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyReplicationGroup(
      params: ModifyReplicationGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyReplicationGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance the keyspaces among exisiting shards.
      */
    def modifyReplicationGroupShardConfiguration(): awsDashSdkLib.libRequestMod.Request[ModifyReplicationGroupShardConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyReplicationGroupShardConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyReplicationGroupShardConfigurationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationGroupShardConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance the keyspaces among exisiting shards.
      */
    def modifyReplicationGroupShardConfiguration(params: ModifyReplicationGroupShardConfigurationMessage): awsDashSdkLib.libRequestMod.Request[ModifyReplicationGroupShardConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyReplicationGroupShardConfiguration(
      params: ModifyReplicationGroupShardConfigurationMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyReplicationGroupShardConfigurationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationGroupShardConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Allows you to purchase a reserved cache node offering.
      */
    def purchaseReservedCacheNodesOffering(): awsDashSdkLib.libRequestMod.Request[PurchaseReservedCacheNodesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def purchaseReservedCacheNodesOffering(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseReservedCacheNodesOfferingResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PurchaseReservedCacheNodesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Allows you to purchase a reserved cache node offering.
      */
    def purchaseReservedCacheNodesOffering(params: PurchaseReservedCacheNodesOfferingMessage): awsDashSdkLib.libRequestMod.Request[PurchaseReservedCacheNodesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def purchaseReservedCacheNodesOffering(
      params: PurchaseReservedCacheNodesOfferingMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseReservedCacheNodesOfferingResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PurchaseReservedCacheNodesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots some, or all, of the cache nodes within a provisioned cluster. This operation applies any modified cache parameter groups to the cluster. The reboot operation takes place as soon as possible, and results in a momentary outage to the cluster. During the reboot, the cluster status is set to REBOOTING. The reboot causes the contents of the cache (for each cache node being rebooted) to be lost. When the reboot is complete, a cluster event is created. Rebooting a cluster is currently supported on Memcached and Redis (cluster mode disabled) clusters. Rebooting is not supported on Redis (cluster mode enabled) clusters. If you make changes to parameters that require a Redis (cluster mode enabled) cluster reboot for the changes to be applied, see Rebooting a Cluster for an alternate process.
      */
    def rebootCacheCluster(): awsDashSdkLib.libRequestMod.Request[RebootCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootCacheCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootCacheClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots some, or all, of the cache nodes within a provisioned cluster. This operation applies any modified cache parameter groups to the cluster. The reboot operation takes place as soon as possible, and results in a momentary outage to the cluster. During the reboot, the cluster status is set to REBOOTING. The reboot causes the contents of the cache (for each cache node being rebooted) to be lost. When the reboot is complete, a cluster event is created. Rebooting a cluster is currently supported on Memcached and Redis (cluster mode disabled) clusters. Rebooting is not supported on Redis (cluster mode enabled) clusters. If you make changes to parameters that require a Redis (cluster mode enabled) cluster reboot for the changes to be applied, see Rebooting a Cluster for an alternate process.
      */
    def rebootCacheCluster(params: RebootCacheClusterMessage): awsDashSdkLib.libRequestMod.Request[RebootCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootCacheCluster(
      params: RebootCacheClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootCacheClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootCacheClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the tags identified by the TagKeys list from the named resource.
      */
    def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the tags identified by the TagKeys list from the named resource.
      */
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      params: RemoveTagsFromResourceMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the ResetAllParameters and CacheParameterGroupName parameters.
      */
    def resetCacheParameterGroup(): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetCacheParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the ResetAllParameters and CacheParameterGroupName parameters.
      */
    def resetCacheParameterGroup(params: ResetCacheParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetCacheParameterGroup(
      params: ResetCacheParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security group that had been previously authorized.
      */
    def revokeCacheSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[RevokeCacheSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeCacheSecurityGroupIngress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeCacheSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeCacheSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security group that had been previously authorized.
      */
    def revokeCacheSecurityGroupIngress(params: RevokeCacheSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[RevokeCacheSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeCacheSecurityGroupIngress(
      params: RevokeCacheSecurityGroupIngressMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeCacheSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeCacheSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Represents the input of a TestFailover operation which test automatic failover on a specified node group (called shard in the console) in a replication group (called cluster in the console).  Note the following    A customer can use this operation to test automatic failover on up to 5 shards (called node groups in the ElastiCache API and AWS CLI) in any rolling 24-hour period.   If calling this operation on shards in different clusters (called replication groups in the API and CLI), the calls can be made concurrently.     If calling this operation multiple times on different shards in the same Redis (cluster mode enabled) replication group, the first node replacement must complete before a subsequent call can be made.   To determine whether the node replacement is complete you can check Events using the Amazon ElastiCache console, the AWS CLI, or the ElastiCache API. Look for the following automatic failover related events, listed here in order of occurrance:   Replication group message: Test Failover API called for node group &lt;node-group-id&gt;    Cache cluster message: Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Replication group message: Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Cache cluster message: Recovering cache nodes &lt;node-id&gt;    Cache cluster message: Finished recovery for cache nodes &lt;node-id&gt;    For more information see:    Viewing ElastiCache Events in the ElastiCache User Guide     DescribeEvents in the ElastiCache API Reference     Also see, Testing Multi-AZ with Automatic Failover in the ElastiCache User Guide.
      */
    def testFailover(): awsDashSdkLib.libRequestMod.Request[TestFailoverResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testFailover(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestFailoverResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestFailoverResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Represents the input of a TestFailover operation which test automatic failover on a specified node group (called shard in the console) in a replication group (called cluster in the console).  Note the following    A customer can use this operation to test automatic failover on up to 5 shards (called node groups in the ElastiCache API and AWS CLI) in any rolling 24-hour period.   If calling this operation on shards in different clusters (called replication groups in the API and CLI), the calls can be made concurrently.     If calling this operation multiple times on different shards in the same Redis (cluster mode enabled) replication group, the first node replacement must complete before a subsequent call can be made.   To determine whether the node replacement is complete you can check Events using the Amazon ElastiCache console, the AWS CLI, or the ElastiCache API. Look for the following automatic failover related events, listed here in order of occurrance:   Replication group message: Test Failover API called for node group &lt;node-group-id&gt;    Cache cluster message: Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Replication group message: Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Cache cluster message: Recovering cache nodes &lt;node-id&gt;    Cache cluster message: Finished recovery for cache nodes &lt;node-id&gt;    For more information see:    Viewing ElastiCache Events in the ElastiCache User Guide     DescribeEvents in the ElastiCache API Reference     Also see, Testing Multi-AZ with Automatic Failover in the ElastiCache User Guide.
      */
    def testFailover(params: TestFailoverMessage): awsDashSdkLib.libRequestMod.Request[TestFailoverResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testFailover(
      params: TestFailoverMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestFailoverResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestFailoverResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the cacheClusterAvailable state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is available.
      */
    @JSName("waitFor")
    def waitFor_cacheClusterAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterAvailable): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_cacheClusterAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterAvailable,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheClusterMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the cacheClusterAvailable state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is available.
      */
    @JSName("waitFor")
    def waitFor_cacheClusterAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterAvailable,
      params: DescribeCacheClustersMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_cacheClusterAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterAvailable,
      params: DescribeCacheClustersMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheClusterMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the cacheClusterDeleted state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is deleted.
      */
    @JSName("waitFor")
    def waitFor_cacheClusterDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterDeleted): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_cacheClusterDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterDeleted,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheClusterMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the cacheClusterDeleted state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is deleted.
      */
    @JSName("waitFor")
    def waitFor_cacheClusterDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterDeleted,
      params: DescribeCacheClustersMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_cacheClusterDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterDeleted,
      params: DescribeCacheClustersMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CacheClusterMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CacheClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationGroupAvailable state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is available.
      */
    @JSName("waitFor")
    def waitFor_replicationGroupAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupAvailable): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationGroupAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupAvailable,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReplicationGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationGroupAvailable state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is available.
      */
    @JSName("waitFor")
    def waitFor_replicationGroupAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupAvailable,
      params: DescribeReplicationGroupsMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationGroupAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupAvailable,
      params: DescribeReplicationGroupsMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReplicationGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationGroupDeleted state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is deleted.
      */
    @JSName("waitFor")
    def waitFor_replicationGroupDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupDeleted): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationGroupDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupDeleted,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReplicationGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationGroupDeleted state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is deleted.
      */
    @JSName("waitFor")
    def waitFor_replicationGroupDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupDeleted,
      params: DescribeReplicationGroupsMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationGroupDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupDeleted,
      params: DescribeReplicationGroupsMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReplicationGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReplicationGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait _AZMode extends js.Object
  
  trait _AutomaticFailoverStatus extends js.Object
  
  trait _ChangeType extends js.Object
  
  trait _PendingAutomaticFailoverStatus extends js.Object
  
  trait _SourceType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AZMode = _AZMode | java.lang.String
  type AllowedNodeGroupId = java.lang.String
  type AutomaticFailoverStatus = _AutomaticFailoverStatus | java.lang.String
  type AvailabilityZonesList = js.Array[String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CacheClusterList = js.Array[CacheCluster]
  type CacheEngineVersionList = js.Array[CacheEngineVersion]
  type CacheNodeIdsList = js.Array[String]
  type CacheNodeList = js.Array[CacheNode]
  type CacheNodeTypeSpecificParametersList = js.Array[CacheNodeTypeSpecificParameter]
  type CacheNodeTypeSpecificValueList = js.Array[CacheNodeTypeSpecificValue]
  type CacheParameterGroupList = js.Array[CacheParameterGroup]
  type CacheSecurityGroupMembershipList = js.Array[CacheSecurityGroupMembership]
  type CacheSecurityGroupNameList = js.Array[String]
  type CacheSecurityGroups = js.Array[CacheSecurityGroup]
  type CacheSubnetGroups = js.Array[CacheSubnetGroup]
  type ChangeType = _ChangeType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterIdList = js.Array[String]
  type Double = scala.Double
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EventList = js.Array[Event]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[String]
  type NodeGroupConfigurationList = js.Array[NodeGroupConfiguration]
  type NodeGroupList = js.Array[NodeGroup]
  type NodeGroupMemberList = js.Array[NodeGroupMember]
  type NodeGroupsToRemoveList = js.Array[AllowedNodeGroupId]
  type NodeGroupsToRetainList = js.Array[AllowedNodeGroupId]
  type NodeSnapshotList = js.Array[NodeSnapshot]
  type NodeTypeList = js.Array[String]
  type ParameterNameValueList = js.Array[ParameterNameValue]
  type ParametersList = js.Array[Parameter]
  type PendingAutomaticFailoverStatus = _PendingAutomaticFailoverStatus | java.lang.String
  type PreferredAvailabilityZoneList = js.Array[String]
  type RecurringChargeList = js.Array[RecurringCharge]
  type RemoveReplicasList = js.Array[String]
  type ReplicaConfigurationList = js.Array[ConfigureShard]
  type ReplicationGroupList = js.Array[ReplicationGroup]
  type ReservedCacheNodeList = js.Array[ReservedCacheNode]
  type ReservedCacheNodesOfferingList = js.Array[ReservedCacheNodesOffering]
  type ReshardingConfigurationList = js.Array[ReshardingConfiguration]
  type SecurityGroupIdsList = js.Array[String]
  type SecurityGroupMembershipList = js.Array[SecurityGroupMembership]
  type SnapshotArnsList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type TStamp = stdLib.Date
  type TagList = js.Array[Tag]
  type apiVersion = _apiVersion | java.lang.String
}

