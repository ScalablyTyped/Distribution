package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAck extends js.Object {
  var ack: js.UndefOr[Boolean] = js.undefined
  var pin: js.UndefOr[String] = js.undefined
}

object AnonAck {
  @scala.inline
  def apply(ack: js.UndefOr[Boolean] = js.undefined, pin: String = null): AnonAck = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ack)) __obj.updateDynamic("ack")(ack.asInstanceOf[js.Any])
    if (pin != null) __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAck]
  }
}

