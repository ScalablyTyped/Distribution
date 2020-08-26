package typings.androiduix.global.android.view

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewGroup")
@js.native
abstract class ViewGroup protected ()
  extends typings.androiduix.android.view.ViewGroup {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}

/* static members */
@JSGlobal("android.view.ViewGroup")
@js.native
object ViewGroup extends js.Object {
  @js.native
  class LayoutParams protected ()
    extends typings.androiduix.android.view.ViewGroup.LayoutParams {
    def this(args: js.Any*) = this()
    def this(src: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(width: Double, height: Double) = this()
  }
  
  @js.native
  class MarginLayoutParams protected ()
    extends typings.androiduix.android.view.ViewGroup.MarginLayoutParams {
    def this(args: js.Any*) = this()
    def this(src: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(src: typings.androiduix.android.view.ViewGroup.MarginLayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(width: Double, height: Double) = this()
  }
  
  var CLIP_TO_PADDING_MASK: Double = js.native
  var FLAG_ADD_STATES_FROM_CHILDREN: Double = js.native
  var FLAG_ALPHA_LOWER_THAN_ONE: Double = js.native
  var FLAG_ALWAYS_DRAWN_WITH_CACHE: Double = js.native
  var FLAG_ANIMATION_CACHE: Double = js.native
  var FLAG_ANIMATION_DONE: Double = js.native
  var FLAG_CHILDREN_DRAWN_WITH_CACHE: Double = js.native
  var FLAG_CLEAR_TRANSFORMATION: Double = js.native
  var FLAG_CLIP_CHILDREN: Double = js.native
  var FLAG_CLIP_TO_PADDING: Double = js.native
  var FLAG_DISALLOW_INTERCEPT: Double = js.native
  var FLAG_INVALIDATE_REQUIRED: Double = js.native
  var FLAG_LAYOUT_MODE_WAS_EXPLICITLY_SET: Double = js.native
  var FLAG_MASK_FOCUSABILITY: Double = js.native
  var FLAG_NOTIFY_ANIMATION_LISTENER: Double = js.native
  var FLAG_NOTIFY_CHILDREN_ON_DRAWABLE_STATE_CHANGE: Double = js.native
  var FLAG_OPTIMIZE_INVALIDATE: Double = js.native
  var FLAG_PADDING_NOT_NULL: Double = js.native
  var FLAG_PREVENT_DISPATCH_ATTACHED_TO_WINDOW: Double = js.native
  var FLAG_RUN_ANIMATION: Double = js.native
  var FLAG_SPLIT_MOTION_EVENTS: Double = js.native
  var FLAG_SUPPORT_STATIC_TRANSFORMATIONS: Double = js.native
  var FLAG_USE_CHILD_DRAWING_ORDER: Double = js.native
  var FOCUS_AFTER_DESCENDANTS: Double = js.native
  var FOCUS_BEFORE_DESCENDANTS: Double = js.native
  var FOCUS_BLOCK_DESCENDANTS: Double = js.native
  var LAYOUT_MODE_CLIP_BOUNDS: Double = js.native
  var LAYOUT_MODE_DEFAULT: Double = js.native
  var LAYOUT_MODE_UNDEFINED: Double = js.native
  var PERSISTENT_ALL_CACHES: Double = js.native
  var PERSISTENT_ANIMATION_CACHE: Double = js.native
  var PERSISTENT_NO_CACHE: Double = js.native
  var PERSISTENT_SCROLLING_CACHE: Double = js.native
  var ViewGroupClassAttrBind: js.Any = js.native
  /* private */ def canViewReceivePointerEvents(child: js.Any): js.Any = js.native
  def getChildMeasureSpec(spec: Double, padding: Double, childDimension: Double): Double = js.native
  /* private */ def resetCancelNextUpFlag(view: js.Any): js.Any = js.native
  /* static members */
  @js.native
  object LayoutParams extends js.Object {
    var ClassAttrBinderClazzMap: js.Any = js.native
    var FILL_PARENT: Double = js.native
    var MATCH_PARENT: Double = js.native
    var WRAP_CONTENT: Double = js.native
  }
  
  /* static members */
  @js.native
  object MarginLayoutParams extends js.Object {
    var DEFAULT_MARGIN_RELATIVE: Double = js.native
    var DEFAULT_MARGIN_RESOLVED: Double = js.native
    var UNDEFINED_MARGIN: Double = js.native
  }
  
}

