package typings
package androiduixLib.androidNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.StateSet")
@js.native
class StateSet () extends js.Object

/* static members */
@JSGlobal("android.util.StateSet")
@js.native
object StateSet extends js.Object {
  var NOTHING: js.Array[scala.Double] = js.native
  var WILD_CARD: js.Array[scala.Double] = js.native
  /* private */ def _stateSetMatches_single(stateSpec: js.Any, state: js.Any): js.Any = js.native
  def isWildCard(stateSetOrSpec: js.Array[scala.Double]): scala.Boolean = js.native
  def stateSetMatches(stateSpec: js.Array[scala.Double], stateSetOrState: js.Array[scala.Double]): scala.Boolean = js.native
  def stateSetMatches(stateSpec: js.Array[scala.Double], stateSetOrState: scala.Double): scala.Boolean = js.native
  def trimStateSet(states: js.Array[scala.Double], newSize: scala.Double): js.Array[scala.Double] = js.native
}

