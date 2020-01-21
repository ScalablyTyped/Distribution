package typings.apolloReactHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLazy extends js.Object {
  var `lazy`: js.UndefOr[Boolean] = js.undefined
}

object AnonLazy {
  @scala.inline
  def apply(`lazy`: js.UndefOr[Boolean] = js.undefined): AnonLazy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLazy]
  }
}

