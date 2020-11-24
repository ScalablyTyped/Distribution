package typings.androiduix.android.widget.TextView

import typings.androiduix.android.view.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnEditorActionListener extends js.Object {
  
  def onEditorAction(v: typings.androiduix.android.widget.TextView, actionId: Double, event: KeyEvent): Boolean = js.native
}
object OnEditorActionListener {
  
  @scala.inline
  def apply(onEditorAction: (typings.androiduix.android.widget.TextView, Double, KeyEvent) => Boolean): OnEditorActionListener = {
    val __obj = js.Dynamic.literal(onEditorAction = js.Any.fromFunction3(onEditorAction))
    __obj.asInstanceOf[OnEditorActionListener]
  }
  
  @scala.inline
  implicit class OnEditorActionListenerOps[Self <: OnEditorActionListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnEditorAction(value: (typings.androiduix.android.widget.TextView, Double, KeyEvent) => Boolean): Self = this.set("onEditorAction", js.Any.fromFunction3(value))
  }
}
