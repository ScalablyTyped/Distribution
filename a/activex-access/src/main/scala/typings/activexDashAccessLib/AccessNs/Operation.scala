package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Operation")
@js.native
class Operation protected () extends js.Object {
  var `Access.Operation_typekey`: Operation = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  @JSName("WSParameters")
  val WSParameters_Original: WSParameters = js.native
  /** @param bstrParameters [bstrParameters=''] */
  def Execute(): js.Any = js.native
  def Execute(bstrParameters: java.lang.String): js.Any = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def WSParameters(Index: java.lang.String): WSParameter = js.native
  def WSParameters(Index: scala.Double): WSParameter = js.native
}

