package typings.androiduix.androidNs.viewNs.ViewTreeObserverNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGlobalFocusChangeListener extends js.Object {
  def onGlobalFocusChanged(oldFocus: View, newFocus: View): js.Any
}

object OnGlobalFocusChangeListener {
  @scala.inline
  def apply(onGlobalFocusChanged: (View, View) => js.Any): OnGlobalFocusChangeListener = {
    val __obj = js.Dynamic.literal(onGlobalFocusChanged = js.Any.fromFunction2(onGlobalFocusChanged))
  
    __obj.asInstanceOf[OnGlobalFocusChangeListener]
  }
}

