package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlItemType extends js.Object

@JSGlobal("Outlook.OlItemType")
@js.native
object OlItemType extends js.Object {
  @js.native
  sealed trait olAppointmentItem
    extends activexDashOutlookLib.OutlookNs.OlItemType
  
  @js.native
  sealed trait olContactItem
    extends activexDashOutlookLib.OutlookNs.OlItemType
  
  @js.native
  sealed trait olDistributionListItem
    extends activexDashOutlookLib.OutlookNs.OlItemType
  
  @js.native
  sealed trait olJournalItem
    extends activexDashOutlookLib.OutlookNs.OlItemType
  
  @js.native
  sealed trait olMailItem
    extends activexDashOutlookLib.OutlookNs.OlItemType
  
  @js.native
  sealed trait olMobileItemMMS
    extends activexDashOutlookLib.OutlookNs.OlItemType
  
  @js.native
  sealed trait olMobileItemSMS
    extends activexDashOutlookLib.OutlookNs.OlItemType
  
  @js.native
  sealed trait olNoteItem
    extends activexDashOutlookLib.OutlookNs.OlItemType
  
  @js.native
  sealed trait olPostItem
    extends activexDashOutlookLib.OutlookNs.OlItemType
  
  @js.native
  sealed trait olTaskItem
    extends activexDashOutlookLib.OutlookNs.OlItemType
  
  /* 1 */ val olAppointmentItem: olAppointmentItem with scala.Double = js.native
  /* 2 */ val olContactItem: olContactItem with scala.Double = js.native
  /* 7 */ val olDistributionListItem: olDistributionListItem with scala.Double = js.native
  /* 4 */ val olJournalItem: olJournalItem with scala.Double = js.native
  /* 0 */ val olMailItem: olMailItem with scala.Double = js.native
  /* 12 */ val olMobileItemMMS: olMobileItemMMS with scala.Double = js.native
  /* 11 */ val olMobileItemSMS: olMobileItemSMS with scala.Double = js.native
  /* 5 */ val olNoteItem: olNoteItem with scala.Double = js.native
  /* 6 */ val olPostItem: olPostItem with scala.Double = js.native
  /* 3 */ val olTaskItem: olTaskItem with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlItemType with scala.Double] = js.native
}

