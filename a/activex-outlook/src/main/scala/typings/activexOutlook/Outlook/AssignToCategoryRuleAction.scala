package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignToCategoryRuleAction extends StObject {
  
  val ActionType: OlRuleActionType = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  var Categories: js.Any = js.native
  
  val Class: OlObjectClass = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Outlook.AssignToCategoryRuleAction_typekey")
  var OutlookDotAssignToCategoryRuleAction_typekey: AssignToCategoryRuleAction = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object AssignToCategoryRuleAction {
  
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Categories: js.Any,
    Class: OlObjectClass,
    Enabled: Boolean,
    OutlookDotAssignToCategoryRuleAction_typekey: AssignToCategoryRuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): AssignToCategoryRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AssignToCategoryRuleAction_typekey")(OutlookDotAssignToCategoryRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignToCategoryRuleAction]
  }
  
  @scala.inline
  implicit class AssignToCategoryRuleActionMutableBuilder[Self <: AssignToCategoryRuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: OlRuleActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategories(value: js.Any): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotAssignToCategoryRuleAction_typekey(value: AssignToCategoryRuleAction): Self = StObject.set(x, "Outlook.AssignToCategoryRuleAction_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
