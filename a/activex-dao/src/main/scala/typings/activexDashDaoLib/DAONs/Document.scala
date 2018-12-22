package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Document")
@js.native
class Document protected () extends js.Object {
  val AllPermissions: scala.Double = js.native
  val Container: java.lang.String = js.native
  var `DAO.Document_typekey`: Document = js.native
  val DateCreated: activexDashInteropLib.VarDate = js.native
  val LastUpdated: activexDashInteropLib.VarDate = js.native
  val Name: java.lang.String = js.native
  var Owner: java.lang.String = js.native
  var Permissions: scala.Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var UserName: java.lang.String = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: java.lang.String): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any, DDL: scala.Boolean): Property = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
}

