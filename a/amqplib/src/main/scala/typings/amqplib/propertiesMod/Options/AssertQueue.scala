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
    expires: js.UndefOr[Double] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    maxPriority: js.UndefOr[Double] = js.undefined,
    messageTtl: js.UndefOr[Double] = js.undefined
  ): AssertQueue = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete.get.asInstanceOf[js.Any])
    if (deadLetterExchange != null) __obj.updateDynamic("deadLetterExchange")(deadLetterExchange.asInstanceOf[js.Any])
    if (deadLetterRoutingKey != null) __obj.updateDynamic("deadLetterRoutingKey")(deadLetterRoutingKey.asInstanceOf[js.Any])
    if (!js.isUndefined(durable)) __obj.updateDynamic("durable")(durable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPriority)) __obj.updateDynamic("maxPriority")(maxPriority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageTtl)) __obj.updateDynamic("messageTtl")(messageTtl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertQueue]
  }
}

