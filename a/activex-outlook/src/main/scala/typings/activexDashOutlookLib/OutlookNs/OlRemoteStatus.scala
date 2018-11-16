package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlRemoteStatus extends js.Object

@JSGlobal("Outlook.OlRemoteStatus")
@js.native
object OlRemoteStatus extends js.Object {
  @js.native
  sealed trait olMarkedForCopy
    extends activexDashOutlookLib.OutlookNs.OlRemoteStatus
  
  @js.native
  sealed trait olMarkedForDelete
    extends activexDashOutlookLib.OutlookNs.OlRemoteStatus
  
  @js.native
  sealed trait olMarkedForDownload
    extends activexDashOutlookLib.OutlookNs.OlRemoteStatus
  
  @js.native
  sealed trait olRemoteStatusNone
    extends activexDashOutlookLib.OutlookNs.OlRemoteStatus
  
  @js.native
  sealed trait olUnMarked
    extends activexDashOutlookLib.OutlookNs.OlRemoteStatus
  
  /* 3 */ val olMarkedForCopy: olMarkedForCopy with scala.Double = js.native
  /* 4 */ val olMarkedForDelete: olMarkedForDelete with scala.Double = js.native
  /* 2 */ val olMarkedForDownload: olMarkedForDownload with scala.Double = js.native
  /* 0 */ val olRemoteStatusNone: olRemoteStatusNone with scala.Double = js.native
  /* 1 */ val olUnMarked: olUnMarked with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlRemoteStatus with scala.Double] = js.native
}

