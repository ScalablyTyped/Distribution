package typings.amqp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consumercancelnotify extends js.Object {
  var consumer_cancel_notify: js.UndefOr[Boolean] = js.undefined
}

object Consumercancelnotify {
  @scala.inline
  def apply(consumer_cancel_notify: js.UndefOr[Boolean] = js.undefined): Consumercancelnotify = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(consumer_cancel_notify)) __obj.updateDynamic("consumer_cancel_notify")(consumer_cancel_notify.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consumercancelnotify]
  }
}

