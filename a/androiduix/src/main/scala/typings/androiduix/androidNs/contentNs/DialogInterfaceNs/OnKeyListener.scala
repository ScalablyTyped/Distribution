package typings.androiduix.androidNs.contentNs.DialogInterfaceNs

import typings.androiduix.androidNs.contentNs.DialogInterface
import typings.androiduix.androidNs.viewNs.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyListener extends js.Object {
  def onKey(dialog: DialogInterface, keyCode: Double, event: KeyEvent): Boolean
}

object OnKeyListener {
  @scala.inline
  def apply(onKey: (DialogInterface, Double, KeyEvent) => Boolean): OnKeyListener = {
    val __obj = js.Dynamic.literal(onKey = js.Any.fromFunction3(onKey))
  
    __obj.asInstanceOf[OnKeyListener]
  }
}

