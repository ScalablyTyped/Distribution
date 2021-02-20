package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBusinessReportScheduleRequest extends StObject {
  
  /**
    * The format of the generated report (individual CSV files or zipped files of individual files).
    */
  var Format: js.UndefOr[BusinessReportFormat] = js.native
  
  /**
    * The recurrence of the reports.
    */
  var Recurrence: js.UndefOr[BusinessReportRecurrence] = js.native
  
  /**
    * The S3 location of the output reports.
    */
  var S3BucketName: js.UndefOr[CustomerS3BucketName] = js.native
  
  /**
    * The S3 key where the report is delivered.
    */
  var S3KeyPrefix: js.UndefOr[typings.awsSdk.alexaforbusinessMod.S3KeyPrefix] = js.native
  
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: Arn = js.native
  
  /**
    * The name identifier of the schedule.
    */
  var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.native
}
object UpdateBusinessReportScheduleRequest {
  
  @scala.inline
  def apply(ScheduleArn: Arn): UpdateBusinessReportScheduleRequest = {
    val __obj = js.Dynamic.literal(ScheduleArn = ScheduleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBusinessReportScheduleRequest]
  }
  
  @scala.inline
  implicit class UpdateBusinessReportScheduleRequestMutableBuilder[Self <: UpdateBusinessReportScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: BusinessReportFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setRecurrence(value: BusinessReportRecurrence): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceUndefined: Self = StObject.set(x, "Recurrence", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: CustomerS3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
    
    @scala.inline
    def setScheduleArn(value: Arn): Self = StObject.set(x, "ScheduleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleName(value: BusinessReportScheduleName): Self = StObject.set(x, "ScheduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleNameUndefined: Self = StObject.set(x, "ScheduleName", js.undefined)
  }
}
