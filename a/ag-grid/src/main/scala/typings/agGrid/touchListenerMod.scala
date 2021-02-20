package typings.agGrid

import typings.agGrid.eventsMod.AgEvent
import typings.agGrid.iEventEmitterMod.IEventEmitter
import typings.std.HTMLElement
import typings.std.Touch
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchListenerMod {
  
  @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener")
  @js.native
  class TouchListener protected () extends IEventEmitter {
    def this(eElement: HTMLElement) = this()
    def this(eElement: HTMLElement, preventMouseClick: Boolean) = this()
    
    /* private */ def checkForDoubleTap(): js.Any = js.native
    
    def destroy(): Unit = js.native
    
    var destroyFuncs: js.Any = js.native
    
    var eElement: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    /* private */ def getActiveTouch(touchList: js.Any): js.Any = js.native
    
    var lastTapTime: js.Any = js.native
    
    var moved: js.Any = js.native
    
    /* private */ def onTouchEnd(touchEvent: js.Any): js.Any = js.native
    
    /* private */ def onTouchMove(touchEvent: js.Any): js.Any = js.native
    
    /* private */ def onTouchStart(touchEvent: js.Any): js.Any = js.native
    
    var preventMouseClick: js.Any = js.native
    
    var touchStart: js.Any = js.native
    
    var touching: js.Any = js.native
  }
  /* static members */
  object TouchListener {
    
    @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener.DOUBLE_TAP_MILLIS")
    @js.native
    def DOUBLE_TAP_MILLIS: js.Any = js.native
    @scala.inline
    def DOUBLE_TAP_MILLIS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_TAP_MILLIS")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener.EVENT_DOUBLE_TAP")
    @js.native
    def EVENT_DOUBLE_TAP: String = js.native
    @scala.inline
    def EVENT_DOUBLE_TAP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_DOUBLE_TAP")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener.EVENT_LONG_TAP")
    @js.native
    def EVENT_LONG_TAP: String = js.native
    @scala.inline
    def EVENT_LONG_TAP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_LONG_TAP")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener.EVENT_TAP")
    @js.native
    def EVENT_TAP: String = js.native
    @scala.inline
    def EVENT_TAP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_TAP")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LongTapEvent extends AgEvent {
    
    var touchEvent: TouchEvent = js.native
    
    var touchStart: Touch = js.native
  }
  object LongTapEvent {
    
    @scala.inline
    def apply(touchEvent: TouchEvent, touchStart: Touch, `type`: String): LongTapEvent = {
      val __obj = js.Dynamic.literal(touchEvent = touchEvent.asInstanceOf[js.Any], touchStart = touchStart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LongTapEvent]
    }
    
    @scala.inline
    implicit class LongTapEventMutableBuilder[Self <: LongTapEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTouchEvent(value: TouchEvent): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchStart(value: Touch): Self = StObject.set(x, "touchStart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TapEvent extends AgEvent {
    
    var touchStart: Touch = js.native
  }
  object TapEvent {
    
    @scala.inline
    def apply(touchStart: Touch, `type`: String): TapEvent = {
      val __obj = js.Dynamic.literal(touchStart = touchStart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TapEvent]
    }
    
    @scala.inline
    implicit class TapEventMutableBuilder[Self <: TapEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTouchStart(value: Touch): Self = StObject.set(x, "touchStart", value.asInstanceOf[js.Any])
    }
  }
}
