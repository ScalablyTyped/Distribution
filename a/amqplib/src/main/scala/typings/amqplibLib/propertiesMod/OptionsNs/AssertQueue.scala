package typings
package amqplibLib.propertiesMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertQueue extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var autoDelete: js.UndefOr[scala.Boolean] = js.undefined
  var deadLetterExchange: js.UndefOr[java.lang.String] = js.undefined
  var deadLetterRoutingKey: js.UndefOr[java.lang.String] = js.undefined
  var durable: js.UndefOr[scala.Boolean] = js.undefined
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var expires: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maxPriority: js.UndefOr[scala.Double] = js.undefined
  var messageTtl: js.UndefOr[scala.Double] = js.undefined
}

object AssertQueue {
  @scala.inline
  def apply(
    arguments: js.Any = null,
    autoDelete: js.UndefOr[scala.Boolean] = js.undefined,
    deadLetterExchange: java.lang.String = null,
    deadLetterRoutingKey: java.lang.String = null,
    durable: js.UndefOr[scala.Boolean] = js.undefined,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    expires: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maxPriority: scala.Int | scala.Double = null,
    messageTtl: scala.Int | scala.Double = null
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

