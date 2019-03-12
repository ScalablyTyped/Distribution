package typings
package androiduixLib.androidNs.viewNs.ViewTreeObserverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPreDrawListener extends js.Object {
  def onPreDraw(): scala.Boolean
}

object OnPreDrawListener {
  @scala.inline
  def apply(onPreDraw: () => scala.Boolean): OnPreDrawListener = {
    val __obj = js.Dynamic.literal(onPreDraw = js.Any.fromFunction0(onPreDraw))
  
    __obj.asInstanceOf[OnPreDrawListener]
  }
}

