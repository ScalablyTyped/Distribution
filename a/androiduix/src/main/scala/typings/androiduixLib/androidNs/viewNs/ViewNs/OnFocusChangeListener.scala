package typings
package androiduixLib.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFocusChangeListener extends js.Object {
  def onFocusChange(v: androiduixLib.androidNs.viewNs.View, hasFocus: scala.Boolean): scala.Unit
}

object OnFocusChangeListener {
  @scala.inline
  def apply(onFocusChange: (androiduixLib.androidNs.viewNs.View, scala.Boolean) => scala.Unit): OnFocusChangeListener = {
    val __obj = js.Dynamic.literal(onFocusChange = js.Any.fromFunction2(onFocusChange))
  
    __obj.asInstanceOf[OnFocusChangeListener]
  }
}

