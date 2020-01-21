package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Operation")
@js.native
class Operation protected () extends js.Object {
  @JSName("Access.Operation_typekey")
  var AccessDotOperation_typekey: Operation = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("WSParameters")
  val WSParameters_Original: WSParameters = js.native
  /** @param bstrParameters [bstrParameters=''] */
  def Execute(): js.Any = js.native
  def Execute(bstrParameters: String): js.Any = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def WSParameters(Index: String): WSParameter = js.native
  def WSParameters(Index: Double): WSParameter = js.native
}

