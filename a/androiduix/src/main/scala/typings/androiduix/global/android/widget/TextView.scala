package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.res.ColorStateList
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.TextView")
@js.native
class TextView protected ()
  extends typings.androiduix.android.widget.TextView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
object TextView {
  
  @JSGlobal("android.widget.TextView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.TextView.ANIMATED_SCROLL_GAP")
  @js.native
  def ANIMATED_SCROLL_GAP: js.Any = js.native
  @scala.inline
  def ANIMATED_SCROLL_GAP_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATED_SCROLL_GAP")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.TextView.BufferType")
  @js.native
  object BufferType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.androiduix.android.widget.TextView.BufferType with Double] = js.native
    
    /* 2 */ val EDITABLE: typings.androiduix.android.widget.TextView.BufferType.EDITABLE with Double = js.native
    
    /* 0 */ val NORMAL: typings.androiduix.android.widget.TextView.BufferType.NORMAL with Double = js.native
    
    /* 1 */ val SPANNABLE: typings.androiduix.android.widget.TextView.BufferType.SPANNABLE with Double = js.native
  }
  
  /* static member */
  @JSGlobal("android.widget.TextView.CHANGE_WATCHER_PRIORITY")
  @js.native
  def CHANGE_WATCHER_PRIORITY: js.Any = js.native
  @scala.inline
  def CHANGE_WATCHER_PRIORITY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_WATCHER_PRIORITY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.TextView.ChangeWatcher")
  @js.native
  class ChangeWatcher protected ()
    extends typings.androiduix.android.widget.TextView.ChangeWatcher {
    def this(arg: typings.androiduix.android.widget.TextView) = this()
  }
  
  /* static member */
  @JSGlobal("android.widget.TextView.DEBUG_EXTRACT")
  @js.native
  def DEBUG_EXTRACT: Boolean = js.native
  @scala.inline
  def DEBUG_EXTRACT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG_EXTRACT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.DECIMAL")
  @js.native
  def DECIMAL: js.Any = js.native
  @scala.inline
  def DECIMAL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DECIMAL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.TextView.Drawables")
  @js.native
  class Drawables ()
    extends typings.androiduix.android.widget.TextView.Drawables {
    def this(context: js.Any) = this()
  }
  object Drawables {
    
    @JSGlobal("android.widget.TextView.Drawables")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.widget.TextView.Drawables.DRAWABLE_LEFT")
    @js.native
    def DRAWABLE_LEFT: Double = js.native
    @scala.inline
    def DRAWABLE_LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAWABLE_LEFT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Drawables.DRAWABLE_NONE")
    @js.native
    def DRAWABLE_NONE: Double = js.native
    @scala.inline
    def DRAWABLE_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAWABLE_NONE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Drawables.DRAWABLE_RIGHT")
    @js.native
    def DRAWABLE_RIGHT: Double = js.native
    @scala.inline
    def DRAWABLE_RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAWABLE_RIGHT")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSGlobal("android.widget.TextView.EMS")
  @js.native
  def EMS: js.Any = js.native
  @scala.inline
  def EMS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.LAST_CUT_OR_COPY_TIME")
  @js.native
  def LAST_CUT_OR_COPY_TIME: Double = js.native
  @scala.inline
  def LAST_CUT_OR_COPY_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAST_CUT_OR_COPY_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.LINES")
  @js.native
  def LINES: js.Any = js.native
  @scala.inline
  def LINES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINES")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.LOG_TAG")
  @js.native
  def LOG_TAG: String = js.native
  @scala.inline
  def LOG_TAG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_TAG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.MARQUEE_FADE_NORMAL")
  @js.native
  def MARQUEE_FADE_NORMAL: js.Any = js.native
  @scala.inline
  def MARQUEE_FADE_NORMAL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARQUEE_FADE_NORMAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.MARQUEE_FADE_SWITCH_SHOW_ELLIPSIS")
  @js.native
  def MARQUEE_FADE_SWITCH_SHOW_ELLIPSIS: js.Any = js.native
  @scala.inline
  def MARQUEE_FADE_SWITCH_SHOW_ELLIPSIS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARQUEE_FADE_SWITCH_SHOW_ELLIPSIS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.MARQUEE_FADE_SWITCH_SHOW_FADE")
  @js.native
  def MARQUEE_FADE_SWITCH_SHOW_FADE: js.Any = js.native
  @scala.inline
  def MARQUEE_FADE_SWITCH_SHOW_FADE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARQUEE_FADE_SWITCH_SHOW_FADE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.MONOSPACE")
  @js.native
  def MONOSPACE: js.Any = js.native
  @scala.inline
  def MONOSPACE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONOSPACE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.MULTILINE_STATE_SET")
  @js.native
  def MULTILINE_STATE_SET: js.Any = js.native
  @scala.inline
  def MULTILINE_STATE_SET_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MULTILINE_STATE_SET")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.TextView.Marquee")
  @js.native
  class Marquee protected ()
    extends typings.androiduix.android.widget.TextView.Marquee {
    def this(v: typings.androiduix.android.widget.TextView) = this()
  }
  object Marquee {
    
    @JSGlobal("android.widget.TextView.Marquee")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.widget.TextView.Marquee.MARQUEE_DELAY")
    @js.native
    def MARQUEE_DELAY: js.Any = js.native
    @scala.inline
    def MARQUEE_DELAY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARQUEE_DELAY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Marquee.MARQUEE_DELTA_MAX")
    @js.native
    def MARQUEE_DELTA_MAX: js.Any = js.native
    @scala.inline
    def MARQUEE_DELTA_MAX_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARQUEE_DELTA_MAX")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Marquee.MARQUEE_PIXELS_PER_SECOND")
    @js.native
    def MARQUEE_PIXELS_PER_SECOND: js.Any = js.native
    @scala.inline
    def MARQUEE_PIXELS_PER_SECOND_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARQUEE_PIXELS_PER_SECOND")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Marquee.MARQUEE_RESOLUTION")
    @js.native
    def MARQUEE_RESOLUTION: js.Any = js.native
    @scala.inline
    def MARQUEE_RESOLUTION_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARQUEE_RESOLUTION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Marquee.MARQUEE_RESTART_DELAY")
    @js.native
    def MARQUEE_RESTART_DELAY: js.Any = js.native
    @scala.inline
    def MARQUEE_RESTART_DELAY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARQUEE_RESTART_DELAY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Marquee.MARQUEE_RUNNING")
    @js.native
    def MARQUEE_RUNNING: js.Any = js.native
    @scala.inline
    def MARQUEE_RUNNING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARQUEE_RUNNING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Marquee.MARQUEE_STARTING")
    @js.native
    def MARQUEE_STARTING: js.Any = js.native
    @scala.inline
    def MARQUEE_STARTING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARQUEE_STARTING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Marquee.MARQUEE_STOPPED")
    @js.native
    def MARQUEE_STOPPED: js.Any = js.native
    @scala.inline
    def MARQUEE_STOPPED_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARQUEE_STOPPED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Marquee.MESSAGE_RESTART")
    @js.native
    def MESSAGE_RESTART: js.Any = js.native
    @scala.inline
    def MESSAGE_RESTART_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE_RESTART")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Marquee.MESSAGE_START")
    @js.native
    def MESSAGE_START: js.Any = js.native
    @scala.inline
    def MESSAGE_START_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE_START")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.TextView.Marquee.MESSAGE_TICK")
    @js.native
    def MESSAGE_TICK: js.Any = js.native
    @scala.inline
    def MESSAGE_TICK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE_TICK")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSGlobal("android.widget.TextView.NO_FILTERS")
  @js.native
  def NO_FILTERS: js.Any = js.native
  @scala.inline
  def NO_FILTERS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_FILTERS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.PIXELS")
  @js.native
  def PIXELS: js.Any = js.native
  @scala.inline
  def PIXELS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PIXELS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.SANS")
  @js.native
  def SANS: js.Any = js.native
  @scala.inline
  def SANS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SANS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.SERIF")
  @js.native
  def SERIF: js.Any = js.native
  @scala.inline
  def SERIF_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERIF")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.SIGNED")
  @js.native
  def SIGNED: js.Any = js.native
  @scala.inline
  def SIGNED_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGNED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.TEMP_RECTF")
  @js.native
  def TEMP_RECTF: js.Any = js.native
  @scala.inline
  def TEMP_RECTF_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMP_RECTF")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.UNKNOWN_BORING")
  @js.native
  def UNKNOWN_BORING: js.Any = js.native
  @scala.inline
  def UNKNOWN_BORING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_BORING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.VERY_WIDE")
  @js.native
  def VERY_WIDE: js.Any = js.native
  @scala.inline
  def VERY_WIDE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERY_WIDE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.TextView.desired")
  @js.native
  def desired(layout: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.TextView.getTextColor")
  @js.native
  def getTextColor(`def`: Double): Double = js.native
  
  /* static member */
  @JSGlobal("android.widget.TextView.getTextColors")
  @js.native
  def getTextColors(): ColorStateList = js.native
  
  /* static member */
  @JSGlobal("android.widget.TextView.isMultilineInputType")
  @js.native
  def isMultilineInputType(`type`: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.TextView.isPasswordInputType")
  @js.native
  def isPasswordInputType(inputType: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.TextView.isVisiblePasswordInputType")
  @js.native
  def isVisiblePasswordInputType(inputType: js.Any): js.Any = js.native
}
