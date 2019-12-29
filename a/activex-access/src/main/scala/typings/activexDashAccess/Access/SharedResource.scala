package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.SharedResource")
@js.native
class SharedResource protected () extends js.Object {
  @JSName("Access.SharedResource_typekey")
  var AccessDotSharedResource_typekey: SharedResource = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  val Type: AcResourceType = js.native
  def Delete(): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

