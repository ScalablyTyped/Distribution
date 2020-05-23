package typings.anyproxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebInterfaceOptions extends js.Object {
  /** If enable web interface, default to false */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** Port number for web interface */
  var webPort: js.UndefOr[Double] = js.undefined
}

object WebInterfaceOptions {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined, webPort: js.UndefOr[Double] = js.undefined): WebInterfaceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webPort)) __obj.updateDynamic("webPort")(webPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebInterfaceOptions]
  }
}

