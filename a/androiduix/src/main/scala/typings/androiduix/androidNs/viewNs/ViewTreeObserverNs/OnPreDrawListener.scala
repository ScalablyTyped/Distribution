package typings.androiduix.androidNs.viewNs.ViewTreeObserverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPreDrawListener extends js.Object {
  def onPreDraw(): Boolean
}

object OnPreDrawListener {
  @scala.inline
  def apply(onPreDraw: () => Boolean): OnPreDrawListener = {
    val __obj = js.Dynamic.literal(onPreDraw = js.Any.fromFunction0(onPreDraw))
  
    __obj.asInstanceOf[OnPreDrawListener]
  }
}

