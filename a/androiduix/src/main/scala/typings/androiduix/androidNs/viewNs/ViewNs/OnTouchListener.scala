package typings.androiduix.androidNs.viewNs.ViewNs

import typings.androiduix.androidNs.viewNs.MotionEvent
import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTouchListener extends js.Object {
  def onTouch(v: View, event: MotionEvent): Unit
}

object OnTouchListener {
  @scala.inline
  def apply(onTouch: (View, MotionEvent) => Unit): OnTouchListener = {
    val __obj = js.Dynamic.literal(onTouch = js.Any.fromFunction2(onTouch))
  
    __obj.asInstanceOf[OnTouchListener]
  }
}

