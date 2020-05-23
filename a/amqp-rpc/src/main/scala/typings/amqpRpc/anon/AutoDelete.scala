package typings.amqpRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoDelete extends js.Object {
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
}

object AutoDelete {
  @scala.inline
  def apply(autoDelete: js.UndefOr[Boolean] = js.undefined, exclusive: js.UndefOr[Boolean] = js.undefined): AutoDelete = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDelete]
  }
}

