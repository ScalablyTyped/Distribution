package typings.androiduix.android.widget.PopupWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDismissListener extends js.Object {
  def onDismiss(): Unit
}

object OnDismissListener {
  @scala.inline
  def apply(onDismiss: () => Unit): OnDismissListener = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction0(onDismiss))
  
    __obj.asInstanceOf[OnDismissListener]
  }
}

