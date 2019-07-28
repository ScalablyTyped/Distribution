package typings.amqp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Consumercancelnotify extends js.Object {
  var consumer_cancel_notify: js.UndefOr[Boolean] = js.undefined
}

object Anon_Consumercancelnotify {
  @scala.inline
  def apply(consumer_cancel_notify: js.UndefOr[Boolean] = js.undefined): Anon_Consumercancelnotify = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(consumer_cancel_notify)) __obj.updateDynamic("consumer_cancel_notify")(consumer_cancel_notify)
    __obj.asInstanceOf[Anon_Consumercancelnotify]
  }
}

