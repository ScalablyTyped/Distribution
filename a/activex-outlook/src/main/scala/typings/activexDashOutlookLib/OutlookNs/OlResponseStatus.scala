package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlResponseStatus extends js.Object

@JSGlobal("Outlook.OlResponseStatus")
@js.native
object OlResponseStatus extends js.Object {
  @js.native
  sealed trait olResponseAccepted
    extends activexDashOutlookLib.OutlookNs.OlResponseStatus
  
  @js.native
  sealed trait olResponseDeclined
    extends activexDashOutlookLib.OutlookNs.OlResponseStatus
  
  @js.native
  sealed trait olResponseNone
    extends activexDashOutlookLib.OutlookNs.OlResponseStatus
  
  @js.native
  sealed trait olResponseNotResponded
    extends activexDashOutlookLib.OutlookNs.OlResponseStatus
  
  @js.native
  sealed trait olResponseOrganized
    extends activexDashOutlookLib.OutlookNs.OlResponseStatus
  
  @js.native
  sealed trait olResponseTentative
    extends activexDashOutlookLib.OutlookNs.OlResponseStatus
  
  /* 3 */ val olResponseAccepted: olResponseAccepted with scala.Double = js.native
  /* 4 */ val olResponseDeclined: olResponseDeclined with scala.Double = js.native
  /* 0 */ val olResponseNone: olResponseNone with scala.Double = js.native
  /* 5 */ val olResponseNotResponded: olResponseNotResponded with scala.Double = js.native
  /* 1 */ val olResponseOrganized: olResponseOrganized with scala.Double = js.native
  /* 2 */ val olResponseTentative: olResponseTentative with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlResponseStatus with scala.Double] = js.native
}

