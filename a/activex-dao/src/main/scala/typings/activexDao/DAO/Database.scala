package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Database")
@js.native
class Database protected () extends js.Object {
  val CollatingOrder: Double = js.native
  var Connect: String = js.native
  val Connection: typings.activexDao.DAO.Connection = js.native
  @JSName("Containers")
  val Containers_Original: Containers = js.native
  @JSName("DAO.Database_typekey")
  var DAODotDatabase_typekey: Database = js.native
  var DesignMasterID: String = js.native
  val Name: String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  @JSName("QueryDefs")
  val QueryDefs_Original: QueryDefs = js.native
  var QueryTimeout: Double = js.native
  val RecordsAffected: Double = js.native
  @JSName("Recordsets")
  val Recordsets_Original: Recordsets = js.native
  @JSName("Relations")
  val Relations_Original: Relations = js.native
  val ReplicaID: String = js.native
  @JSName("TableDefs")
  val TableDefs_Original: TableDefs = js.native
  val Transactions: Boolean = js.native
  val Updatable: Boolean = js.native
  val Version: String = js.native
  def Close(): Unit = js.native
  def Containers(Item: String): Container = js.native
  def Containers(Item: Double): Container = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: String): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any, DDL: Boolean): Property = js.native
  def CreateQueryDef(): QueryDef = js.native
  def CreateQueryDef(Name: String): QueryDef = js.native
  def CreateQueryDef(Name: String, SQLText: String): QueryDef = js.native
  def CreateRelation(): Relation = js.native
  def CreateRelation(Name: String): Relation = js.native
  def CreateRelation(Name: String, Table: String): Relation = js.native
  def CreateRelation(Name: String, Table: String, ForeignTable: String): Relation = js.native
  def CreateRelation(Name: String, Table: String, ForeignTable: String, Attributes: RelationAttributeEnum): Relation = js.native
  def CreateTableDef(): TableDef = js.native
  def CreateTableDef(Name: String): TableDef = js.native
  def CreateTableDef(Name: String, Attributes: TableDefAttributeEnum): TableDef = js.native
  def CreateTableDef(Name: String, Attributes: TableDefAttributeEnum, SourceTableName: String): TableDef = js.native
  def CreateTableDef(Name: String, Attributes: TableDefAttributeEnum, SourceTableName: String, Connect: String): TableDef = js.native
  def Execute(Query: String): Unit = js.native
  def Execute(Query: String, Options: RecordsetOptionEnum): Unit = js.native
  def MakeReplica(PathName: String, Description: String): Unit = js.native
  def MakeReplica(PathName: String, Description: String, Options: ReplicaTypeEnum): Unit = js.native
  def NewPassword(bstrOld: String, bstrNew: String): Unit = js.native
  def OpenRecordset(Name: String): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum, Options: RecordsetOptionEnum, LockEdit: LockTypeEnum): Recordset = js.native
  def PopulatePartial(DbPathName: String): Unit = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  def QueryDefs(Item: String): QueryDef = js.native
  def QueryDefs(Item: Double): QueryDef = js.native
  def Recordsets(Item: String): Recordset = js.native
  def Recordsets(Item: Double): Recordset = js.native
  def Relations(Item: String): Relation = js.native
  def Relations(Item: Double): Relation = js.native
  def Synchronize(DbPathName: String): Unit = js.native
  def Synchronize(DbPathName: String, ExchangeType: SynchronizeTypeEnum): Unit = js.native
  def TableDefs(Item: String): TableDef = js.native
  def TableDefs(Item: Double): TableDef = js.native
}

