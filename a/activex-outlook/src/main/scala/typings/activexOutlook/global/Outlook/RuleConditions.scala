package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.RuleConditions")
@js.native
/* private */ open class RuleConditions ()
  extends StObject
     with typings.activexOutlook.Outlook.RuleConditions {
  
  /* CompleteClass */
  override val Account: typings.activexOutlook.Outlook.AccountRuleCondition = js.native
  
  /* CompleteClass */
  override val AnyCategory: typings.activexOutlook.Outlook.RuleCondition = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Body: typings.activexOutlook.Outlook.TextRuleCondition = js.native
  
  /* CompleteClass */
  override val BodyOrSubject: typings.activexOutlook.Outlook.TextRuleCondition = js.native
  
  /* CompleteClass */
  override val CC: typings.activexOutlook.Outlook.RuleCondition = js.native
  
  /* CompleteClass */
  override val Category: typings.activexOutlook.Outlook.CategoryRuleCondition = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val FormName: typings.activexOutlook.Outlook.FormNameRuleCondition = js.native
  
  /* CompleteClass */
  override val From: typings.activexOutlook.Outlook.ToOrFromRuleCondition = js.native
  
  /* CompleteClass */
  override val FromAnyRSSFeed: typings.activexOutlook.Outlook.RuleCondition = js.native
  
  /* CompleteClass */
  override val FromRssFeed: typings.activexOutlook.Outlook.FromRssFeedRuleCondition = js.native
  
  /* CompleteClass */
  override val HasAttachment: typings.activexOutlook.Outlook.RuleCondition = js.native
  
  /* CompleteClass */
  override val Importance: typings.activexOutlook.Outlook.ImportanceRuleCondition = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): typings.activexOutlook.Outlook.RuleCondition = js.native
  
  /* CompleteClass */
  override val MeetingInviteOrUpdate: typings.activexOutlook.Outlook.RuleCondition = js.native
  
  /* CompleteClass */
  override val MessageHeader: typings.activexOutlook.Outlook.TextRuleCondition = js.native
  
  /* CompleteClass */
  override val NotTo: typings.activexOutlook.Outlook.RuleCondition = js.native
  
  /* CompleteClass */
  override val OnLocalMachine: typings.activexOutlook.Outlook.RuleCondition = js.native
  
  /* CompleteClass */
  override val OnOtherMachine: typings.activexOutlook.Outlook.RuleCondition = js.native
  
  /* CompleteClass */
  override val OnlyToMe: typings.activexOutlook.Outlook.RuleCondition = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.RuleConditions_typekey")
  var OutlookDotRuleConditions_typekey: typings.activexOutlook.Outlook.RuleConditions = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val RecipientAddress: typings.activexOutlook.Outlook.AddressRuleCondition = js.native
  
  /* CompleteClass */
  override val SenderAddress: typings.activexOutlook.Outlook.AddressRuleCondition = js.native
  
  /* CompleteClass */
  override val SenderInAddressList: typings.activexOutlook.Outlook.SenderInAddressListRuleCondition = js.native
  
  /* CompleteClass */
  override val SentTo: typings.activexOutlook.Outlook.ToOrFromRuleCondition = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val Subject: typings.activexOutlook.Outlook.TextRuleCondition = js.native
  
  /* CompleteClass */
  override val ToMe: typings.activexOutlook.Outlook.RuleCondition = js.native
  
  /* CompleteClass */
  override val ToOrCc: typings.activexOutlook.Outlook.RuleCondition = js.native
}
