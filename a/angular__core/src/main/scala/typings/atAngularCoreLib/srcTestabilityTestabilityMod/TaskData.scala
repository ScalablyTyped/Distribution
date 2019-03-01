package typings
package atAngularCoreLib.srcTestabilityTestabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskData extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var isPeriodic: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[stdLib.XMLHttpRequest] = js.undefined
}

object TaskData {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    isPeriodic: js.UndefOr[scala.Boolean] = js.undefined,
    target: stdLib.XMLHttpRequest = null
  ): TaskData = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(isPeriodic)) __obj.updateDynamic("isPeriodic")(isPeriodic)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TaskData]
  }
}

