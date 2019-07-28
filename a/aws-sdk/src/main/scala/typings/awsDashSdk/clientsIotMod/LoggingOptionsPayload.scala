package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingOptionsPayload extends js.Object {
  /**
    * The log level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn
}

object LoggingOptionsPayload {
  @scala.inline
  def apply(roleArn: AwsArn, logLevel: LogLevel = null): LoggingOptionsPayload = {
    val __obj = js.Dynamic.literal(roleArn = roleArn)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptionsPayload]
  }
}

