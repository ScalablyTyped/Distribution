package typings.amqpRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoDelete extends js.Object {
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
}

object AnonAutoDelete {
  @scala.inline
  def apply(autoDelete: js.UndefOr[Boolean] = js.undefined, exclusive: js.UndefOr[Boolean] = js.undefined): AnonAutoDelete = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoDelete]
  }
}

