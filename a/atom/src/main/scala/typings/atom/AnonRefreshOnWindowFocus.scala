package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRefreshOnWindowFocus extends js.Object {
  var refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined
}

object AnonRefreshOnWindowFocus {
  @scala.inline
  def apply(refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined): AnonRefreshOnWindowFocus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(refreshOnWindowFocus)) __obj.updateDynamic("refreshOnWindowFocus")(refreshOnWindowFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRefreshOnWindowFocus]
  }
}

