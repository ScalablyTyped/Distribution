package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.res.ColorStateList
import typings.std.HTMLElement
import typings.std.Map
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
/* static members */
@JSGlobal("android.widget.TextView")
@js.native
object TextView extends js.Object {
  
  var ANIMATED_SCROLL_GAP: js.Any = js.native
  
  var CHANGE_WATCHER_PRIORITY: js.Any = js.native
  
  var DEBUG_EXTRACT: Boolean = js.native
  
  var DECIMAL: js.Any = js.native
  
  var EMS: js.Any = js.native
  
  var LAST_CUT_OR_COPY_TIME: Double = js.native
  
  var LINES: js.Any = js.native
  
  var LOG_TAG: String = js.native
  
  var MARQUEE_FADE_NORMAL: js.Any = js.native
  
  var MARQUEE_FADE_SWITCH_SHOW_ELLIPSIS: js.Any = js.native
  
  var MARQUEE_FADE_SWITCH_SHOW_FADE: js.Any = js.native
  
  var MONOSPACE: js.Any = js.native
  
  var MULTILINE_STATE_SET: js.Any = js.native
  
  var NO_FILTERS: js.Any = js.native
  
  var PIXELS: js.Any = js.native
  
  var SANS: js.Any = js.native
  
  var SERIF: js.Any = js.native
  
  var SIGNED: js.Any = js.native
  
  var TEMP_RECTF: js.Any = js.native
  
  var UNKNOWN_BORING: js.Any = js.native
  
  var VERY_WIDE: js.Any = js.native
  
  /* private */ def desired(layout: js.Any): js.Any = js.native
  
  def getTextColor(`def`: Double): Double = js.native
  
  def getTextColors(): ColorStateList = js.native
  
  /* private */ def isMultilineInputType(`type`: js.Any): js.Any = js.native
  
  /* private */ def isPasswordInputType(inputType: js.Any): js.Any = js.native
  
  /* private */ def isVisiblePasswordInputType(inputType: js.Any): js.Any = js.native
  
  @js.native
  object BufferType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.androiduix.android.widget.TextView.BufferType with Double] = js.native
    
    /* 2 */ val EDITABLE: typings.androiduix.android.widget.TextView.BufferType.EDITABLE with Double = js.native
    
    /* 0 */ val NORMAL: typings.androiduix.android.widget.TextView.BufferType.NORMAL with Double = js.native
    
    /* 1 */ val SPANNABLE: typings.androiduix.android.widget.TextView.BufferType.SPANNABLE with Double = js.native
  }
  
  @js.native
  class ChangeWatcher protected ()
    extends typings.androiduix.android.widget.TextView.ChangeWatcher {
    def this(arg: typings.androiduix.android.widget.TextView) = this()
  }
  
  @js.native
  class Drawables ()
    extends typings.androiduix.android.widget.TextView.Drawables {
    def this(context: js.Any) = this()
  }
  /* static members */
  @js.native
  object Drawables extends js.Object {
    
    var DRAWABLE_LEFT: Double = js.native
    
    var DRAWABLE_NONE: Double = js.native
    
    var DRAWABLE_RIGHT: Double = js.native
  }
  
  @js.native
  class Marquee protected ()
    extends typings.androiduix.android.widget.TextView.Marquee {
    def this(v: typings.androiduix.android.widget.TextView) = this()
  }
  /* static members */
  @js.native
  object Marquee extends js.Object {
    
    var MARQUEE_DELAY: js.Any = js.native
    
    var MARQUEE_DELTA_MAX: js.Any = js.native
    
    var MARQUEE_PIXELS_PER_SECOND: js.Any = js.native
    
    var MARQUEE_RESOLUTION: js.Any = js.native
    
    var MARQUEE_RESTART_DELAY: js.Any = js.native
    
    var MARQUEE_RUNNING: js.Any = js.native
    
    var MARQUEE_STARTING: js.Any = js.native
    
    var MARQUEE_STOPPED: js.Any = js.native
    
    var MESSAGE_RESTART: js.Any = js.native
    
    var MESSAGE_START: js.Any = js.native
    
    var MESSAGE_TICK: js.Any = js.native
  }
}
