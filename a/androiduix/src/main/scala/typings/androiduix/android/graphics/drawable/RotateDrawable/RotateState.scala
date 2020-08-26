package typings.androiduix.android.graphics.drawable.RotateDrawable

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateState extends ConstantState {
  var mCanConstantState: js.Any = js.native
  var mCheckedConstantState: js.Any = js.native
  var mCurrentDegrees: Double = js.native
  var mDrawable: Drawable = js.native
  var mFromDegrees: Double = js.native
  var mPivotX: Double = js.native
  var mPivotXRel: Boolean = js.native
  var mPivotY: Double = js.native
  var mPivotYRel: Boolean = js.native
  var mToDegrees: Double = js.native
  def canConstantState(): Boolean = js.native
}

object RotateState {
  @scala.inline
  def apply(
    canConstantState: () => Boolean,
    mCanConstantState: js.Any,
    mCheckedConstantState: js.Any,
    mCurrentDegrees: Double,
    mDrawable: Drawable,
    mFromDegrees: Double,
    mPivotX: Double,
    mPivotXRel: Boolean,
    mPivotY: Double,
    mPivotYRel: Boolean,
    mToDegrees: Double,
    newDrawable: () => Drawable
  ): RotateState = {
    val __obj = js.Dynamic.literal(canConstantState = js.Any.fromFunction0(canConstantState), mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mCurrentDegrees = mCurrentDegrees.asInstanceOf[js.Any], mDrawable = mDrawable.asInstanceOf[js.Any], mFromDegrees = mFromDegrees.asInstanceOf[js.Any], mPivotX = mPivotX.asInstanceOf[js.Any], mPivotXRel = mPivotXRel.asInstanceOf[js.Any], mPivotY = mPivotY.asInstanceOf[js.Any], mPivotYRel = mPivotYRel.asInstanceOf[js.Any], mToDegrees = mToDegrees.asInstanceOf[js.Any], newDrawable = js.Any.fromFunction0(newDrawable))
    __obj.asInstanceOf[RotateState]
  }
  @scala.inline
  implicit class RotateStateOps[Self <: RotateState] (val x: Self) extends AnyVal {
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
    def setMCurrentDegrees(value: Double): Self = this.set("mCurrentDegrees", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawable(value: Drawable): Self = this.set("mDrawable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMFromDegrees(value: Double): Self = this.set("mFromDegrees", value.asInstanceOf[js.Any])
    @scala.inline
    def setMPivotX(value: Double): Self = this.set("mPivotX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMPivotXRel(value: Boolean): Self = this.set("mPivotXRel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMPivotY(value: Double): Self = this.set("mPivotY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMPivotYRel(value: Boolean): Self = this.set("mPivotYRel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMToDegrees(value: Double): Self = this.set("mToDegrees", value.asInstanceOf[js.Any])
  }
  
}

