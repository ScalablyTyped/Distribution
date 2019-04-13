package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogTargetConfiguration extends js.Object {
  /**
    * The logging level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  /**
    * A log target
    */
  var logTarget: js.UndefOr[LogTarget] = js.undefined
}

object LogTargetConfiguration {
  @scala.inline
  def apply(logLevel: LogLevel = null, logTarget: LogTarget = null): LogTargetConfiguration = {
    val __obj = js.Dynamic.literal()
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logTarget != null) __obj.updateDynamic("logTarget")(logTarget)
    __obj.asInstanceOf[LogTargetConfiguration]
  }
}

