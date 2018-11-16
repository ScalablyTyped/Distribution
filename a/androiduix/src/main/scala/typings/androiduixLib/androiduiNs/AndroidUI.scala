package typings
package androiduixLib.androiduiNs

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
  var appName: java.lang.String = js.native
  var ketEvent: js.Any = js.native
  var mActivityThread: js.Any = js.native
  var mApplication: js.Any = js.native
  var showDebugLayoutDefault: js.Any = js.native
  var tempRect: js.Any = js.native
  var touchEvent: js.Any = js.native
  var uiClient: js.Any = js.native
  var viewsDependOnDebugLayout: js.Any = js.native
  val windowBound: androiduixLib.androidNs.graphicsNs.Rect = js.native
  val windowManager: androiduixLib.androidNs.viewNs.WindowManager = js.native
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
  def setDebugEnable(): scala.Unit = js.native
  def setDebugEnable(enable: scala.Boolean): scala.Unit = js.native
  def setShowDebugLayout(): scala.Unit = js.native
  def setShowDebugLayout(showDebugLayoutDefault: scala.Boolean): scala.Unit = js.native
  def setUIClient(uiClient: androiduixLib.androiduiNs.AndroidUINs.UIClient): scala.Unit = js.native
  def showAppClosed(): scala.Unit = js.native
  /* private */ def showDebugLayout(): js.Any = js.native
  def viewAttachedDependOnDebugLayout(view: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def viewDetachedDependOnDebugLayout(view: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
}

@JSGlobal("androidui.AndroidUI")
@js.native
object AndroidUI extends js.Object {
  var BindToElementName: java.lang.String = js.native
  /* private */ def showAppClosed(androidUI: js.Any): js.Any = js.native
}

