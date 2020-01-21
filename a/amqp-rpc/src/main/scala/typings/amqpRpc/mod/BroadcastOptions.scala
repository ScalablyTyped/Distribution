package typings.amqpRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var onComplete: js.UndefOr[js.Any] = js.undefined
  var onResponse: js.UndefOr[js.Any] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object BroadcastOptions {
  @scala.inline
  def apply(
    context: js.Any = null,
    onComplete: js.Any = null,
    onResponse: js.Any = null,
    ttl: Int | Double = null
  ): BroadcastOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    if (onResponse != null) __obj.updateDynamic("onResponse")(onResponse.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastOptions]
  }
}

