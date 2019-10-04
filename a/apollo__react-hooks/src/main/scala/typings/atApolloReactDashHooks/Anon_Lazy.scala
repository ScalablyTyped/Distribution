package typings.atApolloReactDashHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lazy extends js.Object {
  var `lazy`: js.UndefOr[Boolean] = js.undefined
}

object Anon_Lazy {
  @scala.inline
  def apply(`lazy`: js.UndefOr[Boolean] = js.undefined): Anon_Lazy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    __obj.asInstanceOf[Anon_Lazy]
  }
}

