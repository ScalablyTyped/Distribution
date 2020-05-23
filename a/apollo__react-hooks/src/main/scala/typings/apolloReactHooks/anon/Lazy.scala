package typings.apolloReactHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lazy extends js.Object {
  var `lazy`: js.UndefOr[Boolean] = js.undefined
}

object Lazy {
  @scala.inline
  def apply(`lazy`: js.UndefOr[Boolean] = js.undefined): Lazy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lazy]
  }
}

