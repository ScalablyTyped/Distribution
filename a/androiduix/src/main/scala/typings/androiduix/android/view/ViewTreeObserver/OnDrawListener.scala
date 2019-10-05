package typings.androiduix.android.view.ViewTreeObserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDrawListener extends js.Object {
  def onDraw(): js.Any
}

object OnDrawListener {
  @scala.inline
  def apply(onDraw: () => js.Any): OnDrawListener = {
    val __obj = js.Dynamic.literal(onDraw = js.Any.fromFunction0(onDraw))
  
    __obj.asInstanceOf[OnDrawListener]
  }
}

