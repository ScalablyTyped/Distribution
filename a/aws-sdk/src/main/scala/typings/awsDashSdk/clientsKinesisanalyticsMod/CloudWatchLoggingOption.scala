package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLoggingOption extends js.Object {
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typings.awsDashSdk.clientsKinesisanalyticsMod.LogStreamARN
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role that is used must have the PutLogEvents policy action enabled.
    */
  var RoleARN: typings.awsDashSdk.clientsKinesisanalyticsMod.RoleARN
}

object CloudWatchLoggingOption {
  @scala.inline
  def apply(LogStreamARN: LogStreamARN, RoleARN: RoleARN): CloudWatchLoggingOption = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN, RoleARN = RoleARN)
  
    __obj.asInstanceOf[CloudWatchLoggingOption]
  }
}

