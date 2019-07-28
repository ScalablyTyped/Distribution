package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateDRTLogBucketRequest extends js.Object {
  /**
    * The Amazon S3 bucket that contains your AWS WAF logs.
    */
  var LogBucket: typings.awsDashSdk.clientsShieldMod.LogBucket
}

object DisassociateDRTLogBucketRequest {
  @scala.inline
  def apply(LogBucket: LogBucket): DisassociateDRTLogBucketRequest = {
    val __obj = js.Dynamic.literal(LogBucket = LogBucket)
  
    __obj.asInstanceOf[DisassociateDRTLogBucketRequest]
  }
}

