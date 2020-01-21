package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnoreCancelled extends js.Object {
  var ignoreCancelled: js.UndefOr[Boolean] = js.undefined
}

object AnonIgnoreCancelled {
  @scala.inline
  def apply(ignoreCancelled: js.UndefOr[Boolean] = js.undefined): AnonIgnoreCancelled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCancelled)) __obj.updateDynamic("ignoreCancelled")(ignoreCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreCancelled]
  }
}

