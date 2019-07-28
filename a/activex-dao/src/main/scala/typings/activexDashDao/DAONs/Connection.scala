package typings.activexDashDao.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Connection")
@js.native
class Connection protected () extends js.Object {
  val Connect: String = js.native
  var `DAO.Connection_typekey`: Connection = js.native
  val Database: typings.activexDashDao.DAONs.Database = js.native
  val Name: String = js.native
  @JSName("QueryDefs")
  val QueryDefs_Original: QueryDefs = js.native
  var QueryTimeout: Double = js.native
  val RecordsAffected: Double = js.native
  @JSName("Recordsets")
  val Recordsets_Original: Recordsets = js.native
  val StillExecuting: Boolean = js.native
  val Transactions: Boolean = js.native
  val Updatable: Boolean = js.native
  val hDbc: Double = js.native
  def Cancel(): Unit = js.native
  def Close(): Unit = js.native
  def CreateQueryDef(): QueryDef = js.native
  def CreateQueryDef(Name: String): QueryDef = js.native
  def CreateQueryDef(Name: String, SQLText: String): QueryDef = js.native
  def Execute(Query: String): Unit = js.native
  def Execute(Query: String, Options: RecordsetOptionEnum): Unit = js.native
  def OpenRecordset(Name: String): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum, Options: RecordsetOptionEnum, LockEdit: LockTypeEnum): Recordset = js.native
  def QueryDefs(Item: String): QueryDef = js.native
  def QueryDefs(Item: Double): QueryDef = js.native
  def Recordsets(Item: String): Recordset = js.native
  def Recordsets(Item: Double): Recordset = js.native
}

