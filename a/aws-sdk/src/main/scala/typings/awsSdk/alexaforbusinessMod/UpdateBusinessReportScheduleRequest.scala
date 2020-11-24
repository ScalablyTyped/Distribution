package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBusinessReportScheduleRequest extends js.Object {
  
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
  implicit class UpdateBusinessReportScheduleRequestOps[Self <: UpdateBusinessReportScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScheduleArn(value: Arn): Self = this.set("ScheduleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: BusinessReportFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    
    @scala.inline
    def setRecurrence(value: BusinessReportRecurrence): Self = this.set("Recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrence: Self = this.set("Recurrence", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: CustomerS3BucketName): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketName: Self = this.set("S3BucketName", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: S3KeyPrefix): Self = this.set("S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("S3KeyPrefix", js.undefined)
    
    @scala.inline
    def setScheduleName(value: BusinessReportScheduleName): Self = this.set("ScheduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleName: Self = this.set("ScheduleName", js.undefined)
  }
}
