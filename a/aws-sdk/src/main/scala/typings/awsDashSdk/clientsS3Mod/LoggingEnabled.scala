package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingEnabled extends js.Object {
  /**
    * Specifies the bucket where you want Amazon S3 to store server access logs. You can have your logs delivered to any bucket that you own, including the same bucket that is being logged. You can also configure multiple buckets to deliver their logs to the same target bucket. In this case, you should choose a different TargetPrefix for each source bucket so that the delivered log files can be distinguished by key.
    */
  var TargetBucket: typings.awsDashSdk.clientsS3Mod.TargetBucket = js.native
  /**
    * Container for granting information.
    */
  var TargetGrants: js.UndefOr[typings.awsDashSdk.clientsS3Mod.TargetGrants] = js.native
  /**
    * A prefix for all log object keys. If you store log files from multiple Amazon S3 buckets in a single bucket, you can use a prefix to distinguish which log files came from which bucket.
    */
  var TargetPrefix: typings.awsDashSdk.clientsS3Mod.TargetPrefix = js.native
}

object LoggingEnabled {
  @scala.inline
  def apply(TargetBucket: TargetBucket, TargetPrefix: TargetPrefix, TargetGrants: TargetGrants = null): LoggingEnabled = {
    val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
    if (TargetGrants != null) __obj.updateDynamic("TargetGrants")(TargetGrants.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingEnabled]
  }
}

