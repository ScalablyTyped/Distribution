package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefinedProperty extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  def Delete(): Unit
  
  val DisplayFormat: Double
  
  val Formula: String
  
  val Name: String
  
  @JSName("Outlook.UserDefinedProperty_typekey")
  var OutlookDotUserDefinedProperty_typekey: UserDefinedProperty
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  val Type: OlUserPropertyType
}
object UserDefinedProperty {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Delete: () => Unit,
    DisplayFormat: Double,
    Formula: String,
    Name: String,
    OutlookDotUserDefinedProperty_typekey: UserDefinedProperty,
    Parent: js.Any,
    Session: NameSpace,
    Type: OlUserPropertyType
  ): UserDefinedProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayFormat = DisplayFormat.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.UserDefinedProperty_typekey")(OutlookDotUserDefinedProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedProperty]
  }
  
  @scala.inline
  implicit class UserDefinedPropertyMutableBuilder[Self <: UserDefinedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayFormat(value: Double): Self = StObject.set(x, "DisplayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotUserDefinedProperty_typekey(value: UserDefinedProperty): Self = StObject.set(x, "Outlook.UserDefinedProperty_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OlUserPropertyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
