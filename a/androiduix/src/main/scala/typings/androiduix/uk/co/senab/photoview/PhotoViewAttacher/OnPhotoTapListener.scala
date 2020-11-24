package typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPhotoTapListener extends js.Object {
  
  def onPhotoTap(view: View, x: Double, y: Double): Unit = js.native
}
object OnPhotoTapListener {
  
  @scala.inline
  def apply(onPhotoTap: (View, Double, Double) => Unit): OnPhotoTapListener = {
    val __obj = js.Dynamic.literal(onPhotoTap = js.Any.fromFunction3(onPhotoTap))
    __obj.asInstanceOf[OnPhotoTapListener]
  }
  
  @scala.inline
  implicit class OnPhotoTapListenerOps[Self <: OnPhotoTapListener] (val x: Self) extends AnyVal {
    
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
    def setOnPhotoTap(value: (View, Double, Double) => Unit): Self = this.set("onPhotoTap", js.Any.fromFunction3(value))
  }
}
