package typings.androiduix.android.support.v4.widget

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.support.v4.widget.DrawerLayout.DrawerListener
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerLayout_ extends ViewGroup {
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
  def cancelChildViewTouch(): Unit = js.native
  def checkDrawerViewAbsoluteGravity(drawerView: View, checkFor: Double): Boolean = js.native
  def closeDrawer(drawerView: View): Unit = js.native
  def closeDrawer(gravity: Double): Unit = js.native
  def closeDrawers(): Unit = js.native
  def closeDrawers(peekingOnly: Boolean): Unit = js.native
  def dispatchOnDrawerClosed(drawerView: View): Unit = js.native
  def dispatchOnDrawerOpened(drawerView: View): Unit = js.native
  def dispatchOnDrawerSlide(drawerView: View, slideOffset: Double): Unit = js.native
  def findDrawerWithGravity(gravity: Double): View = js.native
  def findOpenDrawer(): View = js.native
  /* private */ def findVisibleDrawer(): js.Any = js.native
  def getDrawerLockMode(edgeGravityOrView: Double): Double = js.native
  def getDrawerLockMode(edgeGravityOrView: View): Double = js.native
  def getDrawerViewAbsoluteGravity(drawerView: View): Double = js.native
  def getDrawerViewOffset(drawerView: View): Double = js.native
  /* private */ def hasPeekingDrawer(): js.Any = js.native
  /* private */ def hasVisibleDrawer(): js.Any = js.native
  def isContentView(child: View): Boolean = js.native
  def isDrawerOpen(drawerGravity: Double): Boolean = js.native
  def isDrawerOpen(drawer: View): Boolean = js.native
  def isDrawerView(child: View): Boolean = js.native
  def isDrawerVisible(drawerGravity: Double): Boolean = js.native
  def isDrawerVisible(drawer: View): Boolean = js.native
  def moveDrawerToOffset(drawerView: View, slideOffset: Double): Unit = js.native
  def openDrawer(drawerView: View): Unit = js.native
  def openDrawer(gravity: Double): Unit = js.native
  def setDrawerListener(listener: DrawerListener): Unit = js.native
  def setDrawerLockMode(lockMode: Double): Unit = js.native
  def setDrawerLockMode(lockMode: Double, edgeGravityOrView: Double): Unit = js.native
  def setDrawerLockMode(lockMode: Double, edgeGravityOrView: View): Unit = js.native
  def setDrawerShadow(shadowDrawable: Drawable, gravity: Double): Unit = js.native
  def setDrawerViewOffset(drawerView: View, slideOffset: Double): Unit = js.native
  def setScrimColor(color: Double): Unit = js.native
  def updateDrawerState(forGravity: Double, activeState: Double, activeDrawer: View): Unit = js.native
}

