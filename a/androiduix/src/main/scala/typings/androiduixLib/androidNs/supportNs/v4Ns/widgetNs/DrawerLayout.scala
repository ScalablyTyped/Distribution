package typings
package androiduixLib.androidNs.supportNs.v4Ns.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.support.v4.widget.DrawerLayout")
@js.native
class DrawerLayout protected ()
  extends androiduixLib.androidNs.viewNs.ViewGroup {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mChildrenCanceledTouch: js.Any = js.native
  var mDisallowInterceptRequested: js.Any = js.native
  var mDrawerState: js.Any = js.native
  var mFirstLayout: js.Any = js.native
  var mInLayout: js.Any = js.native
  var mInitialMotionX: js.Any = js.native
  var mInitialMotionY: js.Any = js.native
  var mLeftCallback: js.Any = js.native
  var mLeftDragger: js.Any = js.native
  var mListener: js.Any = js.native
  var mLockModeLeft: js.Any = js.native
  var mLockModeRight: js.Any = js.native
  var mMinDrawerMargin: js.Any = js.native
  var mRightCallback: js.Any = js.native
  var mRightDragger: js.Any = js.native
  var mScrimColor: js.Any = js.native
  var mScrimOpacity: js.Any = js.native
  var mScrimPaint: js.Any = js.native
  var mShadowLeft: js.Any = js.native
  var mShadowRight: js.Any = js.native
  /* private */ def _closeDrawer_gravity(gravity: js.Any): js.Any = js.native
  /* private */ def _closeDrawer_view(drawerView: js.Any): js.Any = js.native
  /* private */ def _isDrawerOpen_gravity(drawerGravity: js.Any): js.Any = js.native
  /* private */ def _isDrawerOpen_view(drawer: js.Any): js.Any = js.native
  /* private */ def _isDrawerVisible_gravity(drawerGravity: js.Any): js.Any = js.native
  /* private */ def _isDrawerVisible_view(drawer: js.Any): js.Any = js.native
  /* private */ def _openDrawer_gravity(gravity: js.Any): js.Any = js.native
  /* private */ def _openDrawer_view(drawerView: js.Any): js.Any = js.native
  def cancelChildViewTouch(): scala.Unit = js.native
  def checkDrawerViewAbsoluteGravity(drawerView: androiduixLib.androidNs.viewNs.View, checkFor: scala.Double): scala.Boolean = js.native
  def closeDrawer(drawerView: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def closeDrawer(gravity: scala.Double): scala.Unit = js.native
  def closeDrawers(): scala.Unit = js.native
  def closeDrawers(peekingOnly: scala.Boolean): scala.Unit = js.native
  def dispatchOnDrawerClosed(drawerView: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def dispatchOnDrawerOpened(drawerView: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def dispatchOnDrawerSlide(drawerView: androiduixLib.androidNs.viewNs.View, slideOffset: scala.Double): scala.Unit = js.native
  def findDrawerWithGravity(gravity: scala.Double): androiduixLib.androidNs.viewNs.View = js.native
  def findOpenDrawer(): androiduixLib.androidNs.viewNs.View = js.native
  /* private */ def findVisibleDrawer(): js.Any = js.native
  def getDrawerLockMode(edgeGravityOrView: androiduixLib.androidNs.viewNs.View): scala.Double = js.native
  def getDrawerLockMode(edgeGravityOrView: scala.Double): scala.Double = js.native
  def getDrawerViewAbsoluteGravity(drawerView: androiduixLib.androidNs.viewNs.View): scala.Double = js.native
  def getDrawerViewOffset(drawerView: androiduixLib.androidNs.viewNs.View): scala.Double = js.native
  /* private */ def hasPeekingDrawer(): js.Any = js.native
  /* private */ def hasVisibleDrawer(): js.Any = js.native
  def isContentView(child: androiduixLib.androidNs.viewNs.View): scala.Boolean = js.native
  def isDrawerOpen(drawerGravity: scala.Double): scala.Boolean = js.native
  def isDrawerOpen(drawer: androiduixLib.androidNs.viewNs.View): scala.Boolean = js.native
  def isDrawerView(child: androiduixLib.androidNs.viewNs.View): scala.Boolean = js.native
  def isDrawerVisible(drawerGravity: scala.Double): scala.Boolean = js.native
  def isDrawerVisible(drawer: androiduixLib.androidNs.viewNs.View): scala.Boolean = js.native
  def moveDrawerToOffset(drawerView: androiduixLib.androidNs.viewNs.View, slideOffset: scala.Double): scala.Unit = js.native
  def openDrawer(drawerView: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def openDrawer(gravity: scala.Double): scala.Unit = js.native
  def setDrawerListener(listener: androiduixLib.androidNs.supportNs.v4Ns.widgetNs.DrawerLayoutNs.DrawerListener): scala.Unit = js.native
  def setDrawerLockMode(lockMode: scala.Double): scala.Unit = js.native
  def setDrawerLockMode(lockMode: scala.Double, edgeGravityOrView: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setDrawerLockMode(lockMode: scala.Double, edgeGravityOrView: scala.Double): scala.Unit = js.native
  def setDrawerShadow(shadowDrawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable, gravity: scala.Double): scala.Unit = js.native
  def setDrawerViewOffset(drawerView: androiduixLib.androidNs.viewNs.View, slideOffset: scala.Double): scala.Unit = js.native
  def setScrimColor(color: scala.Double): scala.Unit = js.native
  def updateDrawerState(
    forGravity: scala.Double,
    activeState: scala.Double,
    activeDrawer: androiduixLib.androidNs.viewNs.View
  ): scala.Unit = js.native
}

@JSGlobal("android.support.v4.widget.DrawerLayout")
@js.native
object DrawerLayout extends js.Object {
  var ALLOW_EDGE_LOCK: scala.Boolean = js.native
  var CHILDREN_DISALLOW_INTERCEPT: js.Any = js.native
  var DEFAULT_SCRIM_COLOR: js.Any = js.native
  var LOCK_MODE_LOCKED_CLOSED: scala.Double = js.native
  var LOCK_MODE_LOCKED_OPEN: scala.Double = js.native
  var LOCK_MODE_UNLOCKED: scala.Double = js.native
  var MIN_DRAWER_MARGIN: js.Any = js.native
  var MIN_FLING_VELOCITY: js.Any = js.native
  var PEEK_DELAY: scala.Double = js.native
  var STATE_DRAGGING: scala.Double = js.native
  var STATE_IDLE: scala.Double = js.native
  var STATE_SETTLING: scala.Double = js.native
  var TAG: js.Any = js.native
  var TOUCH_SLOP_SENSITIVITY: js.Any = js.native
  def gravityToString(gravity: scala.Double): java.lang.String = js.native
  /* private */ def hasOpaqueBackground(v: js.Any): js.Any = js.native
}

