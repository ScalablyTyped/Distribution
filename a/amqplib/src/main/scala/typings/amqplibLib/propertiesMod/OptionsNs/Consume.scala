package typings
package amqplibLib.propertiesMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consume extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var consumerTag: js.UndefOr[java.lang.String] = js.undefined
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var noAck: js.UndefOr[scala.Boolean] = js.undefined
  var noLocal: js.UndefOr[scala.Boolean] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
}

object Consume {
  @scala.inline
  def apply(
    arguments: js.Any = null,
    consumerTag: java.lang.String = null,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    noAck: js.UndefOr[scala.Boolean] = js.undefined,
    noLocal: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Int | scala.Double = null
  ): Consume = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (consumerTag != null) __obj.updateDynamic("consumerTag")(consumerTag)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (!js.isUndefined(noAck)) __obj.updateDynamic("noAck")(noAck)
    if (!js.isUndefined(noLocal)) __obj.updateDynamic("noLocal")(noLocal)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consume]
  }
}

