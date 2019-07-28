package typings.androiduix.androidNs.graphicsNs.drawableNs.ScaleDrawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.ConstantState
import typings.androiduix.androidNs.graphicsNs.drawableNs.ScaleDrawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.ScaleDrawable.ScaleState")
@js.native
class ScaleState protected () extends ConstantState {
  def this(orig: ScaleState, owner: ScaleDrawable) = this()
  var mCanConstantState: js.Any = js.native
  var mCheckedConstantState: js.Any = js.native
  var mDrawable: Drawable = js.native
  var mGravity: Double = js.native
  var mScaleHeight: Double = js.native
  var mScaleWidth: Double = js.native
  var mUseIntrinsicSizeAsMin: Boolean = js.native
  def canConstantState(): Boolean = js.native
  /* CompleteClass */
  override def newDrawable(): Drawable = js.native
}

