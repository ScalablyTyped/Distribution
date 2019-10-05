package typings.activexDashDao.DAO

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.TableDef")
@js.native
class TableDef protected () extends js.Object {
  var Attributes: TableDefAttributeEnum = js.native
  val ConflictTable: String = js.native
  var Connect: String = js.native
  var `DAO.TableDef_typekey`: TableDef = js.native
  val DateCreated: VarDate = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  @JSName("Indexes")
  val Indexes_Original: Indexes = js.native
  val LastUpdated: VarDate = js.native
  var Name: String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val RecordCount: Double = js.native
  var ReplicaFilter: String | Boolean = js.native
  var SourceTableName: String = js.native
  val Updatable: Boolean = js.native
  var ValidationRule: String = js.native
  var ValidationText: String = js.native
  def CreateField(): Field = js.native
  def CreateField(Name: String): Field = js.native
  def CreateField(Name: String, Type: DataTypeEnum): Field = js.native
  def CreateField(Name: String, Type: DataTypeEnum, Size: Double): Field = js.native
  def CreateIndex(): Index = js.native
  def CreateIndex(Name: String): Index = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: String): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any, DDL: Boolean): Property = js.native
  def Fields(Item: String): Field = js.native
  def Fields(Item: Double): Field = js.native
  def Indexes(Item: String): Index = js.native
  def Indexes(Item: Double): Index = js.native
  def OpenRecordset(): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  def RefreshLink(): Unit = js.native
}

