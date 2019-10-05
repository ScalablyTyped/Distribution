package typings.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAttachStateChangeListener extends js.Object {
  def onViewAttachedToWindow(v: typings.androiduix.android.view.View): js.Any
  def onViewDetachedFromWindow(v: typings.androiduix.android.view.View): js.Any
}

object OnAttachStateChangeListener {
  @scala.inline
  def apply(
    onViewAttachedToWindow: typings.androiduix.android.view.View => js.Any,
    onViewDetachedFromWindow: typings.androiduix.android.view.View => js.Any
  ): OnAttachStateChangeListener = {
    val __obj = js.Dynamic.literal(onViewAttachedToWindow = js.Any.fromFunction1(onViewAttachedToWindow), onViewDetachedFromWindow = js.Any.fromFunction1(onViewDetachedFromWindow))
  
    __obj.asInstanceOf[OnAttachStateChangeListener]
  }
}

