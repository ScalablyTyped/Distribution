package typings.androiduix.androidNs.viewNs.ViewNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAttachStateChangeListener extends js.Object {
  def onViewAttachedToWindow(v: View): js.Any
  def onViewDetachedFromWindow(v: View): js.Any
}

object OnAttachStateChangeListener {
  @scala.inline
  def apply(onViewAttachedToWindow: View => js.Any, onViewDetachedFromWindow: View => js.Any): OnAttachStateChangeListener = {
    val __obj = js.Dynamic.literal(onViewAttachedToWindow = js.Any.fromFunction1(onViewAttachedToWindow), onViewDetachedFromWindow = js.Any.fromFunction1(onViewDetachedFromWindow))
  
    __obj.asInstanceOf[OnAttachStateChangeListener]
  }
}

