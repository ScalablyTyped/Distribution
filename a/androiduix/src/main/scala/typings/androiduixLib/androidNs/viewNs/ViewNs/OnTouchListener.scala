package typings
package androiduixLib.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTouchListener extends js.Object {
  def onTouch(v: androiduixLib.androidNs.viewNs.View, event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Unit
}

object OnTouchListener {
  @scala.inline
  def apply(
    onTouch: js.Function2[
      androiduixLib.androidNs.viewNs.View, 
      androiduixLib.androidNs.viewNs.MotionEvent, 
      scala.Unit
    ]
  ): OnTouchListener = {
    val __obj = js.Dynamic.literal(onTouch = onTouch)
  
    __obj.asInstanceOf[OnTouchListener]
  }
}

