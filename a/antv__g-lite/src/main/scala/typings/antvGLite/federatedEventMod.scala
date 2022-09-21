package typings.antvGLite

import typings.antvGLite.domInterfacesMod.IEventTarget
import typings.antvGLite.pointMod.Point
import typings.antvGLite.servicesMod.EventService
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object federatedEventMod {
  
  @JSImport("@antv/g-lite/dist/dom/FederatedEvent", "FederatedEvent")
  @js.native
  /**
    * The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  open class FederatedEvent[N /* <: Event */, T] () extends StObject {
    def this(manager: EventService) = this()
    
    var AT_TARGET: Double = js.native
    
    var BUBBLING_PHASE: Double = js.native
    
    var CAPTURING_PHASE: Double = js.native
    
    var NONE: Double = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Event/bubbles
      */
    var bubbles: Boolean = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Event/cancelBubble
      */
    var cancelBubble: Boolean = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Event/cancelable
      */
    val cancelable: /* false */ Boolean = js.native
    
    /**
      * relative to Canvas, origin is left-top
      */
    var canvas: Point = js.native
    
    def canvasX: Double = js.native
    
    def canvasY: Double = js.native
    
    val composed: /* false */ Boolean = js.native
    
    /**
      * The propagation path for this event
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Event/composedPath
      *
      * So composedPath()[0] represents the original target.
      * @see https://polymer-library.polymer-project.org/3.0/docs/devguide/events#retargeting
      */
    def composedPath(): js.Array[IEventTarget] = js.native
    
    /** the event target when listeners binded */
    var currentTarget: IEventTarget | Null = js.native
    
    /** Flags whether the default response of the user agent was prevent through this event. */
    var defaultPrevented: Boolean = js.native
    
    /** Event-specific detail */
    var detail: T = js.native
    
    /**
      * The propagation phase.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Event/eventPhase
      */
    var eventPhase: Double = js.native
    
    /**
      * added for compatibility with DOM Event,
      * deprecated props and methods
      */
    def initEvent(): Unit = js.native
    
    def initUIEvent(): Unit = js.native
    
    var isTrusted: Boolean = js.native
    
    /**
      * The coordinates of the evnet relative to the nearest DOM layer.
      * This is a non-standard property.
      */
    var layer: Point = js.native
    
    def layerX: Double = js.native
    
    def layerY: Double = js.native
    
    var manager: EventService | Null = js.native
    
    /**
      * @deprecated
      */
    def name: String = js.native
    
    /**
      * the original event.
      */
    var nativeEvent: N = js.native
    
    /** The original event that caused this event, if any. */
    var originalEvent: FederatedEvent[N, Any] = js.native
    
    /**
      * The coordinates of the event relative to the DOM document.
      * This is a non-standard property.
      * relative to the DOM document.
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/MouseEvent/pageX
      */
    var page: Point = js.native
    
    def pageX: Double = js.native
    
    def pageY: Double = js.native
    
    var path: js.Array[IEventTarget] = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Event/preventDefault
      */
    def preventDefault(): Unit = js.native
    
    /** Flags whether propagation was immediately stopped. */
    var propagationImmediatelyStopped: Boolean = js.native
    
    /**
      * @deprecated
      */
    def propagationPath: js.Array[IEventTarget] = js.native
    
    /** Flags whether propagation was stopped. */
    var propagationStopped: Boolean = js.native
    
    var returnValue: Boolean = js.native
    
    var srcElement: IEventTarget = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Event/stopImmediatePropagation
      */
    def stopImmediatePropagation(): Unit = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Event/stopPropagation
      */
    def stopPropagation(): Unit = js.native
    
    /**
      * can be used to implement event delegation
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Event/target
      */
    var target: IEventTarget | Null = js.native
    
    /**
      * timestamp when the event created
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/Event/timeStamp
      */
    var timeStamp: Double = js.native
    
    /**
      * The type of event, supports the following:
      * * pointerdown
      * * touchstart
      * * mousedown
      * * rightdown
      * * ...
      */
    var `type`: String = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/UIEvent/view
      */
    var view: Any = js.native
    
    /**
      * relative to Viewport, account for Camera
      */
    var viewport: Point = js.native
    
    def viewportX: Double = js.native
    
    def viewportY: Double = js.native
    
    var which: Double = js.native
    
    def x: Double = js.native
    
    def y: Double = js.native
  }
}
