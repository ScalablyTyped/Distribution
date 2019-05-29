package typings
package arrifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("arrify", JSImport.Namespace)
@js.native
object arrifyMod extends js.Object {
  def apply[ValueType](value: ValueType): (js.Array[_ | js.Any | java.lang.String | ValueType]) | ValueType = js.native
}

