package typings.angularRouter.anon

import typings.angularRouter.angularRouterStrings.disabled
import typings.angularRouter.angularRouterStrings.enabled
import typings.angularRouter.angularRouterStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorScrolling extends js.Object {
  var anchorScrolling: js.UndefOr[disabled | enabled] = js.undefined
  var scrollPositionRestoration: js.UndefOr[disabled | enabled | top] = js.undefined
}

object AnchorScrolling {
  @scala.inline
  def apply(
    anchorScrolling: disabled | enabled = null,
    scrollPositionRestoration: disabled | enabled | top = null
  ): AnchorScrolling = {
    val __obj = js.Dynamic.literal()
    if (anchorScrolling != null) __obj.updateDynamic("anchorScrolling")(anchorScrolling.asInstanceOf[js.Any])
    if (scrollPositionRestoration != null) __obj.updateDynamic("scrollPositionRestoration")(scrollPositionRestoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorScrolling]
  }
}

