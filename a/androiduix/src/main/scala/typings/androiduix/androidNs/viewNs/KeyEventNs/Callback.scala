package typings.androiduix.androidNs.viewNs.KeyEventNs

import typings.androiduix.androidNs.viewNs.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def onKeyDown(keyCode: Double, event: KeyEvent): Boolean
  def onKeyLongPress(keyCode: Double, event: KeyEvent): Boolean
  def onKeyUp(keyCode: Double, event: KeyEvent): Boolean
}

object Callback {
  @scala.inline
  def apply(
    onKeyDown: (Double, KeyEvent) => Boolean,
    onKeyLongPress: (Double, KeyEvent) => Boolean,
    onKeyUp: (Double, KeyEvent) => Boolean
  ): Callback = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyLongPress = js.Any.fromFunction2(onKeyLongPress), onKeyUp = js.Any.fromFunction2(onKeyUp))
  
    __obj.asInstanceOf[Callback]
  }
}

