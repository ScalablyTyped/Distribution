package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveByExampleOptions extends js.Object {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var waitForSync: js.UndefOr[scala.Boolean] = js.undefined
}

object RemoveByExampleOptions {
  @scala.inline
  def apply(limit: scala.Int | scala.Double = null, waitForSync: js.UndefOr[scala.Boolean] = js.undefined): RemoveByExampleOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync)
    __obj.asInstanceOf[RemoveByExampleOptions]
  }
}

