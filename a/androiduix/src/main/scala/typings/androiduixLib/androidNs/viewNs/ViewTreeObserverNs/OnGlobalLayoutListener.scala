package typings
package androiduixLib.androidNs.viewNs.ViewTreeObserverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGlobalLayoutListener extends js.Object {
  def onGlobalLayout(): js.Any
}

object OnGlobalLayoutListener {
  @scala.inline
  def apply(onGlobalLayout: js.Function0[js.Any]): OnGlobalLayoutListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onGlobalLayout")(onGlobalLayout)
    __obj.asInstanceOf[OnGlobalLayoutListener]
  }
}

