package typings.androiduix.android.graphics.drawable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateListDrawable extends DrawableContainer {
  
  def addState(stateSet: js.Array[Double], drawable: Drawable): Unit = js.native
  
  def getStateCount(): Double = js.native
  
  def getStateDrawable(index: Double): Drawable = js.native
  
  def getStateDrawableIndex(stateSet: js.Array[Double]): Double = js.native
  
  /* private */ def getStateListState(): js.Any = js.native
  
  def getStateSet(index: Double): js.Array[Double] = js.native
  
  /* private */ def initWithState(state: js.Any): js.Any = js.native
  
  var mStateListState: js.Any = js.native
}
