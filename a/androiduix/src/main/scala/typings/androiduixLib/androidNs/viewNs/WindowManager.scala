package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.WindowManager")
@js.native
class WindowManager protected () extends js.Object {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  var mActiveWindow: Window = js.native
  var mWindowsLayout: js.Any = js.native
  def addWindow(window: Window): scala.Unit = js.native
  def getWindowsLayout(): ViewGroup = js.native
  def removeWindow(window: Window): scala.Unit = js.native
  def updateWindowLayout(window: Window, params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.view.WindowManager")
@js.native
object WindowManager extends js.Object {
  var FocusViewRemember: js.Any = js.native
}

