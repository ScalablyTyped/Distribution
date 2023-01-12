package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReportPlanInput extends StObject {
  
  /**
    * A customer-chosen string that you can use to distinguish between otherwise identical calls to UpdateReportPlanInput. Retrying a successful request with the same idempotency token results in a success message with no action taken.
    */
  var IdempotencyToken: js.UndefOr[String] = js.undefined
  
  /**
    * A structure that contains information about where to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
    */
  var ReportDeliveryChannel: js.UndefOr[typings.awsSdk.clientsBackupMod.ReportDeliveryChannel] = js.undefined
  
  /**
    * An optional description of the report plan with a maximum 1,024 characters.
    */
  var ReportPlanDescription: js.UndefOr[typings.awsSdk.clientsBackupMod.ReportPlanDescription] = js.undefined
  
  /**
    * The unique name of the report plan. This name is between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
    */
  var ReportPlanName: typings.awsSdk.clientsBackupMod.ReportPlanName
  
  /**
    * Identifies the report template for the report. Reports are built using a report template. The report templates are:  RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT  If the report template is RESOURCE_COMPLIANCE_REPORT or CONTROL_COMPLIANCE_REPORT, this API resource also describes the report coverage by Amazon Web Services Regions and frameworks.
    */
  var ReportSetting: js.UndefOr[typings.awsSdk.clientsBackupMod.ReportSetting] = js.undefined
}
object UpdateReportPlanInput {
  
  inline def apply(ReportPlanName: ReportPlanName): UpdateReportPlanInput = {
    val __obj = js.Dynamic.literal(ReportPlanName = ReportPlanName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReportPlanInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateReportPlanInput] (val x: Self) extends AnyVal {
    
    inline def setIdempotencyToken(value: String): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setReportDeliveryChannel(value: ReportDeliveryChannel): Self = StObject.set(x, "ReportDeliveryChannel", value.asInstanceOf[js.Any])
    
    inline def setReportDeliveryChannelUndefined: Self = StObject.set(x, "ReportDeliveryChannel", js.undefined)
    
    inline def setReportPlanDescription(value: ReportPlanDescription): Self = StObject.set(x, "ReportPlanDescription", value.asInstanceOf[js.Any])
    
    inline def setReportPlanDescriptionUndefined: Self = StObject.set(x, "ReportPlanDescription", js.undefined)
    
    inline def setReportPlanName(value: ReportPlanName): Self = StObject.set(x, "ReportPlanName", value.asInstanceOf[js.Any])
    
    inline def setReportSetting(value: ReportSetting): Self = StObject.set(x, "ReportSetting", value.asInstanceOf[js.Any])
    
    inline def setReportSettingUndefined: Self = StObject.set(x, "ReportSetting", js.undefined)
  }
}
