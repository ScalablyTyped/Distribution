package typings.androiduix.android.graphics.drawable.ScaleDrawable

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleState extends ConstantState {
  var mCanConstantState: js.Any = js.native
  var mCheckedConstantState: js.Any = js.native
  var mDrawable: Drawable = js.native
  var mGravity: Double = js.native
  var mScaleHeight: Double = js.native
  var mScaleWidth: Double = js.native
  var mUseIntrinsicSizeAsMin: Boolean = js.native
  def canConstantState(): Boolean = js.native
}

object ScaleState {
  @scala.inline
  def apply(
    canConstantState: () => Boolean,
    mCanConstantState: js.Any,
    mCheckedConstantState: js.Any,
    mDrawable: Drawable,
    mGravity: Double,
    mScaleHeight: Double,
    mScaleWidth: Double,
    mUseIntrinsicSizeAsMin: Boolean,
    newDrawable: () => Drawable
  ): ScaleState = {
    val __obj = js.Dynamic.literal(canConstantState = js.Any.fromFunction0(canConstantState), mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mDrawable = mDrawable.asInstanceOf[js.Any], mGravity = mGravity.asInstanceOf[js.Any], mScaleHeight = mScaleHeight.asInstanceOf[js.Any], mScaleWidth = mScaleWidth.asInstanceOf[js.Any], mUseIntrinsicSizeAsMin = mUseIntrinsicSizeAsMin.asInstanceOf[js.Any], newDrawable = js.Any.fromFunction0(newDrawable))
    __obj.asInstanceOf[ScaleState]
  }
  @scala.inline
  implicit class ScaleStateOps[Self <: ScaleState] (val x: Self) extends AnyVal {
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
    def setCanConstantState(value: () => Boolean): Self = this.set("canConstantState", js.Any.fromFunction0(value))
    @scala.inline
    def setMCanConstantState(value: js.Any): Self = this.set("mCanConstantState", value.asInstanceOf[js.Any])
    @scala.inline
    def setMCheckedConstantState(value: js.Any): Self = this.set("mCheckedConstantState", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawable(value: Drawable): Self = this.set("mDrawable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMGravity(value: Double): Self = this.set("mGravity", value.asInstanceOf[js.Any])
    @scala.inline
    def setMScaleHeight(value: Double): Self = this.set("mScaleHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMScaleWidth(value: Double): Self = this.set("mScaleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMUseIntrinsicSizeAsMin(value: Boolean): Self = this.set("mUseIntrinsicSizeAsMin", value.asInstanceOf[js.Any])
  }
  
}

