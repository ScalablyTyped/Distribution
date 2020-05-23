package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.RuleActions")
@js.native
class RuleActions protected ()
  extends typings.activexOutlook.Outlook.RuleActions {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val AssignToCategory: typings.activexOutlook.Outlook.AssignToCategoryRuleAction = js.native
  /* CompleteClass */
  override val CC: typings.activexOutlook.Outlook.SendRuleAction = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ClearCategories: typings.activexOutlook.Outlook.RuleAction = js.native
  /* CompleteClass */
  override val CopyToFolder: typings.activexOutlook.Outlook.MoveOrCopyRuleAction = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Delete: typings.activexOutlook.Outlook.RuleAction = js.native
  /* CompleteClass */
  override val DeletePermanently: typings.activexOutlook.Outlook.RuleAction = js.native
  /* CompleteClass */
  override val DesktopAlert: typings.activexOutlook.Outlook.RuleAction = js.native
  /* CompleteClass */
  override val Forward: typings.activexOutlook.Outlook.SendRuleAction = js.native
  /* CompleteClass */
  override val ForwardAsAttachment: typings.activexOutlook.Outlook.SendRuleAction = js.native
  /* CompleteClass */
  override val MarkAsTask: typings.activexOutlook.Outlook.MarkAsTaskRuleAction = js.native
  /* CompleteClass */
  override val MoveToFolder: typings.activexOutlook.Outlook.MoveOrCopyRuleAction = js.native
  /* CompleteClass */
  override val NewItemAlert: typings.activexOutlook.Outlook.NewItemAlertRuleAction = js.native
  /* CompleteClass */
  override val NotifyDelivery: typings.activexOutlook.Outlook.RuleAction = js.native
  /* CompleteClass */
  override val NotifyRead: typings.activexOutlook.Outlook.RuleAction = js.native
  /* CompleteClass */
  @JSName("Outlook.RuleActions_typekey")
  override var OutlookDotRuleActions_typekey: typings.activexOutlook.Outlook.RuleActions = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val PlaySound: typings.activexOutlook.Outlook.PlaySoundRuleAction = js.native
  /* CompleteClass */
  override val Redirect: typings.activexOutlook.Outlook.SendRuleAction = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override val Stop: typings.activexOutlook.Outlook.RuleAction = js.native
  /* CompleteClass */
  override def Item(Index: Double): typings.activexOutlook.Outlook.RuleAction = js.native
}

