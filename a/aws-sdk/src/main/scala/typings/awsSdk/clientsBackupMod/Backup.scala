package typings.awsSdk.clientsBackupMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backup extends Service {
  
  @JSName("config")
  var config_Backup: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a backup plan using a backup plan name and backup rules. A backup plan is a document that contains information that Backup uses to schedule tasks that create recovery points for resources. If you call CreateBackupPlan with a plan that already exists, you receive an AlreadyExistsException exception.
    */
  def createBackupPlan(): Request[CreateBackupPlanOutput, AWSError] = js.native
  def createBackupPlan(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupPlanOutput, Unit]): Request[CreateBackupPlanOutput, AWSError] = js.native
  /**
    * Creates a backup plan using a backup plan name and backup rules. A backup plan is a document that contains information that Backup uses to schedule tasks that create recovery points for resources. If you call CreateBackupPlan with a plan that already exists, you receive an AlreadyExistsException exception.
    */
  def createBackupPlan(params: CreateBackupPlanInput): Request[CreateBackupPlanOutput, AWSError] = js.native
  def createBackupPlan(
    params: CreateBackupPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupPlanOutput, Unit]
  ): Request[CreateBackupPlanOutput, AWSError] = js.native
  
  /**
    * Creates a JSON document that specifies a set of resources to assign to a backup plan. For examples, see Assigning resources programmatically. 
    */
  def createBackupSelection(): Request[CreateBackupSelectionOutput, AWSError] = js.native
  def createBackupSelection(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupSelectionOutput, Unit]): Request[CreateBackupSelectionOutput, AWSError] = js.native
  /**
    * Creates a JSON document that specifies a set of resources to assign to a backup plan. For examples, see Assigning resources programmatically. 
    */
  def createBackupSelection(params: CreateBackupSelectionInput): Request[CreateBackupSelectionOutput, AWSError] = js.native
  def createBackupSelection(
    params: CreateBackupSelectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupSelectionOutput, Unit]
  ): Request[CreateBackupSelectionOutput, AWSError] = js.native
  
  /**
    * Creates a logical container where backups are stored. A CreateBackupVault request includes a name, optionally one or more resource tags, an encryption key, and a request ID.  Do not include sensitive data, such as passport numbers, in the name of a backup vault. 
    */
  def createBackupVault(): Request[CreateBackupVaultOutput, AWSError] = js.native
  def createBackupVault(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupVaultOutput, Unit]): Request[CreateBackupVaultOutput, AWSError] = js.native
  /**
    * Creates a logical container where backups are stored. A CreateBackupVault request includes a name, optionally one or more resource tags, an encryption key, and a request ID.  Do not include sensitive data, such as passport numbers, in the name of a backup vault. 
    */
  def createBackupVault(params: CreateBackupVaultInput): Request[CreateBackupVaultOutput, AWSError] = js.native
  def createBackupVault(
    params: CreateBackupVaultInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackupVaultOutput, Unit]
  ): Request[CreateBackupVaultOutput, AWSError] = js.native
  
  /**
    * Creates a framework with one or more controls. A framework is a collection of controls that you can use to evaluate your backup practices. By using pre-built customizable controls to define your policies, you can evaluate whether your backup practices comply with your policies and which resources are not yet in compliance.
    */
  def createFramework(): Request[CreateFrameworkOutput, AWSError] = js.native
  def createFramework(callback: js.Function2[/* err */ AWSError, /* data */ CreateFrameworkOutput, Unit]): Request[CreateFrameworkOutput, AWSError] = js.native
  /**
    * Creates a framework with one or more controls. A framework is a collection of controls that you can use to evaluate your backup practices. By using pre-built customizable controls to define your policies, you can evaluate whether your backup practices comply with your policies and which resources are not yet in compliance.
    */
  def createFramework(params: CreateFrameworkInput): Request[CreateFrameworkOutput, AWSError] = js.native
  def createFramework(
    params: CreateFrameworkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFrameworkOutput, Unit]
  ): Request[CreateFrameworkOutput, AWSError] = js.native
  
  /**
    * Creates a report plan. A report plan is a document that contains information about the contents of the report and where Backup will deliver it. If you call CreateReportPlan with a plan that already exists, you receive an AlreadyExistsException exception.
    */
  def createReportPlan(): Request[CreateReportPlanOutput, AWSError] = js.native
  def createReportPlan(callback: js.Function2[/* err */ AWSError, /* data */ CreateReportPlanOutput, Unit]): Request[CreateReportPlanOutput, AWSError] = js.native
  /**
    * Creates a report plan. A report plan is a document that contains information about the contents of the report and where Backup will deliver it. If you call CreateReportPlan with a plan that already exists, you receive an AlreadyExistsException exception.
    */
  def createReportPlan(params: CreateReportPlanInput): Request[CreateReportPlanOutput, AWSError] = js.native
  def createReportPlan(
    params: CreateReportPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReportPlanOutput, Unit]
  ): Request[CreateReportPlanOutput, AWSError] = js.native
  
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
    * Deletes Backup Vault Lock from a backup vault specified by a backup vault name. If the Vault Lock configuration is immutable, then you cannot delete Vault Lock using API operations, and you will receive an InvalidRequestException if you attempt to do so. For more information, see Vault Lock in the Backup Developer Guide.
    */
  def deleteBackupVaultLockConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteBackupVaultLockConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes Backup Vault Lock from a backup vault specified by a backup vault name. If the Vault Lock configuration is immutable, then you cannot delete Vault Lock using API operations, and you will receive an InvalidRequestException if you attempt to do so. For more information, see Vault Lock in the Backup Developer Guide.
    */
  def deleteBackupVaultLockConfiguration(params: DeleteBackupVaultLockConfigurationInput): Request[js.Object, AWSError] = js.native
  def deleteBackupVaultLockConfiguration(
    params: DeleteBackupVaultLockConfigurationInput,
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
    * Deletes the framework specified by a framework name.
    */
  def deleteFramework(): Request[js.Object, AWSError] = js.native
  def deleteFramework(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the framework specified by a framework name.
    */
  def deleteFramework(params: DeleteFrameworkInput): Request[js.Object, AWSError] = js.native
  def deleteFramework(
    params: DeleteFrameworkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the recovery point specified by a recovery point ID. If the recovery point ID belongs to a continuous backup, calling this endpoint deletes the existing continuous backup and stops future continuous backup.
    */
  def deleteRecoveryPoint(): Request[js.Object, AWSError] = js.native
  def deleteRecoveryPoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the recovery point specified by a recovery point ID. If the recovery point ID belongs to a continuous backup, calling this endpoint deletes the existing continuous backup and stops future continuous backup.
    */
  def deleteRecoveryPoint(params: DeleteRecoveryPointInput): Request[js.Object, AWSError] = js.native
  def deleteRecoveryPoint(
    params: DeleteRecoveryPointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the report plan specified by a report plan name.
    */
  def deleteReportPlan(): Request[js.Object, AWSError] = js.native
  def deleteReportPlan(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the report plan specified by a report plan name.
    */
  def deleteReportPlan(params: DeleteReportPlanInput): Request[js.Object, AWSError] = js.native
  def deleteReportPlan(
    params: DeleteReportPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Returns backup job details for the specified BackupJobId.
    */
  def describeBackupJob(): Request[DescribeBackupJobOutput, AWSError] = js.native
  def describeBackupJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBackupJobOutput, Unit]): Request[DescribeBackupJobOutput, AWSError] = js.native
  /**
    * Returns backup job details for the specified BackupJobId.
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
    * Returns the framework details for the specified FrameworkName.
    */
  def describeFramework(): Request[DescribeFrameworkOutput, AWSError] = js.native
  def describeFramework(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFrameworkOutput, Unit]): Request[DescribeFrameworkOutput, AWSError] = js.native
  /**
    * Returns the framework details for the specified FrameworkName.
    */
  def describeFramework(params: DescribeFrameworkInput): Request[DescribeFrameworkOutput, AWSError] = js.native
  def describeFramework(
    params: DescribeFrameworkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFrameworkOutput, Unit]
  ): Request[DescribeFrameworkOutput, AWSError] = js.native
  
  /**
    * Describes whether the Amazon Web Services account is opted in to cross-account backup. Returns an error if the account is not a member of an Organizations organization. Example: describe-global-settings --region us-west-2 
    */
  def describeGlobalSettings(): Request[DescribeGlobalSettingsOutput, AWSError] = js.native
  def describeGlobalSettings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGlobalSettingsOutput, Unit]): Request[DescribeGlobalSettingsOutput, AWSError] = js.native
  /**
    * Describes whether the Amazon Web Services account is opted in to cross-account backup. Returns an error if the account is not a member of an Organizations organization. Example: describe-global-settings --region us-west-2 
    */
  def describeGlobalSettings(params: DescribeGlobalSettingsInput): Request[DescribeGlobalSettingsOutput, AWSError] = js.native
  def describeGlobalSettings(
    params: DescribeGlobalSettingsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGlobalSettingsOutput, Unit]
  ): Request[DescribeGlobalSettingsOutput, AWSError] = js.native
  
  /**
    * Returns information about a saved resource, including the last time it was backed up, its Amazon Resource Name (ARN), and the Amazon Web Services service type of the saved resource.
    */
  def describeProtectedResource(): Request[DescribeProtectedResourceOutput, AWSError] = js.native
  def describeProtectedResource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectedResourceOutput, Unit]): Request[DescribeProtectedResourceOutput, AWSError] = js.native
  /**
    * Returns information about a saved resource, including the last time it was backed up, its Amazon Resource Name (ARN), and the Amazon Web Services service type of the saved resource.
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
    * Returns the current service opt-in settings for the Region. If service opt-in is enabled for a service, Backup tries to protect that service's resources in this Region, when the resource is included in an on-demand backup or scheduled backup plan. Otherwise, Backup does not try to protect that service's resources in this Region.
    */
  def describeRegionSettings(): Request[DescribeRegionSettingsOutput, AWSError] = js.native
  def describeRegionSettings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRegionSettingsOutput, Unit]): Request[DescribeRegionSettingsOutput, AWSError] = js.native
  /**
    * Returns the current service opt-in settings for the Region. If service opt-in is enabled for a service, Backup tries to protect that service's resources in this Region, when the resource is included in an on-demand backup or scheduled backup plan. Otherwise, Backup does not try to protect that service's resources in this Region.
    */
  def describeRegionSettings(params: DescribeRegionSettingsInput): Request[DescribeRegionSettingsOutput, AWSError] = js.native
  def describeRegionSettings(
    params: DescribeRegionSettingsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRegionSettingsOutput, Unit]
  ): Request[DescribeRegionSettingsOutput, AWSError] = js.native
  
  /**
    * Returns the details associated with creating a report as specified by its ReportJobId.
    */
  def describeReportJob(): Request[DescribeReportJobOutput, AWSError] = js.native
  def describeReportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReportJobOutput, Unit]): Request[DescribeReportJobOutput, AWSError] = js.native
  /**
    * Returns the details associated with creating a report as specified by its ReportJobId.
    */
  def describeReportJob(params: DescribeReportJobInput): Request[DescribeReportJobOutput, AWSError] = js.native
  def describeReportJob(
    params: DescribeReportJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReportJobOutput, Unit]
  ): Request[DescribeReportJobOutput, AWSError] = js.native
  
  /**
    * Returns a list of all report plans for an Amazon Web Services account and Amazon Web Services Region.
    */
  def describeReportPlan(): Request[DescribeReportPlanOutput, AWSError] = js.native
  def describeReportPlan(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReportPlanOutput, Unit]): Request[DescribeReportPlanOutput, AWSError] = js.native
  /**
    * Returns a list of all report plans for an Amazon Web Services account and Amazon Web Services Region.
    */
  def describeReportPlan(params: DescribeReportPlanInput): Request[DescribeReportPlanOutput, AWSError] = js.native
  def describeReportPlan(
    params: DescribeReportPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReportPlanOutput, Unit]
  ): Request[DescribeReportPlanOutput, AWSError] = js.native
  
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
    * Deletes the specified continuous backup recovery point from Backup and releases control of that continuous backup to the source service, such as Amazon RDS. The source service will continue to create and retain continuous backups using the lifecycle that you specified in your original backup plan. Does not support snapshot backup recovery points.
    */
  def disassociateRecoveryPoint(): Request[js.Object, AWSError] = js.native
  def disassociateRecoveryPoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified continuous backup recovery point from Backup and releases control of that continuous backup to the source service, such as Amazon RDS. The source service will continue to create and retain continuous backups using the lifecycle that you specified in your original backup plan. Does not support snapshot backup recovery points.
    */
  def disassociateRecoveryPoint(params: DisassociateRecoveryPointInput): Request[js.Object, AWSError] = js.native
  def disassociateRecoveryPoint(
    params: DisassociateRecoveryPointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
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
    * Returns BackupPlan details for the specified BackupPlanId. The details are the body of a backup plan in JSON format, in addition to plan metadata.
    */
  def getBackupPlan(): Request[GetBackupPlanOutput, AWSError] = js.native
  def getBackupPlan(callback: js.Function2[/* err */ AWSError, /* data */ GetBackupPlanOutput, Unit]): Request[GetBackupPlanOutput, AWSError] = js.native
  /**
    * Returns BackupPlan details for the specified BackupPlanId. The details are the body of a backup plan in JSON format, in addition to plan metadata.
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
    * Returns the Amazon Web Services resource types supported by Backup.
    */
  def getSupportedResourceTypes(): Request[GetSupportedResourceTypesOutput, AWSError] = js.native
  def getSupportedResourceTypes(callback: js.Function2[/* err */ AWSError, /* data */ GetSupportedResourceTypesOutput, Unit]): Request[GetSupportedResourceTypesOutput, AWSError] = js.native
  
  /**
    * Returns a list of existing backup jobs for an authenticated account for the last 30 days. For a longer period of time, consider using these monitoring tools.
    */
  def listBackupJobs(): Request[ListBackupJobsOutput, AWSError] = js.native
  def listBackupJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListBackupJobsOutput, Unit]): Request[ListBackupJobsOutput, AWSError] = js.native
  /**
    * Returns a list of existing backup jobs for an authenticated account for the last 30 days. For a longer period of time, consider using these monitoring tools.
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
    * Returns a list of all active backup plans for an authenticated account. The list contains information such as Amazon Resource Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan names, and creator request IDs.
    */
  def listBackupPlans(): Request[ListBackupPlansOutput, AWSError] = js.native
  def listBackupPlans(callback: js.Function2[/* err */ AWSError, /* data */ ListBackupPlansOutput, Unit]): Request[ListBackupPlansOutput, AWSError] = js.native
  /**
    * Returns a list of all active backup plans for an authenticated account. The list contains information such as Amazon Resource Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan names, and creator request IDs.
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
    * Returns a list of all frameworks for an Amazon Web Services account and Amazon Web Services Region.
    */
  def listFrameworks(): Request[ListFrameworksOutput, AWSError] = js.native
  def listFrameworks(callback: js.Function2[/* err */ AWSError, /* data */ ListFrameworksOutput, Unit]): Request[ListFrameworksOutput, AWSError] = js.native
  /**
    * Returns a list of all frameworks for an Amazon Web Services account and Amazon Web Services Region.
    */
  def listFrameworks(params: ListFrameworksInput): Request[ListFrameworksOutput, AWSError] = js.native
  def listFrameworks(
    params: ListFrameworksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFrameworksOutput, Unit]
  ): Request[ListFrameworksOutput, AWSError] = js.native
  
  /**
    * Returns an array of resources successfully backed up by Backup, including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
    */
  def listProtectedResources(): Request[ListProtectedResourcesOutput, AWSError] = js.native
  def listProtectedResources(callback: js.Function2[/* err */ AWSError, /* data */ ListProtectedResourcesOutput, Unit]): Request[ListProtectedResourcesOutput, AWSError] = js.native
  /**
    * Returns an array of resources successfully backed up by Backup, including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
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
    * Returns detailed information about all the recovery points of the type specified by a resource Amazon Resource Name (ARN).  For Amazon EFS and Amazon EC2, this action only lists recovery points created by Backup. 
    */
  def listRecoveryPointsByResource(): Request[ListRecoveryPointsByResourceOutput, AWSError] = js.native
  def listRecoveryPointsByResource(callback: js.Function2[/* err */ AWSError, /* data */ ListRecoveryPointsByResourceOutput, Unit]): Request[ListRecoveryPointsByResourceOutput, AWSError] = js.native
  /**
    * Returns detailed information about all the recovery points of the type specified by a resource Amazon Resource Name (ARN).  For Amazon EFS and Amazon EC2, this action only lists recovery points created by Backup. 
    */
  def listRecoveryPointsByResource(params: ListRecoveryPointsByResourceInput): Request[ListRecoveryPointsByResourceOutput, AWSError] = js.native
  def listRecoveryPointsByResource(
    params: ListRecoveryPointsByResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecoveryPointsByResourceOutput, Unit]
  ): Request[ListRecoveryPointsByResourceOutput, AWSError] = js.native
  
  /**
    * Returns details about your report jobs.
    */
  def listReportJobs(): Request[ListReportJobsOutput, AWSError] = js.native
  def listReportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListReportJobsOutput, Unit]): Request[ListReportJobsOutput, AWSError] = js.native
  /**
    * Returns details about your report jobs.
    */
  def listReportJobs(params: ListReportJobsInput): Request[ListReportJobsOutput, AWSError] = js.native
  def listReportJobs(
    params: ListReportJobsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReportJobsOutput, Unit]
  ): Request[ListReportJobsOutput, AWSError] = js.native
  
  /**
    * Returns a list of your report plans. For detailed information about a single report plan, use DescribeReportPlan.
    */
  def listReportPlans(): Request[ListReportPlansOutput, AWSError] = js.native
  def listReportPlans(callback: js.Function2[/* err */ AWSError, /* data */ ListReportPlansOutput, Unit]): Request[ListReportPlansOutput, AWSError] = js.native
  /**
    * Returns a list of your report plans. For detailed information about a single report plan, use DescribeReportPlan.
    */
  def listReportPlans(params: ListReportPlansInput): Request[ListReportPlansOutput, AWSError] = js.native
  def listReportPlans(
    params: ListReportPlansInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReportPlansOutput, Unit]
  ): Request[ListReportPlansOutput, AWSError] = js.native
  
  /**
    * Returns a list of jobs that Backup initiated to restore a saved resource, including details about the recovery process.
    */
  def listRestoreJobs(): Request[ListRestoreJobsOutput, AWSError] = js.native
  def listRestoreJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListRestoreJobsOutput, Unit]): Request[ListRestoreJobsOutput, AWSError] = js.native
  /**
    * Returns a list of jobs that Backup initiated to restore a saved resource, including details about the recovery process.
    */
  def listRestoreJobs(params: ListRestoreJobsInput): Request[ListRestoreJobsOutput, AWSError] = js.native
  def listRestoreJobs(
    params: ListRestoreJobsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRestoreJobsOutput, Unit]
  ): Request[ListRestoreJobsOutput, AWSError] = js.native
  
  /**
    * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.  ListTags only works for resource types that support full Backup management of their backups. Those resource types are listed in the "Full Backup management" section of the  Feature availability by resource table.
    */
  def listTags(): Request[ListTagsOutput, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsOutput, Unit]): Request[ListTagsOutput, AWSError] = js.native
  /**
    * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.  ListTags only works for resource types that support full Backup management of their backups. Those resource types are listed in the "Full Backup management" section of the  Feature availability by resource table.
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
    * Applies Backup Vault Lock to a backup vault, preventing attempts to delete any recovery point stored in or created in a backup vault. Vault Lock also prevents attempts to update the lifecycle policy that controls the retention period of any recovery point currently stored in a backup vault. If specified, Vault Lock enforces a minimum and maximum retention period for future backup and copy jobs that target a backup vault.  Backup Vault Lock has yet to receive a third-party assessment for SEC 17a-4(f) and CFTC. 
    */
  def putBackupVaultLockConfiguration(): Request[js.Object, AWSError] = js.native
  def putBackupVaultLockConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Applies Backup Vault Lock to a backup vault, preventing attempts to delete any recovery point stored in or created in a backup vault. Vault Lock also prevents attempts to update the lifecycle policy that controls the retention period of any recovery point currently stored in a backup vault. If specified, Vault Lock enforces a minimum and maximum retention period for future backup and copy jobs that target a backup vault.  Backup Vault Lock has yet to receive a third-party assessment for SEC 17a-4(f) and CFTC. 
    */
  def putBackupVaultLockConfiguration(params: PutBackupVaultLockConfigurationInput): Request[js.Object, AWSError] = js.native
  def putBackupVaultLockConfiguration(
    params: PutBackupVaultLockConfigurationInput,
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
    * Starts an on-demand backup job for the specified resource.
    */
  def startBackupJob(): Request[StartBackupJobOutput, AWSError] = js.native
  def startBackupJob(callback: js.Function2[/* err */ AWSError, /* data */ StartBackupJobOutput, Unit]): Request[StartBackupJobOutput, AWSError] = js.native
  /**
    * Starts an on-demand backup job for the specified resource.
    */
  def startBackupJob(params: StartBackupJobInput): Request[StartBackupJobOutput, AWSError] = js.native
  def startBackupJob(
    params: StartBackupJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartBackupJobOutput, Unit]
  ): Request[StartBackupJobOutput, AWSError] = js.native
  
  /**
    * Starts a job to create a one-time copy of the specified resource. Does not support continuous backups.
    */
  def startCopyJob(): Request[StartCopyJobOutput, AWSError] = js.native
  def startCopyJob(callback: js.Function2[/* err */ AWSError, /* data */ StartCopyJobOutput, Unit]): Request[StartCopyJobOutput, AWSError] = js.native
  /**
    * Starts a job to create a one-time copy of the specified resource. Does not support continuous backups.
    */
  def startCopyJob(params: StartCopyJobInput): Request[StartCopyJobOutput, AWSError] = js.native
  def startCopyJob(
    params: StartCopyJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartCopyJobOutput, Unit]
  ): Request[StartCopyJobOutput, AWSError] = js.native
  
  /**
    * Starts an on-demand report job for the specified report plan.
    */
  def startReportJob(): Request[StartReportJobOutput, AWSError] = js.native
  def startReportJob(callback: js.Function2[/* err */ AWSError, /* data */ StartReportJobOutput, Unit]): Request[StartReportJobOutput, AWSError] = js.native
  /**
    * Starts an on-demand report job for the specified report plan.
    */
  def startReportJob(params: StartReportJobInput): Request[StartReportJobOutput, AWSError] = js.native
  def startReportJob(
    params: StartReportJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReportJobOutput, Unit]
  ): Request[StartReportJobOutput, AWSError] = js.native
  
  /**
    * Recovers the saved resource identified by an Amazon Resource Name (ARN).
    */
  def startRestoreJob(): Request[StartRestoreJobOutput, AWSError] = js.native
  def startRestoreJob(callback: js.Function2[/* err */ AWSError, /* data */ StartRestoreJobOutput, Unit]): Request[StartRestoreJobOutput, AWSError] = js.native
  /**
    * Recovers the saved resource identified by an Amazon Resource Name (ARN).
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
    * Updates an existing backup plan identified by its backupPlanId with the input document in JSON format. The new version is uniquely identified by a VersionId.
    */
  def updateBackupPlan(): Request[UpdateBackupPlanOutput, AWSError] = js.native
  def updateBackupPlan(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackupPlanOutput, Unit]): Request[UpdateBackupPlanOutput, AWSError] = js.native
  /**
    * Updates an existing backup plan identified by its backupPlanId with the input document in JSON format. The new version is uniquely identified by a VersionId.
    */
  def updateBackupPlan(params: UpdateBackupPlanInput): Request[UpdateBackupPlanOutput, AWSError] = js.native
  def updateBackupPlan(
    params: UpdateBackupPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackupPlanOutput, Unit]
  ): Request[UpdateBackupPlanOutput, AWSError] = js.native
  
  /**
    * Updates an existing framework identified by its FrameworkName with the input document in JSON format.
    */
  def updateFramework(): Request[UpdateFrameworkOutput, AWSError] = js.native
  def updateFramework(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFrameworkOutput, Unit]): Request[UpdateFrameworkOutput, AWSError] = js.native
  /**
    * Updates an existing framework identified by its FrameworkName with the input document in JSON format.
    */
  def updateFramework(params: UpdateFrameworkInput): Request[UpdateFrameworkOutput, AWSError] = js.native
  def updateFramework(
    params: UpdateFrameworkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFrameworkOutput, Unit]
  ): Request[UpdateFrameworkOutput, AWSError] = js.native
  
  /**
    * Updates whether the Amazon Web Services account is opted in to cross-account backup. Returns an error if the account is not an Organizations management account. Use the DescribeGlobalSettings API to determine the current settings.
    */
  def updateGlobalSettings(): Request[js.Object, AWSError] = js.native
  def updateGlobalSettings(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates whether the Amazon Web Services account is opted in to cross-account backup. Returns an error if the account is not an Organizations management account. Use the DescribeGlobalSettings API to determine the current settings.
    */
  def updateGlobalSettings(params: UpdateGlobalSettingsInput): Request[js.Object, AWSError] = js.native
  def updateGlobalSettings(
    params: UpdateGlobalSettingsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the transition lifecycle of a recovery point. The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and expires backups automatically according to the lifecycle that you define. Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “retention” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. Resource types that are able to be transitioned to cold storage are listed in the "Lifecycle to cold storage" section of the  Feature availability by resource table. Backup ignores this expression for other resource types. This operation does not support continuous backups.
    */
  def updateRecoveryPointLifecycle(): Request[UpdateRecoveryPointLifecycleOutput, AWSError] = js.native
  def updateRecoveryPointLifecycle(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecoveryPointLifecycleOutput, Unit]): Request[UpdateRecoveryPointLifecycleOutput, AWSError] = js.native
  /**
    * Sets the transition lifecycle of a recovery point. The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and expires backups automatically according to the lifecycle that you define. Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “retention” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. Resource types that are able to be transitioned to cold storage are listed in the "Lifecycle to cold storage" section of the  Feature availability by resource table. Backup ignores this expression for other resource types. This operation does not support continuous backups.
    */
  def updateRecoveryPointLifecycle(params: UpdateRecoveryPointLifecycleInput): Request[UpdateRecoveryPointLifecycleOutput, AWSError] = js.native
  def updateRecoveryPointLifecycle(
    params: UpdateRecoveryPointLifecycleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecoveryPointLifecycleOutput, Unit]
  ): Request[UpdateRecoveryPointLifecycleOutput, AWSError] = js.native
  
  /**
    * Updates the current service opt-in settings for the Region. If service-opt-in is enabled for a service, Backup tries to protect that service's resources in this Region, when the resource is included in an on-demand backup or scheduled backup plan. Otherwise, Backup does not try to protect that service's resources in this Region. Use the DescribeRegionSettings API to determine the resource types that are supported.
    */
  def updateRegionSettings(): Request[js.Object, AWSError] = js.native
  def updateRegionSettings(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the current service opt-in settings for the Region. If service-opt-in is enabled for a service, Backup tries to protect that service's resources in this Region, when the resource is included in an on-demand backup or scheduled backup plan. Otherwise, Backup does not try to protect that service's resources in this Region. Use the DescribeRegionSettings API to determine the resource types that are supported.
    */
  def updateRegionSettings(params: UpdateRegionSettingsInput): Request[js.Object, AWSError] = js.native
  def updateRegionSettings(
    params: UpdateRegionSettingsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates an existing report plan identified by its ReportPlanName with the input document in JSON format.
    */
  def updateReportPlan(): Request[UpdateReportPlanOutput, AWSError] = js.native
  def updateReportPlan(callback: js.Function2[/* err */ AWSError, /* data */ UpdateReportPlanOutput, Unit]): Request[UpdateReportPlanOutput, AWSError] = js.native
  /**
    * Updates an existing report plan identified by its ReportPlanName with the input document in JSON format.
    */
  def updateReportPlan(params: UpdateReportPlanInput): Request[UpdateReportPlanOutput, AWSError] = js.native
  def updateReportPlan(
    params: UpdateReportPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateReportPlanOutput, Unit]
  ): Request[UpdateReportPlanOutput, AWSError] = js.native
}
