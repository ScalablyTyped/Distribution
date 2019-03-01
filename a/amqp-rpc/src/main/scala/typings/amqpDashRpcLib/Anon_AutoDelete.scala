package typings
package amqpDashRpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoDelete extends js.Object {
  var autoDelete: js.UndefOr[scala.Boolean] = js.undefined
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AutoDelete {
  @scala.inline
  def apply(
    autoDelete: js.UndefOr[scala.Boolean] = js.undefined,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AutoDelete = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    __obj.asInstanceOf[Anon_AutoDelete]
  }
}

