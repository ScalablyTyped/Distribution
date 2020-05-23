package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleConditions extends js.Object {
  val Account: AccountRuleCondition
  val AnyCategory: RuleCondition
  val Application: typings.activexOutlook.Outlook.Application
  val Body: TextRuleCondition
  val BodyOrSubject: TextRuleCondition
  val CC: RuleCondition
  val Category: CategoryRuleCondition
  val Class: OlObjectClass
  val Count: Double
  val FormName: FormNameRuleCondition
  val From: ToOrFromRuleCondition
  val FromAnyRSSFeed: RuleCondition
  val FromRssFeed: FromRssFeedRuleCondition
  val HasAttachment: RuleCondition
  val Importance: ImportanceRuleCondition
  val MeetingInviteOrUpdate: RuleCondition
  val MessageHeader: TextRuleCondition
  val NotTo: RuleCondition
  val OnLocalMachine: RuleCondition
  val OnOtherMachine: RuleCondition
  val OnlyToMe: RuleCondition
  @JSName("Outlook.RuleConditions_typekey")
  var OutlookDotRuleConditions_typekey: RuleConditions
  val Parent: js.Any
  val RecipientAddress: AddressRuleCondition
  val SenderAddress: AddressRuleCondition
  val SenderInAddressList: SenderInAddressListRuleCondition
  val SentTo: ToOrFromRuleCondition
  val Session: NameSpace
  val Subject: TextRuleCondition
  val ToMe: RuleCondition
  val ToOrCc: RuleCondition
  def Item(Index: Double): RuleCondition
}

object RuleConditions {
  @scala.inline
  def apply(
    Account: AccountRuleCondition,
    AnyCategory: RuleCondition,
    Application: Application,
    Body: TextRuleCondition,
    BodyOrSubject: TextRuleCondition,
    CC: RuleCondition,
    Category: CategoryRuleCondition,
    Class: OlObjectClass,
    Count: Double,
    FormName: FormNameRuleCondition,
    From: ToOrFromRuleCondition,
    FromAnyRSSFeed: RuleCondition,
    FromRssFeed: FromRssFeedRuleCondition,
    HasAttachment: RuleCondition,
    Importance: ImportanceRuleCondition,
    Item: Double => RuleCondition,
    MeetingInviteOrUpdate: RuleCondition,
    MessageHeader: TextRuleCondition,
    NotTo: RuleCondition,
    OnLocalMachine: RuleCondition,
    OnOtherMachine: RuleCondition,
    OnlyToMe: RuleCondition,
    OutlookDotRuleConditions_typekey: RuleConditions,
    Parent: js.Any,
    RecipientAddress: AddressRuleCondition,
    SenderAddress: AddressRuleCondition,
    SenderInAddressList: SenderInAddressListRuleCondition,
    SentTo: ToOrFromRuleCondition,
    Session: NameSpace,
    Subject: TextRuleCondition,
    ToMe: RuleCondition,
    ToOrCc: RuleCondition
  ): RuleConditions = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], AnyCategory = AnyCategory.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], BodyOrSubject = BodyOrSubject.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], FormName = FormName.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], FromAnyRSSFeed = FromAnyRSSFeed.asInstanceOf[js.Any], FromRssFeed = FromRssFeed.asInstanceOf[js.Any], HasAttachment = HasAttachment.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MeetingInviteOrUpdate = MeetingInviteOrUpdate.asInstanceOf[js.Any], MessageHeader = MessageHeader.asInstanceOf[js.Any], NotTo = NotTo.asInstanceOf[js.Any], OnLocalMachine = OnLocalMachine.asInstanceOf[js.Any], OnOtherMachine = OnOtherMachine.asInstanceOf[js.Any], OnlyToMe = OnlyToMe.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RecipientAddress = RecipientAddress.asInstanceOf[js.Any], SenderAddress = SenderAddress.asInstanceOf[js.Any], SenderInAddressList = SenderInAddressList.asInstanceOf[js.Any], SentTo = SentTo.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], ToMe = ToMe.asInstanceOf[js.Any], ToOrCc = ToOrCc.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.RuleConditions_typekey")(OutlookDotRuleConditions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleConditions]
  }
}

