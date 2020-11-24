package typings.androiduix.global.android.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.util.StateSet")
@js.native
class StateSet ()
  extends typings.androiduix.android.util.StateSet
/* static members */
@JSGlobal("android.util.StateSet")
@js.native
object StateSet extends js.Object {
  
  var NOTHING: js.Array[Double] = js.native
  
  var WILD_CARD: js.Array[Double] = js.native
  
  /* private */ def _stateSetMatches_single(stateSpec: js.Any, state: js.Any): js.Any = js.native
  
  def isWildCard(stateSetOrSpec: js.Array[Double]): Boolean = js.native
  
  def stateSetMatches(stateSpec: js.Array[Double], stateSetOrState: js.Array[Double]): Boolean = js.native
  def stateSetMatches(stateSpec: js.Array[Double], stateSetOrState: Double): Boolean = js.native
  
  def trimStateSet(states: js.Array[Double], newSize: Double): js.Array[Double] = js.native
}
