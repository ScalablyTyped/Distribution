package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewItemAlertRuleAction extends StObject {
  
  val ActionType: OlRuleActionType
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  var Enabled: Boolean
  
  /* private */ @JSName("Outlook.NewItemAlertRuleAction_typekey")
  var OutlookDotNewItemAlertRuleAction_typekey: NewItemAlertRuleAction
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  var Text: String
}
object NewItemAlertRuleAction {
  
  inline def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    OutlookDotNewItemAlertRuleAction_typekey: NewItemAlertRuleAction,
    Parent: js.Any,
    Session: NameSpace,
    Text: String
  ): NewItemAlertRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NewItemAlertRuleAction_typekey")(OutlookDotNewItemAlertRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewItemAlertRuleAction]
  }
  
  extension [Self <: NewItemAlertRuleAction](x: Self) {
    
    inline def setActionType(value: OlRuleActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotNewItemAlertRuleAction_typekey(value: NewItemAlertRuleAction): Self = StObject.set(x, "Outlook.NewItemAlertRuleAction_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
