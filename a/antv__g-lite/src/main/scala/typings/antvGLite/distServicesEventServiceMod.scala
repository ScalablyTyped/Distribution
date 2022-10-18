package typings.antvGLite

import typings.antvGLite.anon.Context
import typings.antvGLite.distDisplayObjectsMod.DisplayObjectPool
import typings.antvGLite.distDomFederatedEventMod.FederatedEvent
import typings.antvGLite.distDomFederatedPointerEventMod.FederatedPointerEvent
import typings.antvGLite.distDomFederatedWheelEventMod.FederatedWheelEvent
import typings.antvGLite.distDomInterfacesMod.IEventTarget
import typings.antvGLite.distServicesContextServiceMod.ContextService
import typings.antvGLite.distServicesRenderingContextMod.RenderingContext
import typings.antvGLite.distShapesPointMod.PointLike
import typings.antvGLite.distTypesMod.CanvasConfig
import typings.antvGLite.distTypesMod.Cursor
import typings.antvGLite.distTypesMod.EventPosition
import typings.std.Event
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesEventServiceMod {
  
  @JSImport("@antv/g-lite/dist/services/EventService", "EventService")
  @js.native
  open class EventService protected () extends StObject {
    def this(
      renderingContext: RenderingContext,
      contextService: ContextService[Any],
      canvasConfig: CanvasConfig,
      displayObjectPool: DisplayObjectPool
    ) = this()
    
    def addEventMapping(`type`: String, fn: js.Function1[/* e */ FederatedEvent[Event, Any], js.Promise[Unit]]): Unit = js.native
    
    /* private */ var allocateEvent: Any = js.native
    
    def canvas2Viewport(canvasP: PointLike): PointLike = js.native
    
    /* private */ var canvasConfig: Any = js.native
    
    def client2Viewport(client: PointLike): PointLike = js.native
    
    def clonePointerEvent(from: FederatedPointerEvent): FederatedPointerEvent = js.native
    def clonePointerEvent(from: FederatedPointerEvent, `type`: String): FederatedPointerEvent = js.native
    
    def cloneWheelEvent(from: FederatedWheelEvent): FederatedWheelEvent = js.native
    
    /* private */ var contextService: Any = js.native
    
    /* private */ var copyData: Any = js.native
    
    /* private */ var copyMouseData: Any = js.native
    
    /* private */ var copyPointerData: Any = js.native
    
    /* private */ var copyWheelData: Any = js.native
    
    /* private */ var createPointerEvent: Any = js.native
    
    /* private */ var createWheelEvent: Any = js.native
    
    var cursor: Cursor | Null = js.native
    
    def dispatchEvent(e: FederatedEvent[Event, Any]): Unit = js.native
    def dispatchEvent(e: FederatedEvent[Event, Any], `type`: String): Unit = js.native
    
    /* private */ var displayObjectPool: Any = js.native
    
    /* private */ var emitter: Any = js.native
    
    /* private */ var eventPool: Any = js.native
    
    /**
      * some detached nodes may exist in propagation path, need to skip them
      */
    /* private */ var findMountedTarget: Any = js.native
    
    /* private */ var freeEvent: Any = js.native
    
    /* private */ var getCursor: Any = js.native
    
    /* private */ var getExistedHTML: Any = js.native
    
    def hitTest(position: EventPosition): js.Promise[IEventTarget | Null] = js.native
    
    def init(): Unit = js.native
    
    /**
      * whether the native event trigger came from Canvas,
      * should account for HTML shape
      */
    /* private */ var isNativeEventFromCanvas: Any = js.native
    
    def mapEvent(e: FederatedEvent[Event, Any]): Unit = js.native
    
    /* private */ var mappingState: Any = js.native
    
    /* private */ var mappingTable: Any = js.native
    
    /* private */ var notifyListeners: Any = js.native
    
    /* private */ var notifyTarget: Any = js.native
    
    def onPointerDown(from: FederatedEvent[Event, Any]): js.Promise[Unit] = js.native
    
    def onPointerMove(from: FederatedEvent[Event, Any]): js.Promise[Unit] = js.native
    
    def onPointerOut(from: FederatedEvent[Event, Any]): js.Promise[Unit] = js.native
    
    def onPointerOver(from: FederatedEvent[Event, Any]): js.Promise[Unit] = js.native
    
    def onPointerUp(from: FederatedEvent[Event, Any]): js.Promise[Unit] = js.native
    
    def onPointerUpOutside(from: FederatedEvent[Event, Any]): js.Promise[Unit] = js.native
    
    def onWheel(from: FederatedEvent[Event, Any]): js.Promise[Unit] = js.native
    
    /* private */ var pickHandler: Any = js.native
    
    /* private */ var pickTarget: Any = js.native
    
    def propagate(e: FederatedEvent[Event, Any]): Unit = js.native
    def propagate(e: FederatedEvent[Event, Any], `type`: String): Unit = js.native
    
    def propagationPath(target: IEventTarget): js.Array[IEventTarget] = js.native
    
    /* private */ var renderingContext: Any = js.native
    
    /* private */ var rootTarget: Any = js.native
    
    def setPickHandler(pickHandler: Picker): Unit = js.native
    
    /* private */ var tmpMatrix: Any = js.native
    
    /* private */ var tmpVec3: Any = js.native
    
    /* private */ var trackingData: Any = js.native
    
    def viewport2Canvas(hasXY: PointLike): PointLike = js.native
    
    def viewport2Client(canvas: PointLike): PointLike = js.native
  }
  
  type EmitterListeners = Record[String, js.Array[Context] | Context]
  
  type Picker = js.Function1[/* position */ EventPosition, js.Promise[IEventTarget | Null]]
}
