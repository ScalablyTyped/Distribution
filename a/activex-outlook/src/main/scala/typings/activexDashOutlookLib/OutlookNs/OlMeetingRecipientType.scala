package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlMeetingRecipientType extends js.Object

@JSGlobal("Outlook.OlMeetingRecipientType")
@js.native
object OlMeetingRecipientType extends js.Object {
  @js.native
  sealed trait olOptional
    extends activexDashOutlookLib.OutlookNs.OlMeetingRecipientType
  
  @js.native
  sealed trait olOrganizer
    extends activexDashOutlookLib.OutlookNs.OlMeetingRecipientType
  
  @js.native
  sealed trait olRequired
    extends activexDashOutlookLib.OutlookNs.OlMeetingRecipientType
  
  @js.native
  sealed trait olResource
    extends activexDashOutlookLib.OutlookNs.OlMeetingRecipientType
  
  /* 2 */ val olOptional: olOptional with scala.Double = js.native
  /* 0 */ val olOrganizer: olOrganizer with scala.Double = js.native
  /* 1 */ val olRequired: olRequired with scala.Double = js.native
  /* 3 */ val olResource: olResource with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlMeetingRecipientType with scala.Double] = js.native
}

