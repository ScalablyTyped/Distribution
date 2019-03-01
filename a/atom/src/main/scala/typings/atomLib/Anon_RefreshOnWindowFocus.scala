package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RefreshOnWindowFocus extends js.Object {
  var refreshOnWindowFocus: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_RefreshOnWindowFocus {
  @scala.inline
  def apply(refreshOnWindowFocus: js.UndefOr[scala.Boolean] = js.undefined): Anon_RefreshOnWindowFocus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(refreshOnWindowFocus)) __obj.updateDynamic("refreshOnWindowFocus")(refreshOnWindowFocus)
    __obj.asInstanceOf[Anon_RefreshOnWindowFocus]
  }
}

