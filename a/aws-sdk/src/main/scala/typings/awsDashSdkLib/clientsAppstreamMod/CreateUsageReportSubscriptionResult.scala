package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUsageReportSubscriptionResult extends js.Object {
  /**
    * The Amazon S3 bucket where generated reports are stored. When a usage report subscription is enabled for the first time for an account in an AWS Region, an S3 bucket is created. The bucket is unique to the AWS account and the Region. 
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  /**
    * The schedule for generating usage reports.
    */
  var Schedule: js.UndefOr[UsageReportSchedule] = js.undefined
}

object CreateUsageReportSubscriptionResult {
  @scala.inline
  def apply(S3BucketName: String = null, Schedule: UsageReportSchedule = null): CreateUsageReportSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUsageReportSubscriptionResult]
  }
}

