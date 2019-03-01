package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends ReplaceOptions {
  var keepNull: js.UndefOr[scala.Boolean] = js.undefined
  var mergeObjects: js.UndefOr[scala.Boolean] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(
    keepNull: js.UndefOr[scala.Boolean] = js.undefined,
    mergeObjects: js.UndefOr[scala.Boolean] = js.undefined,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    returnNew: js.UndefOr[scala.Boolean] = js.undefined,
    returnOld: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    waitForSync: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepNull)) __obj.updateDynamic("keepNull")(keepNull)
    if (!js.isUndefined(mergeObjects)) __obj.updateDynamic("mergeObjects")(mergeObjects)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(returnNew)) __obj.updateDynamic("returnNew")(returnNew)
    if (!js.isUndefined(returnOld)) __obj.updateDynamic("returnOld")(returnOld)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync)
    __obj.asInstanceOf[UpdateOptions]
  }
}

