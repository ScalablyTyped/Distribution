package typings.androiduix.androidNs.viewNs.WindowManagerNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.viewNs.ViewGroup
import typings.androiduix.androidNs.viewNs.WindowManager
import typings.androiduix.androidNs.widgetNs.FrameLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.WindowManager.Layout")
@js.native
class Layout protected () extends FrameLayout {
  def this(context: Context, windowManager: WindowManager) = this()
  var mWindowManager: js.Any = js.native
  def getTopFocusableWindowView(): ViewGroup = js.native
  def getTopFocusableWindowView(findParent: Boolean): ViewGroup = js.native
}

