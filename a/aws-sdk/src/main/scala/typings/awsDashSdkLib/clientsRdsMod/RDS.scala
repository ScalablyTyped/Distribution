package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_RDS: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User Guide.  This action only applies to Aurora DB clusters. 
    */
  def addRoleToDBCluster(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addRoleToDBCluster(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User Guide.  This action only applies to Aurora DB clusters. 
    */
  def addRoleToDBCluster(params: AddRoleToDBClusterMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addRoleToDBCluster(
    params: AddRoleToDBClusterMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an AWS Identity and Access Management (IAM) role with a DB instance.  To add a role to a DB instance, the status of the DB instance must be available. 
    */
  def addRoleToDBInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addRoleToDBInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an AWS Identity and Access Management (IAM) role with a DB instance.  To add a role to a DB instance, the status of the DB instance must be available. 
    */
  def addRoleToDBInstance(params: AddRoleToDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addRoleToDBInstance(
    params: AddRoleToDBInstanceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a source identifier to an existing RDS event notification subscription.
    */
  def addSourceIdentifierToSubscription(): awsDashSdkLib.libRequestMod.Request[AddSourceIdentifierToSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addSourceIdentifierToSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddSourceIdentifierToSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddSourceIdentifierToSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a source identifier to an existing RDS event notification subscription.
    */
  def addSourceIdentifierToSubscription(params: AddSourceIdentifierToSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[AddSourceIdentifierToSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addSourceIdentifierToSubscription(
    params: AddSourceIdentifierToSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddSourceIdentifierToSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddSourceIdentifierToSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS. For an overview on tagging Amazon RDS resources, see Tagging Amazon RDS Resources.
    */
  def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS. For an overview on tagging Amazon RDS resources, see Tagging Amazon RDS Resources.
    */
  def addTagsToResource(params: AddTagsToResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a DB instance).
    */
  def applyPendingMaintenanceAction(): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def applyPendingMaintenanceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ApplyPendingMaintenanceActionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a DB instance).
    */
  def applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def applyPendingMaintenanceAction(
    params: ApplyPendingMaintenanceActionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ApplyPendingMaintenanceActionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ApplyPendingMaintenanceActionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances. Second, IP ranges are available if the application accessing your database is running on the Internet. Required parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).  You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.  For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def authorizeDBSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[AuthorizeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def authorizeDBSecurityGroupIngress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AuthorizeDBSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AuthorizeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances. Second, IP ranges are available if the application accessing your database is running on the Internet. Required parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).  You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.  For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def authorizeDBSecurityGroupIngress(params: AuthorizeDBSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[AuthorizeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def authorizeDBSecurityGroupIngress(
    params: AuthorizeDBSecurityGroupIngressMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AuthorizeDBSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AuthorizeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Backtracks a DB cluster to a specific time, without creating a new DB cluster. For more information on backtracking, see  Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def backtrackDBCluster(): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrack, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def backtrackDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterBacktrack, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrack, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Backtracks a DB cluster to a specific time, without creating a new DB cluster. For more information on backtracking, see  Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def backtrackDBCluster(params: BacktrackDBClusterMessage): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrack, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def backtrackDBCluster(
    params: BacktrackDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterBacktrack, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrack, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the specified DB cluster parameter group.  This action only applies to Aurora DB clusters. 
    */
  def copyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[CopyDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the specified DB cluster parameter group.  This action only applies to Aurora DB clusters. 
    */
  def copyDBClusterParameterGroup(params: CopyDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CopyDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyDBClusterParameterGroup(
    params: CopyDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.    TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status. For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see  Copying a Snapshot in the Amazon Aurora User Guide.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def copyDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.    TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status. For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see  Copying a Snapshot in the Amazon Aurora User Guide.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyDBClusterSnapshot(
    params: CopyDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the specified DB parameter group.
    */
  def copyDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[CopyDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the specified DB parameter group.
    */
  def copyDBParameterGroup(params: CopyDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CopyDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyDBParameterGroup(
    params: CopyDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state. You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.  For more information about copying snapshots, see Copying a DB Snapshot in the Amazon RDS User Guide. 
    */
  def copyDBSnapshot(): awsDashSdkLib.libRequestMod.Request[CopyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyDBSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state. You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.  For more information about copying snapshots, see Copying a DB Snapshot in the Amazon RDS User Guide. 
    */
  def copyDBSnapshot(params: CopyDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CopyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyDBSnapshot(
    params: CopyDBSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the specified option group.
    */
  def copyOptionGroup(): awsDashSdkLib.libRequestMod.Request[CopyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyOptionGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the specified option group.
    */
  def copyOptionGroup(params: CopyOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[CopyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyOptionGroup(
    params: CopyOptionGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Amazon Aurora DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBCluster(): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Amazon Aurora DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBCluster(params: CreateDBClusterMessage): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBCluster(
    params: CreateDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def createDBClusterEndpoint(): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBClusterEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def createDBClusterEndpoint(params: CreateDBClusterEndpointMessage): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBClusterEndpoint(
    params: CreateDBClusterEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters action to verify that your DB cluster parameter group has been created or modified.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters action to verify that your DB cluster parameter group has been created or modified.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBClusterParameterGroup(params: CreateDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBClusterParameterGroup(
    params: CreateDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CreateDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBClusterSnapshot(
    params: CreateDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB instance.
    */
  def createDBInstance(): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB instance.
    */
  def createDBInstance(params: CreateDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBInstance(
    params: CreateDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read Replica for a DB instance running MySQL, MariaDB, Oracle, or PostgreSQL. For more information, see Working with Read Replicas in the Amazon RDS User Guide.  Amazon Aurora doesn't support this action. You must call the CreateDBInstance action to create a DB instance for an Aurora DB cluster.  All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB security groups and DB parameter groups) are inherited from the source DB instance, except as specified following.   Your source DB instance must have backup retention enabled.  
    */
  def createDBInstanceReadReplica(): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBInstanceReadReplica(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBInstanceReadReplicaResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read Replica for a DB instance running MySQL, MariaDB, Oracle, or PostgreSQL. For more information, see Working with Read Replicas in the Amazon RDS User Guide.  Amazon Aurora doesn't support this action. You must call the CreateDBInstance action to create a DB instance for an Aurora DB cluster.  All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB security groups and DB parameter groups) are inherited from the source DB instance, except as specified following.   Your source DB instance must have backup retention enabled.  
    */
  def createDBInstanceReadReplica(params: CreateDBInstanceReadReplicaMessage): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBInstanceReadReplica(
    params: CreateDBInstanceReadReplicaMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBInstanceReadReplicaResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBInstanceReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def createDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[CreateDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def createDBParameterGroup(params: CreateDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBParameterGroup(
    params: CreateDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB security group. DB security groups control access to a DB instance.  A DB security group controls access to EC2-Classic DB instances that are not in a VPC. 
    */
  def createDBSecurityGroup(): awsDashSdkLib.libRequestMod.Request[CreateDBSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBSecurityGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB security group. DB security groups control access to a DB instance.  A DB security group controls access to EC2-Classic DB instances that are not in a VPC. 
    */
  def createDBSecurityGroup(params: CreateDBSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateDBSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBSecurityGroup(
    params: CreateDBSecurityGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBSecurityGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a DBSnapshot. The source DBInstance must be in "available" state.
    */
  def createDBSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a DBSnapshot. The source DBInstance must be in "available" state.
    */
  def createDBSnapshot(params: CreateDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CreateDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBSnapshot(
    params: CreateDBSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def createDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDBSubnetGroup(
    params: CreateDBSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an RDS event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of RDS sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all RDS sources belonging to your customer account.
    */
  def createEventSubscription(): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an RDS event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of RDS sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all RDS sources belonging to your customer account.
    */
  def createEventSubscription(params: CreateEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEventSubscription(
    params: CreateEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *    Creates an Aurora global database spread across multiple regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the primary cluster of the global database.   This action only applies to Aurora DB clusters. 
    */
  def createGlobalCluster(): awsDashSdkLib.libRequestMod.Request[CreateGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGlobalCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *    Creates an Aurora global database spread across multiple regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the primary cluster of the global database.   This action only applies to Aurora DB clusters. 
    */
  def createGlobalCluster(params: CreateGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[CreateGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGlobalCluster(
    params: CreateGlobalClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new option group. You can create up to 20 option groups.
    */
  def createOptionGroup(): awsDashSdkLib.libRequestMod.Request[CreateOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOptionGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new option group. You can create up to 20 option groups.
    */
  def createOptionGroup(params: CreateOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOptionGroup(
    params: CreateOptionGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBCluster(): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBCluster(params: DeleteDBClusterMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBCluster(
    params: DeleteDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterEndpoint(): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBClusterEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterEndpoint(params: DeleteDBClusterEndpointMessage): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBClusterEndpoint(
    params: DeleteDBClusterEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBClusterParameterGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBClusterParameterGroup(
    params: DeleteDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBClusterSnapshot(
    params: DeleteDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDBClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon RDS DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when you skip creation of the final snapshot with the SkipFinalSnapshot parameter. If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a Read Replica of another Amazon Aurora DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a Read Replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
    */
  def deleteDBInstance(): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon RDS DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when you skip creation of the final snapshot with the SkipFinalSnapshot parameter. If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a Read Replica of another Amazon Aurora DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a Read Replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
    */
  def deleteDBInstance(params: DeleteDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBInstance(
    params: DeleteDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes automated backups based on the source instance's DbiResourceId value or the restorable instance's resource ID.
    */
  def deleteDBInstanceAutomatedBackup(): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceAutomatedBackupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBInstanceAutomatedBackup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDBInstanceAutomatedBackupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceAutomatedBackupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes automated backups based on the source instance's DbiResourceId value or the restorable instance's resource ID.
    */
  def deleteDBInstanceAutomatedBackup(params: DeleteDBInstanceAutomatedBackupMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceAutomatedBackupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBInstanceAutomatedBackup(
    params: DeleteDBInstanceAutomatedBackupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDBInstanceAutomatedBackupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDBInstanceAutomatedBackupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB instances.
    */
  def deleteDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBParameterGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB instances.
    */
  def deleteDBParameterGroup(params: DeleteDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBParameterGroup(
    params: DeleteDBParameterGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB security group.  The specified DB security group must not be associated with any DB instances. 
    */
  def deleteDBSecurityGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBSecurityGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB security group.  The specified DB security group must not be associated with any DB instances. 
    */
  def deleteDBSecurityGroup(params: DeleteDBSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBSecurityGroup(
    params: DeleteDBSecurityGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB snapshot must be in the available state to be deleted. 
    */
  def deleteDBSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB snapshot must be in the available state to be deleted. 
    */
  def deleteDBSnapshot(params: DeleteDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[DeleteDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBSnapshot(
    params: DeleteDBSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB subnet group.  The specified database subnet group must not be associated with any DB instances. 
    */
  def deleteDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBSubnetGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB subnet group.  The specified database subnet group must not be associated with any DB instances. 
    */
  def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBSubnetGroup(
    params: DeleteDBSubnetGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an RDS event notification subscription.
    */
  def deleteEventSubscription(): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an RDS event notification subscription.
    */
  def deleteEventSubscription(params: DeleteEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEventSubscription(
    params: DeleteEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed first.   This action only applies to Aurora DB clusters. 
    */
  def deleteGlobalCluster(): awsDashSdkLib.libRequestMod.Request[DeleteGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGlobalCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed first.   This action only applies to Aurora DB clusters. 
    */
  def deleteGlobalCluster(params: DeleteGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[DeleteGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGlobalCluster(
    params: DeleteGlobalClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing option group.
    */
  def deleteOptionGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteOptionGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing option group.
    */
  def deleteOptionGroup(params: DeleteOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteOptionGroup(
    params: DeleteOptionGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account, such as the number of DB instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command doesn't take any parameters.
    */
  def describeAccountAttributes(): awsDashSdkLib.libRequestMod.Request[AccountAttributesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccountAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AccountAttributesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AccountAttributesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account, such as the number of DB instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command doesn't take any parameters.
    */
  def describeAccountAttributes(params: DescribeAccountAttributesMessage): awsDashSdkLib.libRequestMod.Request[AccountAttributesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccountAttributes(
    params: DescribeAccountAttributesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AccountAttributesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AccountAttributesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
    */
  def describeCertificates(): awsDashSdkLib.libRequestMod.Request[CertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CertificateMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
    */
  def describeCertificates(params: DescribeCertificatesMessage): awsDashSdkLib.libRequestMod.Request[CertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCertificates(
    params: DescribeCertificatesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CertificateMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about backtracks for a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterBacktracks(): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrackMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterBacktracks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterBacktrackMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrackMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about backtracks for a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterBacktracks(params: DescribeDBClusterBacktracksMessage): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrackMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterBacktracks(
    params: DescribeDBClusterBacktracksMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterBacktrackMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterBacktrackMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about endpoints for an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterEndpoints(): awsDashSdkLib.libRequestMod.Request[DBClusterEndpointMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterEndpointMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpointMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about endpoints for an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterEndpoints(params: DescribeDBClusterEndpointsMessage): awsDashSdkLib.libRequestMod.Request[DBClusterEndpointMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterEndpoints(
    params: DescribeDBClusterEndpointsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterEndpointMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpointMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterParameterGroups(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterParameterGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterParameterGroups(params: DescribeDBClusterParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterParameterGroups(
    params: DescribeDBClusterParameterGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterParameters(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterParameters(params: DescribeDBClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterParameters(
    params: DescribeDBClusterParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.  This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterSnapshotAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterSnapshotAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDBClusterSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.  This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterSnapshotAttributes(params: DescribeDBClusterSnapshotAttributesMessage): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterSnapshotAttributes(
    params: DescribeDBClusterSnapshotAttributesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDBClusterSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDBClusterSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about DB cluster snapshots. This API action supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterSnapshots(): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about DB cluster snapshots. This API action supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusterSnapshots(params: DescribeDBClusterSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusterSnapshots(
    params: DescribeDBClusterSnapshotsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about provisioned Aurora DB clusters. This API supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusters(): awsDashSdkLib.libRequestMod.Request[DBClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about provisioned Aurora DB clusters. This API supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeDBClusters(params: DescribeDBClustersMessage): awsDashSdkLib.libRequestMod.Request[DBClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBClusters(
    params: DescribeDBClustersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the available DB engines.
    */
  def describeDBEngineVersions(): awsDashSdkLib.libRequestMod.Request[DBEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBEngineVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBEngineVersionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the available DB engines.
    */
  def describeDBEngineVersions(params: DescribeDBEngineVersionsMessage): awsDashSdkLib.libRequestMod.Request[DBEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBEngineVersions(
    params: DescribeDBEngineVersionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBEngineVersionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBEngineVersionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays backups for both current and deleted instances. For example, use this operation to find details about automated backups for previously deleted instances. Current instances with retention periods greater than zero (0) are returned for both the DescribeDBInstanceAutomatedBackups and DescribeDBInstances operations. All parameters are optional.
    */
  def describeDBInstanceAutomatedBackups(): awsDashSdkLib.libRequestMod.Request[DBInstanceAutomatedBackupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBInstanceAutomatedBackups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBInstanceAutomatedBackupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBInstanceAutomatedBackupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays backups for both current and deleted instances. For example, use this operation to find details about automated backups for previously deleted instances. Current instances with retention periods greater than zero (0) are returned for both the DescribeDBInstanceAutomatedBackups and DescribeDBInstances operations. All parameters are optional.
    */
  def describeDBInstanceAutomatedBackups(params: DescribeDBInstanceAutomatedBackupsMessage): awsDashSdkLib.libRequestMod.Request[DBInstanceAutomatedBackupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBInstanceAutomatedBackups(
    params: DescribeDBInstanceAutomatedBackupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBInstanceAutomatedBackupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBInstanceAutomatedBackupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about provisioned RDS instances. This API supports pagination.
    */
  def describeDBInstances(): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about provisioned RDS instances. This API supports pagination.
    */
  def describeDBInstances(params: DescribeDBInstancesMessage): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBInstances(
    params: DescribeDBInstancesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of DB log files for the DB instance.
    */
  def describeDBLogFiles(): awsDashSdkLib.libRequestMod.Request[DescribeDBLogFilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBLogFiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDBLogFilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDBLogFilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of DB log files for the DB instance.
    */
  def describeDBLogFiles(params: DescribeDBLogFilesMessage): awsDashSdkLib.libRequestMod.Request[DescribeDBLogFilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBLogFiles(
    params: DescribeDBLogFilesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDBLogFilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDBLogFilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
    */
  def describeDBParameterGroups(): awsDashSdkLib.libRequestMod.Request[DBParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBParameterGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
    */
  def describeDBParameterGroups(params: DescribeDBParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[DBParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBParameterGroups(
    params: DescribeDBParameterGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular DB parameter group.
    */
  def describeDBParameters(): awsDashSdkLib.libRequestMod.Request[DBParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular DB parameter group.
    */
  def describeDBParameters(params: DescribeDBParametersMessage): awsDashSdkLib.libRequestMod.Request[DBParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBParameters(
    params: DescribeDBParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified, the list will contain only the descriptions of the specified DB security group. 
    */
  def describeDBSecurityGroups(): awsDashSdkLib.libRequestMod.Request[DBSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBSecurityGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBSecurityGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified, the list will contain only the descriptions of the specified DB security group. 
    */
  def describeDBSecurityGroups(params: DescribeDBSecurityGroupsMessage): awsDashSdkLib.libRequestMod.Request[DBSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBSecurityGroups(
    params: DescribeDBSecurityGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBSecurityGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of DB snapshot attribute names and values for a manual DB snapshot. When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB snapshot. If all is included in the list of values for the restore attribute, then the manual DB snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB snapshot public or private, use the ModifyDBSnapshotAttribute API action.
    */
  def describeDBSnapshotAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeDBSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBSnapshotAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDBSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDBSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of DB snapshot attribute names and values for a manual DB snapshot. When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB snapshot. If all is included in the list of values for the restore attribute, then the manual DB snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB snapshot public or private, use the ModifyDBSnapshotAttribute API action.
    */
  def describeDBSnapshotAttributes(params: DescribeDBSnapshotAttributesMessage): awsDashSdkLib.libRequestMod.Request[DescribeDBSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBSnapshotAttributes(
    params: DescribeDBSnapshotAttributesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDBSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDBSnapshotAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about DB snapshots. This API action supports pagination.
    */
  def describeDBSnapshots(): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about DB snapshots. This API action supports pagination.
    */
  def describeDBSnapshots(params: DescribeDBSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBSnapshots(
    params: DescribeDBSnapshotsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def describeDBSubnetGroups(): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBSubnetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDBSubnetGroups(
    params: DescribeDBSubnetGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the default engine and system parameter information for the cluster database engine. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeEngineDefaultClusterParameters(): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEngineDefaultClusterParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEngineDefaultClusterParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the default engine and system parameter information for the cluster database engine. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeEngineDefaultClusterParameters(params: DescribeEngineDefaultClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEngineDefaultClusterParameters(
    params: DescribeEngineDefaultClusterParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEngineDefaultClusterParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEngineDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the default engine and system parameter information for the specified database engine.
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
    * Returns the default engine and system parameter information for the specified database engine.
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
    * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in the  Events topic in the Amazon RDS User Guide. 
    */
  def describeEventCategories(): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventCategories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EventCategoriesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in the  Events topic in the Amazon RDS User Guide. 
    */
  def describeEventCategories(params: DescribeEventCategoriesMessage): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventCategories(
    params: DescribeEventCategoriesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EventCategoriesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
    */
  def describeEventSubscriptions(): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventSubscriptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EventSubscriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
    */
  def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEventSubscriptions(
    params: DescribeEventSubscriptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EventSubscriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
    */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEvents(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EventsMessage, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
    */
  def describeEvents(params: DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEvents(
    params: DescribeEventsMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EventsMessage, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns information about Aurora global database clusters. This API supports pagination.   For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeGlobalClusters(): awsDashSdkLib.libRequestMod.Request[GlobalClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeGlobalClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GlobalClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GlobalClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns information about Aurora global database clusters. This API supports pagination.   For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def describeGlobalClusters(params: DescribeGlobalClustersMessage): awsDashSdkLib.libRequestMod.Request[GlobalClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeGlobalClusters(
    params: DescribeGlobalClustersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GlobalClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GlobalClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes all available options.
    */
  def describeOptionGroupOptions(): awsDashSdkLib.libRequestMod.Request[OptionGroupOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOptionGroupOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ OptionGroupOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[OptionGroupOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes all available options.
    */
  def describeOptionGroupOptions(params: DescribeOptionGroupOptionsMessage): awsDashSdkLib.libRequestMod.Request[OptionGroupOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOptionGroupOptions(
    params: DescribeOptionGroupOptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ OptionGroupOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[OptionGroupOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the available option groups.
    */
  def describeOptionGroups(): awsDashSdkLib.libRequestMod.Request[OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOptionGroups(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ OptionGroups, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the available option groups.
    */
  def describeOptionGroups(params: DescribeOptionGroupsMessage): awsDashSdkLib.libRequestMod.Request[OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOptionGroups(
    params: DescribeOptionGroupsMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ OptionGroups, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of orderable DB instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(): awsDashSdkLib.libRequestMod.Request[OrderableDBInstanceOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOrderableDBInstanceOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ OrderableDBInstanceOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[OrderableDBInstanceOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of orderable DB instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(params: DescribeOrderableDBInstanceOptionsMessage): awsDashSdkLib.libRequestMod.Request[OrderableDBInstanceOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOrderableDBInstanceOptions(
    params: DescribeOrderableDBInstanceOptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ OrderableDBInstanceOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[OrderableDBInstanceOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(): awsDashSdkLib.libRequestMod.Request[PendingMaintenanceActionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePendingMaintenanceActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PendingMaintenanceActionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PendingMaintenanceActionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage): awsDashSdkLib.libRequestMod.Request[PendingMaintenanceActionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePendingMaintenanceActions(
    params: DescribePendingMaintenanceActionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PendingMaintenanceActionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PendingMaintenanceActionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
    */
  def describeReservedDBInstances(): awsDashSdkLib.libRequestMod.Request[ReservedDBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReservedDBInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReservedDBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReservedDBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
    */
  def describeReservedDBInstances(params: DescribeReservedDBInstancesMessage): awsDashSdkLib.libRequestMod.Request[ReservedDBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReservedDBInstances(
    params: DescribeReservedDBInstancesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReservedDBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReservedDBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists available reserved DB instance offerings.
    */
  def describeReservedDBInstancesOfferings(): awsDashSdkLib.libRequestMod.Request[ReservedDBInstancesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReservedDBInstancesOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReservedDBInstancesOfferingMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReservedDBInstancesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists available reserved DB instance offerings.
    */
  def describeReservedDBInstancesOfferings(params: DescribeReservedDBInstancesOfferingsMessage): awsDashSdkLib.libRequestMod.Request[ReservedDBInstancesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReservedDBInstancesOfferings(
    params: DescribeReservedDBInstancesOfferingsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReservedDBInstancesOfferingMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReservedDBInstancesOfferingMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB snapshot from. This API action supports pagination.
    */
  def describeSourceRegions(): awsDashSdkLib.libRequestMod.Request[SourceRegionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSourceRegions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SourceRegionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SourceRegionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB snapshot from. This API action supports pagination.
    */
  def describeSourceRegions(params: DescribeSourceRegionsMessage): awsDashSdkLib.libRequestMod.Request[SourceRegionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSourceRegions(
    params: DescribeSourceRegionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SourceRegionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SourceRegionMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
    */
  def describeValidDBInstanceModifications(): awsDashSdkLib.libRequestMod.Request[DescribeValidDBInstanceModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeValidDBInstanceModifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeValidDBInstanceModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeValidDBInstanceModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
    */
  def describeValidDBInstanceModifications(params: DescribeValidDBInstanceModificationsMessage): awsDashSdkLib.libRequestMod.Request[DescribeValidDBInstanceModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeValidDBInstanceModifications(
    params: DescribeValidDBInstanceModificationsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeValidDBInstanceModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeValidDBInstanceModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Downloads all or a portion of the specified log file, up to 1 MB in size.
    */
  def downloadDBLogFilePortion(): awsDashSdkLib.libRequestMod.Request[DownloadDBLogFilePortionDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def downloadDBLogFilePortion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DownloadDBLogFilePortionDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DownloadDBLogFilePortionDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Downloads all or a portion of the specified log file, up to 1 MB in size.
    */
  def downloadDBLogFilePortion(params: DownloadDBLogFilePortionMessage): awsDashSdkLib.libRequestMod.Request[DownloadDBLogFilePortionDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def downloadDBLogFilePortion(
    params: DownloadDBLogFilePortionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DownloadDBLogFilePortionDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DownloadDBLogFilePortionDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def failoverDBCluster(): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def failoverDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ FailoverDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def failoverDBCluster(params: FailoverDBClusterMessage): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def failoverDBCluster(
    params: FailoverDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ FailoverDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[FailoverDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags on an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags on an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide.
    */
  def listTagsForResource(params: ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagListMessage, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[TagListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the capacity of an Aurora Serverless DB cluster to a specific value. Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call ModifyCurrentDBClusterCapacity to set the capacity explicitly. After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on the cooldown period for scaling up and the cooldown period for scaling down. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.  If you call ModifyCurrentDBClusterCapacity with the default TimeoutAction, connections that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling points, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyCurrentDBClusterCapacity(): awsDashSdkLib.libRequestMod.Request[DBClusterCapacityInfo, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyCurrentDBClusterCapacity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterCapacityInfo, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterCapacityInfo, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the capacity of an Aurora Serverless DB cluster to a specific value. Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call ModifyCurrentDBClusterCapacity to set the capacity explicitly. After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on the cooldown period for scaling up and the cooldown period for scaling down. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.  If you call ModifyCurrentDBClusterCapacity with the default TimeoutAction, connections that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling points, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyCurrentDBClusterCapacity(params: ModifyCurrentDBClusterCapacityMessage): awsDashSdkLib.libRequestMod.Request[DBClusterCapacityInfo, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyCurrentDBClusterCapacity(
    params: ModifyCurrentDBClusterCapacityMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterCapacityInfo, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterCapacityInfo, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyDBCluster(): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyDBCluster(params: ModifyDBClusterMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBCluster(
    params: ModifyDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterEndpoint(): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBClusterEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterEndpoint(params: ModifyDBClusterEndpointMessage): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBClusterEndpoint(
    params: ModifyDBClusterEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterEndpoint, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters action to verify that your DB cluster parameter group has been created or modified.   This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters action to verify that your DB cluster parameter group has been created or modified.   This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterParameterGroup(params: ModifyDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBClusterParameterGroup(
    params: ModifyDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.  This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterSnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBClusterSnapshotAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBClusterSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.  This action only applies to Aurora DB clusters. 
    */
  def modifyDBClusterSnapshotAttribute(params: ModifyDBClusterSnapshotAttributeMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBClusterSnapshotAttribute(
    params: ModifyDBClusterSnapshotAttributeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBClusterSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBClusterSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
    */
  def modifyDBInstance(): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
    */
  def modifyDBInstance(params: ModifyDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBInstance(
    params: ModifyDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def modifyDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def modifyDBParameterGroup(params: ModifyDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBParameterGroup(
    params: ModifyDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.  Amazon RDS supports upgrading DB snapshots for MySQL and Oracle. 
    */
  def modifyDBSnapshot(): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.  Amazon RDS supports upgrading DB snapshots for MySQL and Oracle. 
    */
  def modifyDBSnapshot(params: ModifyDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBSnapshot(
    params: ModifyDBSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot. To share a manual DB snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB snapshot. Uses the value all to make the manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot public or private, use the DescribeDBSnapshotAttributes API action.
    */
  def modifyDBSnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBSnapshotAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot. To share a manual DB snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB snapshot. Uses the value all to make the manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot public or private, use the DescribeDBSnapshotAttributes API action.
    */
  def modifyDBSnapshotAttribute(params: ModifyDBSnapshotAttributeMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBSnapshotAttribute(
    params: ModifyDBSnapshotAttributeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBSnapshotAttributeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def modifyDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDBSubnetGroup(
    params: ModifyDBSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDBSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType in the Events topic in the Amazon RDS User Guide or by using the DescribeEventCategories action.
    */
  def modifyEventSubscription(): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType in the Events topic in the Amazon RDS User Guide or by using the DescribeEventCategories action.
    */
  def modifyEventSubscription(params: ModifyEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyEventSubscription(
    params: ModifyEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyGlobalCluster(): awsDashSdkLib.libRequestMod.Request[ModifyGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyGlobalCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def modifyGlobalCluster(params: ModifyGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[ModifyGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyGlobalCluster(
    params: ModifyGlobalClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing option group.
    */
  def modifyOptionGroup(): awsDashSdkLib.libRequestMod.Request[ModifyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyOptionGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing option group.
    */
  def modifyOptionGroup(params: ModifyOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[ModifyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyOptionGroup(
    params: ModifyOptionGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyOptionGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Promotes a Read Replica DB instance to a standalone DB instance.    Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in the backing-up status. If you have enabled backups on your Read Replica, configure the automated backup window so that daily backups do not interfere with Read Replica promotion.   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.   
    */
  def promoteReadReplica(): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def promoteReadReplica(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PromoteReadReplicaResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Promotes a Read Replica DB instance to a standalone DB instance.    Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in the backing-up status. If you have enabled backups on your Read Replica, configure the automated backup window so that daily backups do not interfere with Read Replica promotion.   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.   
    */
  def promoteReadReplica(params: PromoteReadReplicaMessage): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def promoteReadReplica(
    params: PromoteReadReplicaMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PromoteReadReplicaResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Promotes a Read Replica DB cluster to a standalone DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def promoteReadReplicaDBCluster(): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def promoteReadReplicaDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PromoteReadReplicaDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Promotes a Read Replica DB cluster to a standalone DB cluster.  This action only applies to Aurora DB clusters. 
    */
  def promoteReadReplicaDBCluster(params: PromoteReadReplicaDBClusterMessage): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def promoteReadReplicaDBCluster(
    params: PromoteReadReplicaDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PromoteReadReplicaDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PromoteReadReplicaDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Purchases a reserved DB instance offering.
    */
  def purchaseReservedDBInstancesOffering(): awsDashSdkLib.libRequestMod.Request[PurchaseReservedDBInstancesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def purchaseReservedDBInstancesOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PurchaseReservedDBInstancesOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PurchaseReservedDBInstancesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Purchases a reserved DB instance offering.
    */
  def purchaseReservedDBInstancesOffering(params: PurchaseReservedDBInstancesOfferingMessage): awsDashSdkLib.libRequestMod.Request[PurchaseReservedDBInstancesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def purchaseReservedDBInstancesOffering(
    params: PurchaseReservedDBInstancesOfferingMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PurchaseReservedDBInstancesOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PurchaseReservedDBInstancesOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.  For more information about rebooting, see Rebooting a DB Instance in the Amazon RDS User Guide. 
    */
  def rebootDBInstance(): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.  For more information about rebooting, see Rebooting a DB Instance in the Amazon RDS User Guide. 
    */
  def rebootDBInstance(params: RebootDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootDBInstance(
    params: RebootDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a different region.   This action only applies to Aurora DB clusters. 
    */
  def removeFromGlobalCluster(): awsDashSdkLib.libRequestMod.Request[RemoveFromGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeFromGlobalCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveFromGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveFromGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a different region.   This action only applies to Aurora DB clusters. 
    */
  def removeFromGlobalCluster(params: RemoveFromGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[RemoveFromGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeFromGlobalCluster(
    params: RemoveFromGlobalClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveFromGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveFromGlobalClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User Guide.  This action only applies to Aurora DB clusters. 
    */
  def removeRoleFromDBCluster(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeRoleFromDBCluster(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User Guide.  This action only applies to Aurora DB clusters. 
    */
  def removeRoleFromDBCluster(params: RemoveRoleFromDBClusterMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeRoleFromDBCluster(
    params: RemoveRoleFromDBClusterMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates an AWS Identity and Access Management (IAM) role from a DB instance.
    */
  def removeRoleFromDBInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeRoleFromDBInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates an AWS Identity and Access Management (IAM) role from a DB instance.
    */
  def removeRoleFromDBInstance(params: RemoveRoleFromDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeRoleFromDBInstance(
    params: RemoveRoleFromDBInstanceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a source identifier from an existing RDS event notification subscription.
    */
  def removeSourceIdentifierFromSubscription(): awsDashSdkLib.libRequestMod.Request[RemoveSourceIdentifierFromSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeSourceIdentifierFromSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveSourceIdentifierFromSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveSourceIdentifierFromSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a source identifier from an existing RDS event notification subscription.
    */
  def removeSourceIdentifierFromSubscription(params: RemoveSourceIdentifierFromSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[RemoveSourceIdentifierFromSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeSourceIdentifierFromSubscription(
    params: RemoveSourceIdentifierFromSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveSourceIdentifierFromSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveSourceIdentifierFromSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes metadata tags from an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide. 
    */
  def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes metadata tags from an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide. 
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def resetDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def resetDBClusterParameterGroup(params: ResetDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetDBClusterParameterGroup(
    params: ResetDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
    */
  def resetDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
    */
  def resetDBParameterGroup(params: ResetDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetDBParameterGroup(
    params: ResetDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data to an Amazon Aurora MySQL DB Cluster in the Amazon Aurora User Guide.  This action only applies to Aurora DB clusters. 
    */
  def restoreDBClusterFromS3(): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBClusterFromS3(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBClusterFromS3Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data to an Amazon Aurora MySQL DB Cluster in the Amazon Aurora User Guide.  This action only applies to Aurora DB clusters. 
    */
  def restoreDBClusterFromS3(params: RestoreDBClusterFromS3Message): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBClusterFromS3(
    params: RestoreDBClusterFromS3Message,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBClusterFromS3Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def restoreDBClusterFromSnapshot(): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBClusterFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBClusterFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def restoreDBClusterFromSnapshot(params: RestoreDBClusterFromSnapshotMessage): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBClusterFromSnapshot(
    params: RestoreDBClusterFromSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBClusterFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def restoreDBClusterToPointInTime(): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBClusterToPointInTime(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBClusterToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def restoreDBClusterToPointInTime(params: RestoreDBClusterToPointInTimeMessage): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBClusterToPointInTime(
    params: RestoreDBClusterToPointInTimeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBClusterToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBClusterToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore point with the most of original configuration with the default security group and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored AZ deployment and not a single-AZ deployment. If your intent is to replace your original DB instance with the new, restored DB instance, then rename your original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB instances with the same name. Once you have renamed your original DB instance with a different identifier, then you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB instance created from the snapshot. If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterFromSnapshot. 
    */
  def restoreDBInstanceFromDBSnapshot(): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBInstanceFromDBSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBInstanceFromDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore point with the most of original configuration with the default security group and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored AZ deployment and not a single-AZ deployment. If your intent is to replace your original DB instance with the new, restored DB instance, then rename your original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB instances with the same name. Once you have renamed your original DB instance with a different identifier, then you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB instance created from the snapshot. If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterFromSnapshot. 
    */
  def restoreDBInstanceFromDBSnapshot(params: RestoreDBInstanceFromDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBInstanceFromDBSnapshot(
    params: RestoreDBInstanceFromDBSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBInstanceFromDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromDBSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide. 
    */
  def restoreDBInstanceFromS3(): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBInstanceFromS3(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBInstanceFromS3Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide. 
    */
  def restoreDBInstanceFromS3(params: RestoreDBInstanceFromS3Message): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBInstanceFromS3(
    params: RestoreDBInstanceFromS3Message,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBInstanceFromS3Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceFromS3Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by the BackupRetentionPeriod property. The target database is created with most of the original configuration, but in a system-selected Availability Zone, with the default security group, the default subnet group, and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment and not a single-AZ deployment.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterToPointInTime. 
    */
  def restoreDBInstanceToPointInTime(): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBInstanceToPointInTime(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBInstanceToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by the BackupRetentionPeriod property. The target database is created with most of the original configuration, but in a system-selected Availability Zone, with the default security group, the default subnet group, and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment and not a single-AZ deployment.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterToPointInTime. 
    */
  def restoreDBInstanceToPointInTime(params: RestoreDBInstanceToPointInTimeMessage): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restoreDBInstanceToPointInTime(
    params: RestoreDBInstanceToPointInTimeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestoreDBInstanceToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestoreDBInstanceToPointInTimeResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups. Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId).
    */
  def revokeDBSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[RevokeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def revokeDBSecurityGroupIngress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RevokeDBSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RevokeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups. Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId).
    */
  def revokeDBSecurityGroupIngress(params: RevokeDBSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[RevokeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def revokeDBSecurityGroupIngress(
    params: RevokeDBSecurityGroupIngressMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RevokeDBSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RevokeDBSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a database activity stream to monitor activity on the database. For more information, see Database Activity Streams in the Amazon Aurora User Guide.
    */
  def startActivityStream(): awsDashSdkLib.libRequestMod.Request[StartActivityStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startActivityStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartActivityStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartActivityStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a database activity stream to monitor activity on the database. For more information, see Database Activity Streams in the Amazon Aurora User Guide.
    */
  def startActivityStream(params: StartActivityStreamRequest): awsDashSdkLib.libRequestMod.Request[StartActivityStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startActivityStream(
    params: StartActivityStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartActivityStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartActivityStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command, or the StopDBCluster action. For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def startDBCluster(): awsDashSdkLib.libRequestMod.Request[StartDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command, or the StopDBCluster action. For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def startDBCluster(params: StartDBClusterMessage): awsDashSdkLib.libRequestMod.Request[StartDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDBCluster(
    params: StartDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or the StopDBInstance action.  For more information, see  Starting an Amazon RDS DB instance That Was Previously Stopped in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use StartDBCluster instead.  
    */
  def startDBInstance(): awsDashSdkLib.libRequestMod.Request[StartDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or the StopDBInstance action.  For more information, see  Starting an Amazon RDS DB instance That Was Previously Stopped in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use StartDBCluster instead.  
    */
  def startDBInstance(params: StartDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[StartDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startDBInstance(
    params: StartDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a database activity stream that was started using the AWS console, the start-activity-stream AWS CLI command, or the StartActivityStream action. For more information, see Database Activity Streams in the Amazon Aurora User Guide.
    */
  def stopActivityStream(): awsDashSdkLib.libRequestMod.Request[StopActivityStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopActivityStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopActivityStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopActivityStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a database activity stream that was started using the AWS console, the start-activity-stream AWS CLI command, or the StartActivityStream action. For more information, see Database Activity Streams in the Amazon Aurora User Guide.
    */
  def stopActivityStream(params: StopActivityStreamRequest): awsDashSdkLib.libRequestMod.Request[StopActivityStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopActivityStream(
    params: StopActivityStreamRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopActivityStreamResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopActivityStreamResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata, including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def stopDBCluster(): awsDashSdkLib.libRequestMod.Request[StopDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata, including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide.   This action only applies to Aurora DB clusters. 
    */
  def stopDBCluster(params: StopDBClusterMessage): awsDashSdkLib.libRequestMod.Request[StopDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopDBCluster(
    params: StopDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopDBClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata, including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping an Amazon RDS DB Instance Temporarily in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use StopDBCluster instead.  
    */
  def stopDBInstance(): awsDashSdkLib.libRequestMod.Request[StopDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata, including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping an Amazon RDS DB Instance Temporarily in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use StopDBCluster instead.  
    */
  def stopDBInstance(params: StopDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[StopDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopDBInstance(
    params: StopDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopDBInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    params: DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    params: DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    params: DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    params: DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBInstanceMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the dBSnapshotAvailable state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the dBSnapshotAvailable state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable,
    params: DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable,
    params: DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the dBSnapshotDeleted state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the dBSnapshotDeleted state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted,
    params: DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted,
    params: DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DBSnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

