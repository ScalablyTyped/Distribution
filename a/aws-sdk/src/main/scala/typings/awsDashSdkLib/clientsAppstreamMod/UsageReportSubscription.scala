package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReportSubscription extends js.Object {
  /**
    * The time when the last usage report was generated.
    */
  var LastGeneratedReportDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon S3 bucket where generated reports are stored. When a usage report subscription is enabled for the first time for an account in an AWS Region, an S3 bucket is created. The bucket is unique to the AWS account and the Region.
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  /**
    * The schedule for generating usage reports.
    */
  var Schedule: js.UndefOr[UsageReportSchedule] = js.undefined
  /**
    * The errors that are returned when usage reports can't be generated.
    */
  var SubscriptionErrors: js.UndefOr[LastReportGenerationExecutionErrors] = js.undefined
}

object UsageReportSubscription {
  @scala.inline
  def apply(
    LastGeneratedReportDate: Timestamp = null,
    S3BucketName: String = null,
    Schedule: UsageReportSchedule = null,
    SubscriptionErrors: LastReportGenerationExecutionErrors = null
  ): UsageReportSubscription = {
    val __obj = js.Dynamic.literal()
    if (LastGeneratedReportDate != null) __obj.updateDynamic("LastGeneratedReportDate")(LastGeneratedReportDate)
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SubscriptionErrors != null) __obj.updateDynamic("SubscriptionErrors")(SubscriptionErrors)
    __obj.asInstanceOf[UsageReportSubscription]
  }
}

