package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backup
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Backup: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery points of resources. If you call CreateBackupPlan with a plan that already exists, the existing backupPlanId is returned.
    */
  def createBackupPlan(): awsDashSdkLib.libRequestMod.Request[CreateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBackupPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery points of resources. If you call CreateBackupPlan with a plan that already exists, the existing backupPlanId is returned.
    */
  def createBackupPlan(params: CreateBackupPlanInput): awsDashSdkLib.libRequestMod.Request[CreateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBackupPlan(
    params: CreateBackupPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included by specifying patterns for a ListOfTags and selected Resources.  For example, consider the following patterns:    Resources: "arn:aws:ec2:region:account-id:volume/volume-id"     ConditionKey:"department"   ConditionValue:"finance"   ConditionType:"StringEquals"     ConditionKey:"importance"   ConditionValue:"critical"   ConditionType:"StringEquals"    Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as "department=finance", "importance=critical", in addition to an EBS volume with the specified volume Id. Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put together using the OR operator. In other words, all patterns that match are selected for backup.
    */
  def createBackupSelection(): awsDashSdkLib.libRequestMod.Request[CreateBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBackupSelection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBackupSelectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included by specifying patterns for a ListOfTags and selected Resources.  For example, consider the following patterns:    Resources: "arn:aws:ec2:region:account-id:volume/volume-id"     ConditionKey:"department"   ConditionValue:"finance"   ConditionType:"StringEquals"     ConditionKey:"importance"   ConditionValue:"critical"   ConditionType:"StringEquals"    Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as "department=finance", "importance=critical", in addition to an EBS volume with the specified volume Id. Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put together using the OR operator. In other words, all patterns that match are selected for backup.
    */
  def createBackupSelection(params: CreateBackupSelectionInput): awsDashSdkLib.libRequestMod.Request[CreateBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBackupSelection(
    params: CreateBackupSelectionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBackupSelectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a logical container where backups are stored. A CreateBackupVault request includes a name, optionally one or more resource tags, an encryption key, and a request ID.  Sensitive data, such as passport numbers, should not be included the name of a backup vault. 
    */
  def createBackupVault(): awsDashSdkLib.libRequestMod.Request[CreateBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBackupVault(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a logical container where backups are stored. A CreateBackupVault request includes a name, optionally one or more resource tags, an encryption key, and a request ID.  Sensitive data, such as passport numbers, should not be included the name of a backup vault. 
    */
  def createBackupVault(params: CreateBackupVaultInput): awsDashSdkLib.libRequestMod.Request[CreateBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBackupVault(
    params: CreateBackupVaultInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will still exist.
    */
  def deleteBackupPlan(): awsDashSdkLib.libRequestMod.Request[DeleteBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will still exist.
    */
  def deleteBackupPlan(params: DeleteBackupPlanInput): awsDashSdkLib.libRequestMod.Request[DeleteBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupPlan(
    params: DeleteBackupPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def deleteBackupSelection(params: DeleteBackupSelectionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupSelection(
    params: DeleteBackupSelectionInput,
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
  def deleteBackupVault(params: DeleteBackupVaultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupVault(
    params: DeleteBackupVaultInput,
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
  def deleteBackupVaultAccessPolicy(params: DeleteBackupVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupVaultAccessPolicy(
    params: DeleteBackupVaultAccessPolicyInput,
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
  def deleteBackupVaultNotifications(params: DeleteBackupVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBackupVaultNotifications(
    params: DeleteBackupVaultNotificationsInput,
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
  def deleteRecoveryPoint(params: DeleteRecoveryPointInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRecoveryPoint(
    params: DeleteRecoveryPointInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata associated with creating a backup of a resource.
    */
  def describeBackupJob(): awsDashSdkLib.libRequestMod.Request[DescribeBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBackupJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBackupJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata associated with creating a backup of a resource.
    */
  def describeBackupJob(params: DescribeBackupJobInput): awsDashSdkLib.libRequestMod.Request[DescribeBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBackupJob(
    params: DescribeBackupJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBackupJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata about a backup vault specified by its name.
    */
  def describeBackupVault(): awsDashSdkLib.libRequestMod.Request[DescribeBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBackupVault(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata about a backup vault specified by its name.
    */
  def describeBackupVault(params: DescribeBackupVaultInput): awsDashSdkLib.libRequestMod.Request[DescribeBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBackupVault(
    params: DescribeBackupVaultInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name (ARN), and the AWS service type of the saved resource.
    */
  def describeProtectedResource(): awsDashSdkLib.libRequestMod.Request[DescribeProtectedResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProtectedResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProtectedResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProtectedResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name (ARN), and the AWS service type of the saved resource.
    */
  def describeProtectedResource(params: DescribeProtectedResourceInput): awsDashSdkLib.libRequestMod.Request[DescribeProtectedResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProtectedResource(
    params: DescribeProtectedResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProtectedResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProtectedResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
    */
  def describeRecoveryPoint(): awsDashSdkLib.libRequestMod.Request[DescribeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRecoveryPoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRecoveryPointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
    */
  def describeRecoveryPoint(params: DescribeRecoveryPointInput): awsDashSdkLib.libRequestMod.Request[DescribeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRecoveryPoint(
    params: DescribeRecoveryPointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRecoveryPointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata associated with a restore job that is specified by a job ID.
    */
  def describeRestoreJob(): awsDashSdkLib.libRequestMod.Request[DescribeRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRestoreJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRestoreJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata associated with a restore job that is specified by a job ID.
    */
  def describeRestoreJob(params: DescribeRestoreJobInput): awsDashSdkLib.libRequestMod.Request[DescribeRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRestoreJob(
    params: DescribeRestoreJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRestoreJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the backup plan that is specified by the plan ID as a backup template.
    */
  def exportBackupPlanTemplate(): awsDashSdkLib.libRequestMod.Request[ExportBackupPlanTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def exportBackupPlanTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExportBackupPlanTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExportBackupPlanTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the backup plan that is specified by the plan ID as a backup template.
    */
  def exportBackupPlanTemplate(params: ExportBackupPlanTemplateInput): awsDashSdkLib.libRequestMod.Request[ExportBackupPlanTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def exportBackupPlanTemplate(
    params: ExportBackupPlanTemplateInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExportBackupPlanTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExportBackupPlanTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the body of a backup plan in JSON format, in addition to plan metadata.
    */
  def getBackupPlan(): awsDashSdkLib.libRequestMod.Request[GetBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the body of a backup plan in JSON format, in addition to plan metadata.
    */
  def getBackupPlan(params: GetBackupPlanInput): awsDashSdkLib.libRequestMod.Request[GetBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupPlan(
    params: GetBackupPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a valid JSON document specifying a backup plan or an error.
    */
  def getBackupPlanFromJSON(): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromJSONOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupPlanFromJSON(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupPlanFromJSONOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromJSONOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a valid JSON document specifying a backup plan or an error.
    */
  def getBackupPlanFromJSON(params: GetBackupPlanFromJSONInput): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromJSONOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupPlanFromJSON(
    params: GetBackupPlanFromJSONInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupPlanFromJSONOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromJSONOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the template specified by its templateId as a backup plan.
    */
  def getBackupPlanFromTemplate(): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupPlanFromTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupPlanFromTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the template specified by its templateId as a backup plan.
    */
  def getBackupPlanFromTemplate(params: GetBackupPlanFromTemplateInput): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupPlanFromTemplate(
    params: GetBackupPlanFromTemplateInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupPlanFromTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated with a backup plan.
    */
  def getBackupSelection(): awsDashSdkLib.libRequestMod.Request[GetBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupSelection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupSelectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated with a backup plan.
    */
  def getBackupSelection(params: GetBackupSelectionInput): awsDashSdkLib.libRequestMod.Request[GetBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupSelection(
    params: GetBackupSelectionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupSelectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the access policy document that is associated with the named backup vault.
    */
  def getBackupVaultAccessPolicy(): awsDashSdkLib.libRequestMod.Request[GetBackupVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupVaultAccessPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupVaultAccessPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the access policy document that is associated with the named backup vault.
    */
  def getBackupVaultAccessPolicy(params: GetBackupVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[GetBackupVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupVaultAccessPolicy(
    params: GetBackupVaultAccessPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupVaultAccessPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns event notifications for the specified backup vault.
    */
  def getBackupVaultNotifications(): awsDashSdkLib.libRequestMod.Request[GetBackupVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupVaultNotifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupVaultNotificationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns event notifications for the specified backup vault.
    */
  def getBackupVaultNotifications(params: GetBackupVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[GetBackupVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBackupVaultNotifications(
    params: GetBackupVaultNotificationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBackupVaultNotificationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBackupVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns two sets of metadata key-value pairs. The first set lists the metadata that the recovery point was created with. The second set lists the metadata key-value pairs that are required to restore the recovery point. These sets can be the same, or the restore metadata set can contain different values if the target service to be restored has changed since the recovery point was created and now requires additional or different information in order to be restored.
    */
  def getRecoveryPointRestoreMetadata(): awsDashSdkLib.libRequestMod.Request[GetRecoveryPointRestoreMetadataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRecoveryPointRestoreMetadata(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRecoveryPointRestoreMetadataOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRecoveryPointRestoreMetadataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns two sets of metadata key-value pairs. The first set lists the metadata that the recovery point was created with. The second set lists the metadata key-value pairs that are required to restore the recovery point. These sets can be the same, or the restore metadata set can contain different values if the target service to be restored has changed since the recovery point was created and now requires additional or different information in order to be restored.
    */
  def getRecoveryPointRestoreMetadata(params: GetRecoveryPointRestoreMetadataInput): awsDashSdkLib.libRequestMod.Request[GetRecoveryPointRestoreMetadataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRecoveryPointRestoreMetadata(
    params: GetRecoveryPointRestoreMetadataInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRecoveryPointRestoreMetadataOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRecoveryPointRestoreMetadataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the AWS resource types supported by AWS Backup.
    */
  def getSupportedResourceTypes(): awsDashSdkLib.libRequestMod.Request[GetSupportedResourceTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSupportedResourceTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSupportedResourceTypesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSupportedResourceTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata about your backup jobs.
    */
  def listBackupJobs(): awsDashSdkLib.libRequestMod.Request[ListBackupJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata about your backup jobs.
    */
  def listBackupJobs(params: ListBackupJobsInput): awsDashSdkLib.libRequestMod.Request[ListBackupJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupJobs(
    params: ListBackupJobsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and deletion dates.
    */
  def listBackupPlanTemplates(): awsDashSdkLib.libRequestMod.Request[ListBackupPlanTemplatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupPlanTemplates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupPlanTemplatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupPlanTemplatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and deletion dates.
    */
  def listBackupPlanTemplates(params: ListBackupPlanTemplatesInput): awsDashSdkLib.libRequestMod.Request[ListBackupPlanTemplatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupPlanTemplates(
    params: ListBackupPlanTemplatesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupPlanTemplatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupPlanTemplatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation and deletion dates, plan names, and version IDs.
    */
  def listBackupPlanVersions(): awsDashSdkLib.libRequestMod.Request[ListBackupPlanVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupPlanVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupPlanVersionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupPlanVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation and deletion dates, plan names, and version IDs.
    */
  def listBackupPlanVersions(params: ListBackupPlanVersionsInput): awsDashSdkLib.libRequestMod.Request[ListBackupPlanVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupPlanVersions(
    params: ListBackupPlanVersionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupPlanVersionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupPlanVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan names, and creator request IDs.
    */
  def listBackupPlans(): awsDashSdkLib.libRequestMod.Request[ListBackupPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupPlans(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupPlansOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan names, and creator request IDs.
    */
  def listBackupPlans(params: ListBackupPlansInput): awsDashSdkLib.libRequestMod.Request[ListBackupPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupPlans(
    params: ListBackupPlansInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupPlansOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an array containing metadata of the resources associated with the target backup plan.
    */
  def listBackupSelections(): awsDashSdkLib.libRequestMod.Request[ListBackupSelectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupSelections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupSelectionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupSelectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an array containing metadata of the resources associated with the target backup plan.
    */
  def listBackupSelections(params: ListBackupSelectionsInput): awsDashSdkLib.libRequestMod.Request[ListBackupSelectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupSelections(
    params: ListBackupSelectionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupSelectionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupSelectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of recovery point storage containers along with information about them.
    */
  def listBackupVaults(): awsDashSdkLib.libRequestMod.Request[ListBackupVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupVaults(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupVaultsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of recovery point storage containers along with information about them.
    */
  def listBackupVaults(params: ListBackupVaultsInput): awsDashSdkLib.libRequestMod.Request[ListBackupVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBackupVaults(
    params: ListBackupVaultsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBackupVaultsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBackupVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
    */
  def listProtectedResources(): awsDashSdkLib.libRequestMod.Request[ListProtectedResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProtectedResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProtectedResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProtectedResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
    */
  def listProtectedResources(params: ListProtectedResourcesInput): awsDashSdkLib.libRequestMod.Request[ListProtectedResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProtectedResources(
    params: ListProtectedResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProtectedResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProtectedResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about the recovery points stored in a backup vault.
    */
  def listRecoveryPointsByBackupVault(): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRecoveryPointsByBackupVault(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRecoveryPointsByBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about the recovery points stored in a backup vault.
    */
  def listRecoveryPointsByBackupVault(params: ListRecoveryPointsByBackupVaultInput): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRecoveryPointsByBackupVault(
    params: ListRecoveryPointsByBackupVaultInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRecoveryPointsByBackupVaultOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name (ARN).
    */
  def listRecoveryPointsByResource(): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRecoveryPointsByResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRecoveryPointsByResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name (ARN).
    */
  def listRecoveryPointsByResource(params: ListRecoveryPointsByResourceInput): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRecoveryPointsByResource(
    params: ListRecoveryPointsByResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRecoveryPointsByResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the recovery process.
    */
  def listRestoreJobs(): awsDashSdkLib.libRequestMod.Request[ListRestoreJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRestoreJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRestoreJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRestoreJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the recovery process.
    */
  def listRestoreJobs(params: ListRestoreJobsInput): awsDashSdkLib.libRequestMod.Request[ListRestoreJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRestoreJobs(
    params: ListRestoreJobsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRestoreJobsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRestoreJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
    */
  def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
    */
  def listTags(params: ListTagsInput): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    params: ListTagsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def putBackupVaultAccessPolicy(params: PutBackupVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBackupVaultAccessPolicy(
    params: PutBackupVaultAccessPolicyInput,
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
  def putBackupVaultNotifications(params: PutBackupVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putBackupVaultNotifications(
    params: PutBackupVaultNotificationsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a job to create a one-time backup of the specified resource.
    */
  def startBackupJob(): awsDashSdkLib.libRequestMod.Request[StartBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startBackupJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartBackupJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a job to create a one-time backup of the specified resource.
    */
  def startBackupJob(params: StartBackupJobInput): awsDashSdkLib.libRequestMod.Request[StartBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startBackupJob(
    params: StartBackupJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartBackupJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Recovers the saved resource identified by an Amazon Resource Name (ARN).  If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If the ARN of a recovery point is supplied, then that recovery point is restored.
    */
  def startRestoreJob(): awsDashSdkLib.libRequestMod.Request[StartRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startRestoreJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartRestoreJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Recovers the saved resource identified by an Amazon Resource Name (ARN).  If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If the ARN of a recovery point is supplied, then that recovery point is restored.
    */
  def startRestoreJob(params: StartRestoreJobInput): awsDashSdkLib.libRequestMod.Request[StartRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startRestoreJob(
    params: StartRestoreJobInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartRestoreJobOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def stopBackupJob(params: StopBackupJobInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopBackupJob(
    params: StopBackupJobInput,
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
  def tagResource(params: TagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
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
  def untagResource(params: UntagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces the body of a saved backup plan identified by its backupPlanId with the input document in JSON format. The new version is uniquely identified by a VersionId.
    */
  def updateBackupPlan(): awsDashSdkLib.libRequestMod.Request[UpdateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBackupPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces the body of a saved backup plan identified by its backupPlanId with the input document in JSON format. The new version is uniquely identified by a VersionId.
    */
  def updateBackupPlan(params: UpdateBackupPlanInput): awsDashSdkLib.libRequestMod.Request[UpdateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBackupPlan(
    params: UpdateBackupPlanInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBackupPlanOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the transition lifecycle of a recovery point. The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  def updateRecoveryPointLifecycle(): awsDashSdkLib.libRequestMod.Request[UpdateRecoveryPointLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRecoveryPointLifecycle(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRecoveryPointLifecycleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRecoveryPointLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the transition lifecycle of a recovery point. The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  def updateRecoveryPointLifecycle(params: UpdateRecoveryPointLifecycleInput): awsDashSdkLib.libRequestMod.Request[UpdateRecoveryPointLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRecoveryPointLifecycle(
    params: UpdateRecoveryPointLifecycleInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRecoveryPointLifecycleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRecoveryPointLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

