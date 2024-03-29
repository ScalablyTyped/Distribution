package typings.agGrid

import typings.agGrid.eventsMod.AgEvent
import typings.agGrid.iEventEmitterMod.IEventEmitter
import typings.std.HTMLElement
import typings.std.Touch
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchListenerMod {
  
  @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener")
  @js.native
  class TouchListener protected ()
    extends StObject
       with IEventEmitter {
    def this(eElement: HTMLElement) = this()
    def this(eElement: HTMLElement, preventMouseClick: Boolean) = this()
    
    /* private */ def checkForDoubleTap(): js.Any = js.native
    
    def destroy(): Unit = js.native
    
    /* private */ var destroyFuncs: js.Any = js.native
    
    /* private */ var eElement: js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /* private */ def getActiveTouch(touchList: js.Any): js.Any = js.native
    
    /* private */ var lastTapTime: js.Any = js.native
    
    /* private */ var moved: js.Any = js.native
    
    /* private */ def onTouchEnd(touchEvent: js.Any): js.Any = js.native
    
    /* private */ def onTouchMove(touchEvent: js.Any): js.Any = js.native
    
    /* private */ def onTouchStart(touchEvent: js.Any): js.Any = js.native
    
    /* private */ var preventMouseClick: js.Any = js.native
    
    /* private */ var touchStart: js.Any = js.native
    
    /* private */ var touching: js.Any = js.native
  }
  /* static members */
  object TouchListener {
    
    @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener.DOUBLE_TAP_MILLIS")
    @js.native
    def DOUBLE_TAP_MILLIS: js.Any = js.native
    inline def DOUBLE_TAP_MILLIS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_TAP_MILLIS")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener.EVENT_DOUBLE_TAP")
    @js.native
    def EVENT_DOUBLE_TAP: String = js.native
    inline def EVENT_DOUBLE_TAP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_DOUBLE_TAP")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener.EVENT_LONG_TAP")
    @js.native
    def EVENT_LONG_TAP: String = js.native
    inline def EVENT_LONG_TAP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_LONG_TAP")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener.EVENT_TAP")
    @js.native
    def EVENT_TAP: String = js.native
    inline def EVENT_TAP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_TAP")(x.asInstanceOf[js.Any])
  }
  
  trait LongTapEvent
    extends StObject
       with AgEvent {
    
    var touchEvent: TouchEvent
    
    var touchStart: Touch
  }
  object LongTapEvent {
    
    inline def apply(touchEvent: TouchEvent, touchStart: Touch, `type`: String): LongTapEvent = {
      val __obj = js.Dynamic.literal(touchEvent = touchEvent.asInstanceOf[js.Any], touchStart = touchStart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LongTapEvent]
    }
    
    extension [Self <: LongTapEvent](x: Self) {
      
      inline def setTouchEvent(value: TouchEvent): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
      
      inline def setTouchStart(value: Touch): Self = StObject.set(x, "touchStart", value.asInstanceOf[js.Any])
    }
  }
  
  trait TapEvent
    extends StObject
       with AgEvent {
    
    var touchStart: Touch
  }
  object TapEvent {
    
    inline def apply(touchStart: Touch, `type`: String): TapEvent = {
      val __obj = js.Dynamic.literal(touchStart = touchStart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TapEvent]
    }
    
    extension [Self <: TapEvent](x: Self) {
      
      inline def setTouchStart(value: Touch): Self = StObject.set(x, "touchStart", value.asInstanceOf[js.Any])
    }
  }
}
