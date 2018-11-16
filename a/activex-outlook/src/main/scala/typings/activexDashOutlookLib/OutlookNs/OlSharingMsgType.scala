package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlSharingMsgType extends js.Object

@JSGlobal("Outlook.OlSharingMsgType")
@js.native
object OlSharingMsgType extends js.Object {
  @js.native
  sealed trait olSharingMsgTypeInvite
    extends activexDashOutlookLib.OutlookNs.OlSharingMsgType
  
  @js.native
  sealed trait olSharingMsgTypeInviteAndRequest
    extends activexDashOutlookLib.OutlookNs.OlSharingMsgType
  
  @js.native
  sealed trait olSharingMsgTypeRequest
    extends activexDashOutlookLib.OutlookNs.OlSharingMsgType
  
  @js.native
  sealed trait olSharingMsgTypeResponseAllow
    extends activexDashOutlookLib.OutlookNs.OlSharingMsgType
  
  @js.native
  sealed trait olSharingMsgTypeResponseDeny
    extends activexDashOutlookLib.OutlookNs.OlSharingMsgType
  
  @js.native
  sealed trait olSharingMsgTypeUnknown
    extends activexDashOutlookLib.OutlookNs.OlSharingMsgType
  
  /* 2 */ val olSharingMsgTypeInvite: olSharingMsgTypeInvite with scala.Double = js.native
  /* 3 */ val olSharingMsgTypeInviteAndRequest: olSharingMsgTypeInviteAndRequest with scala.Double = js.native
  /* 1 */ val olSharingMsgTypeRequest: olSharingMsgTypeRequest with scala.Double = js.native
  /* 4 */ val olSharingMsgTypeResponseAllow: olSharingMsgTypeResponseAllow with scala.Double = js.native
  /* 5 */ val olSharingMsgTypeResponseDeny: olSharingMsgTypeResponseDeny with scala.Double = js.native
  /* 0 */ val olSharingMsgTypeUnknown: olSharingMsgTypeUnknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlSharingMsgType with scala.Double] = js.native
}

