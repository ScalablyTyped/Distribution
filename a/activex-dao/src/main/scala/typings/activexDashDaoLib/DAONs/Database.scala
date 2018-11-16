package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Database")
@js.native
class Database protected () extends js.Object {
  val CollatingOrder: scala.Double = js.native
  var Connect: java.lang.String = js.native
  val Connection: Connection = js.native
  @JSName("Containers")
  val Containers_Original: Containers = js.native
  var `DAO.Database_typekey`: Database = js.native
  var DesignMasterID: java.lang.String = js.native
  val Name: java.lang.String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  @JSName("QueryDefs")
  val QueryDefs_Original: QueryDefs = js.native
  var QueryTimeout: scala.Double = js.native
  val RecordsAffected: scala.Double = js.native
  @JSName("Recordsets")
  val Recordsets_Original: Recordsets = js.native
  @JSName("Relations")
  val Relations_Original: Relations = js.native
  val ReplicaID: java.lang.String = js.native
  @JSName("TableDefs")
  val TableDefs_Original: TableDefs = js.native
  val Transactions: scala.Boolean = js.native
  val Updatable: scala.Boolean = js.native
  val Version: java.lang.String = js.native
  def Close(): scala.Unit = js.native
  def Containers(Item: java.lang.String): Container = js.native
  def Containers(Item: scala.Double): Container = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: java.lang.String): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any, DDL: scala.Boolean): Property = js.native
  def CreateQueryDef(): QueryDef = js.native
  def CreateQueryDef(Name: java.lang.String): QueryDef = js.native
  def CreateQueryDef(Name: java.lang.String, SQLText: java.lang.String): QueryDef = js.native
  def CreateRelation(): Relation = js.native
  def CreateRelation(Name: java.lang.String): Relation = js.native
  def CreateRelation(Name: java.lang.String, Table: java.lang.String): Relation = js.native
  def CreateRelation(Name: java.lang.String, Table: java.lang.String, ForeignTable: java.lang.String): Relation = js.native
  def CreateRelation(
    Name: java.lang.String,
    Table: java.lang.String,
    ForeignTable: java.lang.String,
    Attributes: RelationAttributeEnum
  ): Relation = js.native
  def CreateTableDef(): TableDef = js.native
  def CreateTableDef(Name: java.lang.String): TableDef = js.native
  def CreateTableDef(Name: java.lang.String, Attributes: TableDefAttributeEnum): TableDef = js.native
  def CreateTableDef(Name: java.lang.String, Attributes: TableDefAttributeEnum, SourceTableName: java.lang.String): TableDef = js.native
  def CreateTableDef(
    Name: java.lang.String,
    Attributes: TableDefAttributeEnum,
    SourceTableName: java.lang.String,
    Connect: java.lang.String
  ): TableDef = js.native
  def Execute(Query: java.lang.String): scala.Unit = js.native
  def Execute(Query: java.lang.String, Options: RecordsetOptionEnum): scala.Unit = js.native
  def MakeReplica(PathName: java.lang.String, Description: java.lang.String): scala.Unit = js.native
  def MakeReplica(PathName: java.lang.String, Description: java.lang.String, Options: ReplicaTypeEnum): scala.Unit = js.native
  def NewPassword(bstrOld: java.lang.String, bstrNew: java.lang.String): scala.Unit = js.native
  def OpenRecordset(Name: java.lang.String): Recordset = js.native
  def OpenRecordset(Name: java.lang.String, Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Name: java.lang.String, Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(
    Name: java.lang.String,
    Type: RecordsetTypeEnum,
    Options: RecordsetOptionEnum,
    LockEdit: LockTypeEnum
  ): Recordset = js.native
  def PopulatePartial(DbPathName: java.lang.String): scala.Unit = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
  def QueryDefs(Item: java.lang.String): QueryDef = js.native
  def QueryDefs(Item: scala.Double): QueryDef = js.native
  def Recordsets(Item: java.lang.String): Recordset = js.native
  def Recordsets(Item: scala.Double): Recordset = js.native
  def Relations(Item: java.lang.String): Relation = js.native
  def Relations(Item: scala.Double): Relation = js.native
  def Synchronize(DbPathName: java.lang.String): scala.Unit = js.native
  def Synchronize(DbPathName: java.lang.String, ExchangeType: SynchronizeTypeEnum): scala.Unit = js.native
  def TableDefs(Item: java.lang.String): TableDef = js.native
  def TableDefs(Item: scala.Double): TableDef = js.native
}

