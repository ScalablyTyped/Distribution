package typings.actionsOnGoogle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ack extends js.Object {
  var ack: js.UndefOr[Boolean] = js.undefined
  var pin: js.UndefOr[String] = js.undefined
}

object Ack {
  @scala.inline
  def apply(ack: js.UndefOr[Boolean] = js.undefined, pin: String = null): Ack = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ack)) __obj.updateDynamic("ack")(ack.get.asInstanceOf[js.Any])
    if (pin != null) __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ack]
  }
}

