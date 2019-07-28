package typings.androiduix.androidNs.viewNs.ViewNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFocusChangeListener extends js.Object {
  def onFocusChange(v: View, hasFocus: Boolean): Unit
}

object OnFocusChangeListener {
  @scala.inline
  def apply(onFocusChange: (View, Boolean) => Unit): OnFocusChangeListener = {
    val __obj = js.Dynamic.literal(onFocusChange = js.Any.fromFunction2(onFocusChange))
  
    __obj.asInstanceOf[OnFocusChangeListener]
  }
}

