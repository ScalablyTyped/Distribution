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
  def apply(onPreDraw: js.Function0[scala.Boolean]): OnPreDrawListener = {
    val __obj = js.Dynamic.literal(onPreDraw = onPreDraw)
  
    __obj.asInstanceOf[OnPreDrawListener]
  }
}

