package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field extends StObject {
  
  var AllowZeroLength: Boolean = js.native
  
  def AppendChunk(Val: Any): Unit = js.native
  
  var AppendOnly: Boolean = js.native
  
  var Attributes: Double = js.native
  
  val CollatingOrder: Double = js.native
  
  val CollectionIndex: Double = js.native
  
  val ComplexType: typings.activexDao.DAO.ComplexType = js.native
  
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
  
  /* private */ @JSName("DAO.Field2_typekey")
  var DAODotField2_typekey: Field = js.native
  
  val DataUpdatable: Boolean = js.native
  
  var DefaultValue: Any = js.native
  
  var Expression: String = js.native
  
  val FieldSize: Double = js.native
  
  var ForeignName: String = js.native
  
  def GetChunk(Offset: Double, Bytes: Double): Any = js.native
  
  val IsComplex: Boolean = js.native
  
  def LoadFromFile(FileName: String): Unit = js.native
  
  var Name: String = js.native
  
  var OrdinalPosition: Double = js.native
  
  val OriginalValue: Any = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var Required: Boolean = js.native
  
  def SaveToFile(FileName: String): Unit = js.native
  
  var Size: Double = js.native
  
  val SourceField: String = js.native
  
  val SourceTable: String = js.native
  
  var Type: Double = js.native
  
  var ValidateOnSet: Boolean = js.native
  
  var ValidationRule: String = js.native
  
  var ValidationText: String = js.native
  
  var Value: Any = js.native
  
  val VisibleValue: Any = js.native
}
