package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoggingOptionsResponse extends js.Object {
  /**
    * The logging level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: js.UndefOr[AwsArn] = js.undefined
}

object GetLoggingOptionsResponse {
  @scala.inline
  def apply(logLevel: LogLevel = null, roleArn: AwsArn = null): GetLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[GetLoggingOptionsResponse]
  }
}

