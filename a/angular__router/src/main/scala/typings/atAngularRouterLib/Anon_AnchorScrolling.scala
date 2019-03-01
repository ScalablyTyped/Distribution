package typings
package atAngularRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnchorScrolling extends js.Object {
  var anchorScrolling: js.UndefOr[
    atAngularRouterLib.atAngularRouterLibStrings.disabled | atAngularRouterLib.atAngularRouterLibStrings.enabled
  ] = js.undefined
  var scrollPositionRestoration: js.UndefOr[
    atAngularRouterLib.atAngularRouterLibStrings.disabled | atAngularRouterLib.atAngularRouterLibStrings.enabled | atAngularRouterLib.atAngularRouterLibStrings.top
  ] = js.undefined
}

object Anon_AnchorScrolling {
  @scala.inline
  def apply(
    anchorScrolling: atAngularRouterLib.atAngularRouterLibStrings.disabled | atAngularRouterLib.atAngularRouterLibStrings.enabled = null,
    scrollPositionRestoration: atAngularRouterLib.atAngularRouterLibStrings.disabled | atAngularRouterLib.atAngularRouterLibStrings.enabled | atAngularRouterLib.atAngularRouterLibStrings.top = null
  ): Anon_AnchorScrolling = {
    val __obj = js.Dynamic.literal()
    if (anchorScrolling != null) __obj.updateDynamic("anchorScrolling")(anchorScrolling.asInstanceOf[js.Any])
    if (scrollPositionRestoration != null) __obj.updateDynamic("scrollPositionRestoration")(scrollPositionRestoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnchorScrolling]
  }
}

