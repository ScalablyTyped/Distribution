package typings.androiduix.android.widget.TextView

import typings.androiduix.android.view.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEditorActionListener extends js.Object {
  def onEditorAction(v: typings.androiduix.android.widget.TextView, actionId: Double, event: KeyEvent): Boolean
}

object OnEditorActionListener {
  @scala.inline
  def apply(onEditorAction: (typings.androiduix.android.widget.TextView, Double, KeyEvent) => Boolean): OnEditorActionListener = {
    val __obj = js.Dynamic.literal(onEditorAction = js.Any.fromFunction3(onEditorAction))
  
    __obj.asInstanceOf[OnEditorActionListener]
  }
}

