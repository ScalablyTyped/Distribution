package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOptionDescription extends js.Object {
  /**
    * ID of the CloudWatch logging option description.
    */
  var CloudWatchLoggingOptionId: js.UndefOr[Id] = js.native
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typings.awsDashSdk.clientsKinesisanalyticsMod.LogStreamARN = js.native
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role used must have the PutLogEvents policy action enabled.
    */
  var RoleARN: typings.awsDashSdk.clientsKinesisanalyticsMod.RoleARN = js.native
}

object CloudWatchLoggingOptionDescription {
  @scala.inline
  def apply(LogStreamARN: LogStreamARN, RoleARN: RoleARN, CloudWatchLoggingOptionId: Id = null): CloudWatchLoggingOptionDescription = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptionId != null) __obj.updateDynamic("CloudWatchLoggingOptionId")(CloudWatchLoggingOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionDescription]
  }
}

