package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View
import typings.androiduix.android.view.animation.Interpolator
import typings.androiduix.java_.util.ArrayList
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.AbsListView")
@js.native
abstract class AbsListView protected ()
  extends typings.androiduix.android.widget.AbsListView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
object AbsListView {
  
  @JSGlobal("android.widget.AbsListView")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("android.widget.AbsListView.AdapterDataSetObserver")
  @js.native
  class AdapterDataSetObserver protected ()
    extends typings.androiduix.android.widget.AbsListView.AdapterDataSetObserver {
    def this(arg: js.Any) = this()
  }
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.CHECK_POSITION_SEARCH_DISTANCE")
  @js.native
  def CHECK_POSITION_SEARCH_DISTANCE: js.Any = js.native
  @scala.inline
  def CHECK_POSITION_SEARCH_DISTANCE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECK_POSITION_SEARCH_DISTANCE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.CHOICE_MODE_MULTIPLE")
  @js.native
  def CHOICE_MODE_MULTIPLE: Double = js.native
  @scala.inline
  def CHOICE_MODE_MULTIPLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHOICE_MODE_MULTIPLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.CHOICE_MODE_MULTIPLE_MODAL")
  @js.native
  def CHOICE_MODE_MULTIPLE_MODAL: Double = js.native
  @scala.inline
  def CHOICE_MODE_MULTIPLE_MODAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHOICE_MODE_MULTIPLE_MODAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.CHOICE_MODE_NONE")
  @js.native
  def CHOICE_MODE_NONE: Double = js.native
  @scala.inline
  def CHOICE_MODE_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHOICE_MODE_NONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.CHOICE_MODE_SINGLE")
  @js.native
  def CHOICE_MODE_SINGLE: Double = js.native
  @scala.inline
  def CHOICE_MODE_SINGLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHOICE_MODE_SINGLE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.AbsListView.CheckForKeyLongPress")
  @js.native
  class CheckForKeyLongPress protected ()
    extends typings.androiduix.android.widget.AbsListView.CheckForKeyLongPress {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  
  @JSGlobal("android.widget.AbsListView.CheckForLongPress")
  @js.native
  class CheckForLongPress protected ()
    extends typings.androiduix.android.widget.AbsListView.CheckForLongPress {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  
  @JSGlobal("android.widget.AbsListView.CheckForTap")
  @js.native
  class CheckForTap protected ()
    extends typings.androiduix.android.widget.AbsListView.CheckForTap {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  
  @JSGlobal("android.widget.AbsListView.FlingRunnable")
  @js.native
  class FlingRunnable protected ()
    extends typings.androiduix.android.widget.AbsListView.FlingRunnable {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  object FlingRunnable {
    
    @JSGlobal("android.widget.AbsListView.FlingRunnable")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.widget.AbsListView.FlingRunnable.FLYWHEEL_TIMEOUT")
    @js.native
    def FLYWHEEL_TIMEOUT: Double = js.native
    @scala.inline
    def FLYWHEEL_TIMEOUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLYWHEEL_TIMEOUT")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.INVALID_POINTER")
  @js.native
  def INVALID_POINTER: Double = js.native
  @scala.inline
  def INVALID_POINTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_POINTER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.LAYOUT_FORCE_BOTTOM")
  @js.native
  def LAYOUT_FORCE_BOTTOM: Double = js.native
  @scala.inline
  def LAYOUT_FORCE_BOTTOM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_FORCE_BOTTOM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.LAYOUT_FORCE_TOP")
  @js.native
  def LAYOUT_FORCE_TOP: Double = js.native
  @scala.inline
  def LAYOUT_FORCE_TOP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_FORCE_TOP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.LAYOUT_MOVE_SELECTION")
  @js.native
  def LAYOUT_MOVE_SELECTION: Double = js.native
  @scala.inline
  def LAYOUT_MOVE_SELECTION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_MOVE_SELECTION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.LAYOUT_NORMAL")
  @js.native
  def LAYOUT_NORMAL: Double = js.native
  @scala.inline
  def LAYOUT_NORMAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_NORMAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.LAYOUT_SET_SELECTION")
  @js.native
  def LAYOUT_SET_SELECTION: Double = js.native
  @scala.inline
  def LAYOUT_SET_SELECTION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_SET_SELECTION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.LAYOUT_SPECIFIC")
  @js.native
  def LAYOUT_SPECIFIC: Double = js.native
  @scala.inline
  def LAYOUT_SPECIFIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_SPECIFIC")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.LAYOUT_SYNC")
  @js.native
  def LAYOUT_SYNC: Double = js.native
  @scala.inline
  def LAYOUT_SYNC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_SYNC")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.AbsListView.LayoutParams")
  @js.native
  class LayoutParams protected ()
    extends typings.androiduix.android.widget.AbsListView.LayoutParams {
    def this(source: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(w: Double, h: Double) = this()
    def this(w: Double, h: Double, viewType: Double) = this()
  }
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.OVERSCROLL_LIMIT_DIVISOR")
  @js.native
  def OVERSCROLL_LIMIT_DIVISOR: js.Any = js.native
  @scala.inline
  def OVERSCROLL_LIMIT_DIVISOR_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OVERSCROLL_LIMIT_DIVISOR")(x.asInstanceOf[js.Any])
  
  object OnScrollListener {
    
    @JSGlobal("android.widget.AbsListView.OnScrollListener")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("android.widget.AbsListView.OnScrollListener.SCROLL_STATE_FLING")
    @js.native
    def SCROLL_STATE_FLING: Double = js.native
    @scala.inline
    def SCROLL_STATE_FLING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_STATE_FLING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.widget.AbsListView.OnScrollListener.SCROLL_STATE_IDLE")
    @js.native
    def SCROLL_STATE_IDLE: Double = js.native
    @scala.inline
    def SCROLL_STATE_IDLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_STATE_IDLE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.widget.AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL")
    @js.native
    def SCROLL_STATE_TOUCH_SCROLL: Double = js.native
    @scala.inline
    def SCROLL_STATE_TOUCH_SCROLL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_STATE_TOUCH_SCROLL")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.PROFILE_FLINGING")
  @js.native
  def PROFILE_FLINGING: Boolean = js.native
  @scala.inline
  def PROFILE_FLINGING_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROFILE_FLINGING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.PROFILE_SCROLLING")
  @js.native
  def PROFILE_SCROLLING: js.Any = js.native
  @scala.inline
  def PROFILE_SCROLLING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROFILE_SCROLLING")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.AbsListView.PerformClick")
  @js.native
  class PerformClick protected ()
    extends typings.androiduix.android.widget.AbsListView.PerformClick {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  
  @JSGlobal("android.widget.AbsListView.PositionScroller")
  @js.native
  class PositionScroller protected ()
    extends typings.androiduix.android.widget.AbsListView.PositionScroller {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  object PositionScroller {
    
    @JSGlobal("android.widget.AbsListView.PositionScroller")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.widget.AbsListView.PositionScroller.MOVE_DOWN_BOUND")
    @js.native
    def MOVE_DOWN_BOUND: js.Any = js.native
    @scala.inline
    def MOVE_DOWN_BOUND_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOVE_DOWN_BOUND")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.AbsListView.PositionScroller.MOVE_DOWN_POS")
    @js.native
    def MOVE_DOWN_POS: js.Any = js.native
    @scala.inline
    def MOVE_DOWN_POS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOVE_DOWN_POS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.AbsListView.PositionScroller.MOVE_OFFSET")
    @js.native
    def MOVE_OFFSET: js.Any = js.native
    @scala.inline
    def MOVE_OFFSET_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOVE_OFFSET")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.AbsListView.PositionScroller.MOVE_UP_BOUND")
    @js.native
    def MOVE_UP_BOUND: js.Any = js.native
    @scala.inline
    def MOVE_UP_BOUND_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOVE_UP_BOUND")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.AbsListView.PositionScroller.MOVE_UP_POS")
    @js.native
    def MOVE_UP_POS: js.Any = js.native
    @scala.inline
    def MOVE_UP_POS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOVE_UP_POS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.AbsListView.PositionScroller.SCROLL_DURATION")
    @js.native
    def SCROLL_DURATION: js.Any = js.native
    @scala.inline
    def SCROLL_DURATION_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_DURATION")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.widget.AbsListView.RecycleBin")
  @js.native
  class RecycleBin protected ()
    extends typings.androiduix.android.widget.AbsListView.RecycleBin {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TAG_AbsListView")
  @js.native
  def TAGAbsListView: String = js.native
  
  @scala.inline
  def TAGAbsListView_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG_AbsListView")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TOUCH_MODE_DONE_WAITING")
  @js.native
  def TOUCH_MODE_DONE_WAITING: Double = js.native
  @scala.inline
  def TOUCH_MODE_DONE_WAITING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MODE_DONE_WAITING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TOUCH_MODE_DOWN")
  @js.native
  def TOUCH_MODE_DOWN: Double = js.native
  @scala.inline
  def TOUCH_MODE_DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MODE_DOWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TOUCH_MODE_FLING")
  @js.native
  def TOUCH_MODE_FLING: Double = js.native
  @scala.inline
  def TOUCH_MODE_FLING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MODE_FLING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TOUCH_MODE_OFF")
  @js.native
  def TOUCH_MODE_OFF: js.Any = js.native
  @scala.inline
  def TOUCH_MODE_OFF_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MODE_OFF")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TOUCH_MODE_ON")
  @js.native
  def TOUCH_MODE_ON: js.Any = js.native
  @scala.inline
  def TOUCH_MODE_ON_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MODE_ON")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TOUCH_MODE_OVERFLING")
  @js.native
  def TOUCH_MODE_OVERFLING: Double = js.native
  @scala.inline
  def TOUCH_MODE_OVERFLING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MODE_OVERFLING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TOUCH_MODE_OVERSCROLL")
  @js.native
  def TOUCH_MODE_OVERSCROLL: js.Any = js.native
  @scala.inline
  def TOUCH_MODE_OVERSCROLL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MODE_OVERSCROLL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TOUCH_MODE_REST")
  @js.native
  def TOUCH_MODE_REST: Double = js.native
  @scala.inline
  def TOUCH_MODE_REST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MODE_REST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TOUCH_MODE_SCROLL")
  @js.native
  def TOUCH_MODE_SCROLL: Double = js.native
  @scala.inline
  def TOUCH_MODE_SCROLL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MODE_SCROLL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TOUCH_MODE_TAP")
  @js.native
  def TOUCH_MODE_TAP: Double = js.native
  @scala.inline
  def TOUCH_MODE_TAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MODE_TAP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TOUCH_MODE_UNKNOWN")
  @js.native
  def TOUCH_MODE_UNKNOWN: js.Any = js.native
  @scala.inline
  def TOUCH_MODE_UNKNOWN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MODE_UNKNOWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TRANSCRIPT_MODE_ALWAYS_SCROLL")
  @js.native
  def TRANSCRIPT_MODE_ALWAYS_SCROLL: Double = js.native
  @scala.inline
  def TRANSCRIPT_MODE_ALWAYS_SCROLL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSCRIPT_MODE_ALWAYS_SCROLL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TRANSCRIPT_MODE_DISABLED")
  @js.native
  def TRANSCRIPT_MODE_DISABLED: Double = js.native
  @scala.inline
  def TRANSCRIPT_MODE_DISABLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSCRIPT_MODE_DISABLED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.TRANSCRIPT_MODE_NORMAL")
  @js.native
  def TRANSCRIPT_MODE_NORMAL: Double = js.native
  @scala.inline
  def TRANSCRIPT_MODE_NORMAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSCRIPT_MODE_NORMAL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.AbsListView.WindowRunnnable")
  @js.native
  class WindowRunnnable protected ()
    extends typings.androiduix.android.widget.AbsListView.WindowRunnnable {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.getDistance")
  @js.native
  def getDistance(source: Rect, dest: Rect, direction: Double): Double = js.native
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.retrieveFromScrap")
  @js.native
  def retrieveFromScrap(scrapViews: ArrayList[View], position: Double): View = js.native
  
  /* static member */
  @JSGlobal("android.widget.AbsListView.sLinearInterpolator")
  @js.native
  def sLinearInterpolator: Interpolator = js.native
  @scala.inline
  def sLinearInterpolator_=(x: Interpolator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sLinearInterpolator")(x.asInstanceOf[js.Any])
}
