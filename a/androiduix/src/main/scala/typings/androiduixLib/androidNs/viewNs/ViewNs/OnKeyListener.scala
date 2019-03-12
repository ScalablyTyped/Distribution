package typings
package androiduixLib.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyListener extends js.Object {
  def onKey(
    v: androiduixLib.androidNs.viewNs.View,
    keyCode: scala.Double,
    event: androiduixLib.androidNs.viewNs.KeyEvent
  ): scala.Unit
}

object OnKeyListener {
  @scala.inline
  def apply(
    onKey: (androiduixLib.androidNs.viewNs.View, scala.Double, androiduixLib.androidNs.viewNs.KeyEvent) => scala.Unit
  ): OnKeyListener = {
    val __obj = js.Dynamic.literal(onKey = js.Any.fromFunction3(onKey))
  
    __obj.asInstanceOf[OnKeyListener]
  }
}

