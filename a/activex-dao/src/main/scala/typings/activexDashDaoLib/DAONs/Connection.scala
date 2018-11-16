package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Connection")
@js.native
class Connection protected () extends js.Object {
  val Connect: java.lang.String = js.native
  var `DAO.Connection_typekey`: Connection = js.native
  val Database: Database = js.native
  val Name: java.lang.String = js.native
  @JSName("QueryDefs")
  val QueryDefs_Original: QueryDefs = js.native
  var QueryTimeout: scala.Double = js.native
  val RecordsAffected: scala.Double = js.native
  @JSName("Recordsets")
  val Recordsets_Original: Recordsets = js.native
  val StillExecuting: scala.Boolean = js.native
  val Transactions: scala.Boolean = js.native
  val Updatable: scala.Boolean = js.native
  val hDbc: scala.Double = js.native
  def Cancel(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def CreateQueryDef(): QueryDef = js.native
  def CreateQueryDef(Name: java.lang.String): QueryDef = js.native
  def CreateQueryDef(Name: java.lang.String, SQLText: java.lang.String): QueryDef = js.native
  def Execute(Query: java.lang.String): scala.Unit = js.native
  def Execute(Query: java.lang.String, Options: RecordsetOptionEnum): scala.Unit = js.native
  def OpenRecordset(Name: java.lang.String): Recordset = js.native
  def OpenRecordset(Name: java.lang.String, Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Name: java.lang.String, Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(
    Name: java.lang.String,
    Type: RecordsetTypeEnum,
    Options: RecordsetOptionEnum,
    LockEdit: LockTypeEnum
  ): Recordset = js.native
  def QueryDefs(Item: java.lang.String): QueryDef = js.native
  def QueryDefs(Item: scala.Double): QueryDef = js.native
  def Recordsets(Item: java.lang.String): Recordset = js.native
  def Recordsets(Item: scala.Double): Recordset = js.native
}

