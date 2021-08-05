package typings.activexAdodb.ADODB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  /* private */ @JSName("ADODB.Parameter_typekey")
  var ADODBDotParameter_typekey: Parameter
  
  def AppendChunk(Val: js.Any): Unit
  
  /** Sum of one or more of the values in the **ParameterAttributesEnum** enum */
  var Attributes: ParameterAttributesEnum
  
  var Direction: ParameterDirectionEnum
  
  var Name: String
  
  var NumericScale: Double
  
  var Precision: Double
  
  def Properties(Index: String): Property
  def Properties(Index: Double): Property
  @JSName("Properties")
  val Properties_Original: Properties
  
  var Size: Double
  
  var Type: DataTypeEnum
  
  var Value: js.Any
}
object Parameter {
  
  inline def apply(
    ADODBDotParameter_typekey: Parameter,
    AppendChunk: js.Any => Unit,
    Attributes: ParameterAttributesEnum,
    Direction: ParameterDirectionEnum,
    Name: String,
    NumericScale: Double,
    Precision: Double,
    Properties: Properties,
    Size: Double,
    Type: DataTypeEnum,
    Value: js.Any
  ): Parameter = {
    val __obj = js.Dynamic.literal(AppendChunk = js.Any.fromFunction1(AppendChunk), Attributes = Attributes.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumericScale = NumericScale.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Parameter_typekey")(ADODBDotParameter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setADODBDotParameter_typekey(value: Parameter): Self = StObject.set(x, "ADODB.Parameter_typekey", value.asInstanceOf[js.Any])
    
    inline def setAppendChunk(value: js.Any => Unit): Self = StObject.set(x, "AppendChunk", js.Any.fromFunction1(value))
    
    inline def setAttributes(value: ParameterAttributesEnum): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: ParameterDirectionEnum): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNumericScale(value: Double): Self = StObject.set(x, "NumericScale", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setType(value: DataTypeEnum): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
