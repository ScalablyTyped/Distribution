package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRetentionPolicyRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}

object DeleteRetentionPolicyRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName): DeleteRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName)
  
    __obj.asInstanceOf[DeleteRetentionPolicyRequest]
  }
}

