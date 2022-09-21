package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportJob extends StObject {
  
  /**
    * The date and time that a report job is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that a report job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The S3 bucket name and S3 keys for the destination where the report job publishes the report.
    */
  var ReportDestination: js.UndefOr[typings.awsSdk.backupMod.ReportDestination] = js.undefined
  
  /**
    * The identifier for a report job. A unique, randomly generated, Unicode, UTF-8 encoded string that is at most 1,024 bytes long. Report job IDs cannot be edited.
    */
  var ReportJobId: js.UndefOr[typings.awsSdk.backupMod.ReportJobId] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ReportPlanArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Identifies the report template for the report. Reports are built using a report template. The report templates are:   RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT 
    */
  var ReportTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * The status of a report job. The statuses are:  CREATED | RUNNING | COMPLETED | FAILED   COMPLETED means that the report is available for your review at your designated destination. If the status is FAILED, review the StatusMessage for the reason.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * A message explaining the status of the report job.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object ReportJob {
  
  inline def apply(): ReportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportJob]
  }
  
  extension [Self <: ReportJob](x: Self) {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setReportDestination(value: ReportDestination): Self = StObject.set(x, "ReportDestination", value.asInstanceOf[js.Any])
    
    inline def setReportDestinationUndefined: Self = StObject.set(x, "ReportDestination", js.undefined)
    
    inline def setReportJobId(value: ReportJobId): Self = StObject.set(x, "ReportJobId", value.asInstanceOf[js.Any])
    
    inline def setReportJobIdUndefined: Self = StObject.set(x, "ReportJobId", js.undefined)
    
    inline def setReportPlanArn(value: ARN): Self = StObject.set(x, "ReportPlanArn", value.asInstanceOf[js.Any])
    
    inline def setReportPlanArnUndefined: Self = StObject.set(x, "ReportPlanArn", js.undefined)
    
    inline def setReportTemplate(value: String): Self = StObject.set(x, "ReportTemplate", value.asInstanceOf[js.Any])
    
    inline def setReportTemplateUndefined: Self = StObject.set(x, "ReportTemplate", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
