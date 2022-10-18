package typings.antvG2

import typings.antvG2.libChartControllerBaseMod.Controller
import typings.antvG2.libChartViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartControllerGestureMod {
  
  @JSImport("@antv/g2/lib/chart/controller/gesture", JSImport.Default)
  @js.native
  open class default protected () extends GestureController {
    def this(view: View) = this()
  }
  
  @js.native
  trait GestureController extends Controller[Any] {
    
    /* private */ var canvas: Any = js.native
    
    /* private */ var center: Any = js.native
    
    /* private */ var clearPressTimeout: Any = js.native
    
    /* private */ var delegateEvent: Any = js.native
    
    /* private */ var direction: Any = js.native
    
    /* private */ var emitEnd: Any = js.native
    
    /* private */ var emitEvent: Any = js.native
    
    /* private */ var emitStart: Any = js.native
    
    /* private */ var enable: Any = js.native
    
    /* private */ var eventType: Any = js.native
    
    /* private */ var getEventType: Any = js.native
    
    /* private */ var isProcess: Any = js.native
    
    /* private */ var lastMovePoints: Any = js.native
    
    /* private */ var lastMoveTime: Any = js.native
    
    /* private */ var offEvent: Any = js.native
    
    /* private */ var pressTimeout: Any = js.native
    
    /* private */ var prevMovePoints: Any = js.native
    
    /* private */ var prevMoveTime: Any = js.native
    
    /* private */ var processEvent: Any = js.native
    
    /* private */ var reset: Any = js.native
    
    /* private */ var startDistance: Any = js.native
    
    /* private */ var startPoints: Any = js.native
    
    /* private */ var startTime: Any = js.native
    
    /* private */ var touchEnd: Any = js.native
    
    /* private */ var touchMove: Any = js.native
    
    /* private */ var touchStart: Any = js.native
  }
}
