package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlRuleConditionType extends js.Object

@JSGlobal("Outlook.OlRuleConditionType")
@js.native
object OlRuleConditionType extends js.Object {
  @js.native
  sealed trait olConditionAccount
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionAnyCategory
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionBody
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionBodyOrSubject
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionCategory
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionCc
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionDateRange
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionFlaggedForAction
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionFormName
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionFrom
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionFromAnyRssFeed
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionFromRssFeed
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionHasAttachment
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionImportance
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionLocalMachineOnly
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionMeetingInviteOrUpdate
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionMessageHeader
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionNotTo
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionOOF
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionOnlyToMe
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionOtherMachine
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionProperty
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionRecipientAddress
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionSenderAddress
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionSenderInAddressBook
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionSensitivity
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionSentTo
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionSizeRange
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionSubject
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionTo
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionToOrCc
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  @js.native
  sealed trait olConditionUnknown
    extends activexDashOutlookLib.OutlookNs.OlRuleConditionType
  
  /* 3 */ val olConditionAccount: olConditionAccount with scala.Double = js.native
  /* 29 */ val olConditionAnyCategory: olConditionAnyCategory with scala.Double = js.native
  /* 13 */ val olConditionBody: olConditionBody with scala.Double = js.native
  /* 14 */ val olConditionBodyOrSubject: olConditionBodyOrSubject with scala.Double = js.native
  /* 18 */ val olConditionCategory: olConditionCategory with scala.Double = js.native
  /* 9 */ val olConditionCc: olConditionCc with scala.Double = js.native
  /* 22 */ val olConditionDateRange: olConditionDateRange with scala.Double = js.native
  /* 8 */ val olConditionFlaggedForAction: olConditionFlaggedForAction with scala.Double = js.native
  /* 23 */ val olConditionFormName: olConditionFormName with scala.Double = js.native
  /* 1 */ val olConditionFrom: olConditionFrom with scala.Double = js.native
  /* 31 */ val olConditionFromAnyRssFeed: olConditionFromAnyRssFeed with scala.Double = js.native
  /* 30 */ val olConditionFromRssFeed: olConditionFromRssFeed with scala.Double = js.native
  /* 20 */ val olConditionHasAttachment: olConditionHasAttachment with scala.Double = js.native
  /* 6 */ val olConditionImportance: olConditionImportance with scala.Double = js.native
  /* 27 */ val olConditionLocalMachineOnly: olConditionLocalMachineOnly with scala.Double = js.native
  /* 26 */ val olConditionMeetingInviteOrUpdate: olConditionMeetingInviteOrUpdate with scala.Double = js.native
  /* 15 */ val olConditionMessageHeader: olConditionMessageHeader with scala.Double = js.native
  /* 11 */ val olConditionNotTo: olConditionNotTo with scala.Double = js.native
  /* 19 */ val olConditionOOF: olConditionOOF with scala.Double = js.native
  /* 4 */ val olConditionOnlyToMe: olConditionOnlyToMe with scala.Double = js.native
  /* 28 */ val olConditionOtherMachine: olConditionOtherMachine with scala.Double = js.native
  /* 24 */ val olConditionProperty: olConditionProperty with scala.Double = js.native
  /* 16 */ val olConditionRecipientAddress: olConditionRecipientAddress with scala.Double = js.native
  /* 17 */ val olConditionSenderAddress: olConditionSenderAddress with scala.Double = js.native
  /* 25 */ val olConditionSenderInAddressBook: olConditionSenderInAddressBook with scala.Double = js.native
  /* 7 */ val olConditionSensitivity: olConditionSensitivity with scala.Double = js.native
  /* 12 */ val olConditionSentTo: olConditionSentTo with scala.Double = js.native
  /* 21 */ val olConditionSizeRange: olConditionSizeRange with scala.Double = js.native
  /* 2 */ val olConditionSubject: olConditionSubject with scala.Double = js.native
  /* 5 */ val olConditionTo: olConditionTo with scala.Double = js.native
  /* 10 */ val olConditionToOrCc: olConditionToOrCc with scala.Double = js.native
  /* 0 */ val olConditionUnknown: olConditionUnknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlRuleConditionType with scala.Double] = js.native
}

