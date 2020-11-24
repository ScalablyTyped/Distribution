package typings.androiduix.android.widget.AbsListView

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecyclerListener extends js.Object {
  
  def onMovedToScrapHeap(view: View): Unit = js.native
}
object RecyclerListener {
  
  @scala.inline
  def apply(onMovedToScrapHeap: View => Unit): RecyclerListener = {
    val __obj = js.Dynamic.literal(onMovedToScrapHeap = js.Any.fromFunction1(onMovedToScrapHeap))
    __obj.asInstanceOf[RecyclerListener]
  }
  
  @scala.inline
  implicit class RecyclerListenerOps[Self <: RecyclerListener] (val x: Self) extends AnyVal {
    
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
    def setOnMovedToScrapHeap(value: View => Unit): Self = this.set("onMovedToScrapHeap", js.Any.fromFunction1(value))
  }
}
