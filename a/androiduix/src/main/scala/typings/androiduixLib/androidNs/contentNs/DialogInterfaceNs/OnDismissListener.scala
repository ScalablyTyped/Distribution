package typings
package androiduixLib.androidNs.contentNs.DialogInterfaceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDismissListener extends js.Object {
  def onDismiss(dialog: androiduixLib.androidNs.contentNs.DialogInterface): scala.Unit
}

object OnDismissListener {
  @scala.inline
  def apply(onDismiss: androiduixLib.androidNs.contentNs.DialogInterface => scala.Unit): OnDismissListener = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction1(onDismiss))
  
    __obj.asInstanceOf[OnDismissListener]
  }
}

