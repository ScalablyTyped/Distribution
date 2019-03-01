package typings
package androiduixLib.androidNs.viewNs.ViewTreeObserverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDrawListener extends js.Object {
  def onDraw(): js.Any
}

object OnDrawListener {
  @scala.inline
  def apply(onDraw: js.Function0[js.Any]): OnDrawListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDraw")(onDraw)
    __obj.asInstanceOf[OnDrawListener]
  }
}

