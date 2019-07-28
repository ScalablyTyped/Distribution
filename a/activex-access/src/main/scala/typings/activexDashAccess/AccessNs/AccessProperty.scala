package typings.activexDashAccess.AccessNs

import typings.activexDashDao.DAONs.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.AccessProperty")
@js.native
class AccessProperty protected () extends js.Object {
  var `Access._AccessProperty_typekey`: AccessProperty = js.native
  val Application: typings.activexDashAccess.AccessNs.Application = js.native
  val Category: Double = js.native
  val Inherited: Boolean = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: typings.activexDashDao.DAONs.Properties = js.native
  var Type: Double = js.native
  var Value: js.Any = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
}

