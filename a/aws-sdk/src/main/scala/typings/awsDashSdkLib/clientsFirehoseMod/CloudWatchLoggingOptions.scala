package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLoggingOptions extends js.Object {
  /**
    * Enables or disables CloudWatch logging.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The CloudWatch group name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogGroupName: js.UndefOr[LogGroupName] = js.undefined
  /**
    * The CloudWatch log stream name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogStreamName: js.UndefOr[LogStreamName] = js.undefined
}

object CloudWatchLoggingOptions {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[BooleanObject] = js.undefined,
    LogGroupName: LogGroupName = null,
    LogStreamName: LogStreamName = null
  ): CloudWatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName)
    if (LogStreamName != null) __obj.updateDynamic("LogStreamName")(LogStreamName)
    __obj.asInstanceOf[CloudWatchLoggingOptions]
  }
}

