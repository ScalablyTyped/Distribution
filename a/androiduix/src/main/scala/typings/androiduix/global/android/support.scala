package typings.androiduix.global.android

import typings.androiduix.android.content.Context
import typings.androiduix.android.support.v4.widget.ViewDragHelper.Callback
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object support {
  
  object v4 {
    
    object view {
      
      @JSGlobal("android.support.v4.view.PagerAdapter")
      @js.native
      abstract class PagerAdapter ()
        extends typings.androiduix.android.support.v4.view.PagerAdapter
      object PagerAdapter {
        
        @JSGlobal("android.support.v4.view.PagerAdapter")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("android.support.v4.view.PagerAdapter.POSITION_NONE")
        @js.native
        def POSITION_NONE: Double = js.native
        @scala.inline
        def POSITION_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_NONE")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.PagerAdapter.POSITION_UNCHANGED")
        @js.native
        def POSITION_UNCHANGED: Double = js.native
        @scala.inline
        def POSITION_UNCHANGED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_UNCHANGED")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("android.support.v4.view.ViewPager")
      @js.native
      class ViewPager protected ()
        extends typings.androiduix.android.support.v4.view.ViewPager {
        def this(context: Context) = this()
        def this(context: Context, bindElement: HTMLElement) = this()
        def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: js.Any) = this()
        def this(context: Context, bindElement: HTMLElement, defStyle: js.Any) = this()
      }
      object ViewPager {
        
        @JSGlobal("android.support.v4.view.ViewPager")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.CLOSE_ENOUGH")
        @js.native
        def CLOSE_ENOUGH: js.Any = js.native
        @scala.inline
        def CLOSE_ENOUGH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_ENOUGH")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.COMPARATOR")
        @js.native
        def COMPARATOR: js.Any = js.native
        @scala.inline
        def COMPARATOR_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPARATOR")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.DEFAULT_GUTTER_SIZE")
        @js.native
        def DEFAULT_GUTTER_SIZE: js.Any = js.native
        @scala.inline
        def DEFAULT_GUTTER_SIZE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GUTTER_SIZE")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.DEFAULT_OFFSCREEN_PAGES")
        @js.native
        def DEFAULT_OFFSCREEN_PAGES: js.Any = js.native
        @scala.inline
        def DEFAULT_OFFSCREEN_PAGES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_OFFSCREEN_PAGES")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.DRAW_ORDER_DEFAULT")
        @js.native
        def DRAW_ORDER_DEFAULT: js.Any = js.native
        @scala.inline
        def DRAW_ORDER_DEFAULT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAW_ORDER_DEFAULT")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.DRAW_ORDER_FORWARD")
        @js.native
        def DRAW_ORDER_FORWARD: js.Any = js.native
        @scala.inline
        def DRAW_ORDER_FORWARD_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAW_ORDER_FORWARD")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.DRAW_ORDER_REVERSE")
        @js.native
        def DRAW_ORDER_REVERSE: js.Any = js.native
        @scala.inline
        def DRAW_ORDER_REVERSE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAW_ORDER_REVERSE")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.INVALID_POINTER")
        @js.native
        def INVALID_POINTER: js.Any = js.native
        @scala.inline
        def INVALID_POINTER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_POINTER")(x.asInstanceOf[js.Any])
        
        @JSGlobal("android.support.v4.view.ViewPager.LayoutParams")
        @js.native
        class LayoutParams ()
          extends typings.androiduix.android.support.v4.view.ViewPager.LayoutParams {
          def this(context: Context, attrs: HTMLElement) = this()
        }
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.MAX_SETTLE_DURATION")
        @js.native
        def MAX_SETTLE_DURATION: js.Any = js.native
        @scala.inline
        def MAX_SETTLE_DURATION_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SETTLE_DURATION")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.MIN_DISTANCE_FOR_FLING")
        @js.native
        def MIN_DISTANCE_FOR_FLING: js.Any = js.native
        @scala.inline
        def MIN_DISTANCE_FOR_FLING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_DISTANCE_FOR_FLING")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.MIN_FLING_VELOCITY")
        @js.native
        def MIN_FLING_VELOCITY: js.Any = js.native
        @scala.inline
        def MIN_FLING_VELOCITY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_FLING_VELOCITY")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.SCROLL_STATE_DRAGGING")
        @js.native
        def SCROLL_STATE_DRAGGING: Double = js.native
        @scala.inline
        def SCROLL_STATE_DRAGGING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_STATE_DRAGGING")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.SCROLL_STATE_IDLE")
        @js.native
        def SCROLL_STATE_IDLE: Double = js.native
        @scala.inline
        def SCROLL_STATE_IDLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_STATE_IDLE")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.SCROLL_STATE_SETTLING")
        @js.native
        def SCROLL_STATE_SETTLING: Double = js.native
        @scala.inline
        def SCROLL_STATE_SETTLING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_STATE_SETTLING")(x.asInstanceOf[js.Any])
        
        @JSGlobal("android.support.v4.view.ViewPager.SimpleOnPageChangeListener")
        @js.native
        class SimpleOnPageChangeListener ()
          extends typings.androiduix.android.support.v4.view.ViewPager.SimpleOnPageChangeListener
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.USE_CACHE")
        @js.native
        def USE_CACHE: js.Any = js.native
        @scala.inline
        def USE_CACHE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USE_CACHE")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.isImplDecor")
        @js.native
        def isImplDecor(view: js.Any): js.Any = js.native
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.sInterpolator")
        @js.native
        def sInterpolator: js.Any = js.native
        @scala.inline
        def sInterpolator_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sInterpolator")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.sPositionComparator")
        @js.native
        def sPositionComparator: js.Any = js.native
        @scala.inline
        def sPositionComparator_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sPositionComparator")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.view.ViewPager.setClassImplDecor")
        @js.native
        def setClassImplDecor(clazz: js.Function): Unit = js.native
      }
    }
    
    object widget {
      
      @JSGlobal("android.support.v4.widget.DrawerLayout")
      @js.native
      class DrawerLayout protected ()
        extends typings.androiduix.android.support.v4.widget.DrawerLayout {
        def this(context: Context) = this()
        def this(context: Context, bindElement: HTMLElement) = this()
        def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
        def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
      }
      object DrawerLayout {
        
        @JSGlobal("android.support.v4.widget.DrawerLayout")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.ALLOW_EDGE_LOCK")
        @js.native
        def ALLOW_EDGE_LOCK: Boolean = js.native
        @scala.inline
        def ALLOW_EDGE_LOCK_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALLOW_EDGE_LOCK")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.CHILDREN_DISALLOW_INTERCEPT")
        @js.native
        def CHILDREN_DISALLOW_INTERCEPT: js.Any = js.native
        @scala.inline
        def CHILDREN_DISALLOW_INTERCEPT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHILDREN_DISALLOW_INTERCEPT")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.DEFAULT_SCRIM_COLOR")
        @js.native
        def DEFAULT_SCRIM_COLOR: js.Any = js.native
        @scala.inline
        def DEFAULT_SCRIM_COLOR_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SCRIM_COLOR")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.LOCK_MODE_LOCKED_CLOSED")
        @js.native
        def LOCK_MODE_LOCKED_CLOSED: Double = js.native
        @scala.inline
        def LOCK_MODE_LOCKED_CLOSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCK_MODE_LOCKED_CLOSED")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.LOCK_MODE_LOCKED_OPEN")
        @js.native
        def LOCK_MODE_LOCKED_OPEN: Double = js.native
        @scala.inline
        def LOCK_MODE_LOCKED_OPEN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCK_MODE_LOCKED_OPEN")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.LOCK_MODE_UNLOCKED")
        @js.native
        def LOCK_MODE_UNLOCKED: Double = js.native
        @scala.inline
        def LOCK_MODE_UNLOCKED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCK_MODE_UNLOCKED")(x.asInstanceOf[js.Any])
        
        @JSGlobal("android.support.v4.widget.DrawerLayout.LayoutParams")
        @js.native
        class LayoutParams protected ()
          extends typings.androiduix.android.support.v4.widget.DrawerLayout.LayoutParams {
          def this(source: typings.androiduix.android.support.v4.widget.DrawerLayout.LayoutParams) = this()
          def this(source: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
          def this(source: MarginLayoutParams) = this()
          def this(context: Context, attrs: HTMLElement) = this()
          def this(width: Double, height: Double) = this()
          def this(width: Double, height: Double, gravity: Double) = this()
        }
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.MIN_DRAWER_MARGIN")
        @js.native
        def MIN_DRAWER_MARGIN: js.Any = js.native
        @scala.inline
        def MIN_DRAWER_MARGIN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_DRAWER_MARGIN")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.MIN_FLING_VELOCITY")
        @js.native
        def MIN_FLING_VELOCITY: js.Any = js.native
        @scala.inline
        def MIN_FLING_VELOCITY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_FLING_VELOCITY")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.PEEK_DELAY")
        @js.native
        def PEEK_DELAY: Double = js.native
        @scala.inline
        def PEEK_DELAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PEEK_DELAY")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.STATE_DRAGGING")
        @js.native
        def STATE_DRAGGING: Double = js.native
        @scala.inline
        def STATE_DRAGGING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_DRAGGING")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.STATE_IDLE")
        @js.native
        def STATE_IDLE: Double = js.native
        @scala.inline
        def STATE_IDLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_IDLE")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.STATE_SETTLING")
        @js.native
        def STATE_SETTLING: Double = js.native
        @scala.inline
        def STATE_SETTLING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_SETTLING")(x.asInstanceOf[js.Any])
        
        @JSGlobal("android.support.v4.widget.DrawerLayout.SimpleDrawerListener")
        @js.native
        class SimpleDrawerListener ()
          extends typings.androiduix.android.support.v4.widget.DrawerLayout.SimpleDrawerListener
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.TAG")
        @js.native
        def TAG: js.Any = js.native
        @scala.inline
        def TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.TOUCH_SLOP_SENSITIVITY")
        @js.native
        def TOUCH_SLOP_SENSITIVITY: js.Any = js.native
        @scala.inline
        def TOUCH_SLOP_SENSITIVITY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_SLOP_SENSITIVITY")(x.asInstanceOf[js.Any])
        
        @JSGlobal("android.support.v4.widget.DrawerLayout.ViewDragCallback")
        @js.native
        class ViewDragCallback protected ()
          extends typings.androiduix.android.support.v4.widget.DrawerLayout.ViewDragCallback {
          def this(arg: typings.androiduix.android.support.v4.widget.DrawerLayout, gravity: Double) = this()
        }
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.gravityToString")
        @js.native
        def gravityToString(gravity: Double): String = js.native
        
        /* static member */
        @JSGlobal("android.support.v4.widget.DrawerLayout.hasOpaqueBackground")
        @js.native
        def hasOpaqueBackground(v: js.Any): js.Any = js.native
      }
      
      @JSGlobal("android.support.v4.widget.ViewDragHelper")
      @js.native
      class ViewDragHelper protected ()
        extends typings.androiduix.android.support.v4.widget.ViewDragHelper {
        def this(forParent: ViewGroup, cb: Callback) = this()
      }
      object ViewDragHelper {
        
        @JSGlobal("android.support.v4.widget.ViewDragHelper")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.BASE_SETTLE_DURATION")
        @js.native
        def BASE_SETTLE_DURATION: js.Any = js.native
        @scala.inline
        def BASE_SETTLE_DURATION_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE_SETTLE_DURATION")(x.asInstanceOf[js.Any])
        
        @JSGlobal("android.support.v4.widget.ViewDragHelper.Callback")
        @js.native
        abstract class Callback ()
          extends typings.androiduix.android.support.v4.widget.ViewDragHelper.Callback
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.DIRECTION_ALL")
        @js.native
        def DIRECTION_ALL: Double = js.native
        @scala.inline
        def DIRECTION_ALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_ALL")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.DIRECTION_HORIZONTAL")
        @js.native
        def DIRECTION_HORIZONTAL: Double = js.native
        @scala.inline
        def DIRECTION_HORIZONTAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_HORIZONTAL")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.DIRECTION_VERTICAL")
        @js.native
        def DIRECTION_VERTICAL: Double = js.native
        @scala.inline
        def DIRECTION_VERTICAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_VERTICAL")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.EDGE_ALL")
        @js.native
        def EDGE_ALL: Double = js.native
        @scala.inline
        def EDGE_ALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE_ALL")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.EDGE_BOTTOM")
        @js.native
        def EDGE_BOTTOM: Double = js.native
        @scala.inline
        def EDGE_BOTTOM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE_BOTTOM")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.EDGE_LEFT")
        @js.native
        def EDGE_LEFT: Double = js.native
        @scala.inline
        def EDGE_LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE_LEFT")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.EDGE_RIGHT")
        @js.native
        def EDGE_RIGHT: Double = js.native
        @scala.inline
        def EDGE_RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE_RIGHT")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.EDGE_SIZE")
        @js.native
        def EDGE_SIZE: js.Any = js.native
        @scala.inline
        def EDGE_SIZE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE_SIZE")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.EDGE_TOP")
        @js.native
        def EDGE_TOP: Double = js.native
        @scala.inline
        def EDGE_TOP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE_TOP")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.INVALID_POINTER")
        @js.native
        def INVALID_POINTER: Double = js.native
        @scala.inline
        def INVALID_POINTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_POINTER")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.MAX_SETTLE_DURATION")
        @js.native
        def MAX_SETTLE_DURATION: js.Any = js.native
        @scala.inline
        def MAX_SETTLE_DURATION_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SETTLE_DURATION")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.STATE_DRAGGING")
        @js.native
        def STATE_DRAGGING: Double = js.native
        @scala.inline
        def STATE_DRAGGING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_DRAGGING")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.STATE_IDLE")
        @js.native
        def STATE_IDLE: Double = js.native
        @scala.inline
        def STATE_IDLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_IDLE")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.STATE_SETTLING")
        @js.native
        def STATE_SETTLING: Double = js.native
        @scala.inline
        def STATE_SETTLING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_SETTLING")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.TAG")
        @js.native
        def TAG: js.Any = js.native
        @scala.inline
        def TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.create")
        @js.native
        def create(forParent: ViewGroup, cb: typings.androiduix.android.support.v4.widget.ViewDragHelper.Callback): typings.androiduix.android.support.v4.widget.ViewDragHelper = js.native
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.create")
        @js.native
        def create(
          forParent: ViewGroup,
          sensitivity: Double,
          cb: typings.androiduix.android.support.v4.widget.ViewDragHelper.Callback
        ): typings.androiduix.android.support.v4.widget.ViewDragHelper = js.native
        
        /* static member */
        @JSGlobal("android.support.v4.widget.ViewDragHelper.sInterpolator")
        @js.native
        def sInterpolator: js.Any = js.native
        @scala.inline
        def sInterpolator_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sInterpolator")(x.asInstanceOf[js.Any])
      }
    }
  }
}
