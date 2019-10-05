package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateByExampleOptions extends js.Object {
  var keepNull: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var mergeObjects: js.UndefOr[Boolean] = js.undefined
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}

object UpdateByExampleOptions {
  @scala.inline
  def apply(
    keepNull: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    mergeObjects: js.UndefOr[Boolean] = js.undefined,
    waitForSync: js.UndefOr[Boolean] = js.undefined
  ): UpdateByExampleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepNull)) __obj.updateDynamic("keepNull")(keepNull)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeObjects)) __obj.updateDynamic("mergeObjects")(mergeObjects)
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync)
    __obj.asInstanceOf[UpdateByExampleOptions]
  }
}

