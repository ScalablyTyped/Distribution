package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaProperty extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val Id: String
  
  val IsReadOnly: Boolean
  
  val IsRequired: Boolean
  
  val Name: String
  
  /* private */ @JSName("Office.MetaProperty_typekey")
  var OfficeDotMetaProperty_typekey: MetaProperty
  
  val Parent: Any
  
  val Type: MsoMetaPropertyType
  
  def Validate(): String
  
  val ValidationError: String
  
  var Value: Any
}
object MetaProperty {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Id: String,
    IsReadOnly: Boolean,
    IsRequired: Boolean,
    Name: String,
    OfficeDotMetaProperty_typekey: MetaProperty,
    Parent: Any,
    Type: MsoMetaPropertyType,
    Validate: () => String,
    ValidationError: String,
    Value: Any
  ): MetaProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], IsRequired = IsRequired.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Validate = js.Any.fromFunction0(Validate), ValidationError = ValidationError.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.MetaProperty_typekey")(OfficeDotMetaProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaProperty]
  }
  
  extension [Self <: MetaProperty](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "IsReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "IsRequired", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotMetaProperty_typekey(value: MetaProperty): Self = StObject.set(x, "Office.MetaProperty_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoMetaPropertyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: () => String): Self = StObject.set(x, "Validate", js.Any.fromFunction0(value))
    
    inline def setValidationError(value: String): Self = StObject.set(x, "ValidationError", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
