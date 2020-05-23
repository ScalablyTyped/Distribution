package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushChannelsParams extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
}

object PushChannelsParams {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined): PushChannelsParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushChannelsParams]
  }
}

