package typings
package atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildKeyEvent extends js.Object {
  var alt: js.UndefOr[scala.Boolean] = js.undefined
  var cmd: js.UndefOr[scala.Boolean] = js.undefined
  var ctrl: js.UndefOr[scala.Boolean] = js.undefined
  var shift: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var which: js.UndefOr[scala.Double] = js.undefined
}

object BuildKeyEvent {
  @scala.inline
  def apply(
    alt: js.UndefOr[scala.Boolean] = js.undefined,
    cmd: js.UndefOr[scala.Boolean] = js.undefined,
    ctrl: js.UndefOr[scala.Boolean] = js.undefined,
    shift: js.UndefOr[scala.Boolean] = js.undefined,
    target: stdLib.Element = null,
    which: scala.Int | scala.Double = null
  ): BuildKeyEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alt)) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(cmd)) __obj.updateDynamic("cmd")(cmd)
    if (!js.isUndefined(ctrl)) __obj.updateDynamic("ctrl")(ctrl)
    if (!js.isUndefined(shift)) __obj.updateDynamic("shift")(shift)
    if (target != null) __obj.updateDynamic("target")(target)
    if (which != null) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildKeyEvent]
  }
}

