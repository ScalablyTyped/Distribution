package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshOnWindowFocus extends js.Object {
  var refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined
}

object RefreshOnWindowFocus {
  @scala.inline
  def apply(refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined): RefreshOnWindowFocus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(refreshOnWindowFocus)) __obj.updateDynamic("refreshOnWindowFocus")(refreshOnWindowFocus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshOnWindowFocus]
  }
}

