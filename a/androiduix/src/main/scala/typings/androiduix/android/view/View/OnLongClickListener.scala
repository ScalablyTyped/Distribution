package typings.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnLongClickListener extends js.Object {
  
  def onLongClick(v: typings.androiduix.android.view.View): Boolean = js.native
}
object OnLongClickListener {
  
  @scala.inline
  def apply(onLongClick: typings.androiduix.android.view.View => Boolean): OnLongClickListener = {
    val __obj = js.Dynamic.literal(onLongClick = js.Any.fromFunction1(onLongClick))
    __obj.asInstanceOf[OnLongClickListener]
  }
  
  @scala.inline
  implicit class OnLongClickListenerOps[Self <: OnLongClickListener] (val x: Self) extends AnyVal {
    
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
    def setOnLongClick(value: typings.androiduix.android.view.View => Boolean): Self = this.set("onLongClick", js.Any.fromFunction1(value))
  }
}
