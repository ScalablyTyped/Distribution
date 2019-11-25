package typings.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consume extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var consumerTag: js.UndefOr[String] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var noAck: js.UndefOr[Boolean] = js.undefined
  var noLocal: js.UndefOr[Boolean] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
}

object Consume {
  @scala.inline
  def apply(
    arguments: js.Any = null,
    consumerTag: String = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    noAck: js.UndefOr[Boolean] = js.undefined,
    noLocal: js.UndefOr[Boolean] = js.undefined,
    priority: Int | Double = null
  ): Consume = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (consumerTag != null) __obj.updateDynamic("consumerTag")(consumerTag.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (!js.isUndefined(noAck)) __obj.updateDynamic("noAck")(noAck.asInstanceOf[js.Any])
    if (!js.isUndefined(noLocal)) __obj.updateDynamic("noLocal")(noLocal.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consume]
  }
}

