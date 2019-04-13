package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsConfiguration extends js.Object {
  /**
    * Whether CloudWatch Logs is enabled for a layer.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of configuration options for CloudWatch Logs.
    */
  var LogStreams: js.UndefOr[CloudWatchLogsLogStreams] = js.undefined
}

object CloudWatchLogsConfiguration {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined, LogStreams: CloudWatchLogsLogStreams = null): CloudWatchLogsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (LogStreams != null) __obj.updateDynamic("LogStreams")(LogStreams)
    __obj.asInstanceOf[CloudWatchLogsConfiguration]
  }
}

