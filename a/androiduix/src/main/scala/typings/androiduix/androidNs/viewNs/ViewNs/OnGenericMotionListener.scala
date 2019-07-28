package typings.androiduix.androidNs.viewNs.ViewNs

import typings.androiduix.androidNs.viewNs.MotionEvent
import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGenericMotionListener extends js.Object {
  def onGenericMotion(v: View, event: MotionEvent): js.Any
}

object OnGenericMotionListener {
  @scala.inline
  def apply(onGenericMotion: (View, MotionEvent) => js.Any): OnGenericMotionListener = {
    val __obj = js.Dynamic.literal(onGenericMotion = js.Any.fromFunction2(onGenericMotion))
  
    __obj.asInstanceOf[OnGenericMotionListener]
  }
}

