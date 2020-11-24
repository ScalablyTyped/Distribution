package typings.androiduix.android.view.View

import typings.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnGenericMotionListener extends js.Object {
  
  def onGenericMotion(v: typings.androiduix.android.view.View, event: MotionEvent): js.Any = js.native
}
object OnGenericMotionListener {
  
  @scala.inline
  def apply(onGenericMotion: (typings.androiduix.android.view.View, MotionEvent) => js.Any): OnGenericMotionListener = {
    val __obj = js.Dynamic.literal(onGenericMotion = js.Any.fromFunction2(onGenericMotion))
    __obj.asInstanceOf[OnGenericMotionListener]
  }
  
  @scala.inline
  implicit class OnGenericMotionListenerOps[Self <: OnGenericMotionListener] (val x: Self) extends AnyVal {
    
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
    def setOnGenericMotion(value: (typings.androiduix.android.view.View, MotionEvent) => js.Any): Self = this.set("onGenericMotion", js.Any.fromFunction2(value))
  }
}
