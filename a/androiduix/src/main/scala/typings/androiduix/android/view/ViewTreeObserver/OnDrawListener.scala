package typings.androiduix.android.view.ViewTreeObserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDrawListener extends js.Object {
  
  def onDraw(): js.Any = js.native
}
object OnDrawListener {
  
  @scala.inline
  def apply(onDraw: () => js.Any): OnDrawListener = {
    val __obj = js.Dynamic.literal(onDraw = js.Any.fromFunction0(onDraw))
    __obj.asInstanceOf[OnDrawListener]
  }
  
  @scala.inline
  implicit class OnDrawListenerOps[Self <: OnDrawListener] (val x: Self) extends AnyVal {
    
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
    def setOnDraw(value: () => js.Any): Self = this.set("onDraw", js.Any.fromFunction0(value))
  }
}
