package typings
package amqpDashRpcLib.amqpDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandInfo extends js.Object {
  var cmd: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var exchange: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object CommandInfo {
  @scala.inline
  def apply(
    cmd: java.lang.String = null,
    contentType: java.lang.String = null,
    exchange: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): CommandInfo = {
    val __obj = js.Dynamic.literal()
    if (cmd != null) __obj.updateDynamic("cmd")(cmd)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (exchange != null) __obj.updateDynamic("exchange")(exchange)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandInfo]
  }
}

