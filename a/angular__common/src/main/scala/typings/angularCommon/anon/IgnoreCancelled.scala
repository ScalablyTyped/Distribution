package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreCancelled extends js.Object {
  var ignoreCancelled: js.UndefOr[Boolean] = js.undefined
}

object IgnoreCancelled {
  @scala.inline
  def apply(ignoreCancelled: js.UndefOr[Boolean] = js.undefined): IgnoreCancelled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCancelled)) __obj.updateDynamic("ignoreCancelled")(ignoreCancelled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreCancelled]
  }
}

