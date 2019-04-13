package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLoggingOptionDescription extends js.Object {
  /**
    * ID of the CloudWatch logging option description.
    */
  var CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: awsDashSdkLib.clientsKinesisanalyticsMod.LogStreamARN
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role used must have the PutLogEvents policy action enabled.
    */
  var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.RoleARN
}

object CloudWatchLoggingOptionDescription {
  @scala.inline
  def apply(LogStreamARN: LogStreamARN, RoleARN: RoleARN, CloudWatchLoggingOptionId: Id = null): CloudWatchLoggingOptionDescription = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN, RoleARN = RoleARN)
    if (CloudWatchLoggingOptionId != null) __obj.updateDynamic("CloudWatchLoggingOptionId")(CloudWatchLoggingOptionId)
    __obj.asInstanceOf[CloudWatchLoggingOptionDescription]
  }
}

