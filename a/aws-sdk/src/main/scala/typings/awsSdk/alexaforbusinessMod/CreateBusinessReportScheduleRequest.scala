package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBusinessReportScheduleRequest extends StObject {
  
  /**
    * The client request token.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.undefined
  
  /**
    * The content range of the reports.
    */
  var ContentRange: BusinessReportContentRange
  
  /**
    * The format of the generated report (individual CSV files or zipped files of individual files).
    */
  var Format: BusinessReportFormat
  
  /**
    * The recurrence of the reports. If this isn't specified, the report will only be delivered one time when the API is called. 
    */
  var Recurrence: js.UndefOr[BusinessReportRecurrence] = js.undefined
  
  /**
    * The S3 bucket name of the output reports. If this isn't specified, the report can be retrieved from a download link by calling ListBusinessReportSchedule. 
    */
  var S3BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined
  
  /**
    * The S3 key where the report is delivered.
    */
  var S3KeyPrefix: js.UndefOr[typings.awsSdk.alexaforbusinessMod.S3KeyPrefix] = js.undefined
  
  /**
    * The name identifier of the schedule.
    */
  var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
  
  /**
    * The tags for the business report schedule.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateBusinessReportScheduleRequest {
  
  inline def apply(ContentRange: BusinessReportContentRange, Format: BusinessReportFormat): CreateBusinessReportScheduleRequest = {
    val __obj = js.Dynamic.literal(ContentRange = ContentRange.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBusinessReportScheduleRequest]
  }
  
  extension [Self <: CreateBusinessReportScheduleRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setContentRange(value: BusinessReportContentRange): Self = StObject.set(x, "ContentRange", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: BusinessReportFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setRecurrence(value: BusinessReportRecurrence): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "Recurrence", js.undefined)
    
    inline def setS3BucketName(value: CustomerS3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
    
    inline def setScheduleName(value: BusinessReportScheduleName): Self = StObject.set(x, "ScheduleName", value.asInstanceOf[js.Any])
    
    inline def setScheduleNameUndefined: Self = StObject.set(x, "ScheduleName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
