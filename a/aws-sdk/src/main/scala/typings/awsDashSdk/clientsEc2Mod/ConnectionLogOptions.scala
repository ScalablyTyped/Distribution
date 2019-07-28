package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionLogOptions extends js.Object {
  /**
    * The name of the CloudWatch Logs log group.
    */
  var CloudwatchLogGroup: js.UndefOr[String] = js.undefined
  /**
    * The name of the CloudWatch Logs log stream to which the connection data is published.
    */
  var CloudwatchLogStream: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether connection logging is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}

object ConnectionLogOptions {
  @scala.inline
  def apply(
    CloudwatchLogGroup: String = null,
    CloudwatchLogStream: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined
  ): ConnectionLogOptions = {
    val __obj = js.Dynamic.literal()
    if (CloudwatchLogGroup != null) __obj.updateDynamic("CloudwatchLogGroup")(CloudwatchLogGroup)
    if (CloudwatchLogStream != null) __obj.updateDynamic("CloudwatchLogStream")(CloudwatchLogStream)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[ConnectionLogOptions]
  }
}

