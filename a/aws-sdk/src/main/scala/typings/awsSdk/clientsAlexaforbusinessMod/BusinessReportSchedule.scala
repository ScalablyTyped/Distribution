package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessReportSchedule extends StObject {
  
  /**
    * The content range of the reports.
    */
  var ContentRange: js.UndefOr[BusinessReportContentRange] = js.undefined
  
  /**
    * The format of the generated report (individual CSV files or zipped files of individual files).
    */
  var Format: js.UndefOr[BusinessReportFormat] = js.undefined
  
  /**
    * The details of the last business report delivery for a specified time interval.
    */
  var LastBusinessReport: js.UndefOr[BusinessReport] = js.undefined
  
  /**
    * The recurrence of the reports.
    */
  var Recurrence: js.UndefOr[BusinessReportRecurrence] = js.undefined
  
  /**
    * The S3 bucket name of the output reports.
    */
  var S3BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined
  
  /**
    * The S3 key where the report is delivered.
    */
  var S3KeyPrefix: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.S3KeyPrefix] = js.undefined
  
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name identifier of the schedule.
    */
  var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
}
object BusinessReportSchedule {
  
  inline def apply(): BusinessReportSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReportSchedule]
  }
  
  extension [Self <: BusinessReportSchedule](x: Self) {
    
    inline def setContentRange(value: BusinessReportContentRange): Self = StObject.set(x, "ContentRange", value.asInstanceOf[js.Any])
    
    inline def setContentRangeUndefined: Self = StObject.set(x, "ContentRange", js.undefined)
    
    inline def setFormat(value: BusinessReportFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setLastBusinessReport(value: BusinessReport): Self = StObject.set(x, "LastBusinessReport", value.asInstanceOf[js.Any])
    
    inline def setLastBusinessReportUndefined: Self = StObject.set(x, "LastBusinessReport", js.undefined)
    
    inline def setRecurrence(value: BusinessReportRecurrence): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "Recurrence", js.undefined)
    
    inline def setS3BucketName(value: CustomerS3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
    
    inline def setScheduleArn(value: Arn): Self = StObject.set(x, "ScheduleArn", value.asInstanceOf[js.Any])
    
    inline def setScheduleArnUndefined: Self = StObject.set(x, "ScheduleArn", js.undefined)
    
    inline def setScheduleName(value: BusinessReportScheduleName): Self = StObject.set(x, "ScheduleName", value.asInstanceOf[js.Any])
    
    inline def setScheduleNameUndefined: Self = StObject.set(x, "ScheduleName", js.undefined)
  }
}
