package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.Window")
@js.native
class Window protected () extends js.Object {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  var mAttachInfo: js.Any = js.native
  var mCallback: js.Any = js.native
  var mChildWindowManager: js.Any = js.native
  var mCloseOnTouchOutside: js.Any = js.native
  var mContainer: js.Any = js.native
  var mContentParent: js.Any = js.native
  var mContext: js.Any = js.native
  var mDecor: js.Any = js.native
  var mDestroyed: js.Any = js.native
  var mIsActive: js.Any = js.native
  var mSetCloseOnTouchOutside: js.Any = js.native
  var mWindowAttributes: js.Any = js.native
  def addContentView(view: View, params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): scala.Unit = js.native
  def addFlags(flags: scala.Double): scala.Unit = js.native
  def clearFlags(flags: scala.Double): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def findViewById(id: java.lang.String): View = js.native
  def getAttributes(): androiduixLib.androidNs.viewNs.WindowManagerNs.LayoutParams = js.native
  def getCallback(): androiduixLib.androidNs.viewNs.WindowNs.Callback = js.native
  def getChildWindowManager(): WindowManager = js.native
  def getContainer(): WindowManager = js.native
  def getContentParent(): ViewGroup = js.native
  def getContext(): androiduixLib.androidNs.contentNs.Context = js.native
  def getCurrentFocus(): View = js.native
  def getDecorView(): View = js.native
  def getLayoutInflater(): LayoutInflater = js.native
  /* private */ def initAttachInfo(): js.Any = js.native
  /* private */ def initDecorView(): js.Any = js.native
  def isActive(): scala.Boolean = js.native
  def isDestroyed(): scala.Boolean = js.native
  def isFloating(): scala.Boolean = js.native
  /* private */ def isOutOfBounds(context: js.Any, event: js.Any): js.Any = js.native
  def makeActive(): scala.Unit = js.native
  /* protected */ def onActive(): scala.Unit = js.native
  def peekDecorView(): View = js.native
  def setAttributes(a: androiduixLib.androidNs.viewNs.WindowManagerNs.LayoutParams): scala.Unit = js.native
  def setBackgroundColor(color: scala.Double): scala.Unit = js.native
  def setBackgroundDrawable(drawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setCallback(callback: androiduixLib.androidNs.viewNs.WindowNs.Callback): scala.Unit = js.native
  def setChildWindowManager(wm: WindowManager): scala.Unit = js.native
  def setCloseOnTouchOutside(close: scala.Boolean): scala.Unit = js.native
  def setCloseOnTouchOutsideIfNotSet(close: scala.Boolean): scala.Unit = js.native
  def setContainer(container: WindowManager): scala.Unit = js.native
  def setContentView(view: View): scala.Unit = js.native
  def setContentView(view: View, params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): scala.Unit = js.native
  def setDimAmount(amount: scala.Double): scala.Unit = js.native
  def setFlags(flags: scala.Double, mask: scala.Double): scala.Unit = js.native
  def setFloating(isFloating: scala.Boolean): scala.Unit = js.native
  def setGravity(gravity: scala.Double): scala.Unit = js.native
  def setLayout(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def setType(`type`: scala.Double): scala.Unit = js.native
  def setWindowAnimations(
    enterAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    exitAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation
  ): scala.Unit = js.native
  def setWindowAnimations(
    enterAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    exitAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    resumeAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation
  ): scala.Unit = js.native
  def setWindowAnimations(
    enterAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    exitAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    resumeAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    hideAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation
  ): scala.Unit = js.native
  def shouldCloseOnTouch(context: androiduixLib.androidNs.contentNs.Context, event: MotionEvent): scala.Boolean = js.native
  def superDispatchGenericMotionEvent(event: MotionEvent): scala.Boolean = js.native
  def superDispatchKeyEvent(event: KeyEvent): scala.Boolean = js.native
  def superDispatchTouchEvent(event: MotionEvent): scala.Boolean = js.native
  def takeKeyEvents(_get: scala.Boolean): scala.Unit = js.native
}

