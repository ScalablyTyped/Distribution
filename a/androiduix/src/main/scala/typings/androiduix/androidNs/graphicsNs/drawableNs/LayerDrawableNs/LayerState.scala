package typings.androiduix.androidNs.graphicsNs.drawableNs.LayerDrawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.ConstantState
import typings.androiduix.androidNs.graphicsNs.drawableNs.LayerDrawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.LayerDrawable.LayerState")
@js.native
class LayerState protected () extends ConstantState {
  def this(orig: LayerState, owner: LayerDrawable) = this()
  var mAutoMirrored: js.Any = js.native
  var mCanConstantState: js.Any = js.native
  var mCheckedConstantState: js.Any = js.native
  var mChildren: js.Array[ChildDrawable] = js.native
  var mHaveOpacity: js.Any = js.native
  var mHaveStateful: js.Any = js.native
  var mNum: Double = js.native
  var mOpacity: js.Any = js.native
  var mStateful: js.Any = js.native
  def canConstantState(): Boolean = js.native
  def getOpacity(): Double = js.native
  def isStateful(): Boolean = js.native
  /* CompleteClass */
  override def newDrawable(): Drawable = js.native
}

