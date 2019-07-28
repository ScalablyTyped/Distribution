package typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantState extends js.Object {
  def newDrawable(): Drawable
}

object ConstantState {
  @scala.inline
  def apply(newDrawable: () => Drawable): ConstantState = {
    val __obj = js.Dynamic.literal(newDrawable = js.Any.fromFunction0(newDrawable))
  
    __obj.asInstanceOf[ConstantState]
  }
}

