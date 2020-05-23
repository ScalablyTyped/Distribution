package typings.amqpRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandInfo extends js.Object {
  var cmd: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var exchange: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object CommandInfo {
  @scala.inline
  def apply(
    cmd: String = null,
    contentType: String = null,
    exchange: String = null,
    size: js.UndefOr[Double] = js.undefined
  ): CommandInfo = {
    val __obj = js.Dynamic.literal()
    if (cmd != null) __obj.updateDynamic("cmd")(cmd.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (exchange != null) __obj.updateDynamic("exchange")(exchange.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandInfo]
  }
}

