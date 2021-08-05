package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleActions extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val AssignToCategory: AssignToCategoryRuleAction
  
  val CC: SendRuleAction
  
  val Class: OlObjectClass
  
  val ClearCategories: RuleAction
  
  val CopyToFolder: MoveOrCopyRuleAction
  
  val Count: Double
  
  val Delete: RuleAction
  
  val DeletePermanently: RuleAction
  
  val DesktopAlert: RuleAction
  
  val Forward: SendRuleAction
  
  val ForwardAsAttachment: SendRuleAction
  
  def Item(Index: Double): RuleAction
  
  val MarkAsTask: MarkAsTaskRuleAction
  
  val MoveToFolder: MoveOrCopyRuleAction
  
  val NewItemAlert: NewItemAlertRuleAction
  
  val NotifyDelivery: RuleAction
  
  val NotifyRead: RuleAction
  
  /* private */ @JSName("Outlook.RuleActions_typekey")
  var OutlookDotRuleActions_typekey: RuleActions
  
  val Parent: js.Any
  
  val PlaySound: PlaySoundRuleAction
  
  val Redirect: SendRuleAction
  
  val Session: NameSpace
  
  val Stop: RuleAction
}
object RuleActions {
  
  inline def apply(
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
  
  extension [Self <: RuleActions](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAssignToCategory(value: AssignToCategoryRuleAction): Self = StObject.set(x, "AssignToCategory", value.asInstanceOf[js.Any])
    
    inline def setCC(value: SendRuleAction): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setClearCategories(value: RuleAction): Self = StObject.set(x, "ClearCategories", value.asInstanceOf[js.Any])
    
    inline def setCopyToFolder(value: MoveOrCopyRuleAction): Self = StObject.set(x, "CopyToFolder", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: RuleAction): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    inline def setDeletePermanently(value: RuleAction): Self = StObject.set(x, "DeletePermanently", value.asInstanceOf[js.Any])
    
    inline def setDesktopAlert(value: RuleAction): Self = StObject.set(x, "DesktopAlert", value.asInstanceOf[js.Any])
    
    inline def setForward(value: SendRuleAction): Self = StObject.set(x, "Forward", value.asInstanceOf[js.Any])
    
    inline def setForwardAsAttachment(value: SendRuleAction): Self = StObject.set(x, "ForwardAsAttachment", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => RuleAction): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setMarkAsTask(value: MarkAsTaskRuleAction): Self = StObject.set(x, "MarkAsTask", value.asInstanceOf[js.Any])
    
    inline def setMoveToFolder(value: MoveOrCopyRuleAction): Self = StObject.set(x, "MoveToFolder", value.asInstanceOf[js.Any])
    
    inline def setNewItemAlert(value: NewItemAlertRuleAction): Self = StObject.set(x, "NewItemAlert", value.asInstanceOf[js.Any])
    
    inline def setNotifyDelivery(value: RuleAction): Self = StObject.set(x, "NotifyDelivery", value.asInstanceOf[js.Any])
    
    inline def setNotifyRead(value: RuleAction): Self = StObject.set(x, "NotifyRead", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotRuleActions_typekey(value: RuleActions): Self = StObject.set(x, "Outlook.RuleActions_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPlaySound(value: PlaySoundRuleAction): Self = StObject.set(x, "PlaySound", value.asInstanceOf[js.Any])
    
    inline def setRedirect(value: SendRuleAction): Self = StObject.set(x, "Redirect", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setStop(value: RuleAction): Self = StObject.set(x, "Stop", value.asInstanceOf[js.Any])
  }
}
