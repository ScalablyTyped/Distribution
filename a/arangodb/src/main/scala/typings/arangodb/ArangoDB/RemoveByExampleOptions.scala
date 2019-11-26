package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveByExampleOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}

object RemoveByExampleOptions {
  @scala.inline
  def apply(limit: Int | Double = null, waitForSync: js.UndefOr[Boolean] = js.undefined): RemoveByExampleOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveByExampleOptions]
  }
}

