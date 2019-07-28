package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessReportSchedule extends js.Object {
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
  var S3KeyPrefix: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.S3KeyPrefix] = js.undefined
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
    if (ContentRange != null) __obj.updateDynamic("ContentRange")(ContentRange)
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (LastBusinessReport != null) __obj.updateDynamic("LastBusinessReport")(LastBusinessReport)
    if (Recurrence != null) __obj.updateDynamic("Recurrence")(Recurrence)
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName)
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix)
    if (ScheduleArn != null) __obj.updateDynamic("ScheduleArn")(ScheduleArn)
    if (ScheduleName != null) __obj.updateDynamic("ScheduleName")(ScheduleName)
    __obj.asInstanceOf[BusinessReportSchedule]
  }
}

