package typings.androiduix.global.android.view

import typings.androiduix.android.content.Context
import typings.androiduix.android.os.Handler
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
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
object View {
  
  @JSGlobal("android.view.View")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.view.View.AndroidViewProperty")
  @js.native
  def AndroidViewProperty: String = js.native
  @scala.inline
  def AndroidViewProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AndroidViewProperty")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.view.View.AttachInfo")
  @js.native
  class AttachInfo protected ()
    extends typings.androiduix.android.view.View.AttachInfo {
    def this(mViewRootImpl: typings.androiduix.android.view.ViewRootImpl, mHandler: Handler) = this()
  }
  object AttachInfo {
    
    @JSGlobal("android.view.View.AttachInfo.InvalidateInfo")
    @js.native
    class InvalidateInfo ()
      extends typings.androiduix.android.view.View.AttachInfo.InvalidateInfo
    object InvalidateInfo {
      
      @JSGlobal("android.view.View.AttachInfo.InvalidateInfo")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("android.view.View.AttachInfo.InvalidateInfo.POOL_LIMIT")
      @js.native
      def POOL_LIMIT: js.Any = js.native
      @scala.inline
      def POOL_LIMIT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POOL_LIMIT")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("android.view.View.AttachInfo.InvalidateInfo.obtain")
      @js.native
      def obtain(): typings.androiduix.android.view.View.AttachInfo.InvalidateInfo = js.native
      
      /* static member */
      @JSGlobal("android.view.View.AttachInfo.InvalidateInfo.sPool")
      @js.native
      def sPool: js.Any = js.native
      @scala.inline
      def sPool_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sPool")(x.asInstanceOf[js.Any])
    }
  }
  
  /* static member */
  @JSGlobal("android.view.View._AttrObserverCallBack")
  @js.native
  def AttrObserverCallBack(arr: js.Any, observer: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.view.View.CLICKABLE")
  @js.native
  def CLICKABLE: Double = js.native
  @scala.inline
  def CLICKABLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICKABLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.DBG")
  @js.native
  def DBG: Boolean = js.native
  @scala.inline
  def DBG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DBG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.DISABLED")
  @js.native
  def DISABLED: Double = js.native
  @scala.inline
  def DISABLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.DRAWING_CACHE_ENABLED")
  @js.native
  def DRAWING_CACHE_ENABLED: Double = js.native
  @scala.inline
  def DRAWING_CACHE_ENABLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAWING_CACHE_ENABLED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.DRAW_MASK")
  @js.native
  def DRAW_MASK: Double = js.native
  @scala.inline
  def DRAW_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAW_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.DUPLICATE_PARENT_STATE")
  @js.native
  def DUPLICATE_PARENT_STATE: Double = js.native
  @scala.inline
  def DUPLICATE_PARENT_STATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DUPLICATE_PARENT_STATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.EMPTY_STATE_SET")
  @js.native
  def EMPTY_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def EMPTY_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.ENABLED")
  @js.native
  def ENABLED: Double = js.native
  @scala.inline
  def ENABLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENABLED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.ENABLED_FOCUSED_SELECTED_STATE_SET")
  @js.native
  def ENABLED_FOCUSED_SELECTED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def ENABLED_FOCUSED_SELECTED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENABLED_FOCUSED_SELECTED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.ENABLED_FOCUSED_STATE_SET")
  @js.native
  def ENABLED_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def ENABLED_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENABLED_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.ENABLED_MASK")
  @js.native
  def ENABLED_MASK: Double = js.native
  @scala.inline
  def ENABLED_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENABLED_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.ENABLED_SELECTED_STATE_SET")
  @js.native
  def ENABLED_SELECTED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def ENABLED_SELECTED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENABLED_SELECTED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.ENABLED_STATE_SET")
  @js.native
  def ENABLED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def ENABLED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENABLED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.ENABLED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def ENABLED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def ENABLED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENABLED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUSABLE")
  @js.native
  def FOCUSABLE: js.Any = js.native
  
  /* static member */
  @JSGlobal("android.view.View.FOCUSABLES_ALL")
  @js.native
  def FOCUSABLES_ALL: Double = js.native
  @scala.inline
  def FOCUSABLES_ALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSABLES_ALL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUSABLES_TOUCH_MODE")
  @js.native
  def FOCUSABLES_TOUCH_MODE: Double = js.native
  @scala.inline
  def FOCUSABLES_TOUCH_MODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSABLES_TOUCH_MODE")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def FOCUSABLE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSABLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUSABLE_IN_TOUCH_MODE")
  @js.native
  def FOCUSABLE_IN_TOUCH_MODE: js.Any = js.native
  @scala.inline
  def FOCUSABLE_IN_TOUCH_MODE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSABLE_IN_TOUCH_MODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUSABLE_MASK")
  @js.native
  def FOCUSABLE_MASK: js.Any = js.native
  @scala.inline
  def FOCUSABLE_MASK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSABLE_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUSED_SELECTED_STATE_SET")
  @js.native
  def FOCUSED_SELECTED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def FOCUSED_SELECTED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSED_SELECTED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUSED_STATE_SET")
  @js.native
  def FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUSED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def FOCUSED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUS_BACKWARD")
  @js.native
  def FOCUS_BACKWARD: Double = js.native
  @scala.inline
  def FOCUS_BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_BACKWARD")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUS_DOWN")
  @js.native
  def FOCUS_DOWN: Double = js.native
  @scala.inline
  def FOCUS_DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_DOWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUS_FORWARD")
  @js.native
  def FOCUS_FORWARD: Double = js.native
  @scala.inline
  def FOCUS_FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_FORWARD")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUS_LEFT")
  @js.native
  def FOCUS_LEFT: Double = js.native
  @scala.inline
  def FOCUS_LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_LEFT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUS_RIGHT")
  @js.native
  def FOCUS_RIGHT: Double = js.native
  @scala.inline
  def FOCUS_RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_RIGHT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.FOCUS_UP")
  @js.native
  def FOCUS_UP: Double = js.native
  @scala.inline
  def FOCUS_UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_UP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.GONE")
  @js.native
  def GONE: Double = js.native
  @scala.inline
  def GONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.INVISIBLE")
  @js.native
  def INVISIBLE: Double = js.native
  @scala.inline
  def INVISIBLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVISIBLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.LAYER_TYPE_NONE")
  @js.native
  def LAYER_TYPE_NONE: Double = js.native
  @scala.inline
  def LAYER_TYPE_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYER_TYPE_NONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.LAYER_TYPE_SOFTWARE")
  @js.native
  def LAYER_TYPE_SOFTWARE: Double = js.native
  @scala.inline
  def LAYER_TYPE_SOFTWARE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYER_TYPE_SOFTWARE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.LAYOUT_DIRECTION_INHERIT")
  @js.native
  def LAYOUT_DIRECTION_INHERIT: Double = js.native
  @scala.inline
  def LAYOUT_DIRECTION_INHERIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_DIRECTION_INHERIT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.LAYOUT_DIRECTION_LOCALE")
  @js.native
  def LAYOUT_DIRECTION_LOCALE: Double = js.native
  @scala.inline
  def LAYOUT_DIRECTION_LOCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_DIRECTION_LOCALE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.LAYOUT_DIRECTION_LTR")
  @js.native
  def LAYOUT_DIRECTION_LTR: Double = js.native
  @scala.inline
  def LAYOUT_DIRECTION_LTR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_DIRECTION_LTR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.LAYOUT_DIRECTION_RTL")
  @js.native
  def LAYOUT_DIRECTION_RTL: Double = js.native
  @scala.inline
  def LAYOUT_DIRECTION_RTL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_DIRECTION_RTL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.LONG_CLICKABLE")
  @js.native
  def LONG_CLICKABLE: Double = js.native
  @scala.inline
  def LONG_CLICKABLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONG_CLICKABLE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.view.View.ListenerInfo")
  @js.native
  class ListenerInfo ()
    extends typings.androiduix.android.view.View.ListenerInfo
  
  /* static member */
  @JSGlobal("android.view.View.MEASURED_HEIGHT_STATE_SHIFT")
  @js.native
  def MEASURED_HEIGHT_STATE_SHIFT: Double = js.native
  @scala.inline
  def MEASURED_HEIGHT_STATE_SHIFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEASURED_HEIGHT_STATE_SHIFT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.MEASURED_SIZE_MASK")
  @js.native
  def MEASURED_SIZE_MASK: Double = js.native
  @scala.inline
  def MEASURED_SIZE_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEASURED_SIZE_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.MEASURED_STATE_MASK")
  @js.native
  def MEASURED_STATE_MASK: Double = js.native
  @scala.inline
  def MEASURED_STATE_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEASURED_STATE_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.MEASURED_STATE_TOO_SMALL")
  @js.native
  def MEASURED_STATE_TOO_SMALL: Double = js.native
  @scala.inline
  def MEASURED_STATE_TOO_SMALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEASURED_STATE_TOO_SMALL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.view.View.MeasureSpec")
  @js.native
  class MeasureSpec ()
    extends typings.androiduix.android.view.View.MeasureSpec
  object MeasureSpec {
    
    @JSGlobal("android.view.View.MeasureSpec")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.view.View.MeasureSpec.AT_MOST")
    @js.native
    def AT_MOST: Double = js.native
    @scala.inline
    def AT_MOST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AT_MOST")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.View.MeasureSpec.EXACTLY")
    @js.native
    def EXACTLY: Double = js.native
    @scala.inline
    def EXACTLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXACTLY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.View.MeasureSpec.MODE_MASK")
    @js.native
    def MODE_MASK: Double = js.native
    @scala.inline
    def MODE_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_MASK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.View.MeasureSpec.MODE_SHIFT")
    @js.native
    def MODE_SHIFT: Double = js.native
    @scala.inline
    def MODE_SHIFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_SHIFT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.View.MeasureSpec.UNSPECIFIED")
    @js.native
    def UNSPECIFIED: Double = js.native
    @scala.inline
    def UNSPECIFIED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSPECIFIED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.View.MeasureSpec.adjust")
    @js.native
    def adjust(measureSpec: js.Any, delta: js.Any): Double = js.native
    
    /* static member */
    @JSGlobal("android.view.View.MeasureSpec.getMode")
    @js.native
    def getMode(measureSpec: js.Any): Double = js.native
    
    /* static member */
    @JSGlobal("android.view.View.MeasureSpec.getSize")
    @js.native
    def getSize(measureSpec: js.Any): Double = js.native
    
    /* static member */
    @JSGlobal("android.view.View.MeasureSpec.makeMeasureSpec")
    @js.native
    def makeMeasureSpec(size: js.Any, mode: js.Any): Double = js.native
    
    /* static member */
    @JSGlobal("android.view.View.MeasureSpec.toString")
    @js.native
    def toString_(measureSpec: js.Any): String = js.native
  }
  
  /* static member */
  @JSGlobal("android.view.View.NOT_FOCUSABLE")
  @js.native
  def NOT_FOCUSABLE: js.Any = js.native
  @scala.inline
  def NOT_FOCUSABLE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOCUSABLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.NO_ID")
  @js.native
  def NO_ID: js.Any = js.native
  @scala.inline
  def NO_ID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_ID")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.OVER_SCROLL_ALWAYS")
  @js.native
  def OVER_SCROLL_ALWAYS: Double = js.native
  @scala.inline
  def OVER_SCROLL_ALWAYS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OVER_SCROLL_ALWAYS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.OVER_SCROLL_IF_CONTENT_SCROLLS")
  @js.native
  def OVER_SCROLL_IF_CONTENT_SCROLLS: Double = js.native
  @scala.inline
  def OVER_SCROLL_IF_CONTENT_SCROLLS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OVER_SCROLL_IF_CONTENT_SCROLLS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.OVER_SCROLL_NEVER")
  @js.native
  def OVER_SCROLL_NEVER: Double = js.native
  @scala.inline
  def OVER_SCROLL_NEVER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OVER_SCROLL_NEVER")(x.asInstanceOf[js.Any])
  
  object OnClickListener {
    
    @JSGlobal("android.view.View.OnClickListener.fromFunction")
    @js.native
    def fromFunction(func: js.Function1[/* v */ typings.androiduix.android.view.View, Unit]): typings.androiduix.android.view.View.OnClickListener = js.native
  }
  
  object OnFocusChangeListener {
    
    @JSGlobal("android.view.View.OnFocusChangeListener.fromFunction")
    @js.native
    def fromFunction(func: js.Function2[/* v */ typings.androiduix.android.view.View, /* hasFocus */ Boolean, Unit]): typings.androiduix.android.view.View.OnFocusChangeListener = js.native
  }
  
  object OnGenericMotionListener {
    
    @JSGlobal("android.view.View.OnGenericMotionListener.fromFunction")
    @js.native
    def fromFunction(
      func: js.Function2[
          /* v */ typings.androiduix.android.view.View, 
          /* event */ typings.androiduix.android.view.MotionEvent, 
          Unit
        ]
    ): typings.androiduix.android.view.View.OnGenericMotionListener = js.native
  }
  
  object OnKeyListener {
    
    @JSGlobal("android.view.View.OnKeyListener.fromFunction")
    @js.native
    def fromFunction(
      func: js.Function3[
          /* v */ typings.androiduix.android.view.View, 
          /* keyCode */ Double, 
          /* event */ typings.androiduix.android.view.KeyEvent, 
          Unit
        ]
    ): typings.androiduix.android.view.View.OnKeyListener = js.native
  }
  
  object OnLongClickListener {
    
    @JSGlobal("android.view.View.OnLongClickListener.fromFunction")
    @js.native
    def fromFunction(func: js.Function1[/* v */ typings.androiduix.android.view.View, Boolean]): typings.androiduix.android.view.View.OnLongClickListener = js.native
  }
  
  object OnTouchListener {
    
    @JSGlobal("android.view.View.OnTouchListener.fromFunction")
    @js.native
    def fromFunction(
      func: js.Function2[
          /* v */ typings.androiduix.android.view.View, 
          /* event */ typings.androiduix.android.view.MotionEvent, 
          Unit
        ]
    ): typings.androiduix.android.view.View.OnTouchListener = js.native
  }
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG2_HAS_TRANSIENT_STATE")
  @js.native
  def PFLAG2_HAS_TRANSIENT_STATE: Double = js.native
  @scala.inline
  def PFLAG2_HAS_TRANSIENT_STATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG2_HAS_TRANSIENT_STATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG2_VIEW_QUICK_REJECTED")
  @js.native
  def PFLAG2_VIEW_QUICK_REJECTED: Double = js.native
  @scala.inline
  def PFLAG2_VIEW_QUICK_REJECTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG2_VIEW_QUICK_REJECTED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG3_CALLED_SUPER")
  @js.native
  def PFLAG3_CALLED_SUPER: Double = js.native
  @scala.inline
  def PFLAG3_CALLED_SUPER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG3_CALLED_SUPER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG3_IS_LAID_OUT")
  @js.native
  def PFLAG3_IS_LAID_OUT: Double = js.native
  @scala.inline
  def PFLAG3_IS_LAID_OUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG3_IS_LAID_OUT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG3_MEASURE_NEEDED_BEFORE_LAYOUT")
  @js.native
  def PFLAG3_MEASURE_NEEDED_BEFORE_LAYOUT: Double = js.native
  @scala.inline
  def PFLAG3_MEASURE_NEEDED_BEFORE_LAYOUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG3_MEASURE_NEEDED_BEFORE_LAYOUT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG3_VIEW_IS_ANIMATING_ALPHA")
  @js.native
  def PFLAG3_VIEW_IS_ANIMATING_ALPHA: Double = js.native
  @scala.inline
  def PFLAG3_VIEW_IS_ANIMATING_ALPHA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG3_VIEW_IS_ANIMATING_ALPHA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG3_VIEW_IS_ANIMATING_TRANSFORM")
  @js.native
  def PFLAG3_VIEW_IS_ANIMATING_TRANSFORM: Double = js.native
  @scala.inline
  def PFLAG3_VIEW_IS_ANIMATING_TRANSFORM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG3_VIEW_IS_ANIMATING_TRANSFORM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_ACTIVATED")
  @js.native
  def PFLAG_ACTIVATED: Double = js.native
  @scala.inline
  def PFLAG_ACTIVATED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_ACTIVATED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_ALPHA_SET")
  @js.native
  def PFLAG_ALPHA_SET: Double = js.native
  @scala.inline
  def PFLAG_ALPHA_SET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_ALPHA_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_ANIMATION_STARTED")
  @js.native
  def PFLAG_ANIMATION_STARTED: Double = js.native
  @scala.inline
  def PFLAG_ANIMATION_STARTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_ANIMATION_STARTED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_AWAKEN_SCROLL_BARS_ON_ATTACH")
  @js.native
  def PFLAG_AWAKEN_SCROLL_BARS_ON_ATTACH: Double = js.native
  @scala.inline
  def PFLAG_AWAKEN_SCROLL_BARS_ON_ATTACH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_AWAKEN_SCROLL_BARS_ON_ATTACH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_CANCEL_NEXT_UP_EVENT")
  @js.native
  def PFLAG_CANCEL_NEXT_UP_EVENT: Double = js.native
  @scala.inline
  def PFLAG_CANCEL_NEXT_UP_EVENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_CANCEL_NEXT_UP_EVENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_DIRTY")
  @js.native
  def PFLAG_DIRTY: Double = js.native
  @scala.inline
  def PFLAG_DIRTY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_DIRTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_DIRTY_MASK")
  @js.native
  def PFLAG_DIRTY_MASK: Double = js.native
  @scala.inline
  def PFLAG_DIRTY_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_DIRTY_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_DIRTY_OPAQUE")
  @js.native
  def PFLAG_DIRTY_OPAQUE: Double = js.native
  @scala.inline
  def PFLAG_DIRTY_OPAQUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_DIRTY_OPAQUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_DRAWABLE_STATE_DIRTY")
  @js.native
  def PFLAG_DRAWABLE_STATE_DIRTY: Double = js.native
  @scala.inline
  def PFLAG_DRAWABLE_STATE_DIRTY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_DRAWABLE_STATE_DIRTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_DRAWING_CACHE_VALID")
  @js.native
  def PFLAG_DRAWING_CACHE_VALID: Double = js.native
  @scala.inline
  def PFLAG_DRAWING_CACHE_VALID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_DRAWING_CACHE_VALID")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_DRAWN")
  @js.native
  def PFLAG_DRAWN: Double = js.native
  @scala.inline
  def PFLAG_DRAWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_DRAWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_DRAW_ANIMATION")
  @js.native
  def PFLAG_DRAW_ANIMATION: Double = js.native
  @scala.inline
  def PFLAG_DRAW_ANIMATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_DRAW_ANIMATION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_FOCUSED")
  @js.native
  def PFLAG_FOCUSED: Double = js.native
  @scala.inline
  def PFLAG_FOCUSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_FOCUSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_FORCE_LAYOUT")
  @js.native
  def PFLAG_FORCE_LAYOUT: Double = js.native
  @scala.inline
  def PFLAG_FORCE_LAYOUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_FORCE_LAYOUT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_HAS_BOUNDS")
  @js.native
  def PFLAG_HAS_BOUNDS: Double = js.native
  @scala.inline
  def PFLAG_HAS_BOUNDS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_HAS_BOUNDS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_HOVERED")
  @js.native
  def PFLAG_HOVERED: Double = js.native
  @scala.inline
  def PFLAG_HOVERED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_HOVERED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_INVALIDATED")
  @js.native
  def PFLAG_INVALIDATED: Double = js.native
  @scala.inline
  def PFLAG_INVALIDATED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_INVALIDATED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_IS_ROOT_NAMESPACE")
  @js.native
  def PFLAG_IS_ROOT_NAMESPACE: Double = js.native
  @scala.inline
  def PFLAG_IS_ROOT_NAMESPACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_IS_ROOT_NAMESPACE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_LAYOUT_REQUIRED")
  @js.native
  def PFLAG_LAYOUT_REQUIRED: Double = js.native
  @scala.inline
  def PFLAG_LAYOUT_REQUIRED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_LAYOUT_REQUIRED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_MEASURED_DIMENSION_SET")
  @js.native
  def PFLAG_MEASURED_DIMENSION_SET: Double = js.native
  @scala.inline
  def PFLAG_MEASURED_DIMENSION_SET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_MEASURED_DIMENSION_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_ONLY_DRAWS_BACKGROUND")
  @js.native
  def PFLAG_ONLY_DRAWS_BACKGROUND: Double = js.native
  @scala.inline
  def PFLAG_ONLY_DRAWS_BACKGROUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_ONLY_DRAWS_BACKGROUND")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_OPAQUE_BACKGROUND")
  @js.native
  def PFLAG_OPAQUE_BACKGROUND: Double = js.native
  @scala.inline
  def PFLAG_OPAQUE_BACKGROUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_OPAQUE_BACKGROUND")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_OPAQUE_MASK")
  @js.native
  def PFLAG_OPAQUE_MASK: Double = js.native
  @scala.inline
  def PFLAG_OPAQUE_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_OPAQUE_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_OPAQUE_SCROLLBARS")
  @js.native
  def PFLAG_OPAQUE_SCROLLBARS: Double = js.native
  @scala.inline
  def PFLAG_OPAQUE_SCROLLBARS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_OPAQUE_SCROLLBARS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_PIVOT_EXPLICITLY_SET")
  @js.native
  def PFLAG_PIVOT_EXPLICITLY_SET: Double = js.native
  @scala.inline
  def PFLAG_PIVOT_EXPLICITLY_SET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_PIVOT_EXPLICITLY_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_PREPRESSED")
  @js.native
  def PFLAG_PREPRESSED: Double = js.native
  @scala.inline
  def PFLAG_PREPRESSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_PREPRESSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_PRESSED")
  @js.native
  def PFLAG_PRESSED: Double = js.native
  @scala.inline
  def PFLAG_PRESSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_PRESSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_REQUEST_TRANSPARENT_REGIONS")
  @js.native
  def PFLAG_REQUEST_TRANSPARENT_REGIONS: Double = js.native
  @scala.inline
  def PFLAG_REQUEST_TRANSPARENT_REGIONS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_REQUEST_TRANSPARENT_REGIONS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_SCROLL_CONTAINER")
  @js.native
  def PFLAG_SCROLL_CONTAINER: Double = js.native
  @scala.inline
  def PFLAG_SCROLL_CONTAINER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_SCROLL_CONTAINER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_SCROLL_CONTAINER_ADDED")
  @js.native
  def PFLAG_SCROLL_CONTAINER_ADDED: Double = js.native
  @scala.inline
  def PFLAG_SCROLL_CONTAINER_ADDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_SCROLL_CONTAINER_ADDED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_SELECTED")
  @js.native
  def PFLAG_SELECTED: Double = js.native
  @scala.inline
  def PFLAG_SELECTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_SELECTED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_SKIP_DRAW")
  @js.native
  def PFLAG_SKIP_DRAW: Double = js.native
  @scala.inline
  def PFLAG_SKIP_DRAW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_SKIP_DRAW")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PFLAG_WANTS_FOCUS")
  @js.native
  def PFLAG_WANTS_FOCUS: Double = js.native
  @scala.inline
  def PFLAG_WANTS_FOCUS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PFLAG_WANTS_FOCUS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET")
  @js.native
  def PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_ENABLED_FOCUSED_STATE_SET")
  @js.native
  def PRESSED_ENABLED_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_ENABLED_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_ENABLED_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_ENABLED_SELECTED_STATE_SET")
  @js.native
  def PRESSED_ENABLED_SELECTED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_ENABLED_SELECTED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_ENABLED_SELECTED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_ENABLED_STATE_SET")
  @js.native
  def PRESSED_ENABLED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_ENABLED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_ENABLED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_FOCUSED_SELECTED_STATE_SET")
  @js.native
  def PRESSED_FOCUSED_SELECTED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_FOCUSED_SELECTED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_FOCUSED_SELECTED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_FOCUSED_STATE_SET")
  @js.native
  def PRESSED_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_SELECTED_STATE_SET")
  @js.native
  def PRESSED_SELECTED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_SELECTED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_SELECTED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_STATE_SET")
  @js.native
  def PRESSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.PRESSED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def PRESSED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def PRESSED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRESSED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.SCROLLBARS_HORIZONTAL")
  @js.native
  def SCROLLBARS_HORIZONTAL: Double = js.native
  @scala.inline
  def SCROLLBARS_HORIZONTAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLLBARS_HORIZONTAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.SCROLLBARS_MASK")
  @js.native
  def SCROLLBARS_MASK: Double = js.native
  @scala.inline
  def SCROLLBARS_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLLBARS_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.SCROLLBARS_NONE")
  @js.native
  def SCROLLBARS_NONE: Double = js.native
  @scala.inline
  def SCROLLBARS_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLLBARS_NONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.SCROLLBARS_VERTICAL")
  @js.native
  def SCROLLBARS_VERTICAL: Double = js.native
  @scala.inline
  def SCROLLBARS_VERTICAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLLBARS_VERTICAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.SELECTED_STATE_SET")
  @js.native
  def SELECTED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def SELECTED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.SELECTED_WINDOW_FOCUSED_STATE_SET")
  @js.native
  def SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def SELECTED_WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_ALIGNMENT_CENTER")
  @js.native
  def TEXT_ALIGNMENT_CENTER: Double = js.native
  @scala.inline
  def TEXT_ALIGNMENT_CENTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_ALIGNMENT_CENTER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_ALIGNMENT_DEFAULT")
  @js.native
  def TEXT_ALIGNMENT_DEFAULT: js.Any = js.native
  @scala.inline
  def TEXT_ALIGNMENT_DEFAULT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_ALIGNMENT_DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_ALIGNMENT_GRAVITY")
  @js.native
  def TEXT_ALIGNMENT_GRAVITY: Double = js.native
  @scala.inline
  def TEXT_ALIGNMENT_GRAVITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_ALIGNMENT_GRAVITY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_ALIGNMENT_INHERIT")
  @js.native
  def TEXT_ALIGNMENT_INHERIT: Double = js.native
  @scala.inline
  def TEXT_ALIGNMENT_INHERIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_ALIGNMENT_INHERIT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_ALIGNMENT_RESOLVED_DEFAULT")
  @js.native
  def TEXT_ALIGNMENT_RESOLVED_DEFAULT: Double = js.native
  @scala.inline
  def TEXT_ALIGNMENT_RESOLVED_DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_ALIGNMENT_RESOLVED_DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_ALIGNMENT_TEXT_END")
  @js.native
  def TEXT_ALIGNMENT_TEXT_END: Double = js.native
  @scala.inline
  def TEXT_ALIGNMENT_TEXT_END_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_ALIGNMENT_TEXT_END")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_ALIGNMENT_TEXT_START")
  @js.native
  def TEXT_ALIGNMENT_TEXT_START: Double = js.native
  @scala.inline
  def TEXT_ALIGNMENT_TEXT_START_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_ALIGNMENT_TEXT_START")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_ALIGNMENT_VIEW_END")
  @js.native
  def TEXT_ALIGNMENT_VIEW_END: Double = js.native
  @scala.inline
  def TEXT_ALIGNMENT_VIEW_END_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_ALIGNMENT_VIEW_END")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_ALIGNMENT_VIEW_START")
  @js.native
  def TEXT_ALIGNMENT_VIEW_START: Double = js.native
  @scala.inline
  def TEXT_ALIGNMENT_VIEW_START_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_ALIGNMENT_VIEW_START")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_DIRECTION_ANY_RTL")
  @js.native
  def TEXT_DIRECTION_ANY_RTL: Double = js.native
  @scala.inline
  def TEXT_DIRECTION_ANY_RTL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_DIRECTION_ANY_RTL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_DIRECTION_DEFAULT")
  @js.native
  def TEXT_DIRECTION_DEFAULT: js.Any = js.native
  @scala.inline
  def TEXT_DIRECTION_DEFAULT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_DIRECTION_DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_DIRECTION_FIRST_STRONG")
  @js.native
  def TEXT_DIRECTION_FIRST_STRONG: Double = js.native
  @scala.inline
  def TEXT_DIRECTION_FIRST_STRONG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_DIRECTION_FIRST_STRONG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_DIRECTION_INHERIT")
  @js.native
  def TEXT_DIRECTION_INHERIT: Double = js.native
  @scala.inline
  def TEXT_DIRECTION_INHERIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_DIRECTION_INHERIT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_DIRECTION_LOCALE")
  @js.native
  def TEXT_DIRECTION_LOCALE: Double = js.native
  @scala.inline
  def TEXT_DIRECTION_LOCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_DIRECTION_LOCALE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_DIRECTION_LTR")
  @js.native
  def TEXT_DIRECTION_LTR: Double = js.native
  @scala.inline
  def TEXT_DIRECTION_LTR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_DIRECTION_LTR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_DIRECTION_RESOLVED_DEFAULT")
  @js.native
  def TEXT_DIRECTION_RESOLVED_DEFAULT: Double = js.native
  @scala.inline
  def TEXT_DIRECTION_RESOLVED_DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_DIRECTION_RESOLVED_DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TEXT_DIRECTION_RTL")
  @js.native
  def TEXT_DIRECTION_RTL: Double = js.native
  @scala.inline
  def TEXT_DIRECTION_RTL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_DIRECTION_RTL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.TempMatrixValue")
  @js.native
  def TempMatrixValue: js.Any = js.native
  @scala.inline
  def TempMatrixValue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TempMatrixValue")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.view.View.TransformationInfo")
  @js.native
  class TransformationInfo ()
    extends typings.androiduix.android.view.View.TransformationInfo
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_LOG_TAG")
  @js.native
  def VIEW_LOG_TAG: String = js.native
  @scala.inline
  def VIEW_LOG_TAG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_LOG_TAG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_ACTIVATED")
  @js.native
  def VIEW_STATE_ACTIVATED: Double = js.native
  @scala.inline
  def VIEW_STATE_ACTIVATED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_ACTIVATED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_CHECKED")
  @js.native
  def VIEW_STATE_CHECKED: Double = js.native
  @scala.inline
  def VIEW_STATE_CHECKED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_CHECKED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_EMPTY")
  @js.native
  def VIEW_STATE_EMPTY: Double = js.native
  @scala.inline
  def VIEW_STATE_EMPTY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_EMPTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_ENABLED")
  @js.native
  def VIEW_STATE_ENABLED: Double = js.native
  @scala.inline
  def VIEW_STATE_ENABLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_ENABLED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_EXPANDED")
  @js.native
  def VIEW_STATE_EXPANDED: Double = js.native
  @scala.inline
  def VIEW_STATE_EXPANDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_EXPANDED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_FOCUSED")
  @js.native
  def VIEW_STATE_FOCUSED: Double = js.native
  @scala.inline
  def VIEW_STATE_FOCUSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_FOCUSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_HOVERED")
  @js.native
  def VIEW_STATE_HOVERED: Double = js.native
  @scala.inline
  def VIEW_STATE_HOVERED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_HOVERED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_IDS")
  @js.native
  def VIEW_STATE_IDS: js.Array[Double] = js.native
  @scala.inline
  def VIEW_STATE_IDS_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_IDS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_LAST")
  @js.native
  def VIEW_STATE_LAST: Double = js.native
  @scala.inline
  def VIEW_STATE_LAST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_LAST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_MULTILINE")
  @js.native
  def VIEW_STATE_MULTILINE: Double = js.native
  @scala.inline
  def VIEW_STATE_MULTILINE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_MULTILINE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_PRESSED")
  @js.native
  def VIEW_STATE_PRESSED: Double = js.native
  @scala.inline
  def VIEW_STATE_PRESSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_PRESSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_SELECTED")
  @js.native
  def VIEW_STATE_SELECTED: Double = js.native
  @scala.inline
  def VIEW_STATE_SELECTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_SELECTED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_SETS")
  @js.native
  def VIEW_STATE_SETS: js.Array[js.Array[Double]] = js.native
  @scala.inline
  def VIEW_STATE_SETS_=(x: js.Array[js.Array[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_SETS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VIEW_STATE_WINDOW_FOCUSED")
  @js.native
  def VIEW_STATE_WINDOW_FOCUSED: Double = js.native
  @scala.inline
  def VIEW_STATE_WINDOW_FOCUSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_STATE_WINDOW_FOCUSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VISIBILITY_MASK")
  @js.native
  def VISIBILITY_MASK: Double = js.native
  @scala.inline
  def VISIBILITY_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VISIBILITY_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.VISIBLE")
  @js.native
  def VISIBLE: Double = js.native
  @scala.inline
  def VISIBLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VISIBLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.ViewClassAttrBinderClazzMap")
  @js.native
  def ViewClassAttrBinderClazzMap: js.Any = js.native
  @scala.inline
  def ViewClassAttrBinderClazzMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ViewClassAttrBinderClazzMap")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.WILL_NOT_CACHE_DRAWING")
  @js.native
  def WILL_NOT_CACHE_DRAWING: Double = js.native
  @scala.inline
  def WILL_NOT_CACHE_DRAWING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WILL_NOT_CACHE_DRAWING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.WILL_NOT_DRAW")
  @js.native
  def WILL_NOT_DRAW: Double = js.native
  @scala.inline
  def WILL_NOT_DRAW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WILL_NOT_DRAW")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.WINDOW_FOCUSED_STATE_SET")
  @js.native
  def WINDOW_FOCUSED_STATE_SET: js.Array[Double] = js.native
  @scala.inline
  def WINDOW_FOCUSED_STATE_SET_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOW_FOCUSED_STATE_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.View.combineMeasuredStates")
  @js.native
  def combineMeasuredStates(curState: js.Any, newState: js.Any): Double = js.native
  
  /* static member */
  @JSGlobal("android.view.View.getDefaultSize")
  @js.native
  def getDefaultSize(size: js.Any, measureSpec: js.Any): js.Any = js.native
  
  @JSGlobal("android.view.View.inflate")
  @js.native
  def inflate(context: Context, xml: String): typings.androiduix.android.view.View = js.native
  @JSGlobal("android.view.View.inflate")
  @js.native
  def inflate(context: Context, xml: String, root: typings.androiduix.android.view.ViewGroup): typings.androiduix.android.view.View = js.native
  /* static member */
  @JSGlobal("android.view.View.inflate")
  @js.native
  def inflate(context: Context, xml: HTMLElement): typings.androiduix.android.view.View = js.native
  @JSGlobal("android.view.View.inflate")
  @js.native
  def inflate(context: Context, xml: HTMLElement, root: typings.androiduix.android.view.ViewGroup): typings.androiduix.android.view.View = js.native
  
  /* static member */
  @JSGlobal("android.view.View.mergeDrawableStates")
  @js.native
  def mergeDrawableStates(baseState: js.Array[Double], additionalState: js.Array[Double]): js.Array[Double] = js.native
  
  /* static member */
  @JSGlobal("android.view.View.resolveSize")
  @js.native
  def resolveSize(size: js.Any, measureSpec: js.Any): Double = js.native
  
  /* static member */
  @JSGlobal("android.view.View.resolveSizeAndState")
  @js.native
  def resolveSizeAndState(size: js.Any, measureSpec: js.Any, childMeasuredState: js.Any): Double = js.native
  
  /* static member */
  @JSGlobal("android.view.View._static")
  @js.native
  def static: js.Any = js.native
  
  @scala.inline
  def static_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_static")(x.asInstanceOf[js.Any])
}
