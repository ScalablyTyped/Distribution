package typings.androiduix.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.StateListDrawable")
@js.native
class StateListDrawable () extends DrawableContainer {
  var mStateListState: js.Any = js.native
  def addState(stateSet: js.Array[Double], drawable: Drawable): Unit = js.native
  def getStateCount(): Double = js.native
  def getStateDrawable(index: Double): Drawable = js.native
  def getStateDrawableIndex(stateSet: js.Array[Double]): Double = js.native
  /* private */ def getStateListState(): js.Any = js.native
  def getStateSet(index: Double): js.Array[Double] = js.native
  /* private */ def initWithState(state: js.Any): js.Any = js.native
}

