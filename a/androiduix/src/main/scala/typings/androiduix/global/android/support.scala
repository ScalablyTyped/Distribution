package typings.androiduix.global.android

import typings.androiduix.android.content.Context
import typings.androiduix.android.support.v4.widget.ViewDragHelper.Callback
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.support")
@js.native
object support extends js.Object {
  
  @js.native
  object v4 extends js.Object {
    
    @js.native
    object view extends js.Object {
      
      @js.native
      abstract class PagerAdapter ()
        extends typings.androiduix.android.support.v4.view.PagerAdapter
      /* static members */
      @js.native
      object PagerAdapter extends js.Object {
        
        var POSITION_NONE: Double = js.native
        
        var POSITION_UNCHANGED: Double = js.native
      }
      
      @js.native
      class ViewPager protected ()
        extends typings.androiduix.android.support.v4.view.ViewPager {
        def this(context: Context) = this()
        def this(context: Context, bindElement: HTMLElement) = this()
        def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: js.Any) = this()
        def this(context: Context, bindElement: HTMLElement, defStyle: js.Any) = this()
      }
      /* static members */
      @js.native
      object ViewPager extends js.Object {
        
        var CLOSE_ENOUGH: js.Any = js.native
        
        var COMPARATOR: js.Any = js.native
        
        var DEFAULT_GUTTER_SIZE: js.Any = js.native
        
        var DEFAULT_OFFSCREEN_PAGES: js.Any = js.native
        
        var DRAW_ORDER_DEFAULT: js.Any = js.native
        
        var DRAW_ORDER_FORWARD: js.Any = js.native
        
        var DRAW_ORDER_REVERSE: js.Any = js.native
        
        var INVALID_POINTER: js.Any = js.native
        
        var MAX_SETTLE_DURATION: js.Any = js.native
        
        var MIN_DISTANCE_FOR_FLING: js.Any = js.native
        
        var MIN_FLING_VELOCITY: js.Any = js.native
        
        var SCROLL_STATE_DRAGGING: Double = js.native
        
        var SCROLL_STATE_IDLE: Double = js.native
        
        var SCROLL_STATE_SETTLING: Double = js.native
        
        var USE_CACHE: js.Any = js.native
        
        /* private */ def isImplDecor(view: js.Any): js.Any = js.native
        
        var sInterpolator: js.Any = js.native
        
        var sPositionComparator: js.Any = js.native
        
        def setClassImplDecor(clazz: js.Function): Unit = js.native
        
        @js.native
        class LayoutParams ()
          extends typings.androiduix.android.support.v4.view.ViewPager.LayoutParams {
          def this(context: Context, attrs: HTMLElement) = this()
        }
        
        @js.native
        class SimpleOnPageChangeListener ()
          extends typings.androiduix.android.support.v4.view.ViewPager.SimpleOnPageChangeListener
      }
    }
    
    @js.native
    object widget extends js.Object {
      
      @js.native
      class DrawerLayout protected ()
        extends typings.androiduix.android.support.v4.widget.DrawerLayout {
        def this(context: Context) = this()
        def this(context: Context, bindElement: HTMLElement) = this()
        def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
        def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
      }
      /* static members */
      @js.native
      object DrawerLayout extends js.Object {
        
        var ALLOW_EDGE_LOCK: Boolean = js.native
        
        var CHILDREN_DISALLOW_INTERCEPT: js.Any = js.native
        
        var DEFAULT_SCRIM_COLOR: js.Any = js.native
        
        var LOCK_MODE_LOCKED_CLOSED: Double = js.native
        
        var LOCK_MODE_LOCKED_OPEN: Double = js.native
        
        var LOCK_MODE_UNLOCKED: Double = js.native
        
        var MIN_DRAWER_MARGIN: js.Any = js.native
        
        var MIN_FLING_VELOCITY: js.Any = js.native
        
        var PEEK_DELAY: Double = js.native
        
        var STATE_DRAGGING: Double = js.native
        
        var STATE_IDLE: Double = js.native
        
        var STATE_SETTLING: Double = js.native
        
        var TAG: js.Any = js.native
        
        var TOUCH_SLOP_SENSITIVITY: js.Any = js.native
        
        def gravityToString(gravity: Double): String = js.native
        
        /* private */ def hasOpaqueBackground(v: js.Any): js.Any = js.native
        
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
        
        @js.native
        class SimpleDrawerListener ()
          extends typings.androiduix.android.support.v4.widget.DrawerLayout.SimpleDrawerListener
        
        @js.native
        class ViewDragCallback protected ()
          extends typings.androiduix.android.support.v4.widget.DrawerLayout.ViewDragCallback {
          def this(arg: typings.androiduix.android.support.v4.widget.DrawerLayout, gravity: Double) = this()
        }
      }
      
      @js.native
      class ViewDragHelper protected ()
        extends typings.androiduix.android.support.v4.widget.ViewDragHelper {
        def this(forParent: ViewGroup, cb: Callback) = this()
      }
      /* static members */
      @js.native
      object ViewDragHelper extends js.Object {
        
        var BASE_SETTLE_DURATION: js.Any = js.native
        
        var DIRECTION_ALL: Double = js.native
        
        var DIRECTION_HORIZONTAL: Double = js.native
        
        var DIRECTION_VERTICAL: Double = js.native
        
        var EDGE_ALL: Double = js.native
        
        var EDGE_BOTTOM: Double = js.native
        
        var EDGE_LEFT: Double = js.native
        
        var EDGE_RIGHT: Double = js.native
        
        var EDGE_SIZE: js.Any = js.native
        
        var EDGE_TOP: Double = js.native
        
        var INVALID_POINTER: Double = js.native
        
        var MAX_SETTLE_DURATION: js.Any = js.native
        
        var STATE_DRAGGING: Double = js.native
        
        var STATE_IDLE: Double = js.native
        
        var STATE_SETTLING: Double = js.native
        
        var TAG: js.Any = js.native
        
        def create(forParent: ViewGroup, cb: typings.androiduix.android.support.v4.widget.ViewDragHelper.Callback): typings.androiduix.android.support.v4.widget.ViewDragHelper = js.native
        def create(
          forParent: ViewGroup,
          sensitivity: Double,
          cb: typings.androiduix.android.support.v4.widget.ViewDragHelper.Callback
        ): typings.androiduix.android.support.v4.widget.ViewDragHelper = js.native
        
        var sInterpolator: js.Any = js.native
        
        @js.native
        abstract class Callback ()
          extends typings.androiduix.android.support.v4.widget.ViewDragHelper.Callback
      }
    }
  }
}
