package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Entity")
@js.native
class Entity protected () extends js.Object {
  var `Access.Entity_typekey`: Entity = js.native
  val Name: java.lang.String = js.native
  @JSName("Operations")
  val Operations_Original: Operations = js.native
  val Parent: js.Any = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Operations(Index: java.lang.String): Operation = js.native
  def Operations(Index: scala.Double): Operation = js.native
}

