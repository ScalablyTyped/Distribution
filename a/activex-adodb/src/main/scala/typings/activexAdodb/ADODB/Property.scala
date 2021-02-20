package typings.activexAdodb.ADODB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Property extends StObject {
  
  @JSName("ADODB.Property_typekey")
  var ADODBDotProperty_typekey: Property = js.native
  
  /** Sum of one or more of the values in the **PropertyAttributesEnum** enum */
  var Attributes: PropertyAttributesEnum = js.native
  
  val Name: String = js.native
  
  val Type: DataTypeEnum = js.native
  
  var Value: js.Any = js.native
}
object Property {
  
  @scala.inline
  def apply(
    ADODBDotProperty_typekey: Property,
    Attributes: PropertyAttributesEnum,
    Name: String,
    Type: DataTypeEnum,
    Value: js.Any
  ): Property = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Property_typekey")(ADODBDotProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit class PropertyMutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADODBDotProperty_typekey(value: Property): Self = StObject.set(x, "ADODB.Property_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: PropertyAttributesEnum): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DataTypeEnum): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
