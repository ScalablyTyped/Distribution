package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends StObject {
  
  def Close(): Unit = js.native
  
  val CollatingOrder: Double = js.native
  
  var Connect: String = js.native
  
  val Connection: typings.activexDao.DAO.Connection = js.native
  
  def Containers(Item: String): Container = js.native
  def Containers(Item: Double): Container = js.native
  @JSName("Containers")
  val Containers_Original: Containers = js.native
  
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: String): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: js.Any): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: js.Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: js.Any): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: js.Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: js.Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: Unit, DDL: Boolean): Property = js.native
  
  def CreateQueryDef(): QueryDef = js.native
  def CreateQueryDef(Name: String): QueryDef = js.native
  def CreateQueryDef(Name: String, SQLText: String): QueryDef = js.native
  def CreateQueryDef(Name: Unit, SQLText: String): QueryDef = js.native
  
  def CreateRelation(): Relation = js.native
  def CreateRelation(Name: String): Relation = js.native
  def CreateRelation(Name: String, Table: String): Relation = js.native
  def CreateRelation(Name: String, Table: String, ForeignTable: String): Relation = js.native
  def CreateRelation(Name: String, Table: String, ForeignTable: String, Attributes: RelationAttributeEnum): Relation = js.native
  def CreateRelation(Name: String, Table: String, ForeignTable: Unit, Attributes: RelationAttributeEnum): Relation = js.native
  def CreateRelation(Name: String, Table: Unit, ForeignTable: String): Relation = js.native
  def CreateRelation(Name: String, Table: Unit, ForeignTable: String, Attributes: RelationAttributeEnum): Relation = js.native
  def CreateRelation(Name: String, Table: Unit, ForeignTable: Unit, Attributes: RelationAttributeEnum): Relation = js.native
  def CreateRelation(Name: Unit, Table: String): Relation = js.native
  def CreateRelation(Name: Unit, Table: String, ForeignTable: String): Relation = js.native
  def CreateRelation(Name: Unit, Table: String, ForeignTable: String, Attributes: RelationAttributeEnum): Relation = js.native
  def CreateRelation(Name: Unit, Table: String, ForeignTable: Unit, Attributes: RelationAttributeEnum): Relation = js.native
  def CreateRelation(Name: Unit, Table: Unit, ForeignTable: String): Relation = js.native
  def CreateRelation(Name: Unit, Table: Unit, ForeignTable: String, Attributes: RelationAttributeEnum): Relation = js.native
  def CreateRelation(Name: Unit, Table: Unit, ForeignTable: Unit, Attributes: RelationAttributeEnum): Relation = js.native
  
  def CreateTableDef(): TableDef = js.native
  def CreateTableDef(Name: String): TableDef = js.native
  def CreateTableDef(Name: String, Attributes: Unit, SourceTableName: String): TableDef = js.native
  def CreateTableDef(Name: String, Attributes: Unit, SourceTableName: String, Connect: String): TableDef = js.native
  def CreateTableDef(Name: String, Attributes: Unit, SourceTableName: Unit, Connect: String): TableDef = js.native
  def CreateTableDef(Name: String, Attributes: TableDefAttributeEnum): TableDef = js.native
  def CreateTableDef(Name: String, Attributes: TableDefAttributeEnum, SourceTableName: String): TableDef = js.native
  def CreateTableDef(Name: String, Attributes: TableDefAttributeEnum, SourceTableName: String, Connect: String): TableDef = js.native
  def CreateTableDef(Name: String, Attributes: TableDefAttributeEnum, SourceTableName: Unit, Connect: String): TableDef = js.native
  def CreateTableDef(Name: Unit, Attributes: Unit, SourceTableName: String): TableDef = js.native
  def CreateTableDef(Name: Unit, Attributes: Unit, SourceTableName: String, Connect: String): TableDef = js.native
  def CreateTableDef(Name: Unit, Attributes: Unit, SourceTableName: Unit, Connect: String): TableDef = js.native
  def CreateTableDef(Name: Unit, Attributes: TableDefAttributeEnum): TableDef = js.native
  def CreateTableDef(Name: Unit, Attributes: TableDefAttributeEnum, SourceTableName: String): TableDef = js.native
  def CreateTableDef(Name: Unit, Attributes: TableDefAttributeEnum, SourceTableName: String, Connect: String): TableDef = js.native
  def CreateTableDef(Name: Unit, Attributes: TableDefAttributeEnum, SourceTableName: Unit, Connect: String): TableDef = js.native
  
  @JSName("DAO.Database_typekey")
  var DAODotDatabase_typekey: Database = js.native
  
  var DesignMasterID: String = js.native
  
  def Execute(Query: String): Unit = js.native
  def Execute(Query: String, Options: RecordsetOptionEnum): Unit = js.native
  
  def MakeReplica(PathName: String, Description: String): Unit = js.native
  def MakeReplica(PathName: String, Description: String, Options: ReplicaTypeEnum): Unit = js.native
  
  val Name: String = js.native
  
  def NewPassword(bstrOld: String, bstrNew: String): Unit = js.native
  
  def OpenRecordset(Name: String): Recordset = js.native
  def OpenRecordset(Name: String, Type: Unit, Options: Unit, LockEdit: LockTypeEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: Unit, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: Unit, Options: RecordsetOptionEnum, LockEdit: LockTypeEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum, Options: Unit, LockEdit: LockTypeEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(Name: String, Type: RecordsetTypeEnum, Options: RecordsetOptionEnum, LockEdit: LockTypeEnum): Recordset = js.native
  
  def PopulatePartial(DbPathName: String): Unit = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
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
  
  def Relations(Item: String): Relation = js.native
  def Relations(Item: Double): Relation = js.native
  @JSName("Relations")
  val Relations_Original: Relations = js.native
  
  val ReplicaID: String = js.native
  
  def Synchronize(DbPathName: String): Unit = js.native
  def Synchronize(DbPathName: String, ExchangeType: SynchronizeTypeEnum): Unit = js.native
  
  def TableDefs(Item: String): TableDef = js.native
  def TableDefs(Item: Double): TableDef = js.native
  @JSName("TableDefs")
  val TableDefs_Original: TableDefs = js.native
  
  val Transactions: Boolean = js.native
  
  val Updatable: Boolean = js.native
  
  val Version: String = js.native
}
