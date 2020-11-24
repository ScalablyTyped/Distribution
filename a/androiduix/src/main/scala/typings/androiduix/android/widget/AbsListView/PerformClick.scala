package typings.androiduix.android.widget.AbsListView

import typings.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformClick
  extends WindowRunnnable
     with Runnable {
  
  var mClickMotionPosition: Double = js.native
}
object PerformClick {
  
  @scala.inline
  def apply(
    _AbsListView_this: typings.androiduix.android.widget.AbsListView,
    mClickMotionPosition: Double,
    mOriginalAttachCount: js.Any,
    rememberWindowAttachCount: () => Unit,
    run: () => js.Any,
    sameWindow: () => Boolean
  ): PerformClick = {
    val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], mClickMotionPosition = mClickMotionPosition.asInstanceOf[js.Any], mOriginalAttachCount = mOriginalAttachCount.asInstanceOf[js.Any], rememberWindowAttachCount = js.Any.fromFunction0(rememberWindowAttachCount), run = js.Any.fromFunction0(run), sameWindow = js.Any.fromFunction0(sameWindow))
    __obj.asInstanceOf[PerformClick]
  }
  
  @scala.inline
  implicit class PerformClickOps[Self <: PerformClick] (val x: Self) extends AnyVal {
    
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
    def setMClickMotionPosition(value: Double): Self = this.set("mClickMotionPosition", value.asInstanceOf[js.Any])
  }
}
