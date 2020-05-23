package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends ReplaceOptions {
  var keepNull: js.UndefOr[Boolean] = js.undefined
  var mergeObjects: js.UndefOr[Boolean] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(
    keepNull: js.UndefOr[Boolean] = js.undefined,
    mergeObjects: js.UndefOr[Boolean] = js.undefined,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    returnNew: js.UndefOr[Boolean] = js.undefined,
    returnOld: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    waitForSync: js.UndefOr[Boolean] = js.undefined
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepNull)) __obj.updateDynamic("keepNull")(keepNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeObjects)) __obj.updateDynamic("mergeObjects")(mergeObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnNew)) __obj.updateDynamic("returnNew")(returnNew.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnOld)) __obj.updateDynamic("returnOld")(returnOld.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
}

