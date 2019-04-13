package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogSetup extends js.Object {
  /**
    * If a log type is enabled, then that log type exports its control plane logs to CloudWatch Logs. If a log type is not enabled, then that log type does not export its control plane logs. Each individual log type can be enabled or disabled independently.
    */
  var enabled: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The available cluster control plane log types.
    */
  var types: js.UndefOr[LogTypes] = js.undefined
}

object LogSetup {
  @scala.inline
  def apply(enabled: js.UndefOr[BoxedBoolean] = js.undefined, types: LogTypes = null): LogSetup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[LogSetup]
  }
}

