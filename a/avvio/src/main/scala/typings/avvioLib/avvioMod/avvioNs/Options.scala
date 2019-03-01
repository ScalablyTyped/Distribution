package typings
package avvioLib.avvioMod.avvioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autostart: js.UndefOr[scala.Boolean] = js.undefined
  var expose: js.UndefOr[avvioLib.Anon_After] = js.undefined
}

object Options {
  @scala.inline
  def apply(autostart: js.UndefOr[scala.Boolean] = js.undefined, expose: avvioLib.Anon_After = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart)
    if (expose != null) __obj.updateDynamic("expose")(expose)
    __obj.asInstanceOf[Options]
  }
}

