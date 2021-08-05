package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseHandlerOptions extends StObject {
  
  var dragDelay: Double
  
  var dragEnabled: Boolean
  
  var focusTimeout: Double
  
  var scrollSpeed: Double
  
  var tooltipFollowsMouse: Boolean
}
object MouseHandlerOptions {
  
  inline def apply(
    dragDelay: Double,
    dragEnabled: Boolean,
    focusTimeout: Double,
    scrollSpeed: Double,
    tooltipFollowsMouse: Boolean
  ): MouseHandlerOptions = {
    val __obj = js.Dynamic.literal(dragDelay = dragDelay.asInstanceOf[js.Any], dragEnabled = dragEnabled.asInstanceOf[js.Any], focusTimeout = focusTimeout.asInstanceOf[js.Any], scrollSpeed = scrollSpeed.asInstanceOf[js.Any], tooltipFollowsMouse = tooltipFollowsMouse.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseHandlerOptions]
  }
  
  extension [Self <: MouseHandlerOptions](x: Self) {
    
    inline def setDragDelay(value: Double): Self = StObject.set(x, "dragDelay", value.asInstanceOf[js.Any])
    
    inline def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
    
    inline def setFocusTimeout(value: Double): Self = StObject.set(x, "focusTimeout", value.asInstanceOf[js.Any])
    
    inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setTooltipFollowsMouse(value: Boolean): Self = StObject.set(x, "tooltipFollowsMouse", value.asInstanceOf[js.Any])
  }
}
