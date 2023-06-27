package typings.antvGLite

import typings.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typings.antvGLite.distDomFederatedEventMod.FederatedEvent
import typings.antvGLite.distServicesMod.EventService
import typings.antvGLite.distShapesPointMod.Point
import typings.std.EventTarget
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomFederatedMouseEventMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.Event because var conflicts: AT_TARGET, BUBBLING_PHASE, CAPTURING_PHASE, NONE, bubbles, cancelBubble, currentTarget, defaultPrevented, eventPhase, isTrusted, returnValue, srcElement, target, timeStamp, `type`. Inlined 
  - typings.std.UIEvent because var conflicts: AT_TARGET, BUBBLING_PHASE, CAPTURING_PHASE, NONE, bubbles, cancelBubble, currentTarget, defaultPrevented, detail, eventPhase, isTrusted, returnValue, srcElement, target, timeStamp, `type`, view, which. Inlined 
  - typings.std.MouseEvent because var conflicts: AT_TARGET, BUBBLING_PHASE, CAPTURING_PHASE, NONE, bubbles, cancelBubble, currentTarget, defaultPrevented, detail, eventPhase, isTrusted, pageX, pageY, returnValue, srcElement, target, timeStamp, `type`, view, which, x, y. Inlined metaKey, shiftKey, screenY, altKey, offsetX, clientY, screenX, ctrlKey, movementY, movementX, buttons, button, offsetY, clientX, relatedTarget, getModifierState, initMouseEvent, initMouseEvent */ @JSImport("@antv/g-lite/dist/dom/FederatedMouseEvent", "FederatedMouseEvent")
  @js.native
  /**
    * The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  open class FederatedMouseEvent () extends FederatedEvent[MouseEvent | PointerEvent | TouchEvent, Any] {
    def this(manager: EventService) = this()
    
    /** Whether the "alt" key was pressed when this mouse event occurred. */
    var altKey: Boolean = js.native
    
    /** The specific button that was pressed in this mouse event. */
    var button: Double = js.native
    
    /** The button depressed when this event occurred. */
    var buttons: Double = js.native
    
    /**
      * The coordinates of the mouse event relative to the canvas.
      */
    var client: Point = js.native
    
    def clientX: Double = js.native
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/clientX) */
    /* standard dom */
    @JSName("clientX")
    val clientX_FFederatedMouseEvent: Double = js.native
    
    def clientY: Double = js.native
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/clientY) */
    /* standard dom */
    @JSName("clientY")
    val clientY_FFederatedMouseEvent: Double = js.native
    
    /** Whether the "control" key was pressed when this mouse event occurred. */
    var ctrlKey: Boolean = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/getModifierState) */
    /* standard dom */
    def getModifierState(key: String): Boolean = js.native
    
    /**
      * The pointer coordinates in world space.
      */
    var global: Point = js.native
    
    def globalX: Double = js.native
    
    def globalY: Double = js.native
    
    def initMouseEvent(): Unit = js.native
    /**
      * @deprecated
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/initMouseEvent)
      */
    /* standard dom */
    def initMouseEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      viewArg: Window,
      detailArg: Double,
      screenXArg: Double,
      screenYArg: Double,
      clientXArg: Double,
      clientYArg: Double,
      ctrlKeyArg: Boolean,
      altKeyArg: Boolean,
      shiftKeyArg: Boolean,
      metaKeyArg: Boolean,
      buttonArg: Double
    ): Unit = js.native
    def initMouseEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      viewArg: Window,
      detailArg: Double,
      screenXArg: Double,
      screenYArg: Double,
      clientXArg: Double,
      clientYArg: Double,
      ctrlKeyArg: Boolean,
      altKeyArg: Boolean,
      shiftKeyArg: Boolean,
      metaKeyArg: Boolean,
      buttonArg: Double,
      relatedTargetArg: EventTarget
    ): Unit = js.native
    
    /** Whether the "meta" key was pressed when this mouse event occurred. */
    var metaKey: Boolean = js.native
    
    /**
      * The movement in this pointer relative to the last `mousemove` event.
      */
    var movement: Point = js.native
    
    def movementX: Double = js.native
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/movementX) */
    /* standard dom */
    @JSName("movementX")
    val movementX_FFederatedMouseEvent: Double = js.native
    
    def movementY: Double = js.native
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/movementY) */
    /* standard dom */
    @JSName("movementY")
    val movementY_FFederatedMouseEvent: Double = js.native
    
    /**
      * The offset of the pointer coordinates w.r.t. target DisplayObject in world space. This is
      * not supported at the moment.
      */
    var offset: Point = js.native
    
    def offsetX: Double = js.native
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/offsetX) */
    /* standard dom */
    @JSName("offsetX")
    val offsetX_FFederatedMouseEvent: Double = js.native
    
    def offsetY: Double = js.native
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/offsetY) */
    /* standard dom */
    @JSName("offsetY")
    val offsetY_FFederatedMouseEvent: Double = js.native
    
    /** This is currently not implemented in the Federated Events API. */
    var relatedTarget: (DisplayObject[Any, Any]) | EventTarget | Null = js.native
    
    /**
      * The pointer coordinates in sceen space.
      */
    var screen: Point = js.native
    
    def screenX: Double = js.native
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/screenX) */
    /* standard dom */
    @JSName("screenX")
    val screenX_FFederatedMouseEvent: Double = js.native
    
    def screenY: Double = js.native
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/screenY) */
    /* standard dom */
    @JSName("screenY")
    val screenY_FFederatedMouseEvent: Double = js.native
    
    /** Whether the "shift" key was pressed when this mouse event occurred. */
    var shiftKey: Boolean = js.native
  }
}
