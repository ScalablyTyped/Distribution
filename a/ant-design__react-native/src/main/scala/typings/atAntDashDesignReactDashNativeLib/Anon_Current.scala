package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: scala.Double
  var indicatorStyle: scala.Null
  var mode: java.lang.String
  var simple: scala.Boolean
  var total: scala.Double
  def onChange(): scala.Unit
}

object Anon_Current {
  @scala.inline
  def apply(
    current: scala.Double,
    indicatorStyle: scala.Null,
    mode: java.lang.String,
    onChange: () => scala.Unit,
    simple: scala.Boolean,
    total: scala.Double
  ): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current, indicatorStyle = indicatorStyle, mode = mode, onChange = js.Any.fromFunction0(onChange), simple = simple, total = total)
  
    __obj.asInstanceOf[Anon_Current]
  }
}

