package typings.androiduix.androidNs.contentNs.DialogInterfaceNs

import typings.androiduix.androidNs.contentNs.DialogInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnShowListener extends js.Object {
  def onShow(dialog: DialogInterface): Unit
}

object OnShowListener {
  @scala.inline
  def apply(onShow: DialogInterface => Unit): OnShowListener = {
    val __obj = js.Dynamic.literal(onShow = js.Any.fromFunction1(onShow))
  
    __obj.asInstanceOf[OnShowListener]
  }
}

