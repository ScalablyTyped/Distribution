package typings
package androiduixLib.androidNs.viewNs.KeyEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def onKeyDown(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean
  def onKeyLongPress(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean
  def onKeyUp(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean
}

object Callback {
  @scala.inline
  def apply(
    onKeyDown: (scala.Double, androiduixLib.androidNs.viewNs.KeyEvent) => scala.Boolean,
    onKeyLongPress: (scala.Double, androiduixLib.androidNs.viewNs.KeyEvent) => scala.Boolean,
    onKeyUp: (scala.Double, androiduixLib.androidNs.viewNs.KeyEvent) => scala.Boolean
  ): Callback = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyLongPress = js.Any.fromFunction2(onKeyLongPress), onKeyUp = js.Any.fromFunction2(onKeyUp))
  
    __obj.asInstanceOf[Callback]
  }
}

