package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveOrCopyRuleAction extends js.Object {
  
  val ActionType: OlRuleActionType = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var Enabled: Boolean = js.native
  
  var Folder: typings.activexOutlook.Outlook.Folder = js.native
  
  @JSName("Outlook.MoveOrCopyRuleAction_typekey")
  var OutlookDotMoveOrCopyRuleAction_typekey: MoveOrCopyRuleAction = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object MoveOrCopyRuleAction {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class MoveOrCopyRuleActionOps[Self <: MoveOrCopyRuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionType(value: OlRuleActionType): Self = this.set("ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolder(value: Folder): Self = this.set("Folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotMoveOrCopyRuleAction_typekey(value: MoveOrCopyRuleAction): Self = this.set("Outlook.MoveOrCopyRuleAction_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
}
