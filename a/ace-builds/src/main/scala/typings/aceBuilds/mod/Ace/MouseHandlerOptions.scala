package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseHandlerOptions extends js.Object {
  var dragDelay: Double
  var dragEnabled: Boolean
  var focusTimeout: Double
  var scrollSpeed: Double
  var tooltipFollowsMouse: Boolean
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
}

