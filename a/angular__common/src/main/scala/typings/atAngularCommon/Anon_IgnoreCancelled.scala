package typings.atAngularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreCancelled extends js.Object {
  var ignoreCancelled: js.UndefOr[Boolean] = js.undefined
}

object Anon_IgnoreCancelled {
  @scala.inline
  def apply(ignoreCancelled: js.UndefOr[Boolean] = js.undefined): Anon_IgnoreCancelled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCancelled)) __obj.updateDynamic("ignoreCancelled")(ignoreCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IgnoreCancelled]
  }
}

