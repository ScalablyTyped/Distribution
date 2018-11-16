package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlTaskStatus extends js.Object

@JSGlobal("Outlook.OlTaskStatus")
@js.native
object OlTaskStatus extends js.Object {
  @js.native
  sealed trait olTaskComplete
    extends activexDashOutlookLib.OutlookNs.OlTaskStatus
  
  @js.native
  sealed trait olTaskDeferred
    extends activexDashOutlookLib.OutlookNs.OlTaskStatus
  
  @js.native
  sealed trait olTaskInProgress
    extends activexDashOutlookLib.OutlookNs.OlTaskStatus
  
  @js.native
  sealed trait olTaskNotStarted
    extends activexDashOutlookLib.OutlookNs.OlTaskStatus
  
  @js.native
  sealed trait olTaskWaiting
    extends activexDashOutlookLib.OutlookNs.OlTaskStatus
  
  /* 2 */ val olTaskComplete: olTaskComplete with scala.Double = js.native
  /* 4 */ val olTaskDeferred: olTaskDeferred with scala.Double = js.native
  /* 1 */ val olTaskInProgress: olTaskInProgress with scala.Double = js.native
  /* 0 */ val olTaskNotStarted: olTaskNotStarted with scala.Double = js.native
  /* 3 */ val olTaskWaiting: olTaskWaiting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlTaskStatus with scala.Double] = js.native
}

