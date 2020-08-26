package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseHandlerOptions extends js.Object {
  var dragDelay: Double = js.native
  var dragEnabled: Boolean = js.native
  var focusTimeout: Double = js.native
  var scrollSpeed: Double = js.native
  var tooltipFollowsMouse: Boolean = js.native
}

object MouseHandlerOptions {
  @scala.inline
  def apply(
    dragDelay: Double,
    dragEnabled: Boolean,
    focusTimeout: Double,
    scrollSpeed: Double,
    tooltipFollowsMouse: Boolean
  ): MouseHandlerOptions = {
    val __obj = js.Dynamic.literal(dragDelay = dragDelay.asInstanceOf[js.Any], dragEnabled = dragEnabled.asInstanceOf[js.Any], focusTimeout = focusTimeout.asInstanceOf[js.Any], scrollSpeed = scrollSpeed.asInstanceOf[js.Any], tooltipFollowsMouse = tooltipFollowsMouse.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseHandlerOptions]
  }
  @scala.inline
  implicit class MouseHandlerOptionsOps[Self <: MouseHandlerOptions] (val x: Self) extends AnyVal {
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
    def setDragDelay(value: Double): Self = this.set("dragDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragEnabled(value: Boolean): Self = this.set("dragEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusTimeout(value: Double): Self = this.set("focusTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipFollowsMouse(value: Boolean): Self = this.set("tooltipFollowsMouse", value.asInstanceOf[js.Any])
  }
  
}

