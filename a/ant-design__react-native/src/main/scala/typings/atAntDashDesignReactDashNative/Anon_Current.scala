package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: Double
  var indicatorStyle: Null
  var mode: String
  var simple: Boolean
  var total: Double
  def onChange(): Unit
}

object Anon_Current {
  @scala.inline
  def apply(
    current: Double,
    indicatorStyle: Null,
    mode: String,
    onChange: () => Unit,
    simple: Boolean,
    total: Double
  ): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current, indicatorStyle = indicatorStyle, mode = mode, onChange = js.Any.fromFunction0(onChange), simple = simple, total = total)
  
    __obj.asInstanceOf[Anon_Current]
  }
}

