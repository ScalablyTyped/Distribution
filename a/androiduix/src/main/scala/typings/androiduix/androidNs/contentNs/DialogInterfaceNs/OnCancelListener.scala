package typings.androiduix.androidNs.contentNs.DialogInterfaceNs

import typings.androiduix.androidNs.contentNs.DialogInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCancelListener extends js.Object {
  def onCancel(dialog: DialogInterface): Unit
}

object OnCancelListener {
  @scala.inline
  def apply(onCancel: DialogInterface => Unit): OnCancelListener = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction1(onCancel))
  
    __obj.asInstanceOf[OnCancelListener]
  }
}

