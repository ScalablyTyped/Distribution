package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateDRTLogBucketRequest extends js.Object {
  /**
    * The Amazon S3 bucket that contains your flow logs.
    */
  var LogBucket: awsDashSdkLib.clientsShieldMod.LogBucket
}

object AssociateDRTLogBucketRequest {
  @scala.inline
  def apply(LogBucket: LogBucket): AssociateDRTLogBucketRequest = {
    val __obj = js.Dynamic.literal(LogBucket = LogBucket)
  
    __obj.asInstanceOf[AssociateDRTLogBucketRequest]
  }
}

