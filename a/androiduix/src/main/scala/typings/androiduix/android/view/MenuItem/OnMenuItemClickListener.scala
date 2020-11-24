package typings.androiduix.android.view.MenuItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMenuItemClickListener extends js.Object {
  
  def onMenuItemClick(item: typings.androiduix.android.view.MenuItem): Boolean = js.native
}
object OnMenuItemClickListener {
  
  @scala.inline
  def apply(onMenuItemClick: typings.androiduix.android.view.MenuItem => Boolean): OnMenuItemClickListener = {
    val __obj = js.Dynamic.literal(onMenuItemClick = js.Any.fromFunction1(onMenuItemClick))
    __obj.asInstanceOf[OnMenuItemClickListener]
  }
  
  @scala.inline
  implicit class OnMenuItemClickListenerOps[Self <: OnMenuItemClickListener] (val x: Self) extends AnyVal {
    
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
    def setOnMenuItemClick(value: typings.androiduix.android.view.MenuItem => Boolean): Self = this.set("onMenuItemClick", js.Any.fromFunction1(value))
  }
}
