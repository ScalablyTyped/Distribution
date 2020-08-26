package typings.androiduix.android.view.WindowManager

import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.widget.FrameLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends FrameLayout {
  var mWindowManager: js.Any = js.native
  def getTopFocusableWindowView(): ViewGroup = js.native
  def getTopFocusableWindowView(findParent: Boolean): ViewGroup = js.native
}

