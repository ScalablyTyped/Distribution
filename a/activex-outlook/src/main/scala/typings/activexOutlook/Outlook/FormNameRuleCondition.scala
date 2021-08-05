package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormNameRuleCondition extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val ConditionType: OlRuleConditionType
  
  var Enabled: Boolean
  
  var FormName: js.Any
  
  /* private */ @JSName("Outlook.FormNameRuleCondition_typekey")
  var OutlookDotFormNameRuleCondition_typekey: FormNameRuleCondition
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object FormNameRuleCondition {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    FormName: js.Any,
    OutlookDotFormNameRuleCondition_typekey: FormNameRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): FormNameRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FormName = FormName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.FormNameRuleCondition_typekey")(OutlookDotFormNameRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormNameRuleCondition]
  }
  
  extension [Self <: FormNameRuleCondition](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFormName(value: js.Any): Self = StObject.set(x, "FormName", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotFormNameRuleCondition_typekey(value: FormNameRuleCondition): Self = StObject.set(x, "Outlook.FormNameRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
