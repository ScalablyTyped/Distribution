package typings.androiduix.global.android.view

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.view.ViewGroup")
@js.native
abstract class ViewGroup protected ()
  extends typings.androiduix.android.view.ViewGroup {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
object ViewGroup {
  
  @JSGlobal("android.view.ViewGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.CLIP_TO_PADDING_MASK")
  @js.native
  def CLIP_TO_PADDING_MASK: Double = js.native
  @scala.inline
  def CLIP_TO_PADDING_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIP_TO_PADDING_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_ADD_STATES_FROM_CHILDREN")
  @js.native
  def FLAG_ADD_STATES_FROM_CHILDREN: Double = js.native
  @scala.inline
  def FLAG_ADD_STATES_FROM_CHILDREN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_ADD_STATES_FROM_CHILDREN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_ALPHA_LOWER_THAN_ONE")
  @js.native
  def FLAG_ALPHA_LOWER_THAN_ONE: Double = js.native
  @scala.inline
  def FLAG_ALPHA_LOWER_THAN_ONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_ALPHA_LOWER_THAN_ONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_ALWAYS_DRAWN_WITH_CACHE")
  @js.native
  def FLAG_ALWAYS_DRAWN_WITH_CACHE: Double = js.native
  @scala.inline
  def FLAG_ALWAYS_DRAWN_WITH_CACHE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_ALWAYS_DRAWN_WITH_CACHE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_ANIMATION_CACHE")
  @js.native
  def FLAG_ANIMATION_CACHE: Double = js.native
  @scala.inline
  def FLAG_ANIMATION_CACHE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_ANIMATION_CACHE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_ANIMATION_DONE")
  @js.native
  def FLAG_ANIMATION_DONE: Double = js.native
  @scala.inline
  def FLAG_ANIMATION_DONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_ANIMATION_DONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_CHILDREN_DRAWN_WITH_CACHE")
  @js.native
  def FLAG_CHILDREN_DRAWN_WITH_CACHE: Double = js.native
  @scala.inline
  def FLAG_CHILDREN_DRAWN_WITH_CACHE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_CHILDREN_DRAWN_WITH_CACHE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_CLEAR_TRANSFORMATION")
  @js.native
  def FLAG_CLEAR_TRANSFORMATION: Double = js.native
  @scala.inline
  def FLAG_CLEAR_TRANSFORMATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_CLEAR_TRANSFORMATION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_CLIP_CHILDREN")
  @js.native
  def FLAG_CLIP_CHILDREN: Double = js.native
  @scala.inline
  def FLAG_CLIP_CHILDREN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_CLIP_CHILDREN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_CLIP_TO_PADDING")
  @js.native
  def FLAG_CLIP_TO_PADDING: Double = js.native
  @scala.inline
  def FLAG_CLIP_TO_PADDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_CLIP_TO_PADDING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_DISALLOW_INTERCEPT")
  @js.native
  def FLAG_DISALLOW_INTERCEPT: Double = js.native
  @scala.inline
  def FLAG_DISALLOW_INTERCEPT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_DISALLOW_INTERCEPT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_INVALIDATE_REQUIRED")
  @js.native
  def FLAG_INVALIDATE_REQUIRED: Double = js.native
  @scala.inline
  def FLAG_INVALIDATE_REQUIRED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_INVALIDATE_REQUIRED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_LAYOUT_MODE_WAS_EXPLICITLY_SET")
  @js.native
  def FLAG_LAYOUT_MODE_WAS_EXPLICITLY_SET: Double = js.native
  @scala.inline
  def FLAG_LAYOUT_MODE_WAS_EXPLICITLY_SET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_LAYOUT_MODE_WAS_EXPLICITLY_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_MASK_FOCUSABILITY")
  @js.native
  def FLAG_MASK_FOCUSABILITY: Double = js.native
  @scala.inline
  def FLAG_MASK_FOCUSABILITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_MASK_FOCUSABILITY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_NOTIFY_ANIMATION_LISTENER")
  @js.native
  def FLAG_NOTIFY_ANIMATION_LISTENER: Double = js.native
  @scala.inline
  def FLAG_NOTIFY_ANIMATION_LISTENER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_NOTIFY_ANIMATION_LISTENER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_NOTIFY_CHILDREN_ON_DRAWABLE_STATE_CHANGE")
  @js.native
  def FLAG_NOTIFY_CHILDREN_ON_DRAWABLE_STATE_CHANGE: Double = js.native
  @scala.inline
  def FLAG_NOTIFY_CHILDREN_ON_DRAWABLE_STATE_CHANGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_NOTIFY_CHILDREN_ON_DRAWABLE_STATE_CHANGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_OPTIMIZE_INVALIDATE")
  @js.native
  def FLAG_OPTIMIZE_INVALIDATE: Double = js.native
  @scala.inline
  def FLAG_OPTIMIZE_INVALIDATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_OPTIMIZE_INVALIDATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_PADDING_NOT_NULL")
  @js.native
  def FLAG_PADDING_NOT_NULL: Double = js.native
  @scala.inline
  def FLAG_PADDING_NOT_NULL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_PADDING_NOT_NULL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_PREVENT_DISPATCH_ATTACHED_TO_WINDOW")
  @js.native
  def FLAG_PREVENT_DISPATCH_ATTACHED_TO_WINDOW: Double = js.native
  @scala.inline
  def FLAG_PREVENT_DISPATCH_ATTACHED_TO_WINDOW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_PREVENT_DISPATCH_ATTACHED_TO_WINDOW")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_RUN_ANIMATION")
  @js.native
  def FLAG_RUN_ANIMATION: Double = js.native
  @scala.inline
  def FLAG_RUN_ANIMATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_RUN_ANIMATION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_SPLIT_MOTION_EVENTS")
  @js.native
  def FLAG_SPLIT_MOTION_EVENTS: Double = js.native
  @scala.inline
  def FLAG_SPLIT_MOTION_EVENTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_SPLIT_MOTION_EVENTS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_SUPPORT_STATIC_TRANSFORMATIONS")
  @js.native
  def FLAG_SUPPORT_STATIC_TRANSFORMATIONS: Double = js.native
  @scala.inline
  def FLAG_SUPPORT_STATIC_TRANSFORMATIONS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_SUPPORT_STATIC_TRANSFORMATIONS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FLAG_USE_CHILD_DRAWING_ORDER")
  @js.native
  def FLAG_USE_CHILD_DRAWING_ORDER: Double = js.native
  @scala.inline
  def FLAG_USE_CHILD_DRAWING_ORDER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAG_USE_CHILD_DRAWING_ORDER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FOCUS_AFTER_DESCENDANTS")
  @js.native
  def FOCUS_AFTER_DESCENDANTS: Double = js.native
  @scala.inline
  def FOCUS_AFTER_DESCENDANTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_AFTER_DESCENDANTS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FOCUS_BEFORE_DESCENDANTS")
  @js.native
  def FOCUS_BEFORE_DESCENDANTS: Double = js.native
  @scala.inline
  def FOCUS_BEFORE_DESCENDANTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_BEFORE_DESCENDANTS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.FOCUS_BLOCK_DESCENDANTS")
  @js.native
  def FOCUS_BLOCK_DESCENDANTS: Double = js.native
  @scala.inline
  def FOCUS_BLOCK_DESCENDANTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_BLOCK_DESCENDANTS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.LAYOUT_MODE_CLIP_BOUNDS")
  @js.native
  def LAYOUT_MODE_CLIP_BOUNDS: Double = js.native
  @scala.inline
  def LAYOUT_MODE_CLIP_BOUNDS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_MODE_CLIP_BOUNDS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.LAYOUT_MODE_DEFAULT")
  @js.native
  def LAYOUT_MODE_DEFAULT: Double = js.native
  @scala.inline
  def LAYOUT_MODE_DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_MODE_DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.LAYOUT_MODE_UNDEFINED")
  @js.native
  def LAYOUT_MODE_UNDEFINED: Double = js.native
  @scala.inline
  def LAYOUT_MODE_UNDEFINED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAYOUT_MODE_UNDEFINED")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.view.ViewGroup.LayoutParams")
  @js.native
  class LayoutParams protected ()
    extends typings.androiduix.android.view.ViewGroup.LayoutParams {
    def this(args: js.Any*) = this()
    def this(src: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(width: Double, height: Double) = this()
  }
  object LayoutParams {
    
    @JSGlobal("android.view.ViewGroup.LayoutParams")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.view.ViewGroup.LayoutParams.ClassAttrBinderClazzMap")
    @js.native
    def ClassAttrBinderClazzMap: js.Any = js.native
    @scala.inline
    def ClassAttrBinderClazzMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassAttrBinderClazzMap")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.ViewGroup.LayoutParams.FILL_PARENT")
    @js.native
    def FILL_PARENT: Double = js.native
    @scala.inline
    def FILL_PARENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILL_PARENT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.ViewGroup.LayoutParams.MATCH_PARENT")
    @js.native
    def MATCH_PARENT: Double = js.native
    @scala.inline
    def MATCH_PARENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MATCH_PARENT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.ViewGroup.LayoutParams.WRAP_CONTENT")
    @js.native
    def WRAP_CONTENT: Double = js.native
    @scala.inline
    def WRAP_CONTENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WRAP_CONTENT")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.view.ViewGroup.MarginLayoutParams")
  @js.native
  class MarginLayoutParams protected ()
    extends typings.androiduix.android.view.ViewGroup.MarginLayoutParams {
    def this(args: js.Any*) = this()
    def this(src: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(src: typings.androiduix.android.view.ViewGroup.MarginLayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(width: Double, height: Double) = this()
  }
  object MarginLayoutParams {
    
    @JSGlobal("android.view.ViewGroup.MarginLayoutParams")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.view.ViewGroup.MarginLayoutParams.DEFAULT_MARGIN_RELATIVE")
    @js.native
    def DEFAULT_MARGIN_RELATIVE: Double = js.native
    @scala.inline
    def DEFAULT_MARGIN_RELATIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MARGIN_RELATIVE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.ViewGroup.MarginLayoutParams.DEFAULT_MARGIN_RESOLVED")
    @js.native
    def DEFAULT_MARGIN_RESOLVED: Double = js.native
    @scala.inline
    def DEFAULT_MARGIN_RESOLVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MARGIN_RESOLVED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.view.ViewGroup.MarginLayoutParams.UNDEFINED_MARGIN")
    @js.native
    def UNDEFINED_MARGIN: Double = js.native
    @scala.inline
    def UNDEFINED_MARGIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNDEFINED_MARGIN")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.PERSISTENT_ALL_CACHES")
  @js.native
  def PERSISTENT_ALL_CACHES: Double = js.native
  @scala.inline
  def PERSISTENT_ALL_CACHES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERSISTENT_ALL_CACHES")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.PERSISTENT_ANIMATION_CACHE")
  @js.native
  def PERSISTENT_ANIMATION_CACHE: Double = js.native
  @scala.inline
  def PERSISTENT_ANIMATION_CACHE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERSISTENT_ANIMATION_CACHE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.PERSISTENT_NO_CACHE")
  @js.native
  def PERSISTENT_NO_CACHE: Double = js.native
  @scala.inline
  def PERSISTENT_NO_CACHE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERSISTENT_NO_CACHE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.PERSISTENT_SCROLLING_CACHE")
  @js.native
  def PERSISTENT_SCROLLING_CACHE: Double = js.native
  @scala.inline
  def PERSISTENT_SCROLLING_CACHE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERSISTENT_SCROLLING_CACHE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.ViewGroupClassAttrBind")
  @js.native
  def ViewGroupClassAttrBind: js.Any = js.native
  @scala.inline
  def ViewGroupClassAttrBind_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ViewGroupClassAttrBind")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.canViewReceivePointerEvents")
  @js.native
  def canViewReceivePointerEvents(child: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.getChildMeasureSpec")
  @js.native
  def getChildMeasureSpec(spec: Double, padding: Double, childDimension: Double): Double = js.native
  
  /* static member */
  @JSGlobal("android.view.ViewGroup.resetCancelNextUpFlag")
  @js.native
  def resetCancelNextUpFlag(view: js.Any): js.Any = js.native
}
