package typings.antvG2.constantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PLOT_EVENTS extends StObject
@JSImport("@antv/g2/lib/constant", "PLOT_EVENTS")
@js.native
object PLOT_EVENTS extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PLOT_EVENTS & String] = js.native
  
  @js.native
  sealed trait CLICK
    extends StObject
       with PLOT_EVENTS
  /* "plot:click" */ val CLICK: typings.antvG2.constantMod.PLOT_EVENTS.CLICK & String = js.native
  
  @js.native
  sealed trait CONTEXTMENU
    extends StObject
       with PLOT_EVENTS
  /* "plot:contextmenu" */ val CONTEXTMENU: typings.antvG2.constantMod.PLOT_EVENTS.CONTEXTMENU & String = js.native
  
  @js.native
  sealed trait DBLCLICK
    extends StObject
       with PLOT_EVENTS
  /* "plot:dblclick" */ val DBLCLICK: typings.antvG2.constantMod.PLOT_EVENTS.DBLCLICK & String = js.native
  
  @js.native
  sealed trait ENTER
    extends StObject
       with PLOT_EVENTS
  /* "plot:enter" */ val ENTER: typings.antvG2.constantMod.PLOT_EVENTS.ENTER & String = js.native
  
  @js.native
  sealed trait LEAVE
    extends StObject
       with PLOT_EVENTS
  /* "plot:leave" */ val LEAVE: typings.antvG2.constantMod.PLOT_EVENTS.LEAVE & String = js.native
  
  @js.native
  sealed trait MOUSE_DOWN
    extends StObject
       with PLOT_EVENTS
  /* "plot:mousedown" */ val MOUSE_DOWN: typings.antvG2.constantMod.PLOT_EVENTS.MOUSE_DOWN & String = js.native
  
  @js.native
  sealed trait MOUSE_ENTER
    extends StObject
       with PLOT_EVENTS
  /* "plot:mouseenter" */ val MOUSE_ENTER: typings.antvG2.constantMod.PLOT_EVENTS.MOUSE_ENTER & String = js.native
  
  @js.native
  sealed trait MOUSE_LEAVE
    extends StObject
       with PLOT_EVENTS
  /* "plot:mouseleave" */ val MOUSE_LEAVE: typings.antvG2.constantMod.PLOT_EVENTS.MOUSE_LEAVE & String = js.native
  
  @js.native
  sealed trait MOUSE_MOVE
    extends StObject
       with PLOT_EVENTS
  /* "plot:mousemove" */ val MOUSE_MOVE: typings.antvG2.constantMod.PLOT_EVENTS.MOUSE_MOVE & String = js.native
  
  @js.native
  sealed trait MOUSE_UP
    extends StObject
       with PLOT_EVENTS
  /* "plot:mouseup" */ val MOUSE_UP: typings.antvG2.constantMod.PLOT_EVENTS.MOUSE_UP & String = js.native
  
  @js.native
  sealed trait TOUCH_CANCEL
    extends StObject
       with PLOT_EVENTS
  /* "plot:touchcancel" */ val TOUCH_CANCEL: typings.antvG2.constantMod.PLOT_EVENTS.TOUCH_CANCEL & String = js.native
  
  @js.native
  sealed trait TOUCH_END
    extends StObject
       with PLOT_EVENTS
  /* "plot:touchend" */ val TOUCH_END: typings.antvG2.constantMod.PLOT_EVENTS.TOUCH_END & String = js.native
  
  @js.native
  sealed trait TOUCH_MOVE
    extends StObject
       with PLOT_EVENTS
  /* "plot:touchmove" */ val TOUCH_MOVE: typings.antvG2.constantMod.PLOT_EVENTS.TOUCH_MOVE & String = js.native
  
  @js.native
  sealed trait TOUCH_START
    extends StObject
       with PLOT_EVENTS
  /* "plot:touchstart" */ val TOUCH_START: typings.antvG2.constantMod.PLOT_EVENTS.TOUCH_START & String = js.native
}
