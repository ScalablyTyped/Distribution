package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlTrackingStatus extends js.Object

@JSGlobal("Outlook.OlTrackingStatus")
@js.native
object OlTrackingStatus extends js.Object {
  @js.native
  sealed trait olTrackingDelivered
    extends activexDashOutlookLib.OutlookNs.OlTrackingStatus
  
  @js.native
  sealed trait olTrackingNone
    extends activexDashOutlookLib.OutlookNs.OlTrackingStatus
  
  @js.native
  sealed trait olTrackingNotDelivered
    extends activexDashOutlookLib.OutlookNs.OlTrackingStatus
  
  @js.native
  sealed trait olTrackingNotRead
    extends activexDashOutlookLib.OutlookNs.OlTrackingStatus
  
  @js.native
  sealed trait olTrackingRead
    extends activexDashOutlookLib.OutlookNs.OlTrackingStatus
  
  @js.native
  sealed trait olTrackingRecallFailure
    extends activexDashOutlookLib.OutlookNs.OlTrackingStatus
  
  @js.native
  sealed trait olTrackingRecallSuccess
    extends activexDashOutlookLib.OutlookNs.OlTrackingStatus
  
  @js.native
  sealed trait olTrackingReplied
    extends activexDashOutlookLib.OutlookNs.OlTrackingStatus
  
  /* 1 */ val olTrackingDelivered: olTrackingDelivered with scala.Double = js.native
  /* 0 */ val olTrackingNone: olTrackingNone with scala.Double = js.native
  /* 2 */ val olTrackingNotDelivered: olTrackingNotDelivered with scala.Double = js.native
  /* 3 */ val olTrackingNotRead: olTrackingNotRead with scala.Double = js.native
  /* 6 */ val olTrackingRead: olTrackingRead with scala.Double = js.native
  /* 4 */ val olTrackingRecallFailure: olTrackingRecallFailure with scala.Double = js.native
  /* 5 */ val olTrackingRecallSuccess: olTrackingRecallSuccess with scala.Double = js.native
  /* 7 */ val olTrackingReplied: olTrackingReplied with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlTrackingStatus with scala.Double] = js.native
}

