package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.StateListDrawable")
@js.native
class StateListDrawable () extends DrawableContainer {
  var mStateListState: js.Any = js.native
  def addState(stateSet: js.Array[scala.Double], drawable: Drawable): scala.Unit = js.native
  def getStateCount(): scala.Double = js.native
  def getStateDrawable(index: scala.Double): Drawable = js.native
  def getStateDrawableIndex(stateSet: js.Array[scala.Double]): scala.Double = js.native
  /* private */ def getStateListState(): js.Any = js.native
  def getStateSet(index: scala.Double): js.Array[scala.Double] = js.native
  /* private */ def initWithState(state: js.Any): js.Any = js.native
}

