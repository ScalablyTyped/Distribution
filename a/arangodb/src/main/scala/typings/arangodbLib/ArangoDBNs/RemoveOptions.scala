package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveOptions extends js.Object {
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  var returnOld: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var waitForSync: js.UndefOr[scala.Boolean] = js.undefined
}

object RemoveOptions {
  @scala.inline
  def apply(
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    returnOld: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    waitForSync: js.UndefOr[scala.Boolean] = js.undefined
  ): RemoveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(returnOld)) __obj.updateDynamic("returnOld")(returnOld)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync)
    __obj.asInstanceOf[RemoveOptions]
  }
}

