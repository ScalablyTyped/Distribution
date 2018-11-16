package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSharedWorkspaceTaskStatus extends js.Object

@JSGlobal("Office.MsoSharedWorkspaceTaskStatus")
@js.native
object MsoSharedWorkspaceTaskStatus extends js.Object {
  @js.native
  sealed trait msoSharedWorkspaceTaskStatusCompleted
    extends activexDashOfficeLib.OfficeNs.MsoSharedWorkspaceTaskStatus
  
  @js.native
  sealed trait msoSharedWorkspaceTaskStatusDeferred
    extends activexDashOfficeLib.OfficeNs.MsoSharedWorkspaceTaskStatus
  
  @js.native
  sealed trait msoSharedWorkspaceTaskStatusInProgress
    extends activexDashOfficeLib.OfficeNs.MsoSharedWorkspaceTaskStatus
  
  @js.native
  sealed trait msoSharedWorkspaceTaskStatusNotStarted
    extends activexDashOfficeLib.OfficeNs.MsoSharedWorkspaceTaskStatus
  
  @js.native
  sealed trait msoSharedWorkspaceTaskStatusWaiting
    extends activexDashOfficeLib.OfficeNs.MsoSharedWorkspaceTaskStatus
  
  /* 3 */ val msoSharedWorkspaceTaskStatusCompleted: msoSharedWorkspaceTaskStatusCompleted with scala.Double = js.native
  /* 4 */ val msoSharedWorkspaceTaskStatusDeferred: msoSharedWorkspaceTaskStatusDeferred with scala.Double = js.native
  /* 2 */ val msoSharedWorkspaceTaskStatusInProgress: msoSharedWorkspaceTaskStatusInProgress with scala.Double = js.native
  /* 1 */ val msoSharedWorkspaceTaskStatusNotStarted: msoSharedWorkspaceTaskStatusNotStarted with scala.Double = js.native
  /* 5 */ val msoSharedWorkspaceTaskStatusWaiting: msoSharedWorkspaceTaskStatusWaiting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSharedWorkspaceTaskStatus with scala.Double] = js.native
}

