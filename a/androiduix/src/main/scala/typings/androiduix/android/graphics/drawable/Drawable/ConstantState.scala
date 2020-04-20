package typings.androiduix.android.graphics.drawable.Drawable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantState extends js.Object {
  def newDrawable(): typings.androiduix.android.graphics.drawable.Drawable
}

object ConstantState {
  @scala.inline
  def apply(newDrawable: () => typings.androiduix.android.graphics.drawable.Drawable): ConstantState = {
    val __obj = js.Dynamic.literal(newDrawable = js.Any.fromFunction0(newDrawable))
    __obj.asInstanceOf[ConstantState]
  }
}

