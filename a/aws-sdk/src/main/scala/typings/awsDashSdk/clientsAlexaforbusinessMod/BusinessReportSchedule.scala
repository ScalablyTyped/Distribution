package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessReportSchedule extends js.Object {
  /**
    * The content range of the reports.
    */
  var ContentRange: js.UndefOr[BusinessReportContentRange] = js.native
  /**
    * The format of the generated report (individual CSV files or zipped files of individual files).
    */
  var Format: js.UndefOr[BusinessReportFormat] = js.native
  /**
    * The details of the last business report delivery for a specified time interval.
    */
  var LastBusinessReport: js.UndefOr[BusinessReport] = js.native
  /**
    * The recurrence of the reports.
    */
  var Recurrence: js.UndefOr[BusinessReportRecurrence] = js.native
  /**
    * The S3 bucket name of the output reports.
    */
  var S3BucketName: js.UndefOr[CustomerS3BucketName] = js.native
  /**
    * The S3 key where the report is delivered.
    */
  var S3KeyPrefix: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.S3KeyPrefix] = js.native
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: js.UndefOr[Arn] = js.native
  /**
    * The name identifier of the schedule.
    */
  var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.native
}

object BusinessReportSchedule {
  @scala.inline
  def apply(
    ContentRange: BusinessReportContentRange = null,
    Format: BusinessReportFormat = null,
    LastBusinessReport: BusinessReport = null,
    Recurrence: BusinessReportRecurrence = null,
    S3BucketName: CustomerS3BucketName = null,
    S3KeyPrefix: S3KeyPrefix = null,
    ScheduleArn: Arn = null,
    ScheduleName: BusinessReportScheduleName = null
  ): BusinessReportSchedule = {
    val __obj = js.Dynamic.literal()
    if (ContentRange != null) __obj.updateDynamic("ContentRange")(ContentRange.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (LastBusinessReport != null) __obj.updateDynamic("LastBusinessReport")(LastBusinessReport.asInstanceOf[js.Any])
    if (Recurrence != null) __obj.updateDynamic("Recurrence")(Recurrence.asInstanceOf[js.Any])
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName.asInstanceOf[js.Any])
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix.asInstanceOf[js.Any])
    if (ScheduleArn != null) __obj.updateDynamic("ScheduleArn")(ScheduleArn.asInstanceOf[js.Any])
    if (ScheduleName != null) __obj.updateDynamic("ScheduleName")(ScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessReportSchedule]
  }
}

