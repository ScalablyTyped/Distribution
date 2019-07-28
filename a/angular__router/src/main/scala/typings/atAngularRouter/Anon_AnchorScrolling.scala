package typings.atAngularRouter

import typings.atAngularRouter.atAngularRouterStrings.disabled
import typings.atAngularRouter.atAngularRouterStrings.enabled
import typings.atAngularRouter.atAngularRouterStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnchorScrolling extends js.Object {
  var anchorScrolling: js.UndefOr[disabled | enabled] = js.undefined
  var scrollPositionRestoration: js.UndefOr[disabled | enabled | top] = js.undefined
}

object Anon_AnchorScrolling {
  @scala.inline
  def apply(
    anchorScrolling: disabled | enabled = null,
    scrollPositionRestoration: disabled | enabled | top = null
  ): Anon_AnchorScrolling = {
    val __obj = js.Dynamic.literal()
    if (anchorScrolling != null) __obj.updateDynamic("anchorScrolling")(anchorScrolling.asInstanceOf[js.Any])
    if (scrollPositionRestoration != null) __obj.updateDynamic("scrollPositionRestoration")(scrollPositionRestoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnchorScrolling]
  }
}

