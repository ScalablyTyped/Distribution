package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Neptune
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Neptune: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ClientConfiguration = js.native
  /**
    * Associates an Identity and Access Management (IAM) role from an Neptune DB cluster. 
    */
  def addRoleToDBCluster(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addRoleToDBCluster(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an Identity and Access Management (IAM) role from an Neptune DB cluster. 
    */
  def addRoleToDBCluster(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddRoleToDBClusterMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addRoleToDBCluster(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddRoleToDBClusterMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a source identifier to an existing event notification subscription.
    */
  def addSourceIdentifierToSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddSourceIdentifierToSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addSourceIdentifierToSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddSourceIdentifierToSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddSourceIdentifierToSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a source identifier to an existing event notification subscription.
    */
  def addSourceIdentifierToSubscription(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddSourceIdentifierToSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddSourceIdentifierToSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addSourceIdentifierToSubscription(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddSourceIdentifierToSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddSourceIdentifierToSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddSourceIdentifierToSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds metadata tags to an Amazon Neptune resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon Neptune resources, or used in a Condition statement in an IAM policy for Amazon Neptune.
    */
  def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds metadata tags to an Amazon Neptune resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon Neptune resources, or used in a Condition statement in an IAM policy for Amazon Neptune.
    */
  def addTagsToResource(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddTagsToResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.AddTagsToResourceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a DB instance).
    */
  def applyPendingMaintenanceAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def applyPendingMaintenanceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ApplyPendingMaintenanceActionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a DB instance).
    */
  def applyPendingMaintenanceAction(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ApplyPendingMaintenanceActionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def applyPendingMaintenanceAction(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ApplyPendingMaintenanceActionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ApplyPendingMaintenanceActionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB cluster parameter group.
    */
  def copyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB cluster parameter group.
    */
  def copyDBClusterParameterGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterParameterGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:neptune-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.    TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status.
    */
  def copyDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you call the CopyDBClusterSnapshot action is the destination AWS Region for the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the following values:    KmsKeyId - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region.    PreSignedUrl - A URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot action to be called in the source AWS Region where the DB cluster snapshot is copied from. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot will be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:neptune-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.    TargetDBClusterSnapshotIdentifier - The identifier for the new copy of the DB cluster snapshot in the destination AWS Region.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value as the SourceDBClusterSnapshotIdentifier in the pre-signed URL.    To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in "copying" status.
    */
  def copyDBClusterSnapshot(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterSnapshot(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB parameter group.
    */
  def copyDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB parameter group.
    */
  def copyDBParameterGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBParameterGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CopyDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon Neptune DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon Neptune DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter.
    */
  def createDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon Neptune DB cluster. You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of another DB cluster or Amazon Neptune DB instance. For cross-region replication where the DB cluster identified by ReplicationSourceIdentifier is encrypted, you must also specify the PreSignedUrl parameter.
    */
  def createDBCluster(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBCluster(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
    */
  def createDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.  A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover for the new DB cluster parameter group and associated settings to take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
    */
  def createDBClusterParameterGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterParameterGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a DB cluster. 
    */
  def createDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a DB cluster. 
    */
  def createDBClusterSnapshot(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterSnapshot(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB instance.
    */
  def createDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB instance.
    */
  def createDBInstance(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBInstance(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def createDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB parameter group.  A DB parameter group is initially created with the default parameters for the database engine used by the DB instance. To provide custom values for any of the parameters, you must modify the group after creating it using ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance, you need to reboot the DB instance without failover for the new DB parameter group and associated settings to take effect.   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def createDBParameterGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBParameterGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def createDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def createDBSubnetGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBSubnetGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the Neptune console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of Neptune sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your Neptune sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all Neptune sources belonging to your customer account.
    */
  def createEventSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by either the Neptune console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the type of source (SourceType) you want to be notified of, provide a list of Neptune sources (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and EventCategories = Availability, Backup. If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier = myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all your Neptune sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of events generated from all Neptune sources belonging to your customer account.
    */
  def createEventSubscription(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEventSubscription(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted. 
    */
  def deleteDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted. 
    */
  def deleteDBCluster(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBCluster(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters.
    */
  def deleteDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBClusterParameterGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated with any DB clusters.
    */
  def deleteDBClusterParameterGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBClusterParameterGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted. 
    */
  def deleteDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted. 
    */
  def deleteDBClusterSnapshot(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBClusterSnapshot(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon Neptune DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when the SkipFinalSnapshot parameter is set to true. If the specified DB instance is part of a DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a Read Replica of another DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a Read Replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
    */
  def deleteDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to be deleted by DeleteDBInstance are not deleted.  If you request a final DB snapshot the status of the Amazon Neptune DB instance is deleting until the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this operation. The action can't be canceled or reverted once submitted.  Note that when a DB instance is in a failure state and has a status of failed, incompatible-restore, or incompatible-network, you can only delete it when the SkipFinalSnapshot parameter is set to true. If the specified DB instance is part of a DB cluster, you can't delete the DB instance if both of the following conditions are true:   The DB cluster is a Read Replica of another DB cluster.   The DB instance is the only instance in the DB cluster.   To delete a DB instance in this case, first call the PromoteReadReplicaDBCluster API action to promote the DB cluster so it's no longer a Read Replica. After the promotion completes, then call the DeleteDBInstance API action to delete the final instance in the DB cluster.
    */
  def deleteDBInstance(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBInstance(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified DBParameterGroup. The DBParameterGroup to be deleted can't be associated with any DB instances.
    */
  def deleteDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBParameterGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified DBParameterGroup. The DBParameterGroup to be deleted can't be associated with any DB instances.
    */
  def deleteDBParameterGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBParameterGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBParameterGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def deleteDBSubnetGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBSubnetGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteDBSubnetGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an event notification subscription.
    */
  def deleteEventSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an event notification subscription.
    */
  def deleteEventSubscription(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEventSubscription(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DeleteEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group. 
    */
  def describeDBClusterParameterGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameterGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list will contain only the description of the specified DB cluster parameter group. 
    */
  def describeDBClusterParameterGroups(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameterGroups(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterParameterGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group.
    */
  def describeDBClusterParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group.
    */
  def describeDBClusterParameters(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameters(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.
    */
  def describeDBClusterSnapshotAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshotAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts. To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.
    */
  def describeDBClusterSnapshotAttributes(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterSnapshotAttributesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshotAttributes(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterSnapshotAttributesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about DB cluster snapshots. This API action supports pagination.
    */
  def describeDBClusterSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about DB cluster snapshots. This API action supports pagination.
    */
  def describeDBClusterSnapshots(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshots(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClusterSnapshotsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned DB clusters. This API supports pagination.
    */
  def describeDBClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned DB clusters. This API supports pagination.
    */
  def describeDBClusters(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClustersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusters(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBClustersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the available DB engines.
    */
  def describeDBEngineVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBEngineVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBEngineVersionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the available DB engines.
    */
  def describeDBEngineVersions(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBEngineVersionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBEngineVersions(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBEngineVersionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBEngineVersionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned instances. This API supports pagination.
    */
  def describeDBInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned instances. This API supports pagination.
    */
  def describeDBInstances(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBInstancesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBInstances(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBInstancesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
    */
  def describeDBParameterGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBParameterGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is specified, the list will contain only the description of the specified DB parameter group. 
    */
  def describeDBParameterGroups(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBParameterGroups(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBParameterGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular DB parameter group.
    */
  def describeDBParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular DB parameter group.
    */
  def describeDBParameters(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBParameters(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def describeDBSubnetGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSubnetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup. For an overview of CIDR ranges, go to the Wikipedia Tutorial. 
    */
  def describeDBSubnetGroups(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSubnetGroups(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBSubnetGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the cluster database engine.
    */
  def describeEngineDefaultClusterParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultClusterParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultClusterParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the cluster database engine.
    */
  def describeEngineDefaultClusterParameters(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultClusterParameters(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultClusterParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultClusterParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the specified database engine.
    */
  def describeEngineDefaultParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the specified database engine.
    */
  def describeEngineDefaultParameters(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultParameters(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEngineDefaultParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays a list of categories for all event source types, or, if specified, for a specified source type. 
    */
  def describeEventCategories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventCategories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventCategoriesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays a list of categories for all event source types, or, if specified, for a specified source type. 
    */
  def describeEventCategories(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEventCategoriesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventCategories(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEventCategoriesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventCategoriesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
    */
  def describeEventSubscriptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventSubscriptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventSubscriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all the subscription descriptions for a customer account. The description for a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status. If you specify a SubscriptionName, lists the description for that subscription.
    */
  def describeEventSubscriptions(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEventSubscriptionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventSubscriptions(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEventSubscriptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventSubscriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
    */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
    */
  def describeEvents(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeEventsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of orderable DB instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOrderableDBInstanceOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.OrderableDBInstanceOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of orderable DB instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeOrderableDBInstanceOptionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOrderableDBInstanceOptions(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeOrderableDBInstanceOptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.OrderableDBInstanceOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePendingMaintenanceActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PendingMaintenanceActionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribePendingMaintenanceActionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePendingMaintenanceActions(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribePendingMaintenanceActionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PendingMaintenanceActionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
    */
  def describeValidDBInstanceModifications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeValidDBInstanceModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeValidDBInstanceModifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeValidDBInstanceModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeValidDBInstanceModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance. 
    */
  def describeValidDBInstanceModifications(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeValidDBInstanceModificationsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeValidDBInstanceModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeValidDBInstanceModifications(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeValidDBInstanceModificationsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeValidDBInstanceModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeValidDBInstanceModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Read Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Neptune will automatically fail over to a Read Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete.
    */
  def failoverDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def failoverDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.FailoverDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Read Replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). Amazon Neptune will automatically fail over to a Read Replica, if one exists, when the primary instance fails. You can force a failover when you want to simulate a failure of a primary instance for testing. Because each instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing connections that use those endpoint addresses when the failover is complete.
    */
  def failoverDBCluster(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.FailoverDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def failoverDBCluster(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.FailoverDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.FailoverDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags on an Amazon Neptune resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags on an Amazon Neptune resource.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ListTagsForResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify a setting for a DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. 
    */
  def modifyDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modify a setting for a DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. 
    */
  def modifyDBCluster(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBCluster(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
    */
  def modifyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB cluster associated with the parameter group before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to fully complete the create action before the parameter group is used as the default for a new DB cluster. This is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or modified. 
    */
  def modifyDBClusterParameterGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterParameterGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.
    */
  def modifyDBClusterSnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterSnapshotAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case. To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.
    */
  def modifyDBClusterSnapshotAttribute(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterSnapshotAttributeMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterSnapshotAttribute(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterSnapshotAttributeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
    */
  def modifyDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. To learn what modifications you can make to your DB instance, call DescribeValidDBInstanceModifications before you call ModifyDBInstance. 
    */
  def modifyDBInstance(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBInstance(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def modifyDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without failover to the DB instance associated with the parameter group before the change can take effect.   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete the modify action before the parameter group is used as the default for a new DB instance. This is especially important for parameters that are critical when creating the default database for a DB instance, such as the character set for the default database defined by the character_set_database parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to verify that your DB parameter group has been created or modified. 
    */
  def modifyDBParameterGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBParameterGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def modifyDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS Region.
    */
  def modifyDBSubnetGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBSubnetGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType by using the DescribeEventCategories action.
    */
  def modifyEventSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing event notification subscription. Note that you can't modify the source identifiers using this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls. You can see a list of the event categories for a given SourceType by using the DescribeEventCategories action.
    */
  def modifyEventSubscription(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyEventSubscription(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Promotes a Read Replica DB cluster to a standalone DB cluster.
    */
  def promoteReadReplicaDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PromoteReadReplicaDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def promoteReadReplicaDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PromoteReadReplicaDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PromoteReadReplicaDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Promotes a Read Replica DB cluster to a standalone DB cluster.
    */
  def promoteReadReplicaDBCluster(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PromoteReadReplicaDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PromoteReadReplicaDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def promoteReadReplicaDBCluster(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PromoteReadReplicaDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PromoteReadReplicaDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.PromoteReadReplicaDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting. 
    */
  def rebootDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RebootDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting. 
    */
  def rebootDBInstance(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RebootDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootDBInstance(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RebootDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RebootDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates an Identity and Access Management (IAM) role from a DB cluster. 
    */
  def removeRoleFromDBCluster(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeRoleFromDBCluster(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates an Identity and Access Management (IAM) role from a DB cluster. 
    */
  def removeRoleFromDBCluster(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveRoleFromDBClusterMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeRoleFromDBCluster(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveRoleFromDBClusterMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a source identifier from an existing event notification subscription.
    */
  def removeSourceIdentifierFromSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveSourceIdentifierFromSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeSourceIdentifierFromSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveSourceIdentifierFromSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveSourceIdentifierFromSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a source identifier from an existing event notification subscription.
    */
  def removeSourceIdentifierFromSubscription(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveSourceIdentifierFromSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveSourceIdentifierFromSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeSourceIdentifierFromSubscription(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveSourceIdentifierFromSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveSourceIdentifierFromSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveSourceIdentifierFromSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes metadata tags from an Amazon Neptune resource.
    */
  def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes metadata tags from an Amazon Neptune resource.
    */
  def removeTagsFromResource(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveTagsFromResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RemoveTagsFromResourceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to.
    */
  def resetDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static parameter to apply to.
    */
  def resetDBClusterParameterGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ResetDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetDBClusterParameterGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ResetDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
    */
  def resetDBParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetDBParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance restart or RebootDBInstance request. 
    */
  def resetDBParameterGroup(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ResetDBParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetDBParameterGroup(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.ResetDBParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group.
    */
  def restoreDBClusterFromSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group.
    */
  def restoreDBClusterFromSnapshot(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterFromSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterFromSnapshot(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterFromSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available. 
    */
  def restoreDBClusterToPointInTime(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterToPointInTime(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group.   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the RestoreDBClusterToPointInTime action has completed and the DB cluster is available. 
    */
  def restoreDBClusterToPointInTime(params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterToPointInTimeMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterToPointInTime(
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterToPointInTimeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying Neptune.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying Neptune.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying Neptune.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying Neptune.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    params: awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsNeptuneMod.NeptuneNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

