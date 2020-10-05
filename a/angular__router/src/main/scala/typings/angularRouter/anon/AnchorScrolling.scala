package typings.angularRouter.anon

import typings.angularRouter.angularRouterStrings.disabled
import typings.angularRouter.angularRouterStrings.enabled
import typings.angularRouter.angularRouterStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorScrolling extends js.Object {
  var anchorScrolling: js.UndefOr[disabled | enabled] = js.native
  var scrollPositionRestoration: js.UndefOr[disabled | enabled | top] = js.native
}

object AnchorScrolling {
  @scala.inline
  def apply(): AnchorScrolling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorScrolling]
  }
  @scala.inline
  implicit class AnchorScrollingOps[Self <: AnchorScrolling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchorScrolling(value: disabled | enabled): Self = this.set("anchorScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorScrolling: Self = this.set("anchorScrolling", js.undefined)
    @scala.inline
    def setScrollPositionRestoration(value: disabled | enabled | top): Self = this.set("scrollPositionRestoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPositionRestoration: Self = this.set("scrollPositionRestoration", js.undefined)
  }
  
}

