package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogTarget extends js.Object {
  /**
    * The target name.
    */
  var targetName: js.UndefOr[LogTargetName] = js.native
  /**
    * The target type.
    */
  var targetType: LogTargetType = js.native
}

object LogTarget {
  @scala.inline
  def apply(targetType: LogTargetType, targetName: LogTargetName = null): LogTarget = {
    val __obj = js.Dynamic.literal(targetType = targetType.asInstanceOf[js.Any])
    if (targetName != null) __obj.updateDynamic("targetName")(targetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogTarget]
  }
}

