package typings.androiduix.androidNs.graphicsNs.drawableNs.RotateDrawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.ConstantState
import typings.androiduix.androidNs.graphicsNs.drawableNs.RotateDrawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.RotateDrawable.RotateState")
@js.native
class RotateState protected () extends ConstantState {
  def this(source: RotateState, owner: RotateDrawable) = this()
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
  /* CompleteClass */
  override def newDrawable(): Drawable = js.native
}

