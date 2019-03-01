package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceOptions extends InsertOptions {
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  var returnOld: js.UndefOr[scala.Boolean] = js.undefined
}

object ReplaceOptions {
  @scala.inline
  def apply(
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    returnNew: js.UndefOr[scala.Boolean] = js.undefined,
    returnOld: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    waitForSync: js.UndefOr[scala.Boolean] = js.undefined
  ): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(returnNew)) __obj.updateDynamic("returnNew")(returnNew)
    if (!js.isUndefined(returnOld)) __obj.updateDynamic("returnOld")(returnOld)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync)
    __obj.asInstanceOf[ReplaceOptions]
  }
}

