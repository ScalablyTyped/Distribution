package typings.antvGBase

import typings.antvGBase.anon.ClientX
import typings.antvGBase.interfacesMod.IShape
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventContollerMod {
  
  @JSImport("@antv/g-base/lib/event/event-contoller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EventController {
    def this(cfg: Any) = this()
  }
  
  @js.native
  trait EventController extends StObject {
    
    def _afterDrag(draggingShape: Any, pointInfo: Any, event: Any): Unit = js.native
    
    def _bindEvents(): Unit = js.native
    
    def _clearEvents(): Unit = js.native
    
    def _emitDragoverEvents(event: Any, pointInfo: Any, fromShape: Any, toShape: Any, isCanvasEmit: Any): Unit = js.native
    
    def _emitEvent(`type`: Any, event: Any, pointInfo: Any, shape: Any): Unit = js.native
    def _emitEvent(`type`: Any, event: Any, pointInfo: Any, shape: Any, fromShape: Any): Unit = js.native
    def _emitEvent(`type`: Any, event: Any, pointInfo: Any, shape: Any, fromShape: Any, toShape: Any): Unit = js.native
    def _emitEvent(`type`: Any, event: Any, pointInfo: Any, shape: Any, fromShape: Unit, toShape: Any): Unit = js.native
    
    def _emitMouseoverEvents(event: Any, pointInfo: Any, fromShape: Any, toShape: Any): Unit = js.native
    
    def _eventCallback(ev: Any): Unit = js.native
    
    def _getEventObj(`type`: Any, event: Any, point: Any, target: Any, fromShape: Any, toShape: Any): typings.antvGBase.graphEventMod.default = js.native
    
    def _getPointInfo(ev: Any): ClientX = js.native
    
    def _getShape(point: Any, ev: Event): IShape = js.native
    
    def _onDocumentMouseUp(ev: Any): Unit = js.native
    
    def _onDocumentMove(ev: Event): Unit = js.native
    
    def _ondragover(pointInfo: Any, shape: Any, event: Any): Unit = js.native
    
    def _onmousedown(pointInfo: Any, shape: Any, event: Any): Unit = js.native
    
    def _onmousemove(pointInfo: Any, shape: Any, event: Any): Unit = js.native
    
    def _onmouseup(pointInfo: Any, shape: Any, event: Any): Unit = js.native
    
    def _triggerEvent(`type`: Any, ev: Any): Unit = js.native
    
    /* private */ var canvas: Any = js.native
    
    /* private */ var currentShape: Any = js.native
    
    def destroy(): Unit = js.native
    
    /* private */ var dragging: Any = js.native
    
    /* private */ var draggingShape: Any = js.native
    
    def init(): Unit = js.native
    
    /* private */ var mousedownPoint: Any = js.native
    
    /* private */ var mousedownShape: Any = js.native
    
    /* private */ var mousedownTimeStamp: Any = js.native
  }
}
