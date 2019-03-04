package typings
package androiduixLib.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAttachStateChangeListener extends js.Object {
  def onViewAttachedToWindow(v: androiduixLib.androidNs.viewNs.View): js.Any
  def onViewDetachedFromWindow(v: androiduixLib.androidNs.viewNs.View): js.Any
}

object OnAttachStateChangeListener {
  @scala.inline
  def apply(
    onViewAttachedToWindow: js.Function1[androiduixLib.androidNs.viewNs.View, js.Any],
    onViewDetachedFromWindow: js.Function1[androiduixLib.androidNs.viewNs.View, js.Any]
  ): OnAttachStateChangeListener = {
    val __obj = js.Dynamic.literal(onViewAttachedToWindow = onViewAttachedToWindow, onViewDetachedFromWindow = onViewDetachedFromWindow)
  
    __obj.asInstanceOf[OnAttachStateChangeListener]
  }
}

