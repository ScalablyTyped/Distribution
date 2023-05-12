package typings.antvGLite

import typings.antvGLite.distDomFederatedMouseEventMod.FederatedMouseEvent
import typings.antvGLite.distServicesMod.EventService
import typings.std.stdInts.`0x00`
import typings.std.stdInts.`0x01`
import typings.std.stdInts.`0x02`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomFederatedWheelEventMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.Event because Already inherited
  - typings.std.UIEvent because Already inherited
  - typings.std.MouseEvent because Already inherited
  - typings.std.WheelEvent because var conflicts: altKey, button, buttons, cancelBubble, clientX, clientY, ctrlKey, metaKey, movementX, movementY, offsetX, offsetY, relatedTarget, returnValue, screenX, screenY, shiftKey. Inlined DOM_DELTA_PIXEL, DOM_DELTA_PAGE, deltaZ, deltaX, deltaMode, DOM_DELTA_LINE, deltaY */ @JSImport("@antv/g-lite/dist/dom/FederatedWheelEvent", "FederatedWheelEvent")
  @js.native
  /**
    * The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  open class FederatedWheelEvent () extends FederatedMouseEvent {
    def this(manager: EventService) = this()
    
    /** Units specified in lines. */
    var DOM_DELTA_LINE: `0x01` | Double = js.native
    
    /** Units specified in pages. */
    var DOM_DELTA_PAGE: `0x02` | Double = js.native
    
    /** Units specified in pixels. */
    var DOM_DELTA_PIXEL: `0x00` | Double = js.native
    
    /**
      * The units of `deltaX`, `deltaY`, and `deltaZ`. This is one of `DOM_DELTA_LINE`,
      * `DOM_DELTA_PAGE`, `DOM_DELTA_PIXEL`.
      */
    var deltaMode: Double = js.native
    
    /** Horizontal scroll amount */
    var deltaX: Double = js.native
    
    /** Vertical scroll amount */
    var deltaY: Double = js.native
    
    /** z-axis scroll amount. */
    var deltaZ: Double = js.native
  }
}
