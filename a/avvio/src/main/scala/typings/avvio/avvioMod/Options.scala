package typings.avvio.avvioMod

import typings.avvio.Anon_After
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autostart: js.UndefOr[Boolean] = js.undefined
  var expose: js.UndefOr[Anon_After] = js.undefined
}

object Options {
  @scala.inline
  def apply(autostart: js.UndefOr[Boolean] = js.undefined, expose: Anon_After = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart)
    if (expose != null) __obj.updateDynamic("expose")(expose)
    __obj.asInstanceOf[Options]
  }
}

