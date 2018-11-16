package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlDisplayType extends js.Object

@JSGlobal("Outlook.OlDisplayType")
@js.native
object OlDisplayType extends js.Object {
  @js.native
  sealed trait olAgent
    extends activexDashOutlookLib.OutlookNs.OlDisplayType
  
  @js.native
  sealed trait olDistList
    extends activexDashOutlookLib.OutlookNs.OlDisplayType
  
  @js.native
  sealed trait olForum
    extends activexDashOutlookLib.OutlookNs.OlDisplayType
  
  @js.native
  sealed trait olOrganization
    extends activexDashOutlookLib.OutlookNs.OlDisplayType
  
  @js.native
  sealed trait olPrivateDistList
    extends activexDashOutlookLib.OutlookNs.OlDisplayType
  
  @js.native
  sealed trait olRemoteUser
    extends activexDashOutlookLib.OutlookNs.OlDisplayType
  
  @js.native
  sealed trait olUser
    extends activexDashOutlookLib.OutlookNs.OlDisplayType
  
  /* 3 */ val olAgent: olAgent with scala.Double = js.native
  /* 1 */ val olDistList: olDistList with scala.Double = js.native
  /* 2 */ val olForum: olForum with scala.Double = js.native
  /* 4 */ val olOrganization: olOrganization with scala.Double = js.native
  /* 5 */ val olPrivateDistList: olPrivateDistList with scala.Double = js.native
  /* 6 */ val olRemoteUser: olRemoteUser with scala.Double = js.native
  /* 0 */ val olUser: olUser with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlDisplayType with scala.Double] = js.native
}

