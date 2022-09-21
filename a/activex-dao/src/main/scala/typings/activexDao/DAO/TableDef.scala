package typings.activexDao.DAO

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDef extends StObject {
  
  var Attributes: TableDefAttributeEnum = js.native
  
  val ConflictTable: String = js.native
  
  var Connect: String = js.native
  
  def CreateField(): Field = js.native
  def CreateField(Name: String): Field = js.native
  def CreateField(Name: String, Type: Unit, Size: Double): Field = js.native
  def CreateField(Name: String, Type: DataTypeEnum): Field = js.native
  def CreateField(Name: String, Type: DataTypeEnum, Size: Double): Field = js.native
  def CreateField(Name: Unit, Type: Unit, Size: Double): Field = js.native
  def CreateField(Name: Unit, Type: DataTypeEnum): Field = js.native
  def CreateField(Name: Unit, Type: DataTypeEnum, Size: Double): Field = js.native
  
  def CreateIndex(): Index = js.native
  def CreateIndex(Name: String): Index = js.native
  
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: String): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: Any): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: Any): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: Any): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: Any): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: Unit, DDL: Boolean): Property = js.native
  
  /* private */ @JSName("DAO.TableDef_typekey")
  var DAODotTableDef_typekey: TableDef = js.native
  
  val DateCreated: VarDate = js.native
  
  def Fields(Item: String): Field = js.native
  def Fields(Item: Double): Field = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  
  def Indexes(Item: String): Index = js.native
  def Indexes(Item: Double): Index = js.native
  @JSName("Indexes")
  val Indexes_Original: Indexes = js.native
  
  val LastUpdated: VarDate = js.native
  
  var Name: String = js.native
  
  def OpenRecordset(): Recordset = js.native
  def OpenRecordset(Type: Unit, Options: RecordsetOptionEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  val RecordCount: Double = js.native
  
  def RefreshLink(): Unit = js.native
  
  var ReplicaFilter: String | Boolean = js.native
  
  var SourceTableName: String = js.native
  
  val Updatable: Boolean = js.native
  
  var ValidationRule: String = js.native
  
  var ValidationText: String = js.native
}
