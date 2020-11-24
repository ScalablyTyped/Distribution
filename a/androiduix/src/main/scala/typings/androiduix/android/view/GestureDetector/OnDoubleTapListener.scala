package typings.androiduix.android.view.GestureDetector

import typings.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDoubleTapListener extends js.Object {
  
  def onDoubleTap(e: MotionEvent): Boolean = js.native
  
  def onDoubleTapEvent(e: MotionEvent): Boolean = js.native
  
  def onSingleTapConfirmed(e: MotionEvent): Boolean = js.native
}
object OnDoubleTapListener {
  
  @scala.inline
  def apply(
    onDoubleTap: MotionEvent => Boolean,
    onDoubleTapEvent: MotionEvent => Boolean,
    onSingleTapConfirmed: MotionEvent => Boolean
  ): OnDoubleTapListener = {
    val __obj = js.Dynamic.literal(onDoubleTap = js.Any.fromFunction1(onDoubleTap), onDoubleTapEvent = js.Any.fromFunction1(onDoubleTapEvent), onSingleTapConfirmed = js.Any.fromFunction1(onSingleTapConfirmed))
    __obj.asInstanceOf[OnDoubleTapListener]
  }
  
  @scala.inline
  implicit class OnDoubleTapListenerOps[Self <: OnDoubleTapListener] (val x: Self) extends AnyVal {
    
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
    def setOnDoubleTap(value: MotionEvent => Boolean): Self = this.set("onDoubleTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleTapEvent(value: MotionEvent => Boolean): Self = this.set("onDoubleTapEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSingleTapConfirmed(value: MotionEvent => Boolean): Self = this.set("onSingleTapConfirmed", js.Any.fromFunction1(value))
  }
}
