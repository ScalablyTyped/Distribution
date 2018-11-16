package typings
package androiduixLib.androidNs.viewNs.WindowManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.WindowManager.Layout")
@js.native
class Layout protected ()
  extends androiduixLib.androidNs.widgetNs.FrameLayout {
  def this(context: androiduixLib.androidNs.contentNs.Context, windowManager: androiduixLib.androidNs.viewNs.WindowManager) = this()
  var mWindowManager: js.Any = js.native
  def getTopFocusableWindowView(): androiduixLib.androidNs.viewNs.ViewGroup = js.native
  def getTopFocusableWindowView(findParent: scala.Boolean): androiduixLib.androidNs.viewNs.ViewGroup = js.native
}

