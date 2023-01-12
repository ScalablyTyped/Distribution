package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignToCategoryRuleAction extends StObject {
  
  val ActionType: OlRuleActionType
  
  val Application: typings.activexOutlook.Outlook.Application
  
  var Categories: Any
  
  val Class: OlObjectClass
  
  var Enabled: Boolean
  
  /* private */ @JSName("Outlook.AssignToCategoryRuleAction_typekey")
  var OutlookDotAssignToCategoryRuleAction_typekey: AssignToCategoryRuleAction
  
  val Parent: Any
  
  val Session: NameSpace
}
object AssignToCategoryRuleAction {
  
  inline def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Categories: Any,
    Class: OlObjectClass,
    Enabled: Boolean,
    OutlookDotAssignToCategoryRuleAction_typekey: AssignToCategoryRuleAction,
    Parent: Any,
    Session: NameSpace
  ): AssignToCategoryRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AssignToCategoryRuleAction_typekey")(OutlookDotAssignToCategoryRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignToCategoryRuleAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignToCategoryRuleAction] (val x: Self) extends AnyVal {
    
    inline def setActionType(value: OlRuleActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: Any): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotAssignToCategoryRuleAction_typekey(value: AssignToCategoryRuleAction): Self = StObject.set(x, "Outlook.AssignToCategoryRuleAction_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
