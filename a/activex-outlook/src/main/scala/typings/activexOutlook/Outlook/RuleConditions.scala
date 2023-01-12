package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleConditions extends StObject {
  
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
  
  def Item(Index: Double): RuleCondition
  
  val MeetingInviteOrUpdate: RuleCondition
  
  val MessageHeader: TextRuleCondition
  
  val NotTo: RuleCondition
  
  val OnLocalMachine: RuleCondition
  
  val OnOtherMachine: RuleCondition
  
  val OnlyToMe: RuleCondition
  
  /* private */ @JSName("Outlook.RuleConditions_typekey")
  var OutlookDotRuleConditions_typekey: RuleConditions
  
  val Parent: Any
  
  val RecipientAddress: AddressRuleCondition
  
  val SenderAddress: AddressRuleCondition
  
  val SenderInAddressList: SenderInAddressListRuleCondition
  
  val SentTo: ToOrFromRuleCondition
  
  val Session: NameSpace
  
  val Subject: TextRuleCondition
  
  val ToMe: RuleCondition
  
  val ToOrCc: RuleCondition
}
object RuleConditions {
  
  inline def apply(
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
    Parent: Any,
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleConditions] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: AccountRuleCondition): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAnyCategory(value: RuleCondition): Self = StObject.set(x, "AnyCategory", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBody(value: TextRuleCondition): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyOrSubject(value: TextRuleCondition): Self = StObject.set(x, "BodyOrSubject", value.asInstanceOf[js.Any])
    
    inline def setCC(value: RuleCondition): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: CategoryRuleCondition): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setFormName(value: FormNameRuleCondition): Self = StObject.set(x, "FormName", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: ToOrFromRuleCondition): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setFromAnyRSSFeed(value: RuleCondition): Self = StObject.set(x, "FromAnyRSSFeed", value.asInstanceOf[js.Any])
    
    inline def setFromRssFeed(value: FromRssFeedRuleCondition): Self = StObject.set(x, "FromRssFeed", value.asInstanceOf[js.Any])
    
    inline def setHasAttachment(value: RuleCondition): Self = StObject.set(x, "HasAttachment", value.asInstanceOf[js.Any])
    
    inline def setImportance(value: ImportanceRuleCondition): Self = StObject.set(x, "Importance", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => RuleCondition): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setMeetingInviteOrUpdate(value: RuleCondition): Self = StObject.set(x, "MeetingInviteOrUpdate", value.asInstanceOf[js.Any])
    
    inline def setMessageHeader(value: TextRuleCondition): Self = StObject.set(x, "MessageHeader", value.asInstanceOf[js.Any])
    
    inline def setNotTo(value: RuleCondition): Self = StObject.set(x, "NotTo", value.asInstanceOf[js.Any])
    
    inline def setOnLocalMachine(value: RuleCondition): Self = StObject.set(x, "OnLocalMachine", value.asInstanceOf[js.Any])
    
    inline def setOnOtherMachine(value: RuleCondition): Self = StObject.set(x, "OnOtherMachine", value.asInstanceOf[js.Any])
    
    inline def setOnlyToMe(value: RuleCondition): Self = StObject.set(x, "OnlyToMe", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotRuleConditions_typekey(value: RuleConditions): Self = StObject.set(x, "Outlook.RuleConditions_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRecipientAddress(value: AddressRuleCondition): Self = StObject.set(x, "RecipientAddress", value.asInstanceOf[js.Any])
    
    inline def setSenderAddress(value: AddressRuleCondition): Self = StObject.set(x, "SenderAddress", value.asInstanceOf[js.Any])
    
    inline def setSenderInAddressList(value: SenderInAddressListRuleCondition): Self = StObject.set(x, "SenderInAddressList", value.asInstanceOf[js.Any])
    
    inline def setSentTo(value: ToOrFromRuleCondition): Self = StObject.set(x, "SentTo", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: TextRuleCondition): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setToMe(value: RuleCondition): Self = StObject.set(x, "ToMe", value.asInstanceOf[js.Any])
    
    inline def setToOrCc(value: RuleCondition): Self = StObject.set(x, "ToOrCc", value.asInstanceOf[js.Any])
  }
}
