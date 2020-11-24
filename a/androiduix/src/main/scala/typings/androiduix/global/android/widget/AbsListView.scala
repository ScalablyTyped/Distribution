package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View
import typings.androiduix.android.view.animation.Interpolator
import typings.androiduix.java_.util.ArrayList
import typings.std.HTMLElement
import typings.std.Map
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
/* static members */
@JSGlobal("android.widget.AbsListView")
@js.native
object AbsListView extends js.Object {
  
  var CHECK_POSITION_SEARCH_DISTANCE: js.Any = js.native
  
  var CHOICE_MODE_MULTIPLE: Double = js.native
  
  var CHOICE_MODE_MULTIPLE_MODAL: Double = js.native
  
  var CHOICE_MODE_NONE: Double = js.native
  
  var CHOICE_MODE_SINGLE: Double = js.native
  
  var INVALID_POINTER: Double = js.native
  
  var LAYOUT_FORCE_BOTTOM: Double = js.native
  
  var LAYOUT_FORCE_TOP: Double = js.native
  
  var LAYOUT_MOVE_SELECTION: Double = js.native
  
  var LAYOUT_NORMAL: Double = js.native
  
  var LAYOUT_SET_SELECTION: Double = js.native
  
  var LAYOUT_SPECIFIC: Double = js.native
  
  var LAYOUT_SYNC: Double = js.native
  
  var OVERSCROLL_LIMIT_DIVISOR: js.Any = js.native
  
  var PROFILE_FLINGING: Boolean = js.native
  
  var PROFILE_SCROLLING: js.Any = js.native
  
  var TAG_AbsListView: String = js.native
  
  var TOUCH_MODE_DONE_WAITING: Double = js.native
  
  var TOUCH_MODE_DOWN: Double = js.native
  
  var TOUCH_MODE_FLING: Double = js.native
  
  var TOUCH_MODE_OFF: js.Any = js.native
  
  var TOUCH_MODE_ON: js.Any = js.native
  
  var TOUCH_MODE_OVERFLING: Double = js.native
  
  var TOUCH_MODE_OVERSCROLL: js.Any = js.native
  
  var TOUCH_MODE_REST: Double = js.native
  
  var TOUCH_MODE_SCROLL: Double = js.native
  
  var TOUCH_MODE_TAP: Double = js.native
  
  var TOUCH_MODE_UNKNOWN: js.Any = js.native
  
  var TRANSCRIPT_MODE_ALWAYS_SCROLL: Double = js.native
  
  var TRANSCRIPT_MODE_DISABLED: Double = js.native
  
  var TRANSCRIPT_MODE_NORMAL: Double = js.native
  
  def getDistance(source: Rect, dest: Rect, direction: Double): Double = js.native
  
  def retrieveFromScrap(scrapViews: ArrayList[View], position: Double): View = js.native
  
  var sLinearInterpolator: Interpolator = js.native
  
  @js.native
  class AdapterDataSetObserver protected ()
    extends typings.androiduix.android.widget.AbsListView.AdapterDataSetObserver {
    def this(arg: js.Any) = this()
  }
  
  @js.native
  class CheckForKeyLongPress protected ()
    extends typings.androiduix.android.widget.AbsListView.CheckForKeyLongPress {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  
  @js.native
  class CheckForLongPress protected ()
    extends typings.androiduix.android.widget.AbsListView.CheckForLongPress {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  
  @js.native
  class CheckForTap protected ()
    extends typings.androiduix.android.widget.AbsListView.CheckForTap {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  
  @js.native
  class FlingRunnable protected ()
    extends typings.androiduix.android.widget.AbsListView.FlingRunnable {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  /* static members */
  @js.native
  object FlingRunnable extends js.Object {
    
    var FLYWHEEL_TIMEOUT: Double = js.native
  }
  
  @js.native
  class LayoutParams protected ()
    extends typings.androiduix.android.widget.AbsListView.LayoutParams {
    def this(source: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(w: Double, h: Double) = this()
    def this(w: Double, h: Double, viewType: Double) = this()
  }
  
  @js.native
  object OnScrollListener extends js.Object {
    
    var SCROLL_STATE_FLING: Double = js.native
    
    var SCROLL_STATE_IDLE: Double = js.native
    
    var SCROLL_STATE_TOUCH_SCROLL: Double = js.native
  }
  
  @js.native
  class PerformClick protected ()
    extends typings.androiduix.android.widget.AbsListView.PerformClick {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  
  @js.native
  class PositionScroller protected ()
    extends typings.androiduix.android.widget.AbsListView.PositionScroller {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  /* static members */
  @js.native
  object PositionScroller extends js.Object {
    
    var MOVE_DOWN_BOUND: js.Any = js.native
    
    var MOVE_DOWN_POS: js.Any = js.native
    
    var MOVE_OFFSET: js.Any = js.native
    
    var MOVE_UP_BOUND: js.Any = js.native
    
    var MOVE_UP_POS: js.Any = js.native
    
    var SCROLL_DURATION: js.Any = js.native
  }
  
  @js.native
  class RecycleBin protected ()
    extends typings.androiduix.android.widget.AbsListView.RecycleBin {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
  
  @js.native
  class WindowRunnnable protected ()
    extends typings.androiduix.android.widget.AbsListView.WindowRunnnable {
    def this(arg: typings.androiduix.android.widget.AbsListView) = this()
  }
}
