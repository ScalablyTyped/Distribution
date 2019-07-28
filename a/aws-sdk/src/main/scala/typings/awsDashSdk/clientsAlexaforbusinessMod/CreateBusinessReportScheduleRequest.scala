package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBusinessReportScheduleRequest extends js.Object {
  /**
    * The client request token.
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ClientRequestToken] = js.undefined
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
  var S3KeyPrefix: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.S3KeyPrefix] = js.undefined
  /**
    * The name identifier of the schedule.
    */
  var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
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
    ScheduleName: BusinessReportScheduleName = null
  ): CreateBusinessReportScheduleRequest = {
    val __obj = js.Dynamic.literal(ContentRange = ContentRange, Format = Format.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (Recurrence != null) __obj.updateDynamic("Recurrence")(Recurrence)
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName)
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix)
    if (ScheduleName != null) __obj.updateDynamic("ScheduleName")(ScheduleName)
    __obj.asInstanceOf[CreateBusinessReportScheduleRequest]
  }
}

