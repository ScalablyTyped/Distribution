package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionLogResponseOptions extends js.Object {
  /**
    * The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
    */
  var CloudwatchLogGroup: js.UndefOr[String] = js.undefined
  /**
    * The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
    */
  var CloudwatchLogStream: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether client connection logging is enabled for the Client VPN endpoint.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}

object ConnectionLogResponseOptions {
  @scala.inline
  def apply(
    CloudwatchLogGroup: String = null,
    CloudwatchLogStream: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined
  ): ConnectionLogResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (CloudwatchLogGroup != null) __obj.updateDynamic("CloudwatchLogGroup")(CloudwatchLogGroup)
    if (CloudwatchLogStream != null) __obj.updateDynamic("CloudwatchLogStream")(CloudwatchLogStream)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[ConnectionLogResponseOptions]
  }
}

