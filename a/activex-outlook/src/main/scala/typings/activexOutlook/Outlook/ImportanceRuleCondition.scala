package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportanceRuleCondition extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val ConditionType: OlRuleConditionType
  
  var Enabled: Boolean
  
  var Importance: OlImportance
  
  /* private */ @JSName("Outlook.ImportanceRuleCondition_typekey")
  var OutlookDotImportanceRuleCondition_typekey: ImportanceRuleCondition
  
  val Parent: Any
  
  val Session: NameSpace
}
object ImportanceRuleCondition {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    Importance: OlImportance,
    OutlookDotImportanceRuleCondition_typekey: ImportanceRuleCondition,
    Parent: Any,
    Session: NameSpace
  ): ImportanceRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ImportanceRuleCondition_typekey")(OutlookDotImportanceRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportanceRuleCondition]
  }
  
  extension [Self <: ImportanceRuleCondition](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setImportance(value: OlImportance): Self = StObject.set(x, "Importance", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotImportanceRuleCondition_typekey(value: ImportanceRuleCondition): Self = StObject.set(x, "Outlook.ImportanceRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
