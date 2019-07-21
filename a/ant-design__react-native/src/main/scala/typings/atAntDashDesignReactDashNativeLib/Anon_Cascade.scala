package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cascade extends js.Object {
  var cascade: scala.Boolean
  var cols: scala.Double
  var value: js.Array[scala.Nothing]
  def onChange(): scala.Unit
}

object Anon_Cascade {
  @scala.inline
  def apply(
    cascade: scala.Boolean,
    cols: scala.Double,
    onChange: () => scala.Unit,
    value: js.Array[scala.Nothing]
  ): Anon_Cascade = {
    val __obj = js.Dynamic.literal(cascade = cascade, cols = cols, onChange = js.Any.fromFunction0(onChange), value = value)
  
    __obj.asInstanceOf[Anon_Cascade]
  }
}

