package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFormatRule extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  var Enabled: Boolean
  
  var Filter: String
  
  var Font: ViewFont
  
  var Name: String
  
  /* private */ @JSName("Outlook.AutoFormatRule_typekey")
  var OutlookDotAutoFormatRule_typekey: AutoFormatRule
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  val Standard: Boolean
}
object AutoFormatRule {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    Filter: String,
    Font: ViewFont,
    Name: String,
    OutlookDotAutoFormatRule_typekey: AutoFormatRule,
    Parent: js.Any,
    Session: NameSpace,
    Standard: Boolean
  ): AutoFormatRule = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AutoFormatRule_typekey")(OutlookDotAutoFormatRule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFormatRule]
  }
  
  extension [Self <: AutoFormatRule](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFont(value: ViewFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotAutoFormatRule_typekey(value: AutoFormatRule): Self = StObject.set(x, "Outlook.AutoFormatRule_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: Boolean): Self = StObject.set(x, "Standard", value.asInstanceOf[js.Any])
  }
}
