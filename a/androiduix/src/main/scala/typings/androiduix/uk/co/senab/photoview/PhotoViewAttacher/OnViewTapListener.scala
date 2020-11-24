package typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnViewTapListener extends js.Object {
  
  def onViewTap(view: View, x: Double, y: Double): Unit = js.native
}
object OnViewTapListener {
  
  @scala.inline
  def apply(onViewTap: (View, Double, Double) => Unit): OnViewTapListener = {
    val __obj = js.Dynamic.literal(onViewTap = js.Any.fromFunction3(onViewTap))
    __obj.asInstanceOf[OnViewTapListener]
  }
  
  @scala.inline
  implicit class OnViewTapListenerOps[Self <: OnViewTapListener] (val x: Self) extends AnyVal {
    
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
    def setOnViewTap(value: (View, Double, Double) => Unit): Self = this.set("onViewTap", js.Any.fromFunction3(value))
  }
}
