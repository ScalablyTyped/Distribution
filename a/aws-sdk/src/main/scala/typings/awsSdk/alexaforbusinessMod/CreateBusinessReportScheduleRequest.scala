package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBusinessReportScheduleRequest extends js.Object {
  /**
    * The client request token.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The content range of the reports.
    */
  var ContentRange: BusinessReportContentRange = js.native
  /**
    * The format of the generated report (individual CSV files or zipped files of individual files).
    */
  var Format: BusinessReportFormat = js.native
  /**
    * The recurrence of the reports. If this isn't specified, the report will only be delivered one time when the API is called. 
    */
  var Recurrence: js.UndefOr[BusinessReportRecurrence] = js.native
  /**
    * The S3 bucket name of the output reports. If this isn't specified, the report can be retrieved from a download link by calling ListBusinessReportSchedule. 
    */
  var S3BucketName: js.UndefOr[CustomerS3BucketName] = js.native
  /**
    * The S3 key where the report is delivered.
    */
  var S3KeyPrefix: js.UndefOr[typings.awsSdk.alexaforbusinessMod.S3KeyPrefix] = js.native
  /**
    * The name identifier of the schedule.
    */
  var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.native
  /**
    * The tags for the business report schedule.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateBusinessReportScheduleRequest {
  @scala.inline
  def apply(
    ContentRange: BusinessReportContentRange,
    Format: BusinessReportFormat,
    ClientRequestToken: ClientRequestToken = null,
    Recurrence: BusinessReportRecurrence = null,
    S3BucketName: CustomerS3BucketName = null,
    S3KeyPrefix: S3KeyPrefix = null,
    ScheduleName: BusinessReportScheduleName = null,
    Tags: TagList = null
  ): CreateBusinessReportScheduleRequest = {
    val __obj = js.Dynamic.literal(ContentRange = ContentRange.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Recurrence != null) __obj.updateDynamic("Recurrence")(Recurrence.asInstanceOf[js.Any])
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName.asInstanceOf[js.Any])
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix.asInstanceOf[js.Any])
    if (ScheduleName != null) __obj.updateDynamic("ScheduleName")(ScheduleName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBusinessReportScheduleRequest]
  }
}

