package typings.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnAttachStateChangeListener extends js.Object {
  
  def onViewAttachedToWindow(v: typings.androiduix.android.view.View): js.Any = js.native
  
  def onViewDetachedFromWindow(v: typings.androiduix.android.view.View): js.Any = js.native
}
object OnAttachStateChangeListener {
  
  @scala.inline
  def apply(
    onViewAttachedToWindow: typings.androiduix.android.view.View => js.Any,
    onViewDetachedFromWindow: typings.androiduix.android.view.View => js.Any
  ): OnAttachStateChangeListener = {
    val __obj = js.Dynamic.literal(onViewAttachedToWindow = js.Any.fromFunction1(onViewAttachedToWindow), onViewDetachedFromWindow = js.Any.fromFunction1(onViewDetachedFromWindow))
    __obj.asInstanceOf[OnAttachStateChangeListener]
  }
  
  @scala.inline
  implicit class OnAttachStateChangeListenerOps[Self <: OnAttachStateChangeListener] (val x: Self) extends AnyVal {
    
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
    def setOnViewAttachedToWindow(value: typings.androiduix.android.view.View => js.Any): Self = this.set("onViewAttachedToWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewDetachedFromWindow(value: typings.androiduix.android.view.View => js.Any): Self = this.set("onViewDetachedFromWindow", js.Any.fromFunction1(value))
  }
}
