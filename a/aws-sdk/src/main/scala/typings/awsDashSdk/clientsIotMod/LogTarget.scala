package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogTarget extends js.Object {
  /**
    * The target name.
    */
  var targetName: js.UndefOr[LogTargetName] = js.undefined
  /**
    * The target type.
    */
  var targetType: LogTargetType
}

object LogTarget {
  @scala.inline
  def apply(targetType: LogTargetType, targetName: LogTargetName = null): LogTarget = {
    val __obj = js.Dynamic.literal(targetType = targetType.asInstanceOf[js.Any])
    if (targetName != null) __obj.updateDynamic("targetName")(targetName)
    __obj.asInstanceOf[LogTarget]
  }
}

