package typings
package androiduixLib.androidNs.graphicsNs.drawableNs.LayerDrawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.LayerDrawable.LayerState")
@js.native
class LayerState protected ()
  extends androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.ConstantState {
  def this(orig: LayerState, owner: androiduixLib.androidNs.graphicsNs.drawableNs.LayerDrawable) = this()
  var mAutoMirrored: js.Any = js.native
  var mCanConstantState: js.Any = js.native
  var mCheckedConstantState: js.Any = js.native
  var mChildren: js.Array[ChildDrawable] = js.native
  var mHaveOpacity: js.Any = js.native
  var mHaveStateful: js.Any = js.native
  var mNum: scala.Double = js.native
  var mOpacity: js.Any = js.native
  var mStateful: js.Any = js.native
  def canConstantState(): scala.Boolean = js.native
  def getOpacity(): scala.Double = js.native
  def isStateful(): scala.Boolean = js.native
  /* CompleteClass */
  override def newDrawable(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
}

