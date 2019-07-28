package typings.androiduix.androidNs.contentNs.DialogInterfaceNs

import typings.androiduix.androidNs.contentNs.DialogInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDismissListener extends js.Object {
  def onDismiss(dialog: DialogInterface): Unit
}

object OnDismissListener {
  @scala.inline
  def apply(onDismiss: DialogInterface => Unit): OnDismissListener = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction1(onDismiss))
  
    __obj.asInstanceOf[OnDismissListener]
  }
}

