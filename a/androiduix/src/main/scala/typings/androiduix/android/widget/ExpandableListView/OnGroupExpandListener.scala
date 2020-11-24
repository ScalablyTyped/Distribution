package typings.androiduix.android.widget.ExpandableListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnGroupExpandListener extends js.Object {
  
  def onGroupExpand(groupPosition: Double): Unit = js.native
}
object OnGroupExpandListener {
  
  @scala.inline
  def apply(onGroupExpand: Double => Unit): OnGroupExpandListener = {
    val __obj = js.Dynamic.literal(onGroupExpand = js.Any.fromFunction1(onGroupExpand))
    __obj.asInstanceOf[OnGroupExpandListener]
  }
  
  @scala.inline
  implicit class OnGroupExpandListenerOps[Self <: OnGroupExpandListener] (val x: Self) extends AnyVal {
    
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
    def setOnGroupExpand(value: Double => Unit): Self = this.set("onGroupExpand", js.Any.fromFunction1(value))
  }
}
