package typings.activexAccess.Access

import typings.activexDao.DAO.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.AccessProperty")
@js.native
class AccessProperty protected () extends js.Object {
  @JSName("Access._AccessProperty_typekey")
  var AccessDot_AccessProperty_typekey: AccessProperty = js.native
  val Application: typings.activexAccess.Access.Application = js.native
  val Category: Double = js.native
  val Inherited: Boolean = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: typings.activexDao.DAO.Properties = js.native
  var Type: Double = js.native
  var Value: js.Any = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
}

