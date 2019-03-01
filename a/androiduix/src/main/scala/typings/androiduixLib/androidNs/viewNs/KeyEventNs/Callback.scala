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
    onKeyDown: js.Function2[scala.Double, androiduixLib.androidNs.viewNs.KeyEvent, scala.Boolean],
    onKeyLongPress: js.Function2[scala.Double, androiduixLib.androidNs.viewNs.KeyEvent, scala.Boolean],
    onKeyUp: js.Function2[scala.Double, androiduixLib.androidNs.viewNs.KeyEvent, scala.Boolean]
  ): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onKeyDown")(onKeyDown)
    __obj.updateDynamic("onKeyLongPress")(onKeyLongPress)
    __obj.updateDynamic("onKeyUp")(onKeyUp)
    __obj.asInstanceOf[Callback]
  }
}

