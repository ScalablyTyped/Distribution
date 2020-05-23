package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleActions extends js.Object {
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
  val MarkAsTask: MarkAsTaskRuleAction
  val MoveToFolder: MoveOrCopyRuleAction
  val NewItemAlert: NewItemAlertRuleAction
  val NotifyDelivery: RuleAction
  val NotifyRead: RuleAction
  @JSName("Outlook.RuleActions_typekey")
  var OutlookDotRuleActions_typekey: RuleActions
  val Parent: js.Any
  val PlaySound: PlaySoundRuleAction
  val Redirect: SendRuleAction
  val Session: NameSpace
  val Stop: RuleAction
  def Item(Index: Double): RuleAction
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
}

