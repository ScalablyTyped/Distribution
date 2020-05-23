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
    limit: js.UndefOr[Double] = js.undefined,
    mergeObjects: js.UndefOr[Boolean] = js.undefined,
    waitForSync: js.UndefOr[Boolean] = js.undefined
  ): UpdateByExampleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepNull)) __obj.updateDynamic("keepNull")(keepNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeObjects)) __obj.updateDynamic("mergeObjects")(mergeObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateByExampleOptions]
  }
}

