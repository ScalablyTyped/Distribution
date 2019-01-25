package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_RDS: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsRdsMod.RDSNs.ClientConfiguration = js.native
  /**
    * Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User Guide.
    */
  def addRoleToDBCluster(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addRoleToDBCluster(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf in the Amazon Aurora User Guide.
    */
  def addRoleToDBCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.AddRoleToDBClusterMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addRoleToDBCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.AddRoleToDBClusterMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an AWS Identity and Access Management (IAM) role with a DB instance.
    */
  def addRoleToDBInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addRoleToDBInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an AWS Identity and Access Management (IAM) role with a DB instance.
    */
  def addRoleToDBInstance(params: awsDashSdkLib.clientsRdsMod.RDSNs.AddRoleToDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addRoleToDBInstance(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.AddRoleToDBInstanceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a source identifier to an existing RDS event notification subscription.
    */
  def addSourceIdentifierToSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AddSourceIdentifierToSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addSourceIdentifierToSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.AddSourceIdentifierToSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AddSourceIdentifierToSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a source identifier to an existing RDS event notification subscription.
    */
  def addSourceIdentifierToSubscription(params: awsDashSdkLib.clientsRdsMod.RDSNs.AddSourceIdentifierToSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AddSourceIdentifierToSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addSourceIdentifierToSubscription(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.AddSourceIdentifierToSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.AddSourceIdentifierToSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AddSourceIdentifierToSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def addTagsToResource(params: awsDashSdkLib.clientsRdsMod.RDSNs.AddTagsToResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.AddTagsToResourceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a DB instance).
    */
  def applyPendingMaintenanceAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def applyPendingMaintenanceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ApplyPendingMaintenanceActionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a DB instance).
    */
  def applyPendingMaintenanceAction(params: awsDashSdkLib.clientsRdsMod.RDSNs.ApplyPendingMaintenanceActionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def applyPendingMaintenanceAction(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ApplyPendingMaintenanceActionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ApplyPendingMaintenanceActionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances. Second, IP ranges are available if the application accessing your database is running on the Internet. Required parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).  You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.  For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def authorizeDBSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AuthorizeDBSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def authorizeDBSecurityGroupIngress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.AuthorizeDBSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AuthorizeDBSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances. Second, IP ranges are available if the application accessing your database is running on the Internet. Required parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).  You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another. You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.  For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def authorizeDBSecurityGroupIngress(params: awsDashSdkLib.clientsRdsMod.RDSNs.AuthorizeDBSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AuthorizeDBSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def authorizeDBSecurityGroupIngress(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.AuthorizeDBSecurityGroupIngressMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.AuthorizeDBSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AuthorizeDBSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Backtracks a DB cluster to a specific time, without creating a new DB cluster. For more information on backtracking, see  Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide. 
    */
  def backtrackDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrack, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def backtrackDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrack, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrack, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Backtracks a DB cluster to a specific time, without creating a new DB cluster. For more information on backtracking, see  Backtracking an Aurora DB Cluster in the Amazon Aurora User Guide. 
    */
  def backtrackDBCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.BacktrackDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrack, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def backtrackDBCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.BacktrackDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrack, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrack, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB cluster parameter group.
    */
  def copyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB cluster parameter group.
    */
  def copyDBClusterParameterGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterParameterGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.    TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status. For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see  Copying a Snapshot in the Amazon Aurora User Guide.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def copyDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.    TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status. For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see  Copying a Snapshot in the Amazon Aurora User Guide.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def copyDBClusterSnapshot(params: awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterSnapshot(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB parameter group.
    */
  def copyDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB parameter group.
    */
  def copyDBParameterGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBParameterGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state. You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.  For more information about copying snapshots, see Copying a DB Snapshot in the Amazon RDS User Guide. 
    */
  def copyDBSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state. You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the CopyDBSnapshot action is the destination AWS Region for the DB snapshot copy.  For more information about copying snapshots, see Copying a DB Snapshot in the Amazon RDS User Guide. 
    */
  def copyDBSnapshot(params: awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBSnapshot(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified option group.
    */
  def copyOptionGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyOptionGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CopyOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified option group.
    */
  def copyOptionGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.CopyOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyOptionGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CopyOptionGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CopyOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CopyOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon Aurora DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def createDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon Aurora DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def createDBCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.
    */
  def createDBClusterEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.
    */
  def createDBClusterEndpoint(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterEndpointMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterEndpoint(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def createDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def createDBClusterParameterGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterParameterGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def createDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def createDBClusterSnapshot(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterSnapshot(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB instance.
    */
  def createDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB instance.
    */
  def createDBInstance(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBInstance(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read Replica for a DB instance running MySQL, MariaDB, or PostgreSQL. For more information, see Working with PostgreSQL, MySQL, and MariaDB Read Replicas in the Amazon RDS User Guide.  Amazon Aurora doesn't support this action. You must call the CreateDBInstance action to create a DB instance for an Aurora DB cluster.  All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB security groups and DB parameter groups) are inherited from the source DB instance, except as specified following.   Your source DB instance must have backup retention enabled.  
    */
  def createDBInstanceReadReplica(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceReadReplicaResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBInstanceReadReplica(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceReadReplicaResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceReadReplicaResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read Replica for a DB instance running MySQL, MariaDB, or PostgreSQL. For more information, see Working with PostgreSQL, MySQL, and MariaDB Read Replicas in the Amazon RDS User Guide.  Amazon Aurora doesn't support this action. You must call the CreateDBInstance action to create a DB instance for an Aurora DB cluster.  All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB security groups and DB parameter groups) are inherited from the source DB instance, except as specified following.   Your source DB instance must have backup retention enabled.  
    */
  def createDBInstanceReadReplica(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceReadReplicaMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceReadReplicaResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBInstanceReadReplica(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceReadReplicaMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceReadReplicaResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBInstanceReadReplicaResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def createDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def createDBParameterGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBParameterGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB security group. DB security groups control access to a DB instance.  A DB security group controls access to EC2-Classic DB instances that are not in a VPC. 
    */
  def createDBSecurityGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSecurityGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB security group. DB security groups control access to a DB instance.  A DB security group controls access to EC2-Classic DB instances that are not in a VPC. 
    */
  def createDBSecurityGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBSecurityGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSecurityGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSecurityGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a DBSnapshot. The source DBInstance must be in "available" state.
    */
  def createDBSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a DBSnapshot. The source DBInstance must be in "available" state.
    */
  def createDBSnapshot(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBSnapshot(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def createDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def createDBSubnetGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBSubnetGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an RDS event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of RDS sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all RDS sources belonging to your customer account.
    */
  def createEventSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an RDS event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of RDS sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all RDS sources belonging to your customer account.
    */
  def createEventSubscription(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEventSubscription(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *    Creates an Aurora global database spread across multiple regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the primary cluster of the global database. 
    */
  def createGlobalCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGlobalCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *    Creates an Aurora global database spread across multiple regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.   You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the primary cluster of the global database. 
    */
  def createGlobalCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGlobalCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateGlobalClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new option group. You can create up to 20 option groups.
    */
  def createOptionGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createOptionGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new option group. You can create up to 20 option groups.
    */
  def createOptionGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createOptionGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.CreateOptionGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CreateOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CreateOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def deleteDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def deleteDBCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.
    */
  def deleteDBClusterEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBClusterEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.
    */
  def deleteDBClusterEndpoint(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterEndpointMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBClusterEndpoint(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def deleteDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBClusterParameterGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def deleteDBClusterParameterGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBClusterParameterGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def deleteDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def deleteDBClusterSnapshot(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBClusterSnapshot(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon RDS DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when the SkipFinalSnapshot parameter is set to true. If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a Read Replica of another Amazon Aurora DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a Read Replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
    */
  def deleteDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon RDS DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when the SkipFinalSnapshot parameter is set to true. If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a Read Replica of another Amazon Aurora DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a Read Replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
    */
  def deleteDBInstance(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBInstance(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes automated backups based on the source instance's DbiResourceId value or the restorable instance's resource ID.
    */
  def deleteDBInstanceAutomatedBackup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceAutomatedBackupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBInstanceAutomatedBackup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceAutomatedBackupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceAutomatedBackupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes automated backups based on the source instance's DbiResourceId value or the restorable instance's resource ID.
    */
  def deleteDBInstanceAutomatedBackup(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceAutomatedBackupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceAutomatedBackupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBInstanceAutomatedBackup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceAutomatedBackupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceAutomatedBackupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBInstanceAutomatedBackupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteDBParameterGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBParameterGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBParameterGroupMessage,
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
  def deleteDBSecurityGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBSecurityGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSecurityGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB snapshot must be in the available state to be deleted. 
    */
  def deleteDBSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB snapshot must be in the available state to be deleted. 
    */
  def deleteDBSnapshot(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBSnapshot(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteDBSubnetGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBSubnetGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteDBSubnetGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an RDS event notification subscription.
    */
  def deleteEventSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an RDS event notification subscription.
    */
  def deleteEventSubscription(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEventSubscription(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed first. 
    */
  def deleteGlobalCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteGlobalCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed first. 
    */
  def deleteGlobalCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteGlobalCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteGlobalClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DeleteGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DeleteGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteOptionGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteOptionGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DeleteOptionGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account, such as the number of DB instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command doesn't take any parameters.
    */
  def describeAccountAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AccountAttributesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccountAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.AccountAttributesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AccountAttributesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account, such as the number of DB instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command doesn't take any parameters.
    */
  def describeAccountAttributes(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeAccountAttributesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AccountAttributesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccountAttributes(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeAccountAttributesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.AccountAttributesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.AccountAttributesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
    */
  def describeCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CertificateMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CertificateMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CertificateMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
    */
  def describeCertificates(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeCertificatesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CertificateMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCertificates(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeCertificatesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.CertificateMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.CertificateMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about backtracks for a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeDBClusterBacktracks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrackMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterBacktracks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrackMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrackMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about backtracks for a DB cluster. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeDBClusterBacktracks(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterBacktracksMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrackMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterBacktracks(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterBacktracksMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrackMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterBacktrackMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about endpoints for an Amazon Aurora DB cluster.
    */
  def describeDBClusterEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpointMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpointMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpointMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about endpoints for an Amazon Aurora DB cluster.
    */
  def describeDBClusterEndpoints(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterEndpointsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpointMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterEndpoints(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterEndpointsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpointMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpointMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeDBClusterParameterGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameterGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeDBClusterParameterGroups(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameterGroups(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterParameterGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeDBClusterParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeDBClusterParameters(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameters(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.
    */
  def describeDBClusterSnapshotAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshotAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.
    */
  def describeDBClusterSnapshotAttributes(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterSnapshotAttributesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshotAttributes(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterSnapshotAttributesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about DB cluster snapshots. This API action supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeDBClusterSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about DB cluster snapshots. This API action supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeDBClusterSnapshots(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshots(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClusterSnapshotsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned Aurora DB clusters. This API supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeDBClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned Aurora DB clusters. This API supports pagination. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeDBClusters(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClustersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusters(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBClustersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the available DB engines.
    */
  def describeDBEngineVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBEngineVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBEngineVersionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the available DB engines.
    */
  def describeDBEngineVersions(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBEngineVersionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBEngineVersions(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBEngineVersionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBEngineVersionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays backups for both current and deleted instances. For example, use this operation to find details about automated backups for previously deleted instances. Current instances with retention periods greater than zero (0) are returned for both the DescribeDBInstanceAutomatedBackups and DescribeDBInstances operations. All parameters are optional.
    */
  def describeDBInstanceAutomatedBackups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceAutomatedBackupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBInstanceAutomatedBackups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceAutomatedBackupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceAutomatedBackupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays backups for both current and deleted instances. For example, use this operation to find details about automated backups for previously deleted instances. Current instances with retention periods greater than zero (0) are returned for both the DescribeDBInstanceAutomatedBackups and DescribeDBInstances operations. All parameters are optional.
    */
  def describeDBInstanceAutomatedBackups(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBInstanceAutomatedBackupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceAutomatedBackupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBInstanceAutomatedBackups(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBInstanceAutomatedBackupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceAutomatedBackupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceAutomatedBackupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned RDS instances. This API supports pagination.
    */
  def describeDBInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned RDS instances. This API supports pagination.
    */
  def describeDBInstances(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBInstancesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBInstances(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBInstancesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DB log files for the DB instance.
    */
  def describeDBLogFiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBLogFilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBLogFiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBLogFilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBLogFilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DB log files for the DB instance.
    */
  def describeDBLogFiles(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBLogFilesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBLogFilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBLogFiles(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBLogFilesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBLogFilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBLogFilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
    */
  def describeDBParameterGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBParameterGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
    */
  def describeDBParameterGroups(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBParameterGroups(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBParameterGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular DB parameter group.
    */
  def describeDBParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular DB parameter group.
    */
  def describeDBParameters(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBParameters(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified, the list will contain only the descriptions of the specified DB security group. 
    */
  def describeDBSecurityGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSecurityGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBSecurityGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of DBSecurityGroup descriptions. If a DBSecurityGroupName is specified, the list will contain only the descriptions of the specified DB security group. 
    */
  def describeDBSecurityGroups(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSecurityGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSecurityGroups(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSecurityGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBSecurityGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DB snapshot attribute names and values for a manual DB snapshot. When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB snapshot. If all is included in the list of values for the restore attribute, then the manual DB snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB snapshot public or private, use the ModifyDBSnapshotAttribute API action.
    */
  def describeDBSnapshotAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSnapshotAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DB snapshot attribute names and values for a manual DB snapshot. When sharing snapshots with other AWS accounts, DescribeDBSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB snapshot. If all is included in the list of values for the restore attribute, then the manual DB snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB snapshot public or private, use the ModifyDBSnapshotAttribute API action.
    */
  def describeDBSnapshotAttributes(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotAttributesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSnapshotAttributes(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotAttributesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about DB snapshots. This API action supports pagination.
    */
  def describeDBSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about DB snapshots. This API action supports pagination.
    */
  def describeDBSnapshots(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSnapshots(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def describeDBSubnetGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSubnetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def describeDBSubnetGroups(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSubnetGroups(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSubnetGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the cluster database engine. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeEngineDefaultClusterParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultClusterParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultClusterParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the cluster database engine. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeEngineDefaultClusterParameters(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultClusterParameters(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultClusterParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultClusterParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the specified database engine.
    */
  def describeEngineDefaultParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the specified database engine.
    */
  def describeEngineDefaultParameters(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultParameters(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in the  Events topic in the Amazon RDS User Guide. 
    */
  def describeEventCategories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventCategories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.EventCategoriesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in the  Events topic in the Amazon RDS User Guide. 
    */
  def describeEventCategories(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEventCategoriesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventCategories(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEventCategoriesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.EventCategoriesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
    */
  def describeEventSubscriptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventSubscriptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.EventSubscriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
    */
  def describeEventSubscriptions(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEventSubscriptionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventSubscriptions(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEventSubscriptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.EventSubscriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
    */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.EventsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
    */
  def describeEvents(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeEventsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.EventsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns information about Aurora global database clusters. This API supports pagination.   For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeGlobalClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.GlobalClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGlobalClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.GlobalClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.GlobalClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns information about Aurora global database clusters. This API supports pagination.   For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def describeGlobalClusters(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeGlobalClustersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.GlobalClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGlobalClusters(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeGlobalClustersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.GlobalClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.GlobalClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes all available options.
    */
  def describeOptionGroupOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroupOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOptionGroupOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroupOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroupOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes all available options.
    */
  def describeOptionGroupOptions(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeOptionGroupOptionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroupOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOptionGroupOptions(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeOptionGroupOptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroupOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroupOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the available option groups.
    */
  def describeOptionGroups(): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOptionGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroups, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the available option groups.
    */
  def describeOptionGroups(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeOptionGroupsMessage): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOptionGroups(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeOptionGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroups, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[awsDashSdkLib.clientsRdsMod.RDSNs.OptionGroups, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of orderable DB instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOrderableDBInstanceOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.OrderableDBInstanceOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of orderable DB instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeOrderableDBInstanceOptionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOrderableDBInstanceOptions(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeOrderableDBInstanceOptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.OrderableDBInstanceOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePendingMaintenanceActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.PendingMaintenanceActionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribePendingMaintenanceActionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePendingMaintenanceActions(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribePendingMaintenanceActionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.PendingMaintenanceActionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
    */
  def describeReservedDBInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedDBInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
    */
  def describeReservedDBInstances(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeReservedDBInstancesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedDBInstances(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeReservedDBInstancesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists available reserved DB instance offerings.
    */
  def describeReservedDBInstancesOfferings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstancesOfferingMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedDBInstancesOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstancesOfferingMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstancesOfferingMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists available reserved DB instance offerings.
    */
  def describeReservedDBInstancesOfferings(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeReservedDBInstancesOfferingsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstancesOfferingMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReservedDBInstancesOfferings(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeReservedDBInstancesOfferingsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstancesOfferingMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ReservedDBInstancesOfferingMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB snapshot from. This API action supports pagination.
    */
  def describeSourceRegions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.SourceRegionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSourceRegions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.SourceRegionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.SourceRegionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB snapshot from. This API action supports pagination.
    */
  def describeSourceRegions(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeSourceRegionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.SourceRegionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSourceRegions(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeSourceRegionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.SourceRegionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.SourceRegionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
    */
  def describeValidDBInstanceModifications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeValidDBInstanceModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeValidDBInstanceModifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeValidDBInstanceModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeValidDBInstanceModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
    */
  def describeValidDBInstanceModifications(params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeValidDBInstanceModificationsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeValidDBInstanceModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeValidDBInstanceModifications(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeValidDBInstanceModificationsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DescribeValidDBInstanceModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DescribeValidDBInstanceModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Downloads all or a portion of the specified log file, up to 1 MB in size.
    */
  def downloadDBLogFilePortion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DownloadDBLogFilePortionDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def downloadDBLogFilePortion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DownloadDBLogFilePortionDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DownloadDBLogFilePortionDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Downloads all or a portion of the specified log file, up to 1 MB in size.
    */
  def downloadDBLogFilePortion(params: awsDashSdkLib.clientsRdsMod.RDSNs.DownloadDBLogFilePortionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DownloadDBLogFilePortionDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def downloadDBLogFilePortion(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DownloadDBLogFilePortionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DownloadDBLogFilePortionDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DownloadDBLogFilePortionDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def failoverDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def failoverDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.FailoverDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def failoverDBCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.FailoverDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def failoverDBCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.FailoverDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.FailoverDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags on an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags on an Amazon RDS resource. For an overview on tagging an Amazon RDS resource, see Tagging Amazon RDS Resources in the Amazon RDS User Guide.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsRdsMod.RDSNs.ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ListTagsForResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Set the capacity of an Aurora Serverless DB cluster to a specific value. Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call ModifyCurrentDBClusterCapacity to set the capacity explicitly. After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on the cooldown period for scaling up and the cooldown period for scaling down. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.  If you call ModifyCurrentDBClusterCapacity with the default TimeoutAction, connections that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling points, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide. 
    */
  def modifyCurrentDBClusterCapacity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterCapacityInfo, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyCurrentDBClusterCapacity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterCapacityInfo, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterCapacityInfo, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Set the capacity of an Aurora Serverless DB cluster to a specific value. Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call ModifyCurrentDBClusterCapacity to set the capacity explicitly. After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on the cooldown period for scaling up and the cooldown period for scaling down. For more information about Aurora Serverless, see Using Amazon Aurora Serverless in the Amazon Aurora User Guide.  If you call ModifyCurrentDBClusterCapacity with the default TimeoutAction, connections that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling points, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide. 
    */
  def modifyCurrentDBClusterCapacity(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyCurrentDBClusterCapacityMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterCapacityInfo, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyCurrentDBClusterCapacity(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyCurrentDBClusterCapacityMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterCapacityInfo, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterCapacityInfo, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def modifyDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def modifyDBCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
    */
  def modifyDBClusterEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
    */
  def modifyDBClusterEndpoint(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterEndpointMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterEndpoint(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterEndpointMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterEndpoint, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
    */
  def modifyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
    */
  def modifyDBClusterParameterGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterParameterGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.
    */
  def modifyDBClusterSnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterSnapshotAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.
    */
  def modifyDBClusterSnapshotAttribute(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterSnapshotAttributeMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterSnapshotAttribute(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterSnapshotAttributeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
    */
  def modifyDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
    */
  def modifyDBInstance(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBInstance(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def modifyDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon RDS console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def modifyDBParameterGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBParameterGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.  Amazon RDS supports upgrading DB snapshots for MySQL and Oracle. 
    */
  def modifyDBSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.  Amazon RDS supports upgrading DB snapshots for MySQL and Oracle. 
    */
  def modifyDBSnapshot(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBSnapshot(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot. To share a manual DB snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB snapshot. Uses the value all to make the manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot public or private, use the DescribeDBSnapshotAttributes API action.
    */
  def modifyDBSnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBSnapshotAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot. To share a manual DB snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB snapshot. Uses the value all to make the manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot public or private, use the DescribeDBSnapshotAttributes API action.
    */
  def modifyDBSnapshotAttribute(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotAttributeMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBSnapshotAttribute(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotAttributeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def modifyDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def modifyDBSubnetGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBSubnetGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType in the Events topic in the Amazon RDS User Guide or by using the DescribeEventCategories action.
    */
  def modifyEventSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType in the Events topic in the Amazon RDS User Guide or by using the DescribeEventCategories action.
    */
  def modifyEventSubscription(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyEventSubscription(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def modifyGlobalCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyGlobalCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def modifyGlobalCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyGlobalCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyGlobalClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing option group.
    */
  def modifyOptionGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyOptionGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing option group.
    */
  def modifyOptionGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyOptionGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyOptionGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ModifyOptionGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.ModifyOptionGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.ModifyOptionGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Promotes a Read Replica DB instance to a standalone DB instance.    Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in the backing-up status. If you have enabled backups on your Read Replica, configure the automated backup window so that daily backups do not interfere with Read Replica promotion.   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.   
    */
  def promoteReadReplica(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def promoteReadReplica(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Promotes a Read Replica DB instance to a standalone DB instance.    Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in the backing-up status. If you have enabled backups on your Read Replica, configure the automated backup window so that daily backups do not interfere with Read Replica promotion.   This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.   
    */
  def promoteReadReplica(params: awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def promoteReadReplica(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Promotes a Read Replica DB cluster to a standalone DB cluster.
    */
  def promoteReadReplicaDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def promoteReadReplicaDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Promotes a Read Replica DB cluster to a standalone DB cluster.
    */
  def promoteReadReplicaDBCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def promoteReadReplicaDBCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PromoteReadReplicaDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Purchases a reserved DB instance offering.
    */
  def purchaseReservedDBInstancesOffering(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PurchaseReservedDBInstancesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseReservedDBInstancesOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.PurchaseReservedDBInstancesOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PurchaseReservedDBInstancesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Purchases a reserved DB instance offering.
    */
  def purchaseReservedDBInstancesOffering(params: awsDashSdkLib.clientsRdsMod.RDSNs.PurchaseReservedDBInstancesOfferingMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PurchaseReservedDBInstancesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def purchaseReservedDBInstancesOffering(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.PurchaseReservedDBInstancesOfferingMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.PurchaseReservedDBInstancesOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.PurchaseReservedDBInstancesOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.  For more information about rebooting, see Rebooting a DB Instance in the Amazon RDS User Guide. 
    */
  def rebootDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RebootDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting.  For more information about rebooting, see Rebooting a DB Instance in the Amazon RDS User Guide. 
    */
  def rebootDBInstance(params: awsDashSdkLib.clientsRdsMod.RDSNs.RebootDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootDBInstance(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RebootDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RebootDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a different region. 
    */
  def removeFromGlobalCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RemoveFromGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeFromGlobalCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RemoveFromGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RemoveFromGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a different region. 
    */
  def removeFromGlobalCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.RemoveFromGlobalClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RemoveFromGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeFromGlobalCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RemoveFromGlobalClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RemoveFromGlobalClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RemoveFromGlobalClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User Guide.
    */
  def removeRoleFromDBCluster(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeRoleFromDBCluster(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information, see Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf  in the Amazon Aurora User Guide.
    */
  def removeRoleFromDBCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.RemoveRoleFromDBClusterMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeRoleFromDBCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RemoveRoleFromDBClusterMessage,
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
  def removeRoleFromDBInstance(params: awsDashSdkLib.clientsRdsMod.RDSNs.RemoveRoleFromDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeRoleFromDBInstance(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RemoveRoleFromDBInstanceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a source identifier from an existing RDS event notification subscription.
    */
  def removeSourceIdentifierFromSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RemoveSourceIdentifierFromSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeSourceIdentifierFromSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RemoveSourceIdentifierFromSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RemoveSourceIdentifierFromSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a source identifier from an existing RDS event notification subscription.
    */
  def removeSourceIdentifierFromSubscription(params: awsDashSdkLib.clientsRdsMod.RDSNs.RemoveSourceIdentifierFromSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RemoveSourceIdentifierFromSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeSourceIdentifierFromSubscription(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RemoveSourceIdentifierFromSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RemoveSourceIdentifierFromSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RemoveSourceIdentifierFromSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def removeTagsFromResource(params: awsDashSdkLib.clientsRdsMod.RDSNs.RemoveTagsFromResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RemoveTagsFromResourceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def resetDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def resetDBClusterParameterGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.ResetDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetDBClusterParameterGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ResetDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
    */
  def resetDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
    */
  def resetDBParameterGroup(params: awsDashSdkLib.clientsRdsMod.RDSNs.ResetDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetDBParameterGroup(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.ResetDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data to an Amazon Aurora MySQL DB Cluster in the Amazon Aurora User Guide.
    */
  def restoreDBClusterFromS3(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromS3Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterFromS3(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromS3Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromS3Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in  Migrating Data to an Amazon Aurora MySQL DB Cluster in the Amazon Aurora User Guide.
    */
  def restoreDBClusterFromS3(params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromS3Message): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromS3Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterFromS3(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromS3Message,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromS3Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromS3Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def restoreDBClusterFromSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group. For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def restoreDBClusterFromSnapshot(params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterFromSnapshot(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def restoreDBClusterToPointInTime(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterToPointInTime(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available.  For more information on Amazon Aurora, see  What Is Amazon Aurora? in the Amazon Aurora User Guide. 
    */
  def restoreDBClusterToPointInTime(params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterToPointInTimeMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterToPointInTime(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterToPointInTimeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore point with the most of original configuration with the default security group and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored AZ deployment and not a single-AZ deployment. If your intent is to replace your original DB instance with the new, restored DB instance, then rename your original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB instances with the same name. Once you have renamed your original DB instance with a different identifier, then you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB instance created from the snapshot. If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterFromSnapshot. 
    */
  def restoreDBInstanceFromDBSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBInstanceFromDBSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore point with the most of original configuration with the default security group and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored AZ deployment and not a single-AZ deployment. If your intent is to replace your original DB instance with the new, restored DB instance, then rename your original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB instances with the same name. Once you have renamed your original DB instance with a different identifier, then you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB instance created from the snapshot. If you are restoring from a shared manual DB snapshot, the DBSnapshotIdentifier must be the ARN of the shared DB snapshot.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterFromSnapshot. 
    */
  def restoreDBInstanceFromDBSnapshot(params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromDBSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBInstanceFromDBSnapshot(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromDBSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromDBSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromDBSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide. 
    */
  def restoreDBInstanceFromS3(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromS3Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBInstanceFromS3(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromS3Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromS3Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see Importing Data into an Amazon RDS MySQL DB Instance in the Amazon RDS User Guide. 
    */
  def restoreDBInstanceFromS3(params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromS3Message): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromS3Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBInstanceFromS3(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromS3Message,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromS3Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceFromS3Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by the BackupRetentionPeriod property. The target database is created with most of the original configuration, but in a system-selected Availability Zone, with the default security group, the default subnet group, and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment and not a single-AZ deployment.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterToPointInTime. 
    */
  def restoreDBInstanceToPointInTime(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBInstanceToPointInTime(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by the BackupRetentionPeriod property. The target database is created with most of the original configuration, but in a system-selected Availability Zone, with the default security group, the default subnet group, and the default DB parameter group. By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment and not a single-AZ deployment.  This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use RestoreDBClusterToPointInTime. 
    */
  def restoreDBInstanceToPointInTime(params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceToPointInTimeMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBInstanceToPointInTime(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceToPointInTimeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RestoreDBInstanceToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups. Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId).
    */
  def revokeDBSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RevokeDBSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def revokeDBSecurityGroupIngress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RevokeDBSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RevokeDBSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups. Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId).
    */
  def revokeDBSecurityGroupIngress(params: awsDashSdkLib.clientsRdsMod.RDSNs.RevokeDBSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RevokeDBSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def revokeDBSecurityGroupIngress(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.RevokeDBSecurityGroupIngressMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.RevokeDBSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.RevokeDBSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command, or the StopDBCluster action. For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
    */
  def startDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StartDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.StartDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StartDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command, or the StopDBCluster action. For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
    */
  def startDBCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.StartDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StartDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startDBCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.StartDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.StartDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StartDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or the StopDBInstance action.  For more information, see  Starting an Amazon RDS DB instance That Was Previously Stopped in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use StartDBCluster instead.  
    */
  def startDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StartDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.StartDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StartDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or the StopDBInstance action.  For more information, see  Starting an Amazon RDS DB instance That Was Previously Stopped in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use StartDBCluster instead.  
    */
  def startDBInstance(params: awsDashSdkLib.clientsRdsMod.RDSNs.StartDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StartDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startDBInstance(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.StartDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.StartDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StartDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata, including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
    */
  def stopDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StopDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.StopDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StopDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata, including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping and Starting an Aurora Cluster in the Amazon Aurora User Guide. 
    */
  def stopDBCluster(params: awsDashSdkLib.clientsRdsMod.RDSNs.StopDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StopDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopDBCluster(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.StopDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.StopDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StopDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata, including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping an Amazon RDS DB Instance Temporarily in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use StopDBCluster instead.  
    */
  def stopDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StopDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.StopDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StopDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata, including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction logs so you can do a point-in-time restore if necessary.  For more information, see  Stopping an Amazon RDS DB Instance Temporarily in the Amazon RDS User Guide.    This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use StopDBCluster instead.  
    */
  def stopDBInstance(params: awsDashSdkLib.clientsRdsMod.RDSNs.StopDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StopDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopDBInstance(
    params: awsDashSdkLib.clientsRdsMod.RDSNs.StopDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.StopDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.StopDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying RDS.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBSnapshotAvailable state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBSnapshotAvailable state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable,
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotAvailable,
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBSnapshotDeleted state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBSnapshotDeleted state by periodically calling the underlying RDS.describeDBSnapshotsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted,
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBSnapshotDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBSnapshotDeleted,
    params: awsDashSdkLib.clientsRdsMod.RDSNs.DescribeDBSnapshotsMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsMod.RDSNs.DBSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

