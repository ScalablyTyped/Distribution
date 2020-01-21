package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}

object AnonLimit {
  @scala.inline
  def apply(limit: Int | Double = null, waitForSync: js.UndefOr[Boolean] = js.undefined): AnonLimit = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimit]
  }
}

