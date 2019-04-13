package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRetentionPolicyRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  var retentionInDays: Days
}

object PutRetentionPolicyRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName, retentionInDays: Days): PutRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName, retentionInDays = retentionInDays)
  
    __obj.asInstanceOf[PutRetentionPolicyRequest]
  }
}

