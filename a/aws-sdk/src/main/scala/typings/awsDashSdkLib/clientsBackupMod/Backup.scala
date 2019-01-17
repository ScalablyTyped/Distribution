package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backup
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Backup: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsBackupMod.BackupNs.ClientConfiguration = js.native
  /**
    * Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery points of resources. If you call CreateBackupPlan with a plan that already exists, the existing backupPlanId is returned.
    */
  def createBackupPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBackupPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery points of resources. If you call CreateBackupPlan with a plan that already exists, the existing backupPlanId is returned.
    */
  def createBackupPlan(params: awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupPlanInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBackupPlan(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included by specifying patterns for a ListOfTags and selected Resources.  For example, consider the following patterns:    Resources: "arn:aws:ec2:region:account-id:volume/volume-id"     ConditionKey:"department"   ConditionValue:"finance"   ConditionType:"StringEquals"     ConditionKey:"importance"   ConditionValue:"critical"   ConditionType:"StringEquals"    Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as "department=finance", "importance=critical", in addition to an EBS volume with the specified volume Id. Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put together using the OR operator. In other words, all patterns that match are selected for backup.
    */
  def createBackupSelection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupSelectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBackupSelection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupSelectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupSelectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included by specifying patterns for a ListOfTags and selected Resources.  For example, consider the following patterns:    Resources: "arn:aws:ec2:region:account-id:volume/volume-id"     ConditionKey:"department"   ConditionValue:"finance"   ConditionType:"StringEquals"     ConditionKey:"importance"   ConditionValue:"critical"   ConditionType:"StringEquals"    Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as "department=finance", "importance=critical", in addition to an EBS volume with the specified volume Id. Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put together using the OR operator. In other words, all patterns that match are selected for backup.
    */
  def createBackupSelection(params: awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupSelectionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupSelectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBackupSelection(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupSelectionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupSelectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupSelectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a logical container where backups are stored. A CreateBackupVault request includes a name, optionally one or more resource tags, an encryption key, and a request ID.  Sensitive data, such as passport numbers, should not be included the name of a backup vault. 
    */
  def createBackupVault(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBackupVault(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a logical container where backups are stored. A CreateBackupVault request includes a name, optionally one or more resource tags, an encryption key, and a request ID.  Sensitive data, such as passport numbers, should not be included the name of a backup vault. 
    */
  def createBackupVault(params: awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupVaultInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBackupVault(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupVaultInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.CreateBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will still exist.
    */
  def deleteBackupPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteBackupPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will still exist.
    */
  def deleteBackupPlan(params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupPlanInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteBackupPlan(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the resource selection associated with a backup plan that is specified by the SelectionId.
    */
  def deleteBackupSelection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupSelection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the resource selection associated with a backup plan that is specified by the SelectionId.
    */
  def deleteBackupSelection(params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupSelectionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupSelection(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupSelectionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.
    */
  def deleteBackupVault(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupVault(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.
    */
  def deleteBackupVault(params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupVaultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupVault(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupVaultInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the policy document that manages permissions on a backup vault.
    */
  def deleteBackupVaultAccessPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupVaultAccessPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the policy document that manages permissions on a backup vault.
    */
  def deleteBackupVaultAccessPolicy(params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupVaultAccessPolicy(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupVaultAccessPolicyInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes event notifications for the specified backup vault.
    */
  def deleteBackupVaultNotifications(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupVaultNotifications(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes event notifications for the specified backup vault.
    */
  def deleteBackupVaultNotifications(params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupVaultNotifications(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteBackupVaultNotificationsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the recovery point specified by a recovery point ID.
    */
  def deleteRecoveryPoint(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRecoveryPoint(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the recovery point specified by a recovery point ID.
    */
  def deleteRecoveryPoint(params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteRecoveryPointInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRecoveryPoint(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.DeleteRecoveryPointInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata associated with creating a backup of a resource.
    */
  def describeBackupJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBackupJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata associated with creating a backup of a resource.
    */
  def describeBackupJob(params: awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupJobInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBackupJob(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata about a backup vault specified by its name.
    */
  def describeBackupVault(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBackupVault(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata about a backup vault specified by its name.
    */
  def describeBackupVault(params: awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupVaultInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBackupVault(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupVaultInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name (ARN), and the AWS service type of the saved resource.
    */
  def describeProtectedResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeProtectedResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeProtectedResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DescribeProtectedResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeProtectedResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name (ARN), and the AWS service type of the saved resource.
    */
  def describeProtectedResource(params: awsDashSdkLib.clientsBackupMod.BackupNs.DescribeProtectedResourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeProtectedResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeProtectedResource(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.DescribeProtectedResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DescribeProtectedResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeProtectedResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
    */
  def describeRecoveryPoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRecoveryPointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRecoveryPoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRecoveryPointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRecoveryPointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
    */
  def describeRecoveryPoint(params: awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRecoveryPointInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRecoveryPointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRecoveryPoint(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRecoveryPointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRecoveryPointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRecoveryPointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata associated with a restore job that is specified by a job ID.
    */
  def describeRestoreJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRestoreJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRestoreJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRestoreJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRestoreJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata associated with a restore job that is specified by a job ID.
    */
  def describeRestoreJob(params: awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRestoreJobInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRestoreJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRestoreJob(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRestoreJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRestoreJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.DescribeRestoreJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the backup plan that is specified by the plan ID as a backup template.
    */
  def exportBackupPlanTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ExportBackupPlanTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportBackupPlanTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ExportBackupPlanTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ExportBackupPlanTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the backup plan that is specified by the plan ID as a backup template.
    */
  def exportBackupPlanTemplate(params: awsDashSdkLib.clientsBackupMod.BackupNs.ExportBackupPlanTemplateInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ExportBackupPlanTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportBackupPlanTemplate(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ExportBackupPlanTemplateInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ExportBackupPlanTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ExportBackupPlanTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the body of a backup plan in JSON format, in addition to plan metadata.
    */
  def getBackupPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the body of a backup plan in JSON format, in addition to plan metadata.
    */
  def getBackupPlan(params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupPlan(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a valid JSON document specifying a backup plan or an error.
    */
  def getBackupPlanFromJSON(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromJSONOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupPlanFromJSON(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromJSONOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromJSONOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a valid JSON document specifying a backup plan or an error.
    */
  def getBackupPlanFromJSON(params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromJSONInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromJSONOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupPlanFromJSON(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromJSONInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromJSONOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromJSONOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the template specified by its templateId as a backup plan.
    */
  def getBackupPlanFromTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupPlanFromTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the template specified by its templateId as a backup plan.
    */
  def getBackupPlanFromTemplate(params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromTemplateInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupPlanFromTemplate(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromTemplateInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupPlanFromTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated with a backup plan.
    */
  def getBackupSelection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupSelectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupSelection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupSelectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupSelectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated with a backup plan.
    */
  def getBackupSelection(params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupSelectionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupSelectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupSelection(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupSelectionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupSelectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupSelectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the access policy document that is associated with the named backup vault.
    */
  def getBackupVaultAccessPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultAccessPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupVaultAccessPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultAccessPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultAccessPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the access policy document that is associated with the named backup vault.
    */
  def getBackupVaultAccessPolicy(params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultAccessPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupVaultAccessPolicy(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultAccessPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultAccessPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultAccessPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns event notifications for the specified backup vault.
    */
  def getBackupVaultNotifications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultNotificationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupVaultNotifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultNotificationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultNotificationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns event notifications for the specified backup vault.
    */
  def getBackupVaultNotifications(params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultNotificationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBackupVaultNotifications(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultNotificationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultNotificationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetBackupVaultNotificationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns two sets of metadata key-value pairs. The first set lists the metadata that the recovery point was created with. The second set lists the metadata key-value pairs that are required to restore the recovery point. These sets can be the same, or the restore metadata set can contain different values if the target service to be restored has changed since the recovery point was created and now requires additional or different information in order to be restored.
    */
  def getRecoveryPointRestoreMetadata(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetRecoveryPointRestoreMetadataOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRecoveryPointRestoreMetadata(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetRecoveryPointRestoreMetadataOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetRecoveryPointRestoreMetadataOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns two sets of metadata key-value pairs. The first set lists the metadata that the recovery point was created with. The second set lists the metadata key-value pairs that are required to restore the recovery point. These sets can be the same, or the restore metadata set can contain different values if the target service to be restored has changed since the recovery point was created and now requires additional or different information in order to be restored.
    */
  def getRecoveryPointRestoreMetadata(params: awsDashSdkLib.clientsBackupMod.BackupNs.GetRecoveryPointRestoreMetadataInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetRecoveryPointRestoreMetadataOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRecoveryPointRestoreMetadata(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.GetRecoveryPointRestoreMetadataInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetRecoveryPointRestoreMetadataOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetRecoveryPointRestoreMetadataOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the AWS resource types supported by AWS Backup.
    */
  def getSupportedResourceTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetSupportedResourceTypesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSupportedResourceTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.GetSupportedResourceTypesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.GetSupportedResourceTypesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata about your backup jobs.
    */
  def listBackupJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata about your backup jobs.
    */
  def listBackupJobs(params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupJobsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupJobs(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupJobsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and deletion dates.
    */
  def listBackupPlanTemplates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanTemplatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupPlanTemplates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanTemplatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanTemplatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and deletion dates.
    */
  def listBackupPlanTemplates(params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanTemplatesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanTemplatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupPlanTemplates(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanTemplatesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanTemplatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanTemplatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation and deletion dates, plan names, and version IDs.
    */
  def listBackupPlanVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanVersionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupPlanVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanVersionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanVersionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation and deletion dates, plan names, and version IDs.
    */
  def listBackupPlanVersions(params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanVersionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanVersionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupPlanVersions(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanVersionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanVersionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlanVersionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan names, and creator request IDs.
    */
  def listBackupPlans(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlansOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupPlans(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlansOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlansOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan names, and creator request IDs.
    */
  def listBackupPlans(params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlansInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlansOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupPlans(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlansInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlansOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupPlansOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array containing metadata of the resources associated with the target backup plan.
    */
  def listBackupSelections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupSelectionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupSelections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupSelectionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupSelectionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array containing metadata of the resources associated with the target backup plan.
    */
  def listBackupSelections(params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupSelectionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupSelectionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupSelections(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupSelectionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupSelectionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupSelectionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of recovery point storage containers along with information about them.
    */
  def listBackupVaults(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupVaultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupVaults(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupVaultsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupVaultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of recovery point storage containers along with information about them.
    */
  def listBackupVaults(params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupVaultsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupVaultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBackupVaults(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupVaultsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupVaultsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListBackupVaultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
    */
  def listProtectedResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListProtectedResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProtectedResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListProtectedResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListProtectedResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
    */
  def listProtectedResources(params: awsDashSdkLib.clientsBackupMod.BackupNs.ListProtectedResourcesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListProtectedResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProtectedResources(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ListProtectedResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListProtectedResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListProtectedResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns detailed information about the recovery points stored in a backup vault.
    */
  def listRecoveryPointsByBackupVault(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRecoveryPointsByBackupVault(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns detailed information about the recovery points stored in a backup vault.
    */
  def listRecoveryPointsByBackupVault(params: awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByBackupVaultInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRecoveryPointsByBackupVault(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByBackupVaultInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByBackupVaultOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name (ARN).
    */
  def listRecoveryPointsByResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRecoveryPointsByResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name (ARN).
    */
  def listRecoveryPointsByResource(params: awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByResourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRecoveryPointsByResource(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRecoveryPointsByResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the recovery process.
    */
  def listRestoreJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRestoreJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRestoreJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListRestoreJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRestoreJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the recovery process.
    */
  def listRestoreJobs(params: awsDashSdkLib.clientsBackupMod.BackupNs.ListRestoreJobsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRestoreJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRestoreJobs(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ListRestoreJobsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListRestoreJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListRestoreJobsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
    */
  def listTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
    */
  def listTags(params: awsDashSdkLib.clientsBackupMod.BackupNs.ListTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTags(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.ListTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.ListTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.ListTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a backup vault name and an access policy document in JSON format.
    */
  def putBackupVaultAccessPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBackupVaultAccessPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a backup vault name and an access policy document in JSON format.
    */
  def putBackupVaultAccessPolicy(params: awsDashSdkLib.clientsBackupMod.BackupNs.PutBackupVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBackupVaultAccessPolicy(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.PutBackupVaultAccessPolicyInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Turns on notifications on a backup vault for the specified topic and events.
    */
  def putBackupVaultNotifications(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBackupVaultNotifications(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Turns on notifications on a backup vault for the specified topic and events.
    */
  def putBackupVaultNotifications(params: awsDashSdkLib.clientsBackupMod.BackupNs.PutBackupVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBackupVaultNotifications(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.PutBackupVaultNotificationsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a job to create a one-time backup of the specified resource.
    */
  def startBackupJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.StartBackupJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startBackupJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.StartBackupJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.StartBackupJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a job to create a one-time backup of the specified resource.
    */
  def startBackupJob(params: awsDashSdkLib.clientsBackupMod.BackupNs.StartBackupJobInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.StartBackupJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startBackupJob(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.StartBackupJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.StartBackupJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.StartBackupJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Recovers the saved resource identified by an Amazon Resource Name (ARN).  If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If the ARN of a recovery point is supplied, then that recovery point is restored.
    */
  def startRestoreJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.StartRestoreJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startRestoreJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.StartRestoreJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.StartRestoreJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Recovers the saved resource identified by an Amazon Resource Name (ARN).  If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If the ARN of a recovery point is supplied, then that recovery point is restored.
    */
  def startRestoreJob(params: awsDashSdkLib.clientsBackupMod.BackupNs.StartRestoreJobInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.StartRestoreJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startRestoreJob(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.StartRestoreJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.StartRestoreJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.StartRestoreJobOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attempts to cancel a job to create a one-time backup of a resource.
    */
  def stopBackupJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopBackupJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attempts to cancel a job to create a one-time backup of a resource.
    */
  def stopBackupJob(params: awsDashSdkLib.clientsBackupMod.BackupNs.StopBackupJobInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopBackupJob(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.StopBackupJobInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN).
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN).
    */
  def tagResource(params: awsDashSdkLib.clientsBackupMod.BackupNs.TagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.TagResourceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN)
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN)
    */
  def untagResource(params: awsDashSdkLib.clientsBackupMod.BackupNs.UntagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.UntagResourceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces the body of a saved backup plan identified by its backupPlanId with the input document in JSON format. The new version is uniquely identified by a VersionId.
    */
  def updateBackupPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.UpdateBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateBackupPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.UpdateBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.UpdateBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Replaces the body of a saved backup plan identified by its backupPlanId with the input document in JSON format. The new version is uniquely identified by a VersionId.
    */
  def updateBackupPlan(params: awsDashSdkLib.clientsBackupMod.BackupNs.UpdateBackupPlanInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.UpdateBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateBackupPlan(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.UpdateBackupPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.UpdateBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.UpdateBackupPlanOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the transition lifecycle of a recovery point. The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  def updateRecoveryPointLifecycle(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.UpdateRecoveryPointLifecycleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRecoveryPointLifecycle(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.UpdateRecoveryPointLifecycleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.UpdateRecoveryPointLifecycleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the transition lifecycle of a recovery point. The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  def updateRecoveryPointLifecycle(params: awsDashSdkLib.clientsBackupMod.BackupNs.UpdateRecoveryPointLifecycleInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.UpdateRecoveryPointLifecycleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRecoveryPointLifecycle(
    params: awsDashSdkLib.clientsBackupMod.BackupNs.UpdateRecoveryPointLifecycleInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBackupMod.BackupNs.UpdateRecoveryPointLifecycleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBackupMod.BackupNs.UpdateRecoveryPointLifecycleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

