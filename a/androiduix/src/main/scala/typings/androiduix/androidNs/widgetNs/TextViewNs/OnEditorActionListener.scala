package typings.androiduix.androidNs.widgetNs.TextViewNs

import typings.androiduix.androidNs.viewNs.KeyEvent
import typings.androiduix.androidNs.widgetNs.TextView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEditorActionListener extends js.Object {
  def onEditorAction(v: TextView, actionId: Double, event: KeyEvent): Boolean
}

object OnEditorActionListener {
  @scala.inline
  def apply(onEditorAction: (TextView, Double, KeyEvent) => Boolean): OnEditorActionListener = {
    val __obj = js.Dynamic.literal(onEditorAction = js.Any.fromFunction3(onEditorAction))
  
    __obj.asInstanceOf[OnEditorActionListener]
  }
}

