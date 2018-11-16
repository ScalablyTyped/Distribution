package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.TableDef")
@js.native
class TableDef protected () extends js.Object {
  var Attributes: TableDefAttributeEnum = js.native
  val ConflictTable: java.lang.String = js.native
  var Connect: java.lang.String = js.native
  var `DAO.TableDef_typekey`: TableDef = js.native
  val DateCreated: stdLib.VarDate = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  @JSName("Indexes")
  val Indexes_Original: Indexes = js.native
  val LastUpdated: stdLib.VarDate = js.native
  var Name: java.lang.String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val RecordCount: scala.Double = js.native
  var ReplicaFilter: java.lang.String | scala.Boolean = js.native
  var SourceTableName: java.lang.String = js.native
  val Updatable: scala.Boolean = js.native
  var ValidationRule: java.lang.String = js.native
  var ValidationText: java.lang.String = js.native
  def CreateField(): Field = js.native
  def CreateField(Name: java.lang.String): Field = js.native
  def CreateField(Name: java.lang.String, Type: DataTypeEnum): Field = js.native
  def CreateField(Name: java.lang.String, Type: DataTypeEnum, Size: scala.Double): Field = js.native
  def CreateIndex(): Index = js.native
  def CreateIndex(Name: java.lang.String): Index = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: java.lang.String): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any, DDL: scala.Boolean): Property = js.native
  def Fields(Item: java.lang.String): Field = js.native
  def Fields(Item: scala.Double): Field = js.native
  def Indexes(Item: java.lang.String): Index = js.native
  def Indexes(Item: scala.Double): Index = js.native
  def OpenRecordset(): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
  def RefreshLink(): scala.Unit = js.native
}

