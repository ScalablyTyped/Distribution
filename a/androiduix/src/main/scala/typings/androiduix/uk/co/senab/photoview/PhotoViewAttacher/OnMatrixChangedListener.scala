package typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typings.androiduix.android.graphics.RectF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMatrixChangedListener extends js.Object {
  
  def onMatrixChanged(rect: RectF): Unit = js.native
}
object OnMatrixChangedListener {
  
  @scala.inline
  def apply(onMatrixChanged: RectF => Unit): OnMatrixChangedListener = {
    val __obj = js.Dynamic.literal(onMatrixChanged = js.Any.fromFunction1(onMatrixChanged))
    __obj.asInstanceOf[OnMatrixChangedListener]
  }
  
  @scala.inline
  implicit class OnMatrixChangedListenerOps[Self <: OnMatrixChangedListener] (val x: Self) extends AnyVal {
    
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
    def setOnMatrixChanged(value: RectF => Unit): Self = this.set("onMatrixChanged", js.Any.fromFunction1(value))
  }
}
