package typings.androiduix.android.view.ViewTreeObserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGlobalLayoutListener extends js.Object {
  def onGlobalLayout(): js.Any
}

object OnGlobalLayoutListener {
  @scala.inline
  def apply(onGlobalLayout: () => js.Any): OnGlobalLayoutListener = {
    val __obj = js.Dynamic.literal(onGlobalLayout = js.Any.fromFunction0(onGlobalLayout))
  
    __obj.asInstanceOf[OnGlobalLayoutListener]
  }
}

