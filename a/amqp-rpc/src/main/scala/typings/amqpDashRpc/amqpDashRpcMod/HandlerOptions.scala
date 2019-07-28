package typings.amqpDashRpc.amqpDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerOptions extends js.Object {
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  var durable: js.UndefOr[Boolean] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var queueName: js.UndefOr[String] = js.undefined
}

object HandlerOptions {
  @scala.inline
  def apply(
    autoDelete: js.UndefOr[Boolean] = js.undefined,
    durable: js.UndefOr[Boolean] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    queueName: String = null
  ): HandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete)
    if (!js.isUndefined(durable)) __obj.updateDynamic("durable")(durable)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (queueName != null) __obj.updateDynamic("queueName")(queueName)
    __obj.asInstanceOf[HandlerOptions]
  }
}

