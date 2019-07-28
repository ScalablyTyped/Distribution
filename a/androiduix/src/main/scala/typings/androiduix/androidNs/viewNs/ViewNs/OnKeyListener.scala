package typings.androiduix.androidNs.viewNs.ViewNs

import typings.androiduix.androidNs.viewNs.KeyEvent
import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyListener extends js.Object {
  def onKey(v: View, keyCode: Double, event: KeyEvent): Unit
}

object OnKeyListener {
  @scala.inline
  def apply(onKey: (View, Double, KeyEvent) => Unit): OnKeyListener = {
    val __obj = js.Dynamic.literal(onKey = js.Any.fromFunction3(onKey))
  
    __obj.asInstanceOf[OnKeyListener]
  }
}

