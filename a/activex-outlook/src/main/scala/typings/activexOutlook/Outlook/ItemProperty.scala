package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemProperty extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  def Delete(): Unit = js.native
  
  var Formula: String = js.native
  
  val IsUserProperty: Boolean = js.native
  
  val Name: String = js.native
  
  @JSName("Outlook.ItemProperty_typekey")
  var OutlookDotItemProperty_typekey: ItemProperty = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  val Type: OlUserPropertyType = js.native
  
  var ValidationFormula: String = js.native
  
  var ValidationText: String = js.native
  
  var Value: js.Any = js.native
}
object ItemProperty {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Delete: () => Unit,
    Formula: String,
    IsUserProperty: Boolean,
    Name: String,
    OutlookDotItemProperty_typekey: ItemProperty,
    Parent: js.Any,
    Session: NameSpace,
    Type: OlUserPropertyType,
    ValidationFormula: String,
    ValidationText: String,
    Value: js.Any
  ): ItemProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Formula = Formula.asInstanceOf[js.Any], IsUserProperty = IsUserProperty.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], ValidationFormula = ValidationFormula.asInstanceOf[js.Any], ValidationText = ValidationText.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ItemProperty_typekey")(OutlookDotItemProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProperty]
  }
  
  @scala.inline
  implicit class ItemPropertyMutableBuilder[Self <: ItemProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUserProperty(value: Boolean): Self = StObject.set(x, "IsUserProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotItemProperty_typekey(value: ItemProperty): Self = StObject.set(x, "Outlook.ItemProperty_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OlUserPropertyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationFormula(value: String): Self = StObject.set(x, "ValidationFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationText(value: String): Self = StObject.set(x, "ValidationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
