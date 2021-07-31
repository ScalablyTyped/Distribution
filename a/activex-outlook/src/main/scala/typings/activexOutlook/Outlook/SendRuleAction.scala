package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendRuleAction extends StObject {
  
  val ActionType: OlRuleActionType
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  var Enabled: Boolean
  
  @JSName("Outlook.SendRuleAction_typekey")
  var OutlookDotSendRuleAction_typekey: SendRuleAction
  
  val Parent: js.Any
  
  val Recipients: typings.activexOutlook.Outlook.Recipients
  
  val Session: NameSpace
}
object SendRuleAction {
  
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    OutlookDotSendRuleAction_typekey: SendRuleAction,
    Parent: js.Any,
    Recipients: Recipients,
    Session: NameSpace
  ): SendRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SendRuleAction_typekey")(OutlookDotSendRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendRuleAction]
  }
  
  @scala.inline
  implicit class SendRuleActionMutableBuilder[Self <: SendRuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: OlRuleActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotSendRuleAction_typekey(value: SendRuleAction): Self = StObject.set(x, "Outlook.SendRuleAction_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipients(value: Recipients): Self = StObject.set(x, "Recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
