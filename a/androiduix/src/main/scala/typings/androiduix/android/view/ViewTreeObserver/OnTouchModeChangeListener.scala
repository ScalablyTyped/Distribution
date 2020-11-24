package typings.androiduix.android.view.ViewTreeObserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnTouchModeChangeListener extends js.Object {
  
  def onTouchModeChanged(isInTouchMode: Boolean): js.Any = js.native
}
object OnTouchModeChangeListener {
  
  @scala.inline
  def apply(onTouchModeChanged: Boolean => js.Any): OnTouchModeChangeListener = {
    val __obj = js.Dynamic.literal(onTouchModeChanged = js.Any.fromFunction1(onTouchModeChanged))
    __obj.asInstanceOf[OnTouchModeChangeListener]
  }
  
  @scala.inline
  implicit class OnTouchModeChangeListenerOps[Self <: OnTouchModeChangeListener] (val x: Self) extends AnyVal {
    
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
    def setOnTouchModeChanged(value: Boolean => js.Any): Self = this.set("onTouchModeChanged", js.Any.fromFunction1(value))
  }
}
