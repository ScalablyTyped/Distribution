package typings.androiduix.androidNs.graphicsNs.drawableNs.ClipDrawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.ClipDrawable
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.ConstantState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.ClipDrawable.ClipState")
@js.native
class ClipState protected () extends ConstantState {
  def this(orig: ClipState, owner: ClipDrawable) = this()
  var mCanConstantState: js.Any = js.native
  var mCheckedConstantState: js.Any = js.native
  var mDrawable: Drawable = js.native
  var mGravity: Double = js.native
  var mOrientation: Double = js.native
  def canConstantState(): Boolean = js.native
  /* CompleteClass */
  override def newDrawable(): Drawable = js.native
}

