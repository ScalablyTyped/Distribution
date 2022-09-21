package typings.antvGLite

import typings.antvGLite.federatedMouseEventMod.FederatedMouseEvent
import typings.antvGLite.servicesMod.EventService
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object federatedPointerEventMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.Event because Already inherited
  - typings.std.UIEvent because Already inherited
  - typings.std.MouseEvent because Already inherited
  - typings.std.PointerEvent because var conflicts: altKey, button, buttons, cancelBubble, clientX, clientY, ctrlKey, metaKey, movementX, movementY, offsetX, offsetY, relatedTarget, returnValue, screenX, screenY, shiftKey. Inlined isPrimary, pressure, height, pointerType, twist, width, tangentialPressure, tiltY, pointerId, tiltX, getCoalescedEvents, getPredictedEvents */ @JSImport("@antv/g-lite/dist/dom/FederatedPointerEvent", "FederatedPointerEvent")
  @js.native
  /**
    * The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  open class FederatedPointerEvent () extends FederatedMouseEvent {
    def this(manager: EventService) = this()
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/getCoalescedEvents
      */
    /** Available only in secure contexts. */
    /* standard dom */
    def getCoalescedEvents(): js.Array[PointerEvent] = js.native
    
    /**
      * @see https://chromestatus.com/feature/5765569655603200
      */
    /* standard dom */
    def getPredictedEvents(): js.Array[PointerEvent] = js.native
    
    /**
      * The height of the pointer's contact along the y-axis, measured in CSS pixels.
      * radiusY of TouchEvents will be represented by this value.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/height
      */
    var height: Double = js.native
    
    /**
      * Indicates whether or not the pointer device that created the event is the primary pointer.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/isPrimary
      */
    var isPrimary: Boolean = js.native
    
    /**
      * The unique identifier of the pointer.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/pointerId
      */
    var pointerId: Double = js.native
    
    /**
      * The type of pointer that triggered the event.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/pointerType
      */
    var pointerType: String = js.native
    
    /**
      * Pressure applied by the pointing device during the event.
      *s
      * A Touch's force property will be represented by this value.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/pressure
      */
    var pressure: Double = js.native
    
    /**
      * Barrel pressure on a stylus pointer.
      *
      * @see https://w3c.github.io/pointerevents/#pointerevent-interface
      */
    var tangentialPressure: Double = js.native
    
    /**
      * The angle, in degrees, between the pointer device and the screen.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/tiltX
      */
    var tiltX: Double = js.native
    
    /**
      * The angle, in degrees, between the pointer device and the screen.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/tiltY
      */
    var tiltY: Double = js.native
    
    /**
      * Twist of a stylus pointer.
      *
      * @see https://w3c.github.io/pointerevents/#pointerevent-interface
      */
    var twist: Double = js.native
    
    /**
      * The width of the pointer's contact along the x-axis, measured in CSS pixels.
      * radiusX of TouchEvents will be represented by this value.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent/width
      */
    var width: Double = js.native
  }
}
