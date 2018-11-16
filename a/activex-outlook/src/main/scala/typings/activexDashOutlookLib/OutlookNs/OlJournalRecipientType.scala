package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlJournalRecipientType extends js.Object

@JSGlobal("Outlook.OlJournalRecipientType")
@js.native
object OlJournalRecipientType extends js.Object {
  @js.native
  sealed trait olAssociatedContact
    extends activexDashOutlookLib.OutlookNs.OlJournalRecipientType
  
  /* 1 */ val olAssociatedContact: olAssociatedContact with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlJournalRecipientType with scala.Double] = js.native
}

