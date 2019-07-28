package typings.activexDashDao.DAONs

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Document")
@js.native
class Document protected () extends js.Object {
  val AllPermissions: Double = js.native
  val Container: String = js.native
  var `DAO.Document_typekey`: Document = js.native
  val DateCreated: VarDate = js.native
  val LastUpdated: VarDate = js.native
  val Name: String = js.native
  var Owner: String = js.native
  var Permissions: Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var UserName: String = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: String): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any, DDL: Boolean): Property = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
}

