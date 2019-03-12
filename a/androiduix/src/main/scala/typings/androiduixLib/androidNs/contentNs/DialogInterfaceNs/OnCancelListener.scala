package typings
package androiduixLib.androidNs.contentNs.DialogInterfaceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCancelListener extends js.Object {
  def onCancel(dialog: androiduixLib.androidNs.contentNs.DialogInterface): scala.Unit
}

object OnCancelListener {
  @scala.inline
  def apply(onCancel: androiduixLib.androidNs.contentNs.DialogInterface => scala.Unit): OnCancelListener = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction1(onCancel))
  
    __obj.asInstanceOf[OnCancelListener]
  }
}

