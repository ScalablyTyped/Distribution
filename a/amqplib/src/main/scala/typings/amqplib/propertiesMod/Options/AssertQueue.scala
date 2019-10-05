package typings.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertQueue extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  var deadLetterExchange: js.UndefOr[String] = js.undefined
  var deadLetterRoutingKey: js.UndefOr[String] = js.undefined
  var durable: js.UndefOr[Boolean] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var maxPriority: js.UndefOr[Double] = js.undefined
  var messageTtl: js.UndefOr[Double] = js.undefined
}

object AssertQueue {
  @scala.inline
  def apply(
    arguments: js.Any = null,
    autoDelete: js.UndefOr[Boolean] = js.undefined,
    deadLetterExchange: String = null,
    deadLetterRoutingKey: String = null,
    durable: js.UndefOr[Boolean] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    expires: Int | Double = null,
    maxLength: Int | Double = null,
    maxPriority: Int | Double = null,
    messageTtl: Int | Double = null
  ): AssertQueue = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete)
    if (deadLetterExchange != null) __obj.updateDynamic("deadLetterExchange")(deadLetterExchange)
    if (deadLetterRoutingKey != null) __obj.updateDynamic("deadLetterRoutingKey")(deadLetterRoutingKey)
    if (!js.isUndefined(durable)) __obj.updateDynamic("durable")(durable)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxPriority != null) __obj.updateDynamic("maxPriority")(maxPriority.asInstanceOf[js.Any])
    if (messageTtl != null) __obj.updateDynamic("messageTtl")(messageTtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertQueue]
  }
}

