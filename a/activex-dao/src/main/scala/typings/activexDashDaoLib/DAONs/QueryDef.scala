package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.QueryDef")
@js.native
class QueryDef protected () extends js.Object {
  var CacheSize: scala.Double = js.native
  var Connect: java.lang.String = js.native
  var `DAO.QueryDef_typekey`: QueryDef = js.native
  val DateCreated: activexDashInteropLib.VarDate = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  val LastUpdated: activexDashInteropLib.VarDate = js.native
  var MaxRecords: scala.Double = js.native
  var Name: java.lang.String = js.native
  var ODBCTimeout: scala.Double = js.native
  @JSName("Parameters")
  val Parameters_Original: Parameters = js.native
  var Prepare: QueryDefStateEnum = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val RecordsAffected: scala.Double = js.native
  var ReturnsRecords: scala.Boolean = js.native
  var SQL: java.lang.String = js.native
  val StillExecuting: scala.Boolean = js.native
  val Type: QueryDefTypeEnum = js.native
  val Updatable: scala.Boolean = js.native
  val hStmt: scala.Double = js.native
  def Cancel(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: java.lang.String): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any, DDL: scala.Boolean): Property = js.native
  def Execute(): scala.Unit = js.native
  def Execute(Options: RecordsetOptionEnum): scala.Unit = js.native
  def Fields(Item: java.lang.String): Field = js.native
  def Fields(Item: scala.Double): Field = js.native
  def OpenRecordset(): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: RecordsetOptionEnum, LockEdit: LockTypeEnum): Recordset = js.native
  def Parameters(Item: java.lang.String): Parameter = js.native
  def Parameters(Item: scala.Double): Parameter = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
}

