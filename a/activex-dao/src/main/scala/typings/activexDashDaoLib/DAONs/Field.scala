package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Field")
@js.native
class Field protected () extends js.Object {
  var AllowZeroLength: scala.Boolean = js.native
  var AppendOnly: scala.Boolean = js.native
  var Attributes: scala.Double = js.native
  val CollatingOrder: scala.Double = js.native
  val CollectionIndex: scala.Double = js.native
  val ComplexType: ComplexType = js.native
  var `DAO.Field2_typekey`: Field = js.native
  val DataUpdatable: scala.Boolean = js.native
  var DefaultValue: js.Any = js.native
  var Expression: java.lang.String = js.native
  val FieldSize: scala.Double = js.native
  var ForeignName: java.lang.String = js.native
  val IsComplex: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  var OrdinalPosition: scala.Double = js.native
  val OriginalValue: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Required: scala.Boolean = js.native
  var Size: scala.Double = js.native
  val SourceField: java.lang.String = js.native
  val SourceTable: java.lang.String = js.native
  var Type: scala.Double = js.native
  var ValidateOnSet: scala.Boolean = js.native
  var ValidationRule: java.lang.String = js.native
  var ValidationText: java.lang.String = js.native
  var Value: js.Any = js.native
  val VisibleValue: js.Any = js.native
  def AppendChunk(Val: js.Any): scala.Unit = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: java.lang.String): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any, DDL: scala.Boolean): Property = js.native
  def GetChunk(Offset: scala.Double, Bytes: scala.Double): js.Any = js.native
  def LoadFromFile(FileName: java.lang.String): scala.Unit = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
  def SaveToFile(FileName: java.lang.String): scala.Unit = js.native
}

