package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemProperty extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  def Delete(): Unit
  
  var Formula: String
  
  val IsUserProperty: Boolean
  
  val Name: String
  
  /* private */ @JSName("Outlook.ItemProperty_typekey")
  var OutlookDotItemProperty_typekey: ItemProperty
  
  val Parent: Any
  
  val Session: NameSpace
  
  val Type: OlUserPropertyType
  
  var ValidationFormula: String
  
  var ValidationText: String
  
  var Value: Any
}
object ItemProperty {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Delete: () => Unit,
    Formula: String,
    IsUserProperty: Boolean,
    Name: String,
    OutlookDotItemProperty_typekey: ItemProperty,
    Parent: Any,
    Session: NameSpace,
    Type: OlUserPropertyType,
    ValidationFormula: String,
    ValidationText: String,
    Value: Any
  ): ItemProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Formula = Formula.asInstanceOf[js.Any], IsUserProperty = IsUserProperty.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], ValidationFormula = ValidationFormula.asInstanceOf[js.Any], ValidationText = ValidationText.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ItemProperty_typekey")(OutlookDotItemProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemProperty] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    inline def setIsUserProperty(value: Boolean): Self = StObject.set(x, "IsUserProperty", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotItemProperty_typekey(value: ItemProperty): Self = StObject.set(x, "Outlook.ItemProperty_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setType(value: OlUserPropertyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValidationFormula(value: String): Self = StObject.set(x, "ValidationFormula", value.asInstanceOf[js.Any])
    
    inline def setValidationText(value: String): Self = StObject.set(x, "ValidationText", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
