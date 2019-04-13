package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLoggingOptionUpdate extends js.Object {
  /**
    * ID of the CloudWatch logging option to update
    */
  var CloudWatchLoggingOptionId: Id
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.undefined
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role used must have the PutLogEvents policy action enabled.
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
}

object CloudWatchLoggingOptionUpdate {
  @scala.inline
  def apply(
    CloudWatchLoggingOptionId: Id,
    LogStreamARNUpdate: LogStreamARN = null,
    RoleARNUpdate: RoleARN = null
  ): CloudWatchLoggingOptionUpdate = {
    val __obj = js.Dynamic.literal(CloudWatchLoggingOptionId = CloudWatchLoggingOptionId)
    if (LogStreamARNUpdate != null) __obj.updateDynamic("LogStreamARNUpdate")(LogStreamARNUpdate)
    if (RoleARNUpdate != null) __obj.updateDynamic("RoleARNUpdate")(RoleARNUpdate)
    __obj.asInstanceOf[CloudWatchLoggingOptionUpdate]
  }
}

