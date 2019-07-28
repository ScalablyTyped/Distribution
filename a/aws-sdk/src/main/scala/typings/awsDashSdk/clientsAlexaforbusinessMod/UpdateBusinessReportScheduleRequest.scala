package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBusinessReportScheduleRequest extends js.Object {
  /**
    * The format of the generated report (individual CSV files or zipped files of individual files).
    */
  var Format: js.UndefOr[BusinessReportFormat] = js.undefined
  /**
    * The recurrence of the reports.
    */
  var Recurrence: js.UndefOr[BusinessReportRecurrence] = js.undefined
  /**
    * The S3 location of the output reports.
    */
  var S3BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined
  /**
    * The S3 key where the report is delivered.
    */
  var S3KeyPrefix: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.S3KeyPrefix] = js.undefined
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: Arn
  /**
    * The name identifier of the schedule.
    */
  var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
}

object UpdateBusinessReportScheduleRequest {
  @scala.inline
  def apply(
    ScheduleArn: Arn,
    Format: BusinessReportFormat = null,
    Recurrence: BusinessReportRecurrence = null,
    S3BucketName: CustomerS3BucketName = null,
    S3KeyPrefix: S3KeyPrefix = null,
    ScheduleName: BusinessReportScheduleName = null
  ): UpdateBusinessReportScheduleRequest = {
    val __obj = js.Dynamic.literal(ScheduleArn = ScheduleArn)
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (Recurrence != null) __obj.updateDynamic("Recurrence")(Recurrence)
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName)
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix)
    if (ScheduleName != null) __obj.updateDynamic("ScheduleName")(ScheduleName)
    __obj.asInstanceOf[UpdateBusinessReportScheduleRequest]
  }
}

