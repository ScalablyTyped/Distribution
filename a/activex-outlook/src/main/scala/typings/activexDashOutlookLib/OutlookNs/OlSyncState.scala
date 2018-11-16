package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlSyncState extends js.Object

@JSGlobal("Outlook.OlSyncState")
@js.native
object OlSyncState extends js.Object {
  @js.native
  sealed trait olSyncStarted
    extends activexDashOutlookLib.OutlookNs.OlSyncState
  
  @js.native
  sealed trait olSyncStopped
    extends activexDashOutlookLib.OutlookNs.OlSyncState
  
  /* 1 */ val olSyncStarted: olSyncStarted with scala.Double = js.native
  /* 0 */ val olSyncStopped: olSyncStopped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlSyncState with scala.Double] = js.native
}

