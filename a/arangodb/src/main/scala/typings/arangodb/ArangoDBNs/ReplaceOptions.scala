package typings.arangodb.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceOptions extends InsertOptions {
  var overwrite: js.UndefOr[Boolean] = js.undefined
  var returnOld: js.UndefOr[Boolean] = js.undefined
}

object ReplaceOptions {
  @scala.inline
  def apply(
    overwrite: js.UndefOr[Boolean] = js.undefined,
    returnNew: js.UndefOr[Boolean] = js.undefined,
    returnOld: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    waitForSync: js.UndefOr[Boolean] = js.undefined
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

