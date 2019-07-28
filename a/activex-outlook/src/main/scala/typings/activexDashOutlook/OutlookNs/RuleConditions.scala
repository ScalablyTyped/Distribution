package typings.activexDashOutlook.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.RuleConditions")
@js.native
class RuleConditions protected () extends js.Object {
  val Account: AccountRuleCondition = js.native
  val AnyCategory: RuleCondition = js.native
  val Application: typings.activexDashOutlook.OutlookNs.Application = js.native
  val Body: TextRuleCondition = js.native
  val BodyOrSubject: TextRuleCondition = js.native
  val CC: RuleCondition = js.native
  val Category: CategoryRuleCondition = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  val FormName: FormNameRuleCondition = js.native
  val From: ToOrFromRuleCondition = js.native
  val FromAnyRSSFeed: RuleCondition = js.native
  val FromRssFeed: FromRssFeedRuleCondition = js.native
  val HasAttachment: RuleCondition = js.native
  val Importance: ImportanceRuleCondition = js.native
  val MeetingInviteOrUpdate: RuleCondition = js.native
  val MessageHeader: TextRuleCondition = js.native
  val NotTo: RuleCondition = js.native
  val OnLocalMachine: RuleCondition = js.native
  val OnOtherMachine: RuleCondition = js.native
  val OnlyToMe: RuleCondition = js.native
  var `Outlook.RuleConditions_typekey`: RuleConditions = js.native
  val Parent: js.Any = js.native
  val RecipientAddress: AddressRuleCondition = js.native
  val SenderAddress: AddressRuleCondition = js.native
  val SenderInAddressList: SenderInAddressListRuleCondition = js.native
  val SentTo: ToOrFromRuleCondition = js.native
  val Session: NameSpace = js.native
  val Subject: TextRuleCondition = js.native
  val ToMe: RuleCondition = js.native
  val ToOrCc: RuleCondition = js.native
  def Item(Index: Double): RuleCondition = js.native
}

