package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElastiCache
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ElastiCache: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ClientConfiguration = js.native
  /**
    * Adds up to 50 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.  When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business categories (such as cost centers, application names, or owners) to organize your costs across multiple services. For more information, see Using Cost Allocation Tags in Amazon ElastiCache in the ElastiCache User Guide.
    */
  def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTagsToResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds up to 50 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.  When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business categories (such as cost centers, application names, or owners) to organize your costs across multiple services. For more information, see Using Cost Allocation Tags in Amazon ElastiCache in the ElastiCache User Guide.
    */
  def addTagsToResource(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AddTagsToResourceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTagsToResource(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AddTagsToResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2, and Amazon EC2 security groups are used as the authorization mechanism.  You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another region. 
    */
  def authorizeCacheSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AuthorizeCacheSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def authorizeCacheSecurityGroupIngress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AuthorizeCacheSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AuthorizeCacheSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2, and Amazon EC2 security groups are used as the authorization mechanism.  You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another region. 
    */
  def authorizeCacheSecurityGroupIngress(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AuthorizeCacheSecurityGroupIngressMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AuthorizeCacheSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def authorizeCacheSecurityGroupIngress(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AuthorizeCacheSecurityGroupIngressMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AuthorizeCacheSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AuthorizeCacheSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Makes a copy of an existing snapshot.  This operation is valid for Redis only.   Users or groups that have permissions to use the CopySnapshot operation can create their own Amazon S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has the ability to use the CopySnapshot operation. For more information about using IAM to control the use of ElastiCache operations, see Exporting Snapshots and Authentication &amp; Access Control.  You could receive the following error messages.  Error Messages     Error Message: The S3 bucket %s is outside of the region.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s does not exist.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s is not owned by the authenticated user.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The authenticated user does not have sufficient permissions to perform the desired activity.  Solution: Contact your system administrator to get the needed permissions.    Error Message: The S3 bucket %s already contains an object with key %s.  Solution: Give the TargetSnapshotName a new and unique value. If exporting a snapshot, you could alternatively create a new Amazon S3 bucket and use this same value for TargetSnapshotName.    Error Message:  ElastiCache has not been granted READ permissions %s on the S3 Bucket.  Solution: Add List and Read permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.  Solution: Add Upload/Delete permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.  Solution: Add View Permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.  
    */
  def copySnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copySnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CopySnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Makes a copy of an existing snapshot.  This operation is valid for Redis only.   Users or groups that have permissions to use the CopySnapshot operation can create their own Amazon S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has the ability to use the CopySnapshot operation. For more information about using IAM to control the use of ElastiCache operations, see Exporting Snapshots and Authentication &amp; Access Control.  You could receive the following error messages.  Error Messages     Error Message: The S3 bucket %s is outside of the region.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s does not exist.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s is not owned by the authenticated user.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The authenticated user does not have sufficient permissions to perform the desired activity.  Solution: Contact your system administrator to get the needed permissions.    Error Message: The S3 bucket %s already contains an object with key %s.  Solution: Give the TargetSnapshotName a new and unique value. If exporting a snapshot, you could alternatively create a new Amazon S3 bucket and use this same value for TargetSnapshotName.    Error Message:  ElastiCache has not been granted READ permissions %s on the S3 Bucket.  Solution: Add List and Read permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.  Solution: Add Upload/Delete permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.  Solution: Add View Permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.  
    */
  def copySnapshot(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CopySnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copySnapshot(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CopySnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CopySnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CopySnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either Memcached or Redis. This operation is not supported for Redis (cluster mode enabled) clusters.
    */
  def createCacheCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCacheCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either Memcached or Redis. This operation is not supported for Redis (cluster mode enabled) clusters.
    */
  def createCacheCluster(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCacheCluster(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache parameter group is a collection of parameters and their values that are applied to all of the nodes in any cluster or replication group using the CacheParameterGroup. A newly created CacheParameterGroup is an exact duplicate of the default parameter group for the CacheParameterGroupFamily. To customize the newly created CacheParameterGroup you can change the values of specific parameters. For more information, see:    ModifyCacheParameterGroup in the ElastiCache API Reference.    Parameters and Parameter Groups in the ElastiCache User Guide.  
    */
  def createCacheParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCacheParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache parameter group is a collection of parameters and their values that are applied to all of the nodes in any cluster or replication group using the CacheParameterGroup. A newly created CacheParameterGroup is an exact duplicate of the default parameter group for the CacheParameterGroupFamily. To customize the newly created CacheParameterGroup you can change the values of specific parameters. For more information, see:    ModifyCacheParameterGroup in the ElastiCache API Reference.    Parameters and Parameter Groups in the ElastiCache User Guide.  
    */
  def createCacheParameterGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCacheParameterGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new cache security group. Use a cache security group to control access to one or more clusters. Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more information, see CreateCacheSubnetGroup.
    */
  def createCacheSecurityGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCacheSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSecurityGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new cache security group. Use a cache security group to control access to one or more clusters. Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more information, see CreateCacheSubnetGroup.
    */
  def createCacheSecurityGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCacheSecurityGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSecurityGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSecurityGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new cache subnet group. Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
    */
  def createCacheSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCacheSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new cache subnet group. Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
    */
  def createCacheSubnetGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCacheSubnetGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateCacheSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group. A Redis (cluster mode disabled) replication group is a collection of clusters, where one of the clusters is a read/write primary and the others are read-only replicas. Writes to the primary are asynchronously propagated to the replicas. A Redis (cluster mode enabled) replication group is a collection of 1 to 15 node groups (shards). Each node group (shard) has one read/write primary node and up to 5 read-only replica nodes. Writes to the primary are asynchronously propagated to the replicas. Redis (cluster mode enabled) replication groups partition the data across node groups (shards). When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more read replicas to it, up to a total of 5 read replicas. You cannot alter a Redis (cluster mode enabled) replication group after it has been created. However, if you need to increase or decrease the number of node groups (console: shards), you can avail yourself of ElastiCache for Redis' enhanced backup and restore. For more information, see Restoring From a Backup with Cluster Resizing in the ElastiCache User Guide.  This operation is valid for Redis only. 
    */
  def createReplicationGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReplicationGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateReplicationGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group. A Redis (cluster mode disabled) replication group is a collection of clusters, where one of the clusters is a read/write primary and the others are read-only replicas. Writes to the primary are asynchronously propagated to the replicas. A Redis (cluster mode enabled) replication group is a collection of 1 to 15 node groups (shards). Each node group (shard) has one read/write primary node and up to 5 read-only replica nodes. Writes to the primary are asynchronously propagated to the replicas. Redis (cluster mode enabled) replication groups partition the data across node groups (shards). When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more read replicas to it, up to a total of 5 read replicas. You cannot alter a Redis (cluster mode enabled) replication group after it has been created. However, if you need to increase or decrease the number of node groups (console: shards), you can avail yourself of ElastiCache for Redis' enhanced backup and restore. For more information, see Restoring From a Backup with Cluster Resizing in the ElastiCache User Guide.  This operation is valid for Redis only. 
    */
  def createReplicationGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateReplicationGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReplicationGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateReplicationGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateReplicationGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a copy of an entire cluster or replication group at a specific moment in time.  This operation is valid for Redis only. 
    */
  def createSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a copy of an entire cluster or replication group at a specific moment in time.  This operation is valid for Redis only. 
    */
  def createSnapshot(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSnapshot(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CreateSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Dynamically decreases the number of replics in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
    */
  def decreaseReplicaCount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DecreaseReplicaCountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def decreaseReplicaCount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DecreaseReplicaCountResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DecreaseReplicaCountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Dynamically decreases the number of replics in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
    */
  def decreaseReplicaCount(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DecreaseReplicaCountMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DecreaseReplicaCountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def decreaseReplicaCount(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DecreaseReplicaCountMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DecreaseReplicaCountResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DecreaseReplicaCountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously provisioned cluster. DeleteCacheCluster deletes all associated cache nodes, node endpoints and the cluster itself. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the cluster; you cannot cancel or revert this operation. This operation cannot be used to delete a cluster that is the last read replica of a replication group or node group (shard) that has Multi-AZ mode enabled or a cluster from a Redis (cluster mode enabled) replication group. This operation is not valid for Redis (cluster mode enabled) clusters.
    */
  def deleteCacheCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCacheCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously provisioned cluster. DeleteCacheCluster deletes all associated cache nodes, node endpoints and the cluster itself. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the cluster; you cannot cancel or revert this operation. This operation cannot be used to delete a cluster that is the last read replica of a replication group or node group (shard) that has Multi-AZ mode enabled or a cluster from a Redis (cluster mode enabled) replication group. This operation is not valid for Redis (cluster mode enabled) clusters.
    */
  def deleteCacheCluster(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCacheCluster(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteCacheParameterGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCacheParameterGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheParameterGroupMessage,
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
  def deleteCacheSecurityGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCacheSecurityGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheSecurityGroupMessage,
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
  def deleteCacheSubnetGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCacheSubnetGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteCacheSubnetGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing replication group. By default, this operation deletes the entire replication group, including the primary/primaries and all of the read replicas. If the replication group has only one primary, you can optionally delete only the read replicas, while retaining the primary by setting RetainPrimaryCluster=true. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the selected resources; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
    */
  def deleteReplicationGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReplicationGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteReplicationGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing replication group. By default, this operation deletes the entire replication group, including the primary/primaries and all of the read replicas. If the replication group has only one primary, you can optionally delete only the read replicas, while retaining the primary by setting RetainPrimaryCluster=true. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the selected resources; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
    */
  def deleteReplicationGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteReplicationGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReplicationGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteReplicationGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteReplicationGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately begins deleting the snapshot; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
    */
  def deleteSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately begins deleting the snapshot; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
    */
  def deleteSnapshot(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSnapshot(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DeleteSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific cache cluster if a cluster identifier is supplied. By default, abbreviated information about the clusters is returned. You can use the optional ShowCacheNodeInfo flag to retrieve detailed information about the cache nodes associated with the clusters. These details include the DNS address and port for the cache node endpoint. If the cluster is in the creating state, only cluster-level information is displayed until all of the nodes are successfully provisioned. If the cluster is in the deleting state, only cluster-level information is displayed. If cache nodes are currently being added to the cluster, node endpoint information and creation time for the additional nodes are not displayed until they are completely provisioned. When the cluster state is available, the cluster is ready for use. If cache nodes are currently being removed from the cluster, no endpoint information for the removed nodes is displayed.
    */
  def describeCacheClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific cache cluster if a cluster identifier is supplied. By default, abbreviated information about the clusters is returned. You can use the optional ShowCacheNodeInfo flag to retrieve detailed information about the cache nodes associated with the clusters. These details include the DNS address and port for the cache node endpoint. If the cluster is in the creating state, only cluster-level information is displayed until all of the nodes are successfully provisioned. If the cluster is in the deleting state, only cluster-level information is displayed. If cache nodes are currently being added to the cluster, node endpoint information and creation time for the additional nodes are not displayed until they are completely provisioned. When the cluster state is available, the cluster is ready for use. If cache nodes are currently being removed from the cluster, no endpoint information for the removed nodes is displayed.
    */
  def describeCacheClusters(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheClustersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheClusters(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheClustersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the available cache engines and their versions.
    */
  def describeCacheEngineVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheEngineVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheEngineVersionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the available cache engines and their versions.
    */
  def describeCacheEngineVersions(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheEngineVersionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheEngineVersions(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheEngineVersionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheEngineVersionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list contains only the descriptions for that group.
    */
  def describeCacheParameterGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheParameterGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list contains only the descriptions for that group.
    */
  def describeCacheParameterGroups(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheParameterGroups(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheParameterGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular cache parameter group.
    */
  def describeCacheParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular cache parameter group.
    */
  def describeCacheParameters(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheParameters(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of cache security group descriptions. If a cache security group name is specified, the list contains only the description of that group.
    */
  def describeCacheSecurityGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheSecurityGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSecurityGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of cache security group descriptions. If a cache security group name is specified, the list contains only the description of that group.
    */
  def describeCacheSecurityGroups(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheSecurityGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheSecurityGroups(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheSecurityGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSecurityGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only the description of that group.
    */
  def describeCacheSubnetGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheSubnetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only the description of that group.
    */
  def describeCacheSubnetGroups(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCacheSubnetGroups(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheSubnetGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the specified cache engine.
    */
  def describeEngineDefaultParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeEngineDefaultParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the specified cache engine.
    */
  def describeEngineDefaultParameters(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeEngineDefaultParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultParameters(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeEngineDefaultParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeEngineDefaultParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events specific to a particular cluster, cache security group, or cache parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.EventsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events specific to a particular cluster, cache security group, or cache parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeEventsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.EventsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a particular replication group. If no identifier is specified, DescribeReplicationGroups returns information about all replication groups.  This operation is valid for Redis only. 
    */
  def describeReplicationGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReplicationGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a particular replication group. If no identifier is specified, DescribeReplicationGroups returns information about all replication groups.  This operation is valid for Redis only. 
    */
  def describeReplicationGroups(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeReplicationGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReplicationGroups(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeReplicationGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about reserved cache nodes for this account, or about a specified reserved cache node.
    */
  def describeReservedCacheNodes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodeMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedCacheNodes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodeMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodeMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about reserved cache nodes for this account, or about a specified reserved cache node.
    */
  def describeReservedCacheNodes(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeReservedCacheNodesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodeMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedCacheNodes(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeReservedCacheNodesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodeMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodeMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists available reserved cache node offerings.
    */
  def describeReservedCacheNodesOfferings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodesOfferingMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedCacheNodesOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodesOfferingMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodesOfferingMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists available reserved cache node offerings.
    */
  def describeReservedCacheNodesOfferings(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeReservedCacheNodesOfferingsMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodesOfferingMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedCacheNodesOfferings(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeReservedCacheNodesOfferingsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodesOfferingMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReservedCacheNodesOfferingMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about cluster or replication group snapshots. By default, DescribeSnapshots lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with a particular cache cluster.  This operation is valid for Redis only. 
    */
  def describeSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeSnapshotsListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeSnapshotsListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeSnapshotsListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about cluster or replication group snapshots. By default, DescribeSnapshots lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with a particular cache cluster.  This operation is valid for Redis only. 
    */
  def describeSnapshots(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeSnapshotsListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSnapshots(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeSnapshotsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeSnapshotsListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeSnapshotsListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Dynamically increases the number of replics in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
    */
  def increaseReplicaCount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.IncreaseReplicaCountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def increaseReplicaCount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.IncreaseReplicaCountResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.IncreaseReplicaCountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Dynamically increases the number of replics in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
    */
  def increaseReplicaCount(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.IncreaseReplicaCountMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.IncreaseReplicaCountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def increaseReplicaCount(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.IncreaseReplicaCountMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.IncreaseReplicaCountResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.IncreaseReplicaCountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all available node types that you can scale your Redis cluster's or replication group's current node type up to. When you use the ModifyCacheCluster or ModifyReplicationGroup operations to scale up your cluster or replication group, the value of the CacheNodeType parameter must be one of the node types returned by this operation.
    */
  def listAllowedNodeTypeModifications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AllowedNodeTypeModificationsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAllowedNodeTypeModifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AllowedNodeTypeModificationsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AllowedNodeTypeModificationsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all available node types that you can scale your Redis cluster's or replication group's current node type up to. When you use the ModifyCacheCluster or ModifyReplicationGroup operations to scale up your cluster or replication group, the value of the CacheNodeType parameter must be one of the node types returned by this operation.
    */
  def listAllowedNodeTypeModifications(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ListAllowedNodeTypeModificationsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AllowedNodeTypeModificationsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAllowedNodeTypeModifications(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ListAllowedNodeTypeModificationsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AllowedNodeTypeModificationsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.AllowedNodeTypeModificationsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all cost allocation tags currently on the named resource. A cost allocation tag is a key-value pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize and track your AWS costs. If the cluster is not in the available state, ListTagsForResource returns an error. You can have a maximum of 50 cost allocation tags on an ElastiCache resource. For more information, see Monitoring Costs with Tags.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all cost allocation tags currently on the named resource. A cost allocation tag is a key-value pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize and track your AWS costs. If the cluster is not in the available state, ListTagsForResource returns an error. You can have a maximum of 50 cost allocation tags on an ElastiCache resource. For more information, see Monitoring Costs with Tags.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ListTagsForResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration parameters by specifying the parameters and the new values.
    */
  def modifyCacheCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyCacheCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration parameters by specifying the parameters and the new values.
    */
  def modifyCacheCluster(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyCacheCluster(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def modifyCacheParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyCacheParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def modifyCacheParameterGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyCacheParameterGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing cache subnet group.
    */
  def modifyCacheSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyCacheSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing cache subnet group.
    */
  def modifyCacheSubnetGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyCacheSubnetGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyCacheSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the settings for a replication group. For Redis (cluster mode enabled) clusters, this operation cannot be used to change a cluster's node type or engine version. For more information, see:    Scaling for Amazon ElastiCache for Redis—Redis (cluster mode enabled) in the ElastiCache User Guide    ModifyReplicationGroupShardConfiguration in the ElastiCache API Reference    This operation is valid for Redis only. 
    */
  def modifyReplicationGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyReplicationGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the settings for a replication group. For Redis (cluster mode enabled) clusters, this operation cannot be used to change a cluster's node type or engine version. For more information, see:    Scaling for Amazon ElastiCache for Redis—Redis (cluster mode enabled) in the ElastiCache User Guide    ModifyReplicationGroupShardConfiguration in the ElastiCache API Reference    This operation is valid for Redis only. 
    */
  def modifyReplicationGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyReplicationGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance the keyspaces among exisiting shards.
    */
  def modifyReplicationGroupShardConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupShardConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyReplicationGroupShardConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupShardConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupShardConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance the keyspaces among exisiting shards.
    */
  def modifyReplicationGroupShardConfiguration(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupShardConfigurationMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupShardConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyReplicationGroupShardConfiguration(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupShardConfigurationMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupShardConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ModifyReplicationGroupShardConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows you to purchase a reserved cache node offering.
    */
  def purchaseReservedCacheNodesOffering(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.PurchaseReservedCacheNodesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseReservedCacheNodesOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.PurchaseReservedCacheNodesOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.PurchaseReservedCacheNodesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows you to purchase a reserved cache node offering.
    */
  def purchaseReservedCacheNodesOffering(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.PurchaseReservedCacheNodesOfferingMessage
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.PurchaseReservedCacheNodesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseReservedCacheNodesOffering(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.PurchaseReservedCacheNodesOfferingMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.PurchaseReservedCacheNodesOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.PurchaseReservedCacheNodesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Reboots some, or all, of the cache nodes within a provisioned cluster. This operation applies any modified cache parameter groups to the cluster. The reboot operation takes place as soon as possible, and results in a momentary outage to the cluster. During the reboot, the cluster status is set to REBOOTING. The reboot causes the contents of the cache (for each cache node being rebooted) to be lost. When the reboot is complete, a cluster event is created. Rebooting a cluster is currently supported on Memcached and Redis (cluster mode disabled) clusters. Rebooting is not supported on Redis (cluster mode enabled) clusters. If you make changes to parameters that require a Redis (cluster mode enabled) cluster reboot for the changes to be applied, see Rebooting a Cluster for an alternate process.
    */
  def rebootCacheCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RebootCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootCacheCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RebootCacheClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RebootCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Reboots some, or all, of the cache nodes within a provisioned cluster. This operation applies any modified cache parameter groups to the cluster. The reboot operation takes place as soon as possible, and results in a momentary outage to the cluster. During the reboot, the cluster status is set to REBOOTING. The reboot causes the contents of the cache (for each cache node being rebooted) to be lost. When the reboot is complete, a cluster event is created. Rebooting a cluster is currently supported on Memcached and Redis (cluster mode disabled) clusters. Rebooting is not supported on Redis (cluster mode enabled) clusters. If you make changes to parameters that require a Redis (cluster mode enabled) cluster reboot for the changes to be applied, see Rebooting a Cluster for an alternate process.
    */
  def rebootCacheCluster(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RebootCacheClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RebootCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootCacheCluster(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RebootCacheClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RebootCacheClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RebootCacheClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the tags identified by the TagKeys list from the named resource.
    */
  def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeTagsFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the tags identified by the TagKeys list from the named resource.
    */
  def removeTagsFromResource(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RemoveTagsFromResourceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeTagsFromResource(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RemoveTagsFromResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the ResetAllParameters and CacheParameterGroupName parameters.
    */
  def resetCacheParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetCacheParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the ResetAllParameters and CacheParameterGroupName parameters.
    */
  def resetCacheParameterGroup(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ResetCacheParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetCacheParameterGroup(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ResetCacheParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security group that had been previously authorized.
    */
  def revokeCacheSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RevokeCacheSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def revokeCacheSecurityGroupIngress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RevokeCacheSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RevokeCacheSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security group that had been previously authorized.
    */
  def revokeCacheSecurityGroupIngress(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RevokeCacheSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RevokeCacheSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def revokeCacheSecurityGroupIngress(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RevokeCacheSecurityGroupIngressMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RevokeCacheSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.RevokeCacheSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents the input of a TestFailover operation which test automatic failover on a specified node group (called shard in the console) in a replication group (called cluster in the console).  Note the following    A customer can use this operation to test automatic failover on up to 5 shards (called node groups in the ElastiCache API and AWS CLI) in any rolling 24-hour period.   If calling this operation on shards in different clusters (called replication groups in the API and CLI), the calls can be made concurrently.     If calling this operation multiple times on different shards in the same Redis (cluster mode enabled) replication group, the first node replacement must complete before a subsequent call can be made.   To determine whether the node replacement is complete you can check Events using the Amazon ElastiCache console, the AWS CLI, or the ElastiCache API. Look for the following automatic failover related events, listed here in order of occurrance:   Replication group message: Test Failover API called for node group &lt;node-group-id&gt;    Cache cluster message: Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Replication group message: Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Cache cluster message: Recovering cache nodes &lt;node-id&gt;    Cache cluster message: Finished recovery for cache nodes &lt;node-id&gt;    For more information see:    Viewing ElastiCache Events in the ElastiCache User Guide     DescribeEvents in the ElastiCache API Reference     Also see, Testing Multi-AZ with Automatic Failover in the ElastiCache User Guide.
    */
  def testFailover(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TestFailoverResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testFailover(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TestFailoverResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TestFailoverResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Represents the input of a TestFailover operation which test automatic failover on a specified node group (called shard in the console) in a replication group (called cluster in the console).  Note the following    A customer can use this operation to test automatic failover on up to 5 shards (called node groups in the ElastiCache API and AWS CLI) in any rolling 24-hour period.   If calling this operation on shards in different clusters (called replication groups in the API and CLI), the calls can be made concurrently.     If calling this operation multiple times on different shards in the same Redis (cluster mode enabled) replication group, the first node replacement must complete before a subsequent call can be made.   To determine whether the node replacement is complete you can check Events using the Amazon ElastiCache console, the AWS CLI, or the ElastiCache API. Look for the following automatic failover related events, listed here in order of occurrance:   Replication group message: Test Failover API called for node group &lt;node-group-id&gt;    Cache cluster message: Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Replication group message: Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Cache cluster message: Recovering cache nodes &lt;node-id&gt;    Cache cluster message: Finished recovery for cache nodes &lt;node-id&gt;    For more information see:    Viewing ElastiCache Events in the ElastiCache User Guide     DescribeEvents in the ElastiCache API Reference     Also see, Testing Multi-AZ with Automatic Failover in the ElastiCache User Guide.
    */
  def testFailover(params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TestFailoverMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TestFailoverResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testFailover(
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TestFailoverMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TestFailoverResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.TestFailoverResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the cacheClusterAvailable state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is available.
    */
  @JSName("waitFor")
  def waitFor_cacheClusterAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_cacheClusterAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the cacheClusterAvailable state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is available.
    */
  @JSName("waitFor")
  def waitFor_cacheClusterAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterAvailable,
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheClustersMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_cacheClusterAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterAvailable,
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheClustersMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the cacheClusterDeleted state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is deleted.
    */
  @JSName("waitFor")
  def waitFor_cacheClusterDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_cacheClusterDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the cacheClusterDeleted state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is deleted.
    */
  @JSName("waitFor")
  def waitFor_cacheClusterDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterDeleted,
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheClustersMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_cacheClusterDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.cacheClusterDeleted,
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeCacheClustersMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.CacheClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the replicationGroupAvailable state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is available.
    */
  @JSName("waitFor")
  def waitFor_replicationGroupAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_replicationGroupAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the replicationGroupAvailable state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is available.
    */
  @JSName("waitFor")
  def waitFor_replicationGroupAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupAvailable,
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeReplicationGroupsMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_replicationGroupAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupAvailable,
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeReplicationGroupsMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the replicationGroupDeleted state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationGroupDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_replicationGroupDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the replicationGroupDeleted state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationGroupDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupDeleted,
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeReplicationGroupsMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_replicationGroupDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.replicationGroupDeleted,
    params: awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.DescribeReplicationGroupsMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElasticacheMod.ElastiCacheNs.ReplicationGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

