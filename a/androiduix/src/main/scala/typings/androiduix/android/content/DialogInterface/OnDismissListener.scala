package typings.androiduix.android.content.DialogInterface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDismissListener extends js.Object {
  def onDismiss(dialog: typings.androiduix.android.content.DialogInterface): Unit
}

object OnDismissListener {
  @scala.inline
  def apply(onDismiss: typings.androiduix.android.content.DialogInterface => Unit): OnDismissListener = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction1(onDismiss))
  
    __obj.asInstanceOf[OnDismissListener]
  }
}

