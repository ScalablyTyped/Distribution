package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReportPlanInput extends StObject {
  
  /**
    * A customer-chosen string that you can use to distinguish between otherwise identical calls to CreateReportPlanInput. Retrying a successful request with the same idempotency token results in a success message with no action taken.
    */
  var IdempotencyToken: js.UndefOr[String] = js.undefined
  
  /**
    * A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
    */
  var ReportDeliveryChannel: typings.awsSdk.backupMod.ReportDeliveryChannel
  
  /**
    * An optional description of the report plan with a maximum of 1,024 characters.
    */
  var ReportPlanDescription: js.UndefOr[typings.awsSdk.backupMod.ReportPlanDescription] = js.undefined
  
  /**
    * The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
    */
  var ReportPlanName: typings.awsSdk.backupMod.ReportPlanName
  
  /**
    * Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
    */
  var ReportPlanTags: js.UndefOr[stringMap] = js.undefined
  
  /**
    * Identifies the report template for the report. Reports are built using a report template. The report templates are:  RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT  If the report template is RESOURCE_COMPLIANCE_REPORT or CONTROL_COMPLIANCE_REPORT, this API resource also describes the report coverage by Amazon Web Services Regions and frameworks.
    */
  var ReportSetting: typings.awsSdk.backupMod.ReportSetting
}
object CreateReportPlanInput {
  
  inline def apply(
    ReportDeliveryChannel: ReportDeliveryChannel,
    ReportPlanName: ReportPlanName,
    ReportSetting: ReportSetting
  ): CreateReportPlanInput = {
    val __obj = js.Dynamic.literal(ReportDeliveryChannel = ReportDeliveryChannel.asInstanceOf[js.Any], ReportPlanName = ReportPlanName.asInstanceOf[js.Any], ReportSetting = ReportSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReportPlanInput]
  }
  
  extension [Self <: CreateReportPlanInput](x: Self) {
    
    inline def setIdempotencyToken(value: String): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setReportDeliveryChannel(value: ReportDeliveryChannel): Self = StObject.set(x, "ReportDeliveryChannel", value.asInstanceOf[js.Any])
    
    inline def setReportPlanDescription(value: ReportPlanDescription): Self = StObject.set(x, "ReportPlanDescription", value.asInstanceOf[js.Any])
    
    inline def setReportPlanDescriptionUndefined: Self = StObject.set(x, "ReportPlanDescription", js.undefined)
    
    inline def setReportPlanName(value: ReportPlanName): Self = StObject.set(x, "ReportPlanName", value.asInstanceOf[js.Any])
    
    inline def setReportPlanTags(value: stringMap): Self = StObject.set(x, "ReportPlanTags", value.asInstanceOf[js.Any])
    
    inline def setReportPlanTagsUndefined: Self = StObject.set(x, "ReportPlanTags", js.undefined)
    
    inline def setReportSetting(value: ReportSetting): Self = StObject.set(x, "ReportSetting", value.asInstanceOf[js.Any])
  }
}
