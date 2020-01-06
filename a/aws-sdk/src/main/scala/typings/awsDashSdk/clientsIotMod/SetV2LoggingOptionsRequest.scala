package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetV2LoggingOptionsRequest extends js.Object {
  /**
    * The default logging level.
    */
  var defaultLogLevel: js.UndefOr[LogLevel] = js.native
  /**
    * If true all logs are disabled. The default is false.
    */
  var disableAllLogs: js.UndefOr[DisableAllLogs] = js.native
  /**
    * The ARN of the role that allows IoT to write to Cloudwatch logs.
    */
  var roleArn: js.UndefOr[AwsArn] = js.native
}

object SetV2LoggingOptionsRequest {
  @scala.inline
  def apply(
    defaultLogLevel: LogLevel = null,
    disableAllLogs: js.UndefOr[scala.Boolean] = js.undefined,
    roleArn: AwsArn = null
  ): SetV2LoggingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (defaultLogLevel != null) __obj.updateDynamic("defaultLogLevel")(defaultLogLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAllLogs)) __obj.updateDynamic("disableAllLogs")(disableAllLogs.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetV2LoggingOptionsRequest]
  }
}

