package typings.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertExchange extends js.Object {
  var alternateExchange: js.UndefOr[String] = js.undefined
  var arguments: js.UndefOr[js.Any] = js.undefined
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  var durable: js.UndefOr[Boolean] = js.undefined
  var internal: js.UndefOr[Boolean] = js.undefined
}

object AssertExchange {
  @scala.inline
  def apply(
    alternateExchange: String = null,
    arguments: js.Any = null,
    autoDelete: js.UndefOr[Boolean] = js.undefined,
    durable: js.UndefOr[Boolean] = js.undefined,
    internal: js.UndefOr[Boolean] = js.undefined
  ): AssertExchange = {
    val __obj = js.Dynamic.literal()
    if (alternateExchange != null) __obj.updateDynamic("alternateExchange")(alternateExchange.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete.get.asInstanceOf[js.Any])
    if (!js.isUndefined(durable)) __obj.updateDynamic("durable")(durable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertExchange]
  }
}

