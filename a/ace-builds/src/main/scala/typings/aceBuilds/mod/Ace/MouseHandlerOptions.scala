package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseHandlerOptions extends StObject {
  
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
  implicit class MouseHandlerOptionsMutableBuilder[Self <: MouseHandlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragDelay(value: Double): Self = StObject.set(x, "dragDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusTimeout(value: Double): Self = StObject.set(x, "focusTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipFollowsMouse(value: Boolean): Self = StObject.set(x, "tooltipFollowsMouse", value.asInstanceOf[js.Any])
  }
}
