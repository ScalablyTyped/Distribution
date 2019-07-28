package typings.androiduix.androiduiNs

import typings.androiduix.androidNs.graphicsNs.Rect
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.WindowManager
import typings.androiduix.androiduiNs.AndroidUINs.UIClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.AndroidUI")
@js.native
class AndroidUI protected () extends js.Object {
  def this(androidUIElement: AndroidUIElement) = this()
  var _canvas: js.Any = js.native
  var _viewRootImpl: js.Any = js.native
  var _windowBound: js.Any = js.native
  var androidUIElement: AndroidUIElement = js.native
  var appName: String = js.native
  var ketEvent: js.Any = js.native
  var mActivityThread: js.Any = js.native
  var mApplication: js.Any = js.native
  var showDebugLayoutDefault: js.Any = js.native
  var tempRect: js.Any = js.native
  var touchEvent: js.Any = js.native
  var uiClient: js.Any = js.native
  var viewsDependOnDebugLayout: js.Any = js.native
  val windowBound: Rect = js.native
  val windowManager: WindowManager = js.native
  /* private */ def hideDebugLayout(): js.Any = js.native
  /* private */ def init(): js.Any = js.native
  /* private */ def initAndroidUIElement(): js.Any = js.native
  /* private */ def initApplication(): js.Any = js.native
  /* private */ def initBrowserVisibleChange(): js.Any = js.native
  /* private */ def initEvent(): js.Any = js.native
  /* private */ def initGenericEvent(): js.Any = js.native
  /* private */ def initGlobalCrashHandle(): js.Any = js.native
  /* private */ def initKeyEvent(): js.Any = js.native
  /* private */ def initLaunchActivity(): js.Any = js.native
  /* private */ def initMouseEvent(): js.Any = js.native
  /* private */ def initRootSizeChange(): js.Any = js.native
  /* private */ def initTouchEvent(): js.Any = js.native
  /* private */ def notifyRootSizeChange(): js.Any = js.native
  /* private */ def refreshWindowBound(): js.Any = js.native
  def setDebugEnable(): Unit = js.native
  def setDebugEnable(enable: Boolean): Unit = js.native
  def setShowDebugLayout(): Unit = js.native
  def setShowDebugLayout(showDebugLayoutDefault: Boolean): Unit = js.native
  def setUIClient(uiClient: UIClient): Unit = js.native
  def showAppClosed(): Unit = js.native
  /* private */ def showDebugLayout(): js.Any = js.native
  def viewAttachedDependOnDebugLayout(view: View): Unit = js.native
  def viewDetachedDependOnDebugLayout(view: View): Unit = js.native
}

/* static members */
@JSGlobal("androidui.AndroidUI")
@js.native
object AndroidUI extends js.Object {
  var BindToElementName: String = js.native
  /* private */ def showAppClosed(androidUI: js.Any): js.Any = js.native
}

