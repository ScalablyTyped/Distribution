package typings.androiduix.android.widget.NumberPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnScrollListener extends js.Object {
  
  def onScrollStateChange(view: typings.androiduix.android.widget.NumberPicker, scrollState: Double): Unit = js.native
}
object OnScrollListener {
  
  @scala.inline
  def apply(onScrollStateChange: (typings.androiduix.android.widget.NumberPicker, Double) => Unit): OnScrollListener = {
    val __obj = js.Dynamic.literal(onScrollStateChange = js.Any.fromFunction2(onScrollStateChange))
    __obj.asInstanceOf[OnScrollListener]
  }
  
  @scala.inline
  implicit class OnScrollListenerOps[Self <: OnScrollListener] (val x: Self) extends AnyVal {
    
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
    def setOnScrollStateChange(value: (typings.androiduix.android.widget.NumberPicker, Double) => Unit): Self = this.set("onScrollStateChange", js.Any.fromFunction2(value))
  }
}
