package typings.androiduix.android.view.ViewTreeObserver

import typings.androiduix.android.view.View
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

