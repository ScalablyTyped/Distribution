package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.RuleActions")
@js.native
class RuleActions protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val AssignToCategory: AssignToCategoryRuleAction = js.native
  val CC: SendRuleAction = js.native
  val Class: OlObjectClass = js.native
  val ClearCategories: RuleAction = js.native
  val CopyToFolder: MoveOrCopyRuleAction = js.native
  val Count: scala.Double = js.native
  val Delete: RuleAction = js.native
  val DeletePermanently: RuleAction = js.native
  val DesktopAlert: RuleAction = js.native
  val Forward: SendRuleAction = js.native
  val ForwardAsAttachment: SendRuleAction = js.native
  val MarkAsTask: MarkAsTaskRuleAction = js.native
  val MoveToFolder: MoveOrCopyRuleAction = js.native
  val NewItemAlert: NewItemAlertRuleAction = js.native
  val NotifyDelivery: RuleAction = js.native
  val NotifyRead: RuleAction = js.native
  var `Outlook.RuleActions_typekey`: RuleActions = js.native
  val Parent: js.Any = js.native
  val PlaySound: PlaySoundRuleAction = js.native
  val Redirect: SendRuleAction = js.native
  val Session: NameSpace = js.native
  val Stop: RuleAction = js.native
  def Item(Index: scala.Double): RuleAction = js.native
}

