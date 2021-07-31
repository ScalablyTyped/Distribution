package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends StObject {
  
  def Cancel(): Unit = js.native
  
  def Close(): Unit = js.native
  
  val Connect: String = js.native
  
  def CreateQueryDef(): QueryDef = js.native
  def CreateQueryDef(Name: String): QueryDef = js.native
  def CreateQueryDef(Name: String, SQLText: String): QueryDef = js.native
  def CreateQueryDef(Name: Unit, SQLText: String): QueryDef = js.native
  
  @JSName("DAO.Connection_typekey")
  var DAODotConnection_typekey: Connection = js.native
  
  val Database: typings.activexDao.DAO.Database = js.native
  
  def Execute(Query: String): Unit = js.native
  def Execute(Query: String, Options: RecordsetOptionEnum): Unit = js.native
  
  val Name: String = js.native
  
  def OpenRecordset(Name: String): Recordset = js.native
  def OpenRecordset(Name: String, Type: Unit, Options: Unit, LockEdit: LockTypeEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: Unit, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: Unit, Options: RecordsetOptionEnum, LockEdit: LockTypeEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum, Options: Unit, LockEdit: LockTypeEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum, Options: RecordsetOptionEnum, LockEdit: LockTypeEnum): Recordset = js.native
  
  def QueryDefs(Item: String): QueryDef = js.native
  def QueryDefs(Item: Double): QueryDef = js.native
  @JSName("QueryDefs")
  val QueryDefs_Original: QueryDefs = js.native
  
  var QueryTimeout: Double = js.native
  
  val RecordsAffected: Double = js.native
  
  def Recordsets(Item: String): Recordset = js.native
  def Recordsets(Item: Double): Recordset = js.native
  @JSName("Recordsets")
  val Recordsets_Original: Recordsets = js.native
  
  val StillExecuting: Boolean = js.native
  
  val Transactions: Boolean = js.native
  
  val Updatable: Boolean = js.native
  
  val hDbc: Double = js.native
}
