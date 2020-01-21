package typings.awsSdk.backupMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backup extends Service {
  @JSName("config")
  var config_Backup: ConfigBase with ClientConfiguration = js.native
  /**
    * Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery points of resources. If you call CreateBackupPlan with a plan that already exists, an AlreadyExistsException is returned.
    */
  def createBackupPlan(): Request[CreateBackupPlanOutput, AWSError] = js.native
  def createBackupPlan(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupPlanOutput, Unit]): Request[CreateBackupPlanOutput, AWSError] = js.native
  /**
    * Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery points of resources. If you call CreateBackupPlan with a plan that already exists, an AlreadyExistsException is returned.
    */
  def createBackupPlan(params: CreateBackupPlanInput): Request[CreateBackupPlanOutput, AWSError] = js.native
  def createBackupPlan(
    params: CreateBackupPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupPlanOutput, Unit]
  ): Request[CreateBackupPlanOutput, AWSError] = js.native
  /**
    * Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included by specifying patterns for a ListOfTags and selected Resources.  For example, consider the following patterns:    Resources: "arn:aws:ec2:region:account-id:volume/volume-id"     ConditionKey:"department"   ConditionValue:"finance"   ConditionType:"STRINGEQUALS"     ConditionKey:"importance"   ConditionValue:"critical"   ConditionType:"STRINGEQUALS"    Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as "department=finance", "importance=critical", in addition to an EBS volume with the specified volume Id. Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put together using the OR operator. In other words, all patterns that match are selected for backup.
    */
  def createBackupSelection(): Request[CreateBackupSelectionOutput, AWSError] = js.native
  def createBackupSelection(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupSelectionOutput, Unit]): Request[CreateBackupSelectionOutput, AWSError] = js.native
  /**
    * Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included by specifying patterns for a ListOfTags and selected Resources.  For example, consider the following patterns:    Resources: "arn:aws:ec2:region:account-id:volume/volume-id"     ConditionKey:"department"   ConditionValue:"finance"   ConditionType:"STRINGEQUALS"     ConditionKey:"importance"   ConditionValue:"critical"   ConditionType:"STRINGEQUALS"    Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as "department=finance", "importance=critical", in addition to an EBS volume with the specified volume Id. Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put together using the OR operator. In other words, all patterns that match are selected for backup.
    */
  def createBackupSelection(params: CreateBackupSelectionInput): Request[CreateBackupSelectionOutput, AWSError] = js.native
  def createBackupSelection(
    params: CreateBackupSelectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupSelectionOutput, Unit]
  ): Request[CreateBackupSelectionOutput, AWSError] = js.native
  /**
    * Creates a logical container where backups are stored. A CreateBackupVault request includes a name, optionally one or more resource tags, an encryption key, and a request ID.  Sensitive data, such as passport numbers, should not be included the name of a backup vault. 
    */
  def createBackupVault(): Request[CreateBackupVaultOutput, AWSError] = js.native
  def createBackupVault(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupVaultOutput, Unit]): Request[CreateBackupVaultOutput, AWSError] = js.native
  /**
    * Creates a logical container where backups are stored. A CreateBackupVault request includes a name, optionally one or more resource tags, an encryption key, and a request ID.  Sensitive data, such as passport numbers, should not be included the name of a backup vault. 
    */
  def createBackupVault(params: CreateBackupVaultInput): Request[CreateBackupVaultOutput, AWSError] = js.native
  def createBackupVault(
    params: CreateBackupVaultInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupVaultOutput, Unit]
  ): Request[CreateBackupVaultOutput, AWSError] = js.native
  /**
    * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will still exist.
    */
  def deleteBackupPlan(): Request[DeleteBackupPlanOutput, AWSError] = js.native
  def deleteBackupPlan(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackupPlanOutput, Unit]): Request[DeleteBackupPlanOutput, AWSError] = js.native
  /**
    * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will still exist.
    */
  def deleteBackupPlan(params: DeleteBackupPlanInput): Request[DeleteBackupPlanOutput, AWSError] = js.native
  def deleteBackupPlan(
    params: DeleteBackupPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackupPlanOutput, Unit]
  ): Request[DeleteBackupPlanOutput, AWSError] = js.native
  /**
    * Deletes the resource selection associated with a backup plan that is specified by the SelectionId.
    */
  def deleteBackupSelection(): Request[js.Object, AWSError] = js.native
  def deleteBackupSelection(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the resource selection associated with a backup plan that is specified by the SelectionId.
    */
  def deleteBackupSelection(params: DeleteBackupSelectionInput): Request[js.Object, AWSError] = js.native
  def deleteBackupSelection(
    params: DeleteBackupSelectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.
    */
  def deleteBackupVault(): Request[js.Object, AWSError] = js.native
  def deleteBackupVault(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.
    */
  def deleteBackupVault(params: DeleteBackupVaultInput): Request[js.Object, AWSError] = js.native
  def deleteBackupVault(
    params: DeleteBackupVaultInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the policy document that manages permissions on a backup vault.
    */
  def deleteBackupVaultAccessPolicy(): Request[js.Object, AWSError] = js.native
  def deleteBackupVaultAccessPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the policy document that manages permissions on a backup vault.
    */
  def deleteBackupVaultAccessPolicy(params: DeleteBackupVaultAccessPolicyInput): Request[js.Object, AWSError] = js.native
  def deleteBackupVaultAccessPolicy(
    params: DeleteBackupVaultAccessPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes event notifications for the specified backup vault.
    */
  def deleteBackupVaultNotifications(): Request[js.Object, AWSError] = js.native
  def deleteBackupVaultNotifications(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes event notifications for the specified backup vault.
    */
  def deleteBackupVaultNotifications(params: DeleteBackupVaultNotificationsInput): Request[js.Object, AWSError] = js.native
  def deleteBackupVaultNotifications(
    params: DeleteBackupVaultNotificationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the recovery point specified by a recovery point ID.
    */
  def deleteRecoveryPoint(): Request[js.Object, AWSError] = js.native
  def deleteRecoveryPoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the recovery point specified by a recovery point ID.
    */
  def deleteRecoveryPoint(params: DeleteRecoveryPointInput): Request[js.Object, AWSError] = js.native
  def deleteRecoveryPoint(
    params: DeleteRecoveryPointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns metadata associated with creating a backup of a resource.
    */
  def describeBackupJob(): Request[DescribeBackupJobOutput, AWSError] = js.native
  def describeBackupJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBackupJobOutput, Unit]): Request[DescribeBackupJobOutput, AWSError] = js.native
  /**
    * Returns metadata associated with creating a backup of a resource.
    */
  def describeBackupJob(params: DescribeBackupJobInput): Request[DescribeBackupJobOutput, AWSError] = js.native
  def describeBackupJob(
    params: DescribeBackupJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBackupJobOutput, Unit]
  ): Request[DescribeBackupJobOutput, AWSError] = js.native
  /**
    * Returns metadata about a backup vault specified by its name.
    */
  def describeBackupVault(): Request[DescribeBackupVaultOutput, AWSError] = js.native
  def describeBackupVault(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBackupVaultOutput, Unit]): Request[DescribeBackupVaultOutput, AWSError] = js.native
  /**
    * Returns metadata about a backup vault specified by its name.
    */
  def describeBackupVault(params: DescribeBackupVaultInput): Request[DescribeBackupVaultOutput, AWSError] = js.native
  def describeBackupVault(
    params: DescribeBackupVaultInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBackupVaultOutput, Unit]
  ): Request[DescribeBackupVaultOutput, AWSError] = js.native
  /**
    * Returns metadata associated with creating a copy of a resource.
    */
  def describeCopyJob(): Request[DescribeCopyJobOutput, AWSError] = js.native
  def describeCopyJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCopyJobOutput, Unit]): Request[DescribeCopyJobOutput, AWSError] = js.native
  /**
    * Returns metadata associated with creating a copy of a resource.
    */
  def describeCopyJob(params: DescribeCopyJobInput): Request[DescribeCopyJobOutput, AWSError] = js.native
  def describeCopyJob(
    params: DescribeCopyJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCopyJobOutput, Unit]
  ): Request[DescribeCopyJobOutput, AWSError] = js.native
  /**
    * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name (ARN), and the AWS service type of the saved resource.
    */
  def describeProtectedResource(): Request[DescribeProtectedResourceOutput, AWSError] = js.native
  def describeProtectedResource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectedResourceOutput, Unit]): Request[DescribeProtectedResourceOutput, AWSError] = js.native
  /**
    * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name (ARN), and the AWS service type of the saved resource.
    */
  def describeProtectedResource(params: DescribeProtectedResourceInput): Request[DescribeProtectedResourceOutput, AWSError] = js.native
  def describeProtectedResource(
    params: DescribeProtectedResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectedResourceOutput, Unit]
  ): Request[DescribeProtectedResourceOutput, AWSError] = js.native
  /**
    * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
    */
  def describeRecoveryPoint(): Request[DescribeRecoveryPointOutput, AWSError] = js.native
  def describeRecoveryPoint(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecoveryPointOutput, Unit]): Request[DescribeRecoveryPointOutput, AWSError] = js.native
  /**
    * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
    */
  def describeRecoveryPoint(params: DescribeRecoveryPointInput): Request[DescribeRecoveryPointOutput, AWSError] = js.native
  def describeRecoveryPoint(
    params: DescribeRecoveryPointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecoveryPointOutput, Unit]
  ): Request[DescribeRecoveryPointOutput, AWSError] = js.native
  /**
    * Returns metadata associated with a restore job that is specified by a job ID.
    */
  def describeRestoreJob(): Request[DescribeRestoreJobOutput, AWSError] = js.native
  def describeRestoreJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRestoreJobOutput, Unit]): Request[DescribeRestoreJobOutput, AWSError] = js.native
  /**
    * Returns metadata associated with a restore job that is specified by a job ID.
    */
  def describeRestoreJob(params: DescribeRestoreJobInput): Request[DescribeRestoreJobOutput, AWSError] = js.native
  def describeRestoreJob(
    params: DescribeRestoreJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRestoreJobOutput, Unit]
  ): Request[DescribeRestoreJobOutput, AWSError] = js.native
  /**
    * Returns the backup plan that is specified by the plan ID as a backup template.
    */
  def exportBackupPlanTemplate(): Request[ExportBackupPlanTemplateOutput, AWSError] = js.native
  def exportBackupPlanTemplate(callback: js.Function2[/* err */ AWSError, /* data */ ExportBackupPlanTemplateOutput, Unit]): Request[ExportBackupPlanTemplateOutput, AWSError] = js.native
  /**
    * Returns the backup plan that is specified by the plan ID as a backup template.
    */
  def exportBackupPlanTemplate(params: ExportBackupPlanTemplateInput): Request[ExportBackupPlanTemplateOutput, AWSError] = js.native
  def exportBackupPlanTemplate(
    params: ExportBackupPlanTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportBackupPlanTemplateOutput, Unit]
  ): Request[ExportBackupPlanTemplateOutput, AWSError] = js.native
  /**
    * Returns the body of a backup plan in JSON format, in addition to plan metadata.
    */
  def getBackupPlan(): Request[GetBackupPlanOutput, AWSError] = js.native
  def getBackupPlan(callback: js.Function2[/* err */ AWSError, /* data */ GetBackupPlanOutput, Unit]): Request[GetBackupPlanOutput, AWSError] = js.native
  /**
    * Returns the body of a backup plan in JSON format, in addition to plan metadata.
    */
  def getBackupPlan(params: GetBackupPlanInput): Request[GetBackupPlanOutput, AWSError] = js.native
  def getBackupPlan(
    params: GetBackupPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackupPlanOutput, Unit]
  ): Request[GetBackupPlanOutput, AWSError] = js.native
  /**
    * Returns a valid JSON document specifying a backup plan or an error.
    */
  def getBackupPlanFromJSON(): Request[GetBackupPlanFromJSONOutput, AWSError] = js.native
  def getBackupPlanFromJSON(callback: js.Function2[/* err */ AWSError, /* data */ GetBackupPlanFromJSONOutput, Unit]): Request[GetBackupPlanFromJSONOutput, AWSError] = js.native
  /**
    * Returns a valid JSON document specifying a backup plan or an error.
    */
  def getBackupPlanFromJSON(params: GetBackupPlanFromJSONInput): Request[GetBackupPlanFromJSONOutput, AWSError] = js.native
  def getBackupPlanFromJSON(
    params: GetBackupPlanFromJSONInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackupPlanFromJSONOutput, Unit]
  ): Request[GetBackupPlanFromJSONOutput, AWSError] = js.native
  /**
    * Returns the template specified by its templateId as a backup plan.
    */
  def getBackupPlanFromTemplate(): Request[GetBackupPlanFromTemplateOutput, AWSError] = js.native
  def getBackupPlanFromTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetBackupPlanFromTemplateOutput, Unit]): Request[GetBackupPlanFromTemplateOutput, AWSError] = js.native
  /**
    * Returns the template specified by its templateId as a backup plan.
    */
  def getBackupPlanFromTemplate(params: GetBackupPlanFromTemplateInput): Request[GetBackupPlanFromTemplateOutput, AWSError] = js.native
  def getBackupPlanFromTemplate(
    params: GetBackupPlanFromTemplateInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackupPlanFromTemplateOutput, Unit]
  ): Request[GetBackupPlanFromTemplateOutput, AWSError] = js.native
  /**
    * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated with a backup plan.
    */
  def getBackupSelection(): Request[GetBackupSelectionOutput, AWSError] = js.native
  def getBackupSelection(callback: js.Function2[/* err */ AWSError, /* data */ GetBackupSelectionOutput, Unit]): Request[GetBackupSelectionOutput, AWSError] = js.native
  /**
    * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated with a backup plan.
    */
  def getBackupSelection(params: GetBackupSelectionInput): Request[GetBackupSelectionOutput, AWSError] = js.native
  def getBackupSelection(
    params: GetBackupSelectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackupSelectionOutput, Unit]
  ): Request[GetBackupSelectionOutput, AWSError] = js.native
  /**
    * Returns the access policy document that is associated with the named backup vault.
    */
  def getBackupVaultAccessPolicy(): Request[GetBackupVaultAccessPolicyOutput, AWSError] = js.native
  def getBackupVaultAccessPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetBackupVaultAccessPolicyOutput, Unit]): Request[GetBackupVaultAccessPolicyOutput, AWSError] = js.native
  /**
    * Returns the access policy document that is associated with the named backup vault.
    */
  def getBackupVaultAccessPolicy(params: GetBackupVaultAccessPolicyInput): Request[GetBackupVaultAccessPolicyOutput, AWSError] = js.native
  def getBackupVaultAccessPolicy(
    params: GetBackupVaultAccessPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackupVaultAccessPolicyOutput, Unit]
  ): Request[GetBackupVaultAccessPolicyOutput, AWSError] = js.native
  /**
    * Returns event notifications for the specified backup vault.
    */
  def getBackupVaultNotifications(): Request[GetBackupVaultNotificationsOutput, AWSError] = js.native
  def getBackupVaultNotifications(callback: js.Function2[/* err */ AWSError, /* data */ GetBackupVaultNotificationsOutput, Unit]): Request[GetBackupVaultNotificationsOutput, AWSError] = js.native
  /**
    * Returns event notifications for the specified backup vault.
    */
  def getBackupVaultNotifications(params: GetBackupVaultNotificationsInput): Request[GetBackupVaultNotificationsOutput, AWSError] = js.native
  def getBackupVaultNotifications(
    params: GetBackupVaultNotificationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackupVaultNotificationsOutput, Unit]
  ): Request[GetBackupVaultNotificationsOutput, AWSError] = js.native
  /**
    * Returns a set of metadata key-value pairs that were used to create the backup.
    */
  def getRecoveryPointRestoreMetadata(): Request[GetRecoveryPointRestoreMetadataOutput, AWSError] = js.native
  def getRecoveryPointRestoreMetadata(callback: js.Function2[/* err */ AWSError, /* data */ GetRecoveryPointRestoreMetadataOutput, Unit]): Request[GetRecoveryPointRestoreMetadataOutput, AWSError] = js.native
  /**
    * Returns a set of metadata key-value pairs that were used to create the backup.
    */
  def getRecoveryPointRestoreMetadata(params: GetRecoveryPointRestoreMetadataInput): Request[GetRecoveryPointRestoreMetadataOutput, AWSError] = js.native
  def getRecoveryPointRestoreMetadata(
    params: GetRecoveryPointRestoreMetadataInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecoveryPointRestoreMetadataOutput, Unit]
  ): Request[GetRecoveryPointRestoreMetadataOutput, AWSError] = js.native
  /**
    * Returns the AWS resource types supported by AWS Backup.
    */
  def getSupportedResourceTypes(): Request[GetSupportedResourceTypesOutput, AWSError] = js.native
  def getSupportedResourceTypes(callback: js.Function2[/* err */ AWSError, /* data */ GetSupportedResourceTypesOutput, Unit]): Request[GetSupportedResourceTypesOutput, AWSError] = js.native
  /**
    * Returns metadata about your backup jobs.
    */
  def listBackupJobs(): Request[ListBackupJobsOutput, AWSError] = js.native
  def listBackupJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListBackupJobsOutput, Unit]): Request[ListBackupJobsOutput, AWSError] = js.native
  /**
    * Returns metadata about your backup jobs.
    */
  def listBackupJobs(params: ListBackupJobsInput): Request[ListBackupJobsOutput, AWSError] = js.native
  def listBackupJobs(
    params: ListBackupJobsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBackupJobsOutput, Unit]
  ): Request[ListBackupJobsOutput, AWSError] = js.native
  /**
    * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and deletion dates.
    */
  def listBackupPlanTemplates(): Request[ListBackupPlanTemplatesOutput, AWSError] = js.native
  def listBackupPlanTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListBackupPlanTemplatesOutput, Unit]): Request[ListBackupPlanTemplatesOutput, AWSError] = js.native
  /**
    * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and deletion dates.
    */
  def listBackupPlanTemplates(params: ListBackupPlanTemplatesInput): Request[ListBackupPlanTemplatesOutput, AWSError] = js.native
  def listBackupPlanTemplates(
    params: ListBackupPlanTemplatesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBackupPlanTemplatesOutput, Unit]
  ): Request[ListBackupPlanTemplatesOutput, AWSError] = js.native
  /**
    * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation and deletion dates, plan names, and version IDs.
    */
  def listBackupPlanVersions(): Request[ListBackupPlanVersionsOutput, AWSError] = js.native
  def listBackupPlanVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListBackupPlanVersionsOutput, Unit]): Request[ListBackupPlanVersionsOutput, AWSError] = js.native
  /**
    * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation and deletion dates, plan names, and version IDs.
    */
  def listBackupPlanVersions(params: ListBackupPlanVersionsInput): Request[ListBackupPlanVersionsOutput, AWSError] = js.native
  def listBackupPlanVersions(
    params: ListBackupPlanVersionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBackupPlanVersionsOutput, Unit]
  ): Request[ListBackupPlanVersionsOutput, AWSError] = js.native
  /**
    * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan names, and creator request IDs.
    */
  def listBackupPlans(): Request[ListBackupPlansOutput, AWSError] = js.native
  def listBackupPlans(callback: js.Function2[/* err */ AWSError, /* data */ ListBackupPlansOutput, Unit]): Request[ListBackupPlansOutput, AWSError] = js.native
  /**
    * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan names, and creator request IDs.
    */
  def listBackupPlans(params: ListBackupPlansInput): Request[ListBackupPlansOutput, AWSError] = js.native
  def listBackupPlans(
    params: ListBackupPlansInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBackupPlansOutput, Unit]
  ): Request[ListBackupPlansOutput, AWSError] = js.native
  /**
    * Returns an array containing metadata of the resources associated with the target backup plan.
    */
  def listBackupSelections(): Request[ListBackupSelectionsOutput, AWSError] = js.native
  def listBackupSelections(callback: js.Function2[/* err */ AWSError, /* data */ ListBackupSelectionsOutput, Unit]): Request[ListBackupSelectionsOutput, AWSError] = js.native
  /**
    * Returns an array containing metadata of the resources associated with the target backup plan.
    */
  def listBackupSelections(params: ListBackupSelectionsInput): Request[ListBackupSelectionsOutput, AWSError] = js.native
  def listBackupSelections(
    params: ListBackupSelectionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBackupSelectionsOutput, Unit]
  ): Request[ListBackupSelectionsOutput, AWSError] = js.native
  /**
    * Returns a list of recovery point storage containers along with information about them.
    */
  def listBackupVaults(): Request[ListBackupVaultsOutput, AWSError] = js.native
  def listBackupVaults(callback: js.Function2[/* err */ AWSError, /* data */ ListBackupVaultsOutput, Unit]): Request[ListBackupVaultsOutput, AWSError] = js.native
  /**
    * Returns a list of recovery point storage containers along with information about them.
    */
  def listBackupVaults(params: ListBackupVaultsInput): Request[ListBackupVaultsOutput, AWSError] = js.native
  def listBackupVaults(
    params: ListBackupVaultsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBackupVaultsOutput, Unit]
  ): Request[ListBackupVaultsOutput, AWSError] = js.native
  /**
    * Returns metadata about your copy jobs.
    */
  def listCopyJobs(): Request[ListCopyJobsOutput, AWSError] = js.native
  def listCopyJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListCopyJobsOutput, Unit]): Request[ListCopyJobsOutput, AWSError] = js.native
  /**
    * Returns metadata about your copy jobs.
    */
  def listCopyJobs(params: ListCopyJobsInput): Request[ListCopyJobsOutput, AWSError] = js.native
  def listCopyJobs(
    params: ListCopyJobsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCopyJobsOutput, Unit]
  ): Request[ListCopyJobsOutput, AWSError] = js.native
  /**
    * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
    */
  def listProtectedResources(): Request[ListProtectedResourcesOutput, AWSError] = js.native
  def listProtectedResources(callback: js.Function2[/* err */ AWSError, /* data */ ListProtectedResourcesOutput, Unit]): Request[ListProtectedResourcesOutput, AWSError] = js.native
  /**
    * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
    */
  def listProtectedResources(params: ListProtectedResourcesInput): Request[ListProtectedResourcesOutput, AWSError] = js.native
  def listProtectedResources(
    params: ListProtectedResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProtectedResourcesOutput, Unit]
  ): Request[ListProtectedResourcesOutput, AWSError] = js.native
  /**
    * Returns detailed information about the recovery points stored in a backup vault.
    */
  def listRecoveryPointsByBackupVault(): Request[ListRecoveryPointsByBackupVaultOutput, AWSError] = js.native
  def listRecoveryPointsByBackupVault(callback: js.Function2[/* err */ AWSError, /* data */ ListRecoveryPointsByBackupVaultOutput, Unit]): Request[ListRecoveryPointsByBackupVaultOutput, AWSError] = js.native
  /**
    * Returns detailed information about the recovery points stored in a backup vault.
    */
  def listRecoveryPointsByBackupVault(params: ListRecoveryPointsByBackupVaultInput): Request[ListRecoveryPointsByBackupVaultOutput, AWSError] = js.native
  def listRecoveryPointsByBackupVault(
    params: ListRecoveryPointsByBackupVaultInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecoveryPointsByBackupVaultOutput, Unit]
  ): Request[ListRecoveryPointsByBackupVaultOutput, AWSError] = js.native
  /**
    * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name (ARN).
    */
  def listRecoveryPointsByResource(): Request[ListRecoveryPointsByResourceOutput, AWSError] = js.native
  def listRecoveryPointsByResource(callback: js.Function2[/* err */ AWSError, /* data */ ListRecoveryPointsByResourceOutput, Unit]): Request[ListRecoveryPointsByResourceOutput, AWSError] = js.native
  /**
    * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name (ARN).
    */
  def listRecoveryPointsByResource(params: ListRecoveryPointsByResourceInput): Request[ListRecoveryPointsByResourceOutput, AWSError] = js.native
  def listRecoveryPointsByResource(
    params: ListRecoveryPointsByResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecoveryPointsByResourceOutput, Unit]
  ): Request[ListRecoveryPointsByResourceOutput, AWSError] = js.native
  /**
    * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the recovery process.
    */
  def listRestoreJobs(): Request[ListRestoreJobsOutput, AWSError] = js.native
  def listRestoreJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListRestoreJobsOutput, Unit]): Request[ListRestoreJobsOutput, AWSError] = js.native
  /**
    * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the recovery process.
    */
  def listRestoreJobs(params: ListRestoreJobsInput): Request[ListRestoreJobsOutput, AWSError] = js.native
  def listRestoreJobs(
    params: ListRestoreJobsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRestoreJobsOutput, Unit]
  ): Request[ListRestoreJobsOutput, AWSError] = js.native
  /**
    * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
    */
  def listTags(): Request[ListTagsOutput, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsOutput, Unit]): Request[ListTagsOutput, AWSError] = js.native
  /**
    * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
    */
  def listTags(params: ListTagsInput): Request[ListTagsOutput, AWSError] = js.native
  def listTags(params: ListTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ ListTagsOutput, Unit]): Request[ListTagsOutput, AWSError] = js.native
  /**
    * Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a backup vault name and an access policy document in JSON format.
    */
  def putBackupVaultAccessPolicy(): Request[js.Object, AWSError] = js.native
  def putBackupVaultAccessPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a backup vault name and an access policy document in JSON format.
    */
  def putBackupVaultAccessPolicy(params: PutBackupVaultAccessPolicyInput): Request[js.Object, AWSError] = js.native
  def putBackupVaultAccessPolicy(
    params: PutBackupVaultAccessPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Turns on notifications on a backup vault for the specified topic and events.
    */
  def putBackupVaultNotifications(): Request[js.Object, AWSError] = js.native
  def putBackupVaultNotifications(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Turns on notifications on a backup vault for the specified topic and events.
    */
  def putBackupVaultNotifications(params: PutBackupVaultNotificationsInput): Request[js.Object, AWSError] = js.native
  def putBackupVaultNotifications(
    params: PutBackupVaultNotificationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Starts a job to create a one-time backup of the specified resource.
    */
  def startBackupJob(): Request[StartBackupJobOutput, AWSError] = js.native
  def startBackupJob(callback: js.Function2[/* err */ AWSError, /* data */ StartBackupJobOutput, Unit]): Request[StartBackupJobOutput, AWSError] = js.native
  /**
    * Starts a job to create a one-time backup of the specified resource.
    */
  def startBackupJob(params: StartBackupJobInput): Request[StartBackupJobOutput, AWSError] = js.native
  def startBackupJob(
    params: StartBackupJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartBackupJobOutput, Unit]
  ): Request[StartBackupJobOutput, AWSError] = js.native
  /**
    * Starts a job to create a one-time copy of the specified resource.
    */
  def startCopyJob(): Request[StartCopyJobOutput, AWSError] = js.native
  def startCopyJob(callback: js.Function2[/* err */ AWSError, /* data */ StartCopyJobOutput, Unit]): Request[StartCopyJobOutput, AWSError] = js.native
  /**
    * Starts a job to create a one-time copy of the specified resource.
    */
  def startCopyJob(params: StartCopyJobInput): Request[StartCopyJobOutput, AWSError] = js.native
  def startCopyJob(
    params: StartCopyJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartCopyJobOutput, Unit]
  ): Request[StartCopyJobOutput, AWSError] = js.native
  /**
    * Recovers the saved resource identified by an Amazon Resource Name (ARN).  If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If the ARN of a recovery point is supplied, then that recovery point is restored.
    */
  def startRestoreJob(): Request[StartRestoreJobOutput, AWSError] = js.native
  def startRestoreJob(callback: js.Function2[/* err */ AWSError, /* data */ StartRestoreJobOutput, Unit]): Request[StartRestoreJobOutput, AWSError] = js.native
  /**
    * Recovers the saved resource identified by an Amazon Resource Name (ARN).  If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If the ARN of a recovery point is supplied, then that recovery point is restored.
    */
  def startRestoreJob(params: StartRestoreJobInput): Request[StartRestoreJobOutput, AWSError] = js.native
  def startRestoreJob(
    params: StartRestoreJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartRestoreJobOutput, Unit]
  ): Request[StartRestoreJobOutput, AWSError] = js.native
  /**
    * Attempts to cancel a job to create a one-time backup of a resource.
    */
  def stopBackupJob(): Request[js.Object, AWSError] = js.native
  def stopBackupJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attempts to cancel a job to create a one-time backup of a resource.
    */
  def stopBackupJob(params: StopBackupJobInput): Request[js.Object, AWSError] = js.native
  def stopBackupJob(params: StopBackupJobInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN).
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN).
    */
  def tagResource(params: TagResourceInput): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN)
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN)
    */
  def untagResource(params: UntagResourceInput): Request[js.Object, AWSError] = js.native
  def untagResource(params: UntagResourceInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Replaces the body of a saved backup plan identified by its backupPlanId with the input document in JSON format. The new version is uniquely identified by a VersionId.
    */
  def updateBackupPlan(): Request[UpdateBackupPlanOutput, AWSError] = js.native
  def updateBackupPlan(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackupPlanOutput, Unit]): Request[UpdateBackupPlanOutput, AWSError] = js.native
  /**
    * Replaces the body of a saved backup plan identified by its backupPlanId with the input document in JSON format. The new version is uniquely identified by a VersionId.
    */
  def updateBackupPlan(params: UpdateBackupPlanInput): Request[UpdateBackupPlanOutput, AWSError] = js.native
  def updateBackupPlan(
    params: UpdateBackupPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackupPlanOutput, Unit]
  ): Request[UpdateBackupPlanOutput, AWSError] = js.native
  /**
    * Sets the transition lifecycle of a recovery point. The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  def updateRecoveryPointLifecycle(): Request[UpdateRecoveryPointLifecycleOutput, AWSError] = js.native
  def updateRecoveryPointLifecycle(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecoveryPointLifecycleOutput, Unit]): Request[UpdateRecoveryPointLifecycleOutput, AWSError] = js.native
  /**
    * Sets the transition lifecycle of a recovery point. The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  def updateRecoveryPointLifecycle(params: UpdateRecoveryPointLifecycleInput): Request[UpdateRecoveryPointLifecycleOutput, AWSError] = js.native
  def updateRecoveryPointLifecycle(
    params: UpdateRecoveryPointLifecycleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecoveryPointLifecycleOutput, Unit]
  ): Request[UpdateRecoveryPointLifecycleOutput, AWSError] = js.native
}

