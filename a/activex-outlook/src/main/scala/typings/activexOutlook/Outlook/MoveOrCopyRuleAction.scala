package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveOrCopyRuleAction extends StObject {
  
  val ActionType: OlRuleActionType
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  var Enabled: Boolean
  
  var Folder: typings.activexOutlook.Outlook.Folder
  
  /* private */ @JSName("Outlook.MoveOrCopyRuleAction_typekey")
  var OutlookDotMoveOrCopyRuleAction_typekey: MoveOrCopyRuleAction
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object MoveOrCopyRuleAction {
  
  inline def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    Folder: Folder,
    OutlookDotMoveOrCopyRuleAction_typekey: MoveOrCopyRuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): MoveOrCopyRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Folder = Folder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.MoveOrCopyRuleAction_typekey")(OutlookDotMoveOrCopyRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveOrCopyRuleAction]
  }
  
  extension [Self <: MoveOrCopyRuleAction](x: Self) {
    
    inline def setActionType(value: OlRuleActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFolder(value: Folder): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotMoveOrCopyRuleAction_typekey(value: MoveOrCopyRuleAction): Self = StObject.set(x, "Outlook.MoveOrCopyRuleAction_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
