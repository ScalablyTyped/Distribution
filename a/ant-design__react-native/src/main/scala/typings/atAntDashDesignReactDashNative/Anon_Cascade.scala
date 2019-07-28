package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cascade extends js.Object {
  var cascade: Boolean
  var cols: Double
  var value: js.Array[scala.Nothing]
  def onChange(): Unit
}

object Anon_Cascade {
  @scala.inline
  def apply(cascade: Boolean, cols: Double, onChange: () => Unit, value: js.Array[scala.Nothing]): Anon_Cascade = {
    val __obj = js.Dynamic.literal(cascade = cascade, cols = cols, onChange = js.Any.fromFunction0(onChange), value = value)
  
    __obj.asInstanceOf[Anon_Cascade]
  }
}

