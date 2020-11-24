package typings.androiduix.global.android.view

import typings.androiduix.android.content.Context
import typings.androiduix.android.os.Handler
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.view.View")
@js.native
class View protected ()
  extends typings.androiduix.android.view.View {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyleAttr: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyleAttr: Map[String, String]) = this()
}
/* static members */
@JSGlobal("android.view.View")
@js.native
object View extends js.Object {
  
  var AndroidViewProperty: String = js.native
  
  var CLICKABLE: Double = js.native
  
  var DBG: Boolean = js.native
  
  var DISABLED: Double = js.native
  
  var DRAWING_CACHE_ENABLED: Double = js.native
  
  var DRAW_MASK: Double = js.native
  
  var DUPLICATE_PARENT_STATE: Double = js.native
  
  var EMPTY_STATE_SET: js.Array[Double] = js.native
  
  var ENABLED: Double = js.native
  
  var ENABLED_FOCUSED_SELECTED_STATE_SET: js.Array[Double] = js.native
  
  var ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var ENABLED_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var ENABLED_MASK: Double = js.native
  
  var ENABLED_SELECTED_STATE_SET: js.Array[Double] = js.native
  
  var ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var ENABLED_STATE_SET: js.Array[Double] = js.native
  
  var ENABLED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var FOCUSABLE: js.Any = js.native
  
  var FOCUSABLES_ALL: Double = js.native
  
  var FOCUSABLES_TOUCH_MODE: Double = js.native
  
  var FOCUSABLE_IN_TOUCH_MODE: js.Any = js.native
  
  var FOCUSABLE_MASK: js.Any = js.native
  
  var FOCUSED_SELECTED_STATE_SET: js.Array[Double] = js.native
  
  var FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var FOCUS_BACKWARD: Double = js.native
  
  var FOCUS_DOWN: Double = js.native
  
  var FOCUS_FORWARD: Double = js.native
  
  var FOCUS_LEFT: Double = js.native
  
  var FOCUS_RIGHT: Double = js.native
  
  var FOCUS_UP: Double = js.native
  
  var GONE: Double = js.native
  
  var INVISIBLE: Double = js.native
  
  var LAYER_TYPE_NONE: Double = js.native
  
  var LAYER_TYPE_SOFTWARE: Double = js.native
  
  var LAYOUT_DIRECTION_INHERIT: Double = js.native
  
  var LAYOUT_DIRECTION_LOCALE: Double = js.native
  
  var LAYOUT_DIRECTION_LTR: Double = js.native
  
  var LAYOUT_DIRECTION_RTL: Double = js.native
  
  var LONG_CLICKABLE: Double = js.native
  
  var MEASURED_HEIGHT_STATE_SHIFT: Double = js.native
  
  var MEASURED_SIZE_MASK: Double = js.native
  
  var MEASURED_STATE_MASK: Double = js.native
  
  var MEASURED_STATE_TOO_SMALL: Double = js.native
  
  var NOT_FOCUSABLE: js.Any = js.native
  
  var NO_ID: js.Any = js.native
  
  var OVER_SCROLL_ALWAYS: Double = js.native
  
  var OVER_SCROLL_IF_CONTENT_SCROLLS: Double = js.native
  
  var OVER_SCROLL_NEVER: Double = js.native
  
  var PFLAG2_HAS_TRANSIENT_STATE: Double = js.native
  
  var PFLAG2_VIEW_QUICK_REJECTED: Double = js.native
  
  var PFLAG3_CALLED_SUPER: Double = js.native
  
  var PFLAG3_IS_LAID_OUT: Double = js.native
  
  var PFLAG3_MEASURE_NEEDED_BEFORE_LAYOUT: Double = js.native
  
  var PFLAG3_VIEW_IS_ANIMATING_ALPHA: Double = js.native
  
  var PFLAG3_VIEW_IS_ANIMATING_TRANSFORM: Double = js.native
  
  var PFLAG_ACTIVATED: Double = js.native
  
  var PFLAG_ALPHA_SET: Double = js.native
  
  var PFLAG_ANIMATION_STARTED: Double = js.native
  
  var PFLAG_AWAKEN_SCROLL_BARS_ON_ATTACH: Double = js.native
  
  var PFLAG_CANCEL_NEXT_UP_EVENT: Double = js.native
  
  var PFLAG_DIRTY: Double = js.native
  
  var PFLAG_DIRTY_MASK: Double = js.native
  
  var PFLAG_DIRTY_OPAQUE: Double = js.native
  
  var PFLAG_DRAWABLE_STATE_DIRTY: Double = js.native
  
  var PFLAG_DRAWING_CACHE_VALID: Double = js.native
  
  var PFLAG_DRAWN: Double = js.native
  
  var PFLAG_DRAW_ANIMATION: Double = js.native
  
  var PFLAG_FOCUSED: Double = js.native
  
  var PFLAG_FORCE_LAYOUT: Double = js.native
  
  var PFLAG_HAS_BOUNDS: Double = js.native
  
  var PFLAG_HOVERED: Double = js.native
  
  var PFLAG_INVALIDATED: Double = js.native
  
  var PFLAG_IS_ROOT_NAMESPACE: Double = js.native
  
  var PFLAG_LAYOUT_REQUIRED: Double = js.native
  
  var PFLAG_MEASURED_DIMENSION_SET: Double = js.native
  
  var PFLAG_ONLY_DRAWS_BACKGROUND: Double = js.native
  
  var PFLAG_OPAQUE_BACKGROUND: Double = js.native
  
  var PFLAG_OPAQUE_MASK: Double = js.native
  
  var PFLAG_OPAQUE_SCROLLBARS: Double = js.native
  
  var PFLAG_PIVOT_EXPLICITLY_SET: Double = js.native
  
  var PFLAG_PREPRESSED: Double = js.native
  
  var PFLAG_PRESSED: Double = js.native
  
  var PFLAG_REQUEST_TRANSPARENT_REGIONS: Double = js.native
  
  var PFLAG_SCROLL_CONTAINER: Double = js.native
  
  var PFLAG_SCROLL_CONTAINER_ADDED: Double = js.native
  
  var PFLAG_SELECTED: Double = js.native
  
  var PFLAG_SKIP_DRAW: Double = js.native
  
  var PFLAG_WANTS_FOCUS: Double = js.native
  
  var PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_ENABLED_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_ENABLED_SELECTED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_ENABLED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_FOCUSED_SELECTED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_SELECTED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_STATE_SET: js.Array[Double] = js.native
  
  var PRESSED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var SCROLLBARS_HORIZONTAL: Double = js.native
  
  var SCROLLBARS_MASK: Double = js.native
  
  var SCROLLBARS_NONE: Double = js.native
  
  var SCROLLBARS_VERTICAL: Double = js.native
  
  var SELECTED_STATE_SET: js.Array[Double] = js.native
  
  var SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  var TEXT_ALIGNMENT_CENTER: Double = js.native
  
  var TEXT_ALIGNMENT_DEFAULT: js.Any = js.native
  
  var TEXT_ALIGNMENT_GRAVITY: Double = js.native
  
  var TEXT_ALIGNMENT_INHERIT: Double = js.native
  
  var TEXT_ALIGNMENT_RESOLVED_DEFAULT: Double = js.native
  
  var TEXT_ALIGNMENT_TEXT_END: Double = js.native
  
  var TEXT_ALIGNMENT_TEXT_START: Double = js.native
  
  var TEXT_ALIGNMENT_VIEW_END: Double = js.native
  
  var TEXT_ALIGNMENT_VIEW_START: Double = js.native
  
  var TEXT_DIRECTION_ANY_RTL: Double = js.native
  
  var TEXT_DIRECTION_DEFAULT: js.Any = js.native
  
  var TEXT_DIRECTION_FIRST_STRONG: Double = js.native
  
  var TEXT_DIRECTION_INHERIT: Double = js.native
  
  var TEXT_DIRECTION_LOCALE: Double = js.native
  
  var TEXT_DIRECTION_LTR: Double = js.native
  
  var TEXT_DIRECTION_RESOLVED_DEFAULT: Double = js.native
  
  var TEXT_DIRECTION_RTL: Double = js.native
  
  var TempMatrixValue: js.Any = js.native
  
  var VIEW_LOG_TAG: String = js.native
  
  var VIEW_STATE_ACTIVATED: Double = js.native
  
  var VIEW_STATE_CHECKED: Double = js.native
  
  var VIEW_STATE_EMPTY: Double = js.native
  
  var VIEW_STATE_ENABLED: Double = js.native
  
  var VIEW_STATE_EXPANDED: Double = js.native
  
  var VIEW_STATE_FOCUSED: Double = js.native
  
  var VIEW_STATE_HOVERED: Double = js.native
  
  var VIEW_STATE_IDS: js.Array[Double] = js.native
  
  var VIEW_STATE_LAST: Double = js.native
  
  var VIEW_STATE_MULTILINE: Double = js.native
  
  var VIEW_STATE_PRESSED: Double = js.native
  
  var VIEW_STATE_SELECTED: Double = js.native
  
  var VIEW_STATE_SETS: js.Array[js.Array[Double]] = js.native
  
  var VIEW_STATE_WINDOW_FOCUSED: Double = js.native
  
  var VISIBILITY_MASK: Double = js.native
  
  var VISIBLE: Double = js.native
  
  var ViewClassAttrBinderClazzMap: js.Any = js.native
  
  var WILL_NOT_CACHE_DRAWING: Double = js.native
  
  var WILL_NOT_DRAW: Double = js.native
  
  var WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  
  /* private */ def _AttrObserverCallBack(arr: js.Any, observer: js.Any): js.Any = js.native
  
  var _static: js.Any = js.native
  
  def combineMeasuredStates(curState: js.Any, newState: js.Any): Double = js.native
  
  def getDefaultSize(size: js.Any, measureSpec: js.Any): js.Any = js.native
  
  def inflate(context: Context, xml: String): typings.androiduix.android.view.View = js.native
  def inflate(context: Context, xml: String, root: typings.androiduix.android.view.ViewGroup): typings.androiduix.android.view.View = js.native
  def inflate(context: Context, xml: HTMLElement): typings.androiduix.android.view.View = js.native
  def inflate(context: Context, xml: HTMLElement, root: typings.androiduix.android.view.ViewGroup): typings.androiduix.android.view.View = js.native
  
  def mergeDrawableStates(baseState: js.Array[Double], additionalState: js.Array[Double]): js.Array[Double] = js.native
  
  def resolveSize(size: js.Any, measureSpec: js.Any): Double = js.native
  
  def resolveSizeAndState(size: js.Any, measureSpec: js.Any, childMeasuredState: js.Any): Double = js.native
  
  @js.native
  class AttachInfo protected ()
    extends typings.androiduix.android.view.View.AttachInfo {
    def this(mViewRootImpl: typings.androiduix.android.view.ViewRootImpl, mHandler: Handler) = this()
  }
  @js.native
  object AttachInfo extends js.Object {
    
    @js.native
    class InvalidateInfo ()
      extends typings.androiduix.android.view.View.AttachInfo.InvalidateInfo
    /* static members */
    @js.native
    object InvalidateInfo extends js.Object {
      
      var POOL_LIMIT: js.Any = js.native
      
      def obtain(): typings.androiduix.android.view.View.AttachInfo.InvalidateInfo = js.native
      
      var sPool: js.Any = js.native
    }
  }
  
  @js.native
  class ListenerInfo ()
    extends typings.androiduix.android.view.View.ListenerInfo
  
  @js.native
  class MeasureSpec ()
    extends typings.androiduix.android.view.View.MeasureSpec
  /* static members */
  @js.native
  object MeasureSpec extends js.Object {
    
    var AT_MOST: Double = js.native
    
    var EXACTLY: Double = js.native
    
    var MODE_MASK: Double = js.native
    
    var MODE_SHIFT: Double = js.native
    
    var UNSPECIFIED: Double = js.native
    
    def adjust(measureSpec: js.Any, delta: js.Any): Double = js.native
    
    def getMode(measureSpec: js.Any): Double = js.native
    
    def getSize(measureSpec: js.Any): Double = js.native
    
    def makeMeasureSpec(size: js.Any, mode: js.Any): Double = js.native
    
    def toString(measureSpec: js.Any): String = js.native
  }
  
  @js.native
  object OnClickListener extends js.Object {
    
    def fromFunction(func: js.Function1[/* v */ typings.androiduix.android.view.View, Unit]): typings.androiduix.android.view.View.OnClickListener = js.native
  }
  
  @js.native
  object OnFocusChangeListener extends js.Object {
    
    def fromFunction(func: js.Function2[/* v */ typings.androiduix.android.view.View, /* hasFocus */ Boolean, Unit]): typings.androiduix.android.view.View.OnFocusChangeListener = js.native
  }
  
  @js.native
  object OnGenericMotionListener extends js.Object {
    
    def fromFunction(
      func: js.Function2[
          /* v */ typings.androiduix.android.view.View, 
          /* event */ typings.androiduix.android.view.MotionEvent, 
          Unit
        ]
    ): typings.androiduix.android.view.View.OnGenericMotionListener = js.native
  }
  
  @js.native
  object OnKeyListener extends js.Object {
    
    def fromFunction(
      func: js.Function3[
          /* v */ typings.androiduix.android.view.View, 
          /* keyCode */ Double, 
          /* event */ typings.androiduix.android.view.KeyEvent, 
          Unit
        ]
    ): typings.androiduix.android.view.View.OnKeyListener = js.native
  }
  
  @js.native
  object OnLongClickListener extends js.Object {
    
    def fromFunction(func: js.Function1[/* v */ typings.androiduix.android.view.View, Boolean]): typings.androiduix.android.view.View.OnLongClickListener = js.native
  }
  
  @js.native
  object OnTouchListener extends js.Object {
    
    def fromFunction(
      func: js.Function2[
          /* v */ typings.androiduix.android.view.View, 
          /* event */ typings.androiduix.android.view.MotionEvent, 
          Unit
        ]
    ): typings.androiduix.android.view.View.OnTouchListener = js.native
  }
  
  @js.native
  class TransformationInfo ()
    extends typings.androiduix.android.view.View.TransformationInfo
}
