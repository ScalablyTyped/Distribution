package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetV2LoggingOptionsResponse extends js.Object {
  /**
    * The default log level.
    */
  var defaultLogLevel: js.UndefOr[LogLevel] = js.undefined
  /**
    * Disables all logs.
    */
  var disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined
  /**
    * The IAM role ARN AWS IoT uses to write to your CloudWatch logs.
    */
  var roleArn: js.UndefOr[AwsArn] = js.undefined
}

object GetV2LoggingOptionsResponse {
  @scala.inline
  def apply(
    defaultLogLevel: LogLevel = null,
    disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined,
    roleArn: AwsArn = null
  ): GetV2LoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (defaultLogLevel != null) __obj.updateDynamic("defaultLogLevel")(defaultLogLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAllLogs)) __obj.updateDynamic("disableAllLogs")(disableAllLogs)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[GetV2LoggingOptionsResponse]
  }
}

