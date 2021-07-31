package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkAsTaskRuleAction extends StObject {
  
  val ActionType: OlRuleActionType
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  var Enabled: Boolean
  
  var FlagTo: String
  
  var MarkInterval: OlMarkInterval
  
  @JSName("Outlook.MarkAsTaskRuleAction_typekey")
  var OutlookDotMarkAsTaskRuleAction_typekey: MarkAsTaskRuleAction
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object MarkAsTaskRuleAction {
  
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    FlagTo: String,
    MarkInterval: OlMarkInterval,
    OutlookDotMarkAsTaskRuleAction_typekey: MarkAsTaskRuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): MarkAsTaskRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FlagTo = FlagTo.asInstanceOf[js.Any], MarkInterval = MarkInterval.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.MarkAsTaskRuleAction_typekey")(OutlookDotMarkAsTaskRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkAsTaskRuleAction]
  }
  
  @scala.inline
  implicit class MarkAsTaskRuleActionMutableBuilder[Self <: MarkAsTaskRuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: OlRuleActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagTo(value: String): Self = StObject.set(x, "FlagTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkInterval(value: OlMarkInterval): Self = StObject.set(x, "MarkInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotMarkAsTaskRuleAction_typekey(value: MarkAsTaskRuleAction): Self = StObject.set(x, "Outlook.MarkAsTaskRuleAction_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
