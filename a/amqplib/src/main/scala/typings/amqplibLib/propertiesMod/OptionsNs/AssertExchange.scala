package typings
package amqplibLib.propertiesMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertExchange extends js.Object {
  var alternateExchange: js.UndefOr[java.lang.String] = js.undefined
  var arguments: js.UndefOr[js.Any] = js.undefined
  var autoDelete: js.UndefOr[scala.Boolean] = js.undefined
  var durable: js.UndefOr[scala.Boolean] = js.undefined
  var internal: js.UndefOr[scala.Boolean] = js.undefined
}

object AssertExchange {
  @scala.inline
  def apply(
    alternateExchange: java.lang.String = null,
    arguments: js.Any = null,
    autoDelete: js.UndefOr[scala.Boolean] = js.undefined,
    durable: js.UndefOr[scala.Boolean] = js.undefined,
    internal: js.UndefOr[scala.Boolean] = js.undefined
  ): AssertExchange = {
    val __obj = js.Dynamic.literal()
    if (alternateExchange != null) __obj.updateDynamic("alternateExchange")(alternateExchange)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete)
    if (!js.isUndefined(durable)) __obj.updateDynamic("durable")(durable)
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    __obj.asInstanceOf[AssertExchange]
  }
}

