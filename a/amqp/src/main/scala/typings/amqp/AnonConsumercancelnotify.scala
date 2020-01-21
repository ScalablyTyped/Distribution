package typings.amqp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConsumercancelnotify extends js.Object {
  var consumer_cancel_notify: js.UndefOr[Boolean] = js.undefined
}

object AnonConsumercancelnotify {
  @scala.inline
  def apply(consumer_cancel_notify: js.UndefOr[Boolean] = js.undefined): AnonConsumercancelnotify = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(consumer_cancel_notify)) __obj.updateDynamic("consumer_cancel_notify")(consumer_cancel_notify.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConsumercancelnotify]
  }
}

