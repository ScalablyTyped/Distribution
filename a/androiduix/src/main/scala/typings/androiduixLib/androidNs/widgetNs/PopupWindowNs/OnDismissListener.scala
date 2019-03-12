package typings
package androiduixLib.androidNs.widgetNs.PopupWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDismissListener extends js.Object {
  def onDismiss(): scala.Unit
}

object OnDismissListener {
  @scala.inline
  def apply(onDismiss: () => scala.Unit): OnDismissListener = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction0(onDismiss))
  
    __obj.asInstanceOf[OnDismissListener]
  }
}

