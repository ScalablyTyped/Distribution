package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportPlan extends StObject {
  
  /**
    * The date and time that a report plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The deployment status of a report plan. The statuses are:  CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED 
    */
  var DeploymentStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that a report job associated with this report plan last attempted to run, in Unix format and Coordinated Universal Time (UTC). The value of LastAttemptedExecutionTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastAttemptedExecutionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that a report job associated with this report plan last successfully ran, in Unix format and Coordinated Universal Time (UTC). The value of LastSuccessfulExecutionTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastSuccessfulExecutionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
    */
  var ReportDeliveryChannel: js.UndefOr[typings.awsSdk.clientsBackupMod.ReportDeliveryChannel] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ReportPlanArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * An optional description of the report plan with a maximum 1,024 characters.
    */
  var ReportPlanDescription: js.UndefOr[typings.awsSdk.clientsBackupMod.ReportPlanDescription] = js.undefined
  
  /**
    * The unique name of the report plan. This name is between 1 and 256 characters starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
    */
  var ReportPlanName: js.UndefOr[typings.awsSdk.clientsBackupMod.ReportPlanName] = js.undefined
  
  /**
    * Identifies the report template for the report. Reports are built using a report template. The report templates are:  RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT  If the report template is RESOURCE_COMPLIANCE_REPORT or CONTROL_COMPLIANCE_REPORT, this API resource also describes the report coverage by Amazon Web Services Regions and frameworks.
    */
  var ReportSetting: js.UndefOr[typings.awsSdk.clientsBackupMod.ReportSetting] = js.undefined
}
object ReportPlan {
  
  inline def apply(): ReportPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportPlan] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDeploymentStatus(value: String): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
    
    inline def setLastAttemptedExecutionTime(value: js.Date): Self = StObject.set(x, "LastAttemptedExecutionTime", value.asInstanceOf[js.Any])
    
    inline def setLastAttemptedExecutionTimeUndefined: Self = StObject.set(x, "LastAttemptedExecutionTime", js.undefined)
    
    inline def setLastSuccessfulExecutionTime(value: js.Date): Self = StObject.set(x, "LastSuccessfulExecutionTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulExecutionTimeUndefined: Self = StObject.set(x, "LastSuccessfulExecutionTime", js.undefined)
    
    inline def setReportDeliveryChannel(value: ReportDeliveryChannel): Self = StObject.set(x, "ReportDeliveryChannel", value.asInstanceOf[js.Any])
    
    inline def setReportDeliveryChannelUndefined: Self = StObject.set(x, "ReportDeliveryChannel", js.undefined)
    
    inline def setReportPlanArn(value: ARN): Self = StObject.set(x, "ReportPlanArn", value.asInstanceOf[js.Any])
    
    inline def setReportPlanArnUndefined: Self = StObject.set(x, "ReportPlanArn", js.undefined)
    
    inline def setReportPlanDescription(value: ReportPlanDescription): Self = StObject.set(x, "ReportPlanDescription", value.asInstanceOf[js.Any])
    
    inline def setReportPlanDescriptionUndefined: Self = StObject.set(x, "ReportPlanDescription", js.undefined)
    
    inline def setReportPlanName(value: ReportPlanName): Self = StObject.set(x, "ReportPlanName", value.asInstanceOf[js.Any])
    
    inline def setReportPlanNameUndefined: Self = StObject.set(x, "ReportPlanName", js.undefined)
    
    inline def setReportSetting(value: ReportSetting): Self = StObject.set(x, "ReportSetting", value.asInstanceOf[js.Any])
    
    inline def setReportSettingUndefined: Self = StObject.set(x, "ReportSetting", js.undefined)
  }
}
