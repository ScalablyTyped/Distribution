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
    * The Amazon S3 bucket where generated reports are stored. If you enabled on-instance session scripts and Amazon S3 logging for your session script configuration, AppStream 2.0 created an S3 bucket to store the script output. The bucket is unique to your account and Region. When you enable usage reporting in this case, AppStream 2.0 uses the same bucket to store your usage reports. If you haven't already enabled on-instance session scripts, when you enable usage reports, AppStream 2.0 creates a new S3 bucket.
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  /**
    * The schedule for generating usage reports.
    */
  var Schedule: js.UndefOr[UsageReportSchedule] = js.undefined
  /**
    * The errors that were returned if usage reports couldn't be generated.
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

