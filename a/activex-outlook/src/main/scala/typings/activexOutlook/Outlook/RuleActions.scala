package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleActions extends js.Object {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val AssignToCategory: AssignToCategoryRuleAction = js.native
  
  val CC: SendRuleAction = js.native
  
  val Class: OlObjectClass = js.native
  
  val ClearCategories: RuleAction = js.native
  
  val CopyToFolder: MoveOrCopyRuleAction = js.native
  
  val Count: Double = js.native
  
  val Delete: RuleAction = js.native
  
  val DeletePermanently: RuleAction = js.native
  
  val DesktopAlert: RuleAction = js.native
  
  val Forward: SendRuleAction = js.native
  
  val ForwardAsAttachment: SendRuleAction = js.native
  
  def Item(Index: Double): RuleAction = js.native
  
  val MarkAsTask: MarkAsTaskRuleAction = js.native
  
  val MoveToFolder: MoveOrCopyRuleAction = js.native
  
  val NewItemAlert: NewItemAlertRuleAction = js.native
  
  val NotifyDelivery: RuleAction = js.native
  
  val NotifyRead: RuleAction = js.native
  
  @JSName("Outlook.RuleActions_typekey")
  var OutlookDotRuleActions_typekey: RuleActions = js.native
  
  val Parent: js.Any = js.native
  
  val PlaySound: PlaySoundRuleAction = js.native
  
  val Redirect: SendRuleAction = js.native
  
  val Session: NameSpace = js.native
  
  val Stop: RuleAction = js.native
}
object RuleActions {
  
  @scala.inline
  def apply(
    Application: Application,
    AssignToCategory: AssignToCategoryRuleAction,
    CC: SendRuleAction,
    Class: OlObjectClass,
    ClearCategories: RuleAction,
    CopyToFolder: MoveOrCopyRuleAction,
    Count: Double,
    Delete: RuleAction,
    DeletePermanently: RuleAction,
    DesktopAlert: RuleAction,
    Forward: SendRuleAction,
    ForwardAsAttachment: SendRuleAction,
    Item: Double => RuleAction,
    MarkAsTask: MarkAsTaskRuleAction,
    MoveToFolder: MoveOrCopyRuleAction,
    NewItemAlert: NewItemAlertRuleAction,
    NotifyDelivery: RuleAction,
    NotifyRead: RuleAction,
    OutlookDotRuleActions_typekey: RuleActions,
    Parent: js.Any,
    PlaySound: PlaySoundRuleAction,
    Redirect: SendRuleAction,
    Session: NameSpace,
    Stop: RuleAction
  ): RuleActions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AssignToCategory = AssignToCategory.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ClearCategories = ClearCategories.asInstanceOf[js.Any], CopyToFolder = CopyToFolder.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any], DeletePermanently = DeletePermanently.asInstanceOf[js.Any], DesktopAlert = DesktopAlert.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any], ForwardAsAttachment = ForwardAsAttachment.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MarkAsTask = MarkAsTask.asInstanceOf[js.Any], MoveToFolder = MoveToFolder.asInstanceOf[js.Any], NewItemAlert = NewItemAlert.asInstanceOf[js.Any], NotifyDelivery = NotifyDelivery.asInstanceOf[js.Any], NotifyRead = NotifyRead.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlaySound = PlaySound.asInstanceOf[js.Any], Redirect = Redirect.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Stop = Stop.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.RuleActions_typekey")(OutlookDotRuleActions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleActions]
  }
  
  @scala.inline
  implicit class RuleActionsOps[Self <: RuleActions] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignToCategory(value: AssignToCategoryRuleAction): Self = this.set("AssignToCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCC(value: SendRuleAction): Self = this.set("CC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearCategories(value: RuleAction): Self = this.set("ClearCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyToFolder(value: MoveOrCopyRuleAction): Self = this.set("CopyToFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: RuleAction): Self = this.set("Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePermanently(value: RuleAction): Self = this.set("DeletePermanently", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopAlert(value: RuleAction): Self = this.set("DesktopAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: SendRuleAction): Self = this.set("Forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardAsAttachment(value: SendRuleAction): Self = this.set("ForwardAsAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => RuleAction): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarkAsTask(value: MarkAsTaskRuleAction): Self = this.set("MarkAsTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveToFolder(value: MoveOrCopyRuleAction): Self = this.set("MoveToFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewItemAlert(value: NewItemAlertRuleAction): Self = this.set("NewItemAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyDelivery(value: RuleAction): Self = this.set("NotifyDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyRead(value: RuleAction): Self = this.set("NotifyRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotRuleActions_typekey(value: RuleActions): Self = this.set("Outlook.RuleActions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaySound(value: PlaySoundRuleAction): Self = this.set("PlaySound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect(value: SendRuleAction): Self = this.set("Redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: RuleAction): Self = this.set("Stop", value.asInstanceOf[js.Any])
  }
}
