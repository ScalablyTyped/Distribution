package typings
package androiduixLib.androidNs.viewNs.ViewTreeObserverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTouchModeChangeListener extends js.Object {
  def onTouchModeChanged(isInTouchMode: scala.Boolean): js.Any
}

object OnTouchModeChangeListener {
  @scala.inline
  def apply(onTouchModeChanged: js.Function1[scala.Boolean, js.Any]): OnTouchModeChangeListener = {
    val __obj = js.Dynamic.literal(onTouchModeChanged = onTouchModeChanged)
  
    __obj.asInstanceOf[OnTouchModeChangeListener]
  }
}

