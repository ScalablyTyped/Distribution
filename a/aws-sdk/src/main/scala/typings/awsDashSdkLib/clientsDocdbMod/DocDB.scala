package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocDB
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DocDB: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsDocdbMod.DocDBNs.ClientConfiguration = js.native
  /**
    * Adds metadata tags to an Amazon DocumentDB resource. You can use these tags with cost allocation reporting to track costs that are associated with Amazon DocumentDB resources. or in a Condition statement in an AWS Identity and Access Management (IAM) policy for Amazon DocumentDB.
    */
  def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds metadata tags to an Amazon DocumentDB resource. You can use these tags with cost allocation reporting to track costs that are associated with Amazon DocumentDB resources. or in a Condition statement in an AWS Identity and Access Management (IAM) policy for Amazon DocumentDB.
    */
  def addTagsToResource(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.AddTagsToResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.AddTagsToResourceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a DB instance).
    */
  def applyPendingMaintenanceAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def applyPendingMaintenanceAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.ApplyPendingMaintenanceActionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies a pending maintenance action to a resource (for example, to a DB instance).
    */
  def applyPendingMaintenanceAction(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ApplyPendingMaintenanceActionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def applyPendingMaintenanceAction(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ApplyPendingMaintenanceActionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.ApplyPendingMaintenanceActionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ApplyPendingMaintenanceActionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB cluster parameter group.
    */
  def copyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies the specified DB cluster parameter group.
    */
  def copyDBClusterParameterGroup(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterParameterGroup(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. To cancel the copy operation after it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in the copying status.
    */
  def copyDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Copies a snapshot of a DB cluster. To copy a DB cluster snapshot from a shared manual DB cluster snapshot, SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster snapshot. To cancel the copy operation after it is in progress, delete the target DB cluster snapshot identified by TargetDBClusterSnapshotIdentifier while that DB cluster snapshot is in the copying status.
    */
  def copyDBClusterSnapshot(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def copyDBClusterSnapshot(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CopyDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon DocumentDB DB cluster.
    */
  def createDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon DocumentDB DB cluster.
    */
  def createDBCluster(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBCluster(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster. A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after you create it. After you create a DB cluster parameter group, you must associate it with your DB cluster. For the new DB cluster parameter group and associated settings to take effect, you must then reboot the DB instances in the DB cluster without failover.  After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This step is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. 
    */
  def createDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster parameter group. Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster. A DB cluster parameter group is initially created with the default parameters for the database engine used by instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after you create it. After you create a DB cluster parameter group, you must associate it with your DB cluster. For the new DB cluster parameter group and associated settings to take effect, you must then reboot the DB instances in the DB cluster without failover.  After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the DB cluster parameter group is used as the default for a new DB cluster. This step is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. 
    */
  def createDBClusterParameterGroup(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterParameterGroup(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a DB cluster. 
    */
  def createDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a snapshot of a DB cluster. 
    */
  def createDBClusterSnapshot(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBClusterSnapshot(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB instance.
    */
  def createDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB instance.
    */
  def createDBInstance(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBInstance(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
    */
  def createDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
    */
  def createDBSubnetGroup(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDBSubnetGroup(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.CreateDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted. 
    */
  def deleteDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously provisioned DB cluster. When you delete a DB cluster, all automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the specified DB cluster are not deleted. 
    */
  def deleteDBCluster(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBCluster(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterResult, 
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
  def deleteDBClusterParameterGroup(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBClusterParameterGroup(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterParameterGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted. 
    */
  def deleteDBClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.  The DB cluster snapshot must be in the available state to be deleted. 
    */
  def deleteDBClusterSnapshot(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBClusterSnapshot(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously provisioned DB instance. 
    */
  def deleteDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously provisioned DB instance. 
    */
  def deleteDBInstance(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDBInstance(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBInstanceResult, 
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
  def deleteDBSubnetGroup(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDBSubnetGroup(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DeleteDBSubnetGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list contains only the description of the specified DB cluster parameter group. 
    */
  def describeDBClusterParameterGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameterGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DBClusterParameterGroup descriptions. If a DBClusterParameterGroupName parameter is specified, the list contains only the description of the specified DB cluster parameter group. 
    */
  def describeDBClusterParameterGroups(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameterGroups(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterParameterGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group.
    */
  def describeDBClusterParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular DB cluster parameter group.
    */
  def describeDBClusterParameters(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterParameters(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When you share snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.
    */
  def describeDBClusterSnapshotAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshotAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot. When you share snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If all is included in the list of values for the restore attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.
    */
  def describeDBClusterSnapshotAttributes(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterSnapshotAttributesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshotAttributes(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterSnapshotAttributesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterSnapshotAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterSnapshotAttributesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about DB cluster snapshots. This API operation supports pagination.
    */
  def describeDBClusterSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about DB cluster snapshots. This API operation supports pagination.
    */
  def describeDBClusterSnapshots(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusterSnapshots(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClusterSnapshotsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterSnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterSnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned Amazon DocumentDB DB clusters. This API operation supports pagination.
    */
  def describeDBClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned Amazon DocumentDB DB clusters. This API operation supports pagination.
    */
  def describeDBClusters(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClustersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBClusters(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBClustersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the available DB engines.
    */
  def describeDBEngineVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBEngineVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBEngineVersionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the available DB engines.
    */
  def describeDBEngineVersions(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBEngineVersionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBEngineVersions(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBEngineVersionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBEngineVersionMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBEngineVersionMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned Amazon DocumentDB instances. This API supports pagination.
    */
  def describeDBInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about provisioned Amazon DocumentDB instances. This API supports pagination.
    */
  def describeDBInstances(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBInstancesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBInstances(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBInstancesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup.
    */
  def describeDBSubnetGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSubnetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the descriptions of the specified DBSubnetGroup.
    */
  def describeDBSubnetGroups(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDBSubnetGroups(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBSubnetGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the cluster database engine.
    */
  def describeEngineDefaultClusterParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultClusterParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEngineDefaultClusterParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default engine and system parameter information for the cluster database engine.
    */
  def describeEngineDefaultClusterParameters(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEngineDefaultClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEngineDefaultClusterParameters(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEngineDefaultClusterParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEngineDefaultClusterParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEngineDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays a list of categories for all event source types, or, if specified, for a specified source type. 
    */
  def describeEventCategories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventCategories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.EventCategoriesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays a list of categories for all event source types, or, if specified, for a specified source type. 
    */
  def describeEventCategories(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEventCategoriesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEventCategories(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEventCategoriesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.EventCategoriesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. You can obtain events specific to a particular DB instance, DB security group, DB snapshot, or DB parameter group by providing the name as a parameter. By default, the events of the past hour are returned.
    */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.EventsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days. You can obtain events specific to a particular DB instance, DB security group, DB snapshot, or DB parameter group by providing the name as a parameter. By default, the events of the past hour are returned.
    */
  def describeEvents(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeEventsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.EventsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of orderable DB instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOrderableDBInstanceOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.OrderableDBInstanceOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of orderable DB instance options for the specified engine.
    */
  def describeOrderableDBInstanceOptions(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeOrderableDBInstanceOptionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOrderableDBInstanceOptions(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeOrderableDBInstanceOptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.OrderableDBInstanceOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.OrderableDBInstanceOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePendingMaintenanceActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.PendingMaintenanceActionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
    */
  def describePendingMaintenanceActions(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribePendingMaintenanceActionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePendingMaintenanceActions(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribePendingMaintenanceActionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.PendingMaintenanceActionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.PendingMaintenanceActionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Amazon DocumentDB replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). If the primary instance fails, Amazon DocumentDB automatically fails over to an Amazon DocumentDB replica, if one exists. You can force a failover when you want to simulate a failure of a primary instance for testing.
    */
  def failoverDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def failoverDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.FailoverDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Forces a failover for a DB cluster. A failover for a DB cluster promotes one of the Amazon DocumentDB replicas (read-only instances) in the DB cluster to be the primary instance (the cluster writer). If the primary instance fails, Amazon DocumentDB automatically fails over to an Amazon DocumentDB replica, if one exists. You can force a failover when you want to simulate a failure of a primary instance for testing.
    */
  def failoverDBCluster(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.FailoverDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def failoverDBCluster(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.FailoverDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.FailoverDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.FailoverDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags on an Amazon DocumentDB resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags on an Amazon DocumentDB resource.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ListTagsForResourceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.TagListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.TagListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a setting for an Amazon DocumentDB DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. 
    */
  def modifyDBCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies a setting for an Amazon DocumentDB DB cluster. You can change one or more database configuration parameters by specifying these parameters and the new values in the request. 
    */
  def modifyDBCluster(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBCluster(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot or maintenance window before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the parameter group is used as the default for a new DB cluster. This step is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. 
    */
  def modifyDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20 parameters can be modified in a single request.   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot or maintenance window before the change can take effect.   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon DocumentDB to fully complete the create action before the parameter group is used as the default for a new DB cluster. This step is especially important for parameters that are critical when creating the default database for a DB cluster, such as the character set for the default database defined by the character_set_database parameter. 
    */
  def modifyDBClusterParameterGroup(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterParameterGroup(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName, and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case.
    */
  def modifyDBClusterSnapshotAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterSnapshotAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot. To share a manual DB cluster snapshot with other AWS accounts, specify restore as the AttributeName, and use the ValuesToAdd parameter to add a list of IDs of the AWS accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use all as a value for that parameter in this case.
    */
  def modifyDBClusterSnapshotAttribute(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterSnapshotAttributeMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBClusterSnapshotAttribute(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterSnapshotAttributeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterSnapshotAttributeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBClusterSnapshotAttributeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request.
    */
  def modifyDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying these parameters and the new values in the request.
    */
  def modifyDBInstance(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBInstance(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
    */
  def modifyDBSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two Availability Zones in the AWS Region.
    */
  def modifyDBSubnetGroup(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyDBSubnetGroup(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.ModifyDBSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain changes, or if you change the DB cluster parameter group that is associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting. 
    */
  def rebootDBInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootDBInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.RebootDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain changes, or if you change the DB cluster parameter group that is associated with the DB instance, you must reboot the instance for the changes to take effect.  Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary outage, during which the DB instance status is set to rebooting. 
    */
  def rebootDBInstance(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.RebootDBInstanceMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootDBInstance(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.RebootDBInstanceMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.RebootDBInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RebootDBInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes metadata tags from an Amazon DocumentDB resource.
    */
  def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes metadata tags from an Amazon DocumentDB resource.
    */
  def removeTagsFromResource(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.RemoveTagsFromResourceMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.RemoveTagsFromResourceMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters, submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When you reset the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance reboot.
    */
  def resetDBClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetDBClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters, submit a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster parameter group, specify the DBClusterParameterGroupName and ResetAllParameters parameters.   When you reset the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB instance reboot.
    */
  def resetDBClusterParameterGroup(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ResetDBClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetDBClusterParameterGroup(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.ResetDBClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group.
    */
  def restoreDBClusterFromSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterFromSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default configuration and default security group. If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point with the same configuration as the original source DB cluster, except that the new DB cluster is created with the default security group.
    */
  def restoreDBClusterFromSnapshot(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterFromSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterFromSnapshot(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterFromSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterFromSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterFromSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group. 
    */
  def restoreDBClusterToPointInTime(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterToPointInTime(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB cluster is created with the default DB security group. 
    */
  def restoreDBClusterToPointInTime(params: awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterToPointInTimeMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restoreDBClusterToPointInTime(
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterToPointInTimeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterToPointInTimeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.RestoreDBClusterToPointInTimeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceAvailable state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceAvailable,
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dBInstanceDeleted state by periodically calling the underlying DocDB.describeDBInstancesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dBInstanceDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.dBInstanceDeleted,
    params: awsDashSdkLib.clientsDocdbMod.DocDBNs.DescribeDBInstancesMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDocdbMod.DocDBNs.DBInstanceMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

