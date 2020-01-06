package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogTargetConfiguration extends js.Object {
  /**
    * The logging level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  /**
    * A log target
    */
  var logTarget: js.UndefOr[LogTarget] = js.native
}

object LogTargetConfiguration {
  @scala.inline
  def apply(logLevel: LogLevel = null, logTarget: LogTarget = null): LogTargetConfiguration = {
    val __obj = js.Dynamic.literal()
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logTarget != null) __obj.updateDynamic("logTarget")(logTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogTargetConfiguration]
  }
}

