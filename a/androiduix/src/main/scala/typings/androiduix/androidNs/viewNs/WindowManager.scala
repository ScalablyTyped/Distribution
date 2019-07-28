package typings.androiduix.androidNs.viewNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.viewNs.ViewGroupNs.LayoutParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.WindowManager")
@js.native
class WindowManager protected () extends js.Object {
  def this(context: Context) = this()
  var mActiveWindow: Window = js.native
  var mWindowsLayout: js.Any = js.native
  def addWindow(window: Window): Unit = js.native
  def getWindowsLayout(): ViewGroup = js.native
  def removeWindow(window: Window): Unit = js.native
  def updateWindowLayout(window: Window, params: LayoutParams): Unit = js.native
}

/* static members */
@JSGlobal("android.view.WindowManager")
@js.native
object WindowManager extends js.Object {
  var FocusViewRemember: js.Any = js.native
}

