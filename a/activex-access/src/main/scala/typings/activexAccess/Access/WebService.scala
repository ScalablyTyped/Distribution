package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebService extends js.Object {
  @JSName("Access.WebService_typekey")
  var AccessDotWebService_typekey: WebService = js.native
  @JSName("Entities")
  val Entities_Original: Entities = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  def Entities(Index: js.Any): Entity = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

