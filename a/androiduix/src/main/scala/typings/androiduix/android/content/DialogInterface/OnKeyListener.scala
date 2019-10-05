package typings.androiduix.android.content.DialogInterface

import typings.androiduix.android.view.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyListener extends js.Object {
  def onKey(dialog: typings.androiduix.android.content.DialogInterface, keyCode: Double, event: KeyEvent): Boolean
}

object OnKeyListener {
  @scala.inline
  def apply(onKey: (typings.androiduix.android.content.DialogInterface, Double, KeyEvent) => Boolean): OnKeyListener = {
    val __obj = js.Dynamic.literal(onKey = js.Any.fromFunction3(onKey))
  
    __obj.asInstanceOf[OnKeyListener]
  }
}

