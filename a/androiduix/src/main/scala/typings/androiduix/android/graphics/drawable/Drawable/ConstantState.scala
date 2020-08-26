package typings.androiduix.android.graphics.drawable.Drawable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstantState extends js.Object {
  def newDrawable(): typings.androiduix.android.graphics.drawable.Drawable = js.native
}

object ConstantState {
  @scala.inline
  def apply(newDrawable: () => typings.androiduix.android.graphics.drawable.Drawable): ConstantState = {
    val __obj = js.Dynamic.literal(newDrawable = js.Any.fromFunction0(newDrawable))
    __obj.asInstanceOf[ConstantState]
  }
  @scala.inline
  implicit class ConstantStateOps[Self <: ConstantState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewDrawable(value: () => typings.androiduix.android.graphics.drawable.Drawable): Self = this.set("newDrawable", js.Any.fromFunction0(value))
  }
  
}

