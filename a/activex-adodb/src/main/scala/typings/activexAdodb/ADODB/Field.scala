package typings.activexAdodb.ADODB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  @JSName("ADODB.Field_typekey")
  var ADODBDotField_typekey: Field
  
  val ActualSize: Double
  
  def AppendChunk(Data: js.Any): Unit
  
  /** Sum of one or more of the values in the **FieldAttributeEnum** enum */
  var Attributes: FieldAttributeEnum
  
  var DataFormat: js.Any
  
  var DefinedSize: Double
  
  def GetChunk(Length: Double): js.Any
  
  val Name: String
  
  var NumericScale: Double
  
  val OriginalValue: js.Any
  
  var Precision: Double
  
  def Properties(Index: String): Property
  def Properties(Index: Double): Property
  @JSName("Properties")
  val Properties_Original: Properties
  
  val Status: Double
  
  var Type: DataTypeEnum
  
  val UnderlyingValue: js.Any
  
  var Value: js.Any
}
object Field {
  
  @scala.inline
  def apply(
    ADODBDotField_typekey: Field,
    ActualSize: Double,
    AppendChunk: js.Any => Unit,
    Attributes: FieldAttributeEnum,
    DataFormat: js.Any,
    DefinedSize: Double,
    GetChunk: Double => js.Any,
    Name: String,
    NumericScale: Double,
    OriginalValue: js.Any,
    Precision: Double,
    Properties: Properties,
    Status: Double,
    Type: DataTypeEnum,
    UnderlyingValue: js.Any,
    Value: js.Any
  ): Field = {
    val __obj = js.Dynamic.literal(ActualSize = ActualSize.asInstanceOf[js.Any], AppendChunk = js.Any.fromFunction1(AppendChunk), Attributes = Attributes.asInstanceOf[js.Any], DataFormat = DataFormat.asInstanceOf[js.Any], DefinedSize = DefinedSize.asInstanceOf[js.Any], GetChunk = js.Any.fromFunction1(GetChunk), Name = Name.asInstanceOf[js.Any], NumericScale = NumericScale.asInstanceOf[js.Any], OriginalValue = OriginalValue.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UnderlyingValue = UnderlyingValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Field_typekey")(ADODBDotField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADODBDotField_typekey(value: Field): Self = StObject.set(x, "ADODB.Field_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualSize(value: Double): Self = StObject.set(x, "ActualSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendChunk(value: js.Any => Unit): Self = StObject.set(x, "AppendChunk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttributes(value: FieldAttributeEnum): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormat(value: js.Any): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinedSize(value: Double): Self = StObject.set(x, "DefinedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChunk(value: Double => js.Any): Self = StObject.set(x, "GetChunk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericScale(value: Double): Self = StObject.set(x, "NumericScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValue(value: js.Any): Self = StObject.set(x, "OriginalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DataTypeEnum): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlyingValue(value: js.Any): Self = StObject.set(x, "UnderlyingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
