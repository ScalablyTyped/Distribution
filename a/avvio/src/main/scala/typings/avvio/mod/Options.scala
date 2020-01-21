package typings.avvio.mod

import typings.avvio.AnonAfter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autostart: js.UndefOr[Boolean] = js.undefined
  var expose: js.UndefOr[AnonAfter] = js.undefined
}

object Options {
  @scala.inline
  def apply(autostart: js.UndefOr[Boolean] = js.undefined, expose: AnonAfter = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.asInstanceOf[js.Any])
    if (expose != null) __obj.updateDynamic("expose")(expose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

