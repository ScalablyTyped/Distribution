package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSharedWorkspaceTaskPriority extends js.Object

@JSGlobal("Office.MsoSharedWorkspaceTaskPriority")
@js.native
object MsoSharedWorkspaceTaskPriority extends js.Object {
  @js.native
  sealed trait msoSharedWorkspaceTaskPriorityHigh
    extends activexDashOfficeLib.OfficeNs.MsoSharedWorkspaceTaskPriority
  
  @js.native
  sealed trait msoSharedWorkspaceTaskPriorityLow
    extends activexDashOfficeLib.OfficeNs.MsoSharedWorkspaceTaskPriority
  
  @js.native
  sealed trait msoSharedWorkspaceTaskPriorityNormal
    extends activexDashOfficeLib.OfficeNs.MsoSharedWorkspaceTaskPriority
  
  /* 1 */ val msoSharedWorkspaceTaskPriorityHigh: msoSharedWorkspaceTaskPriorityHigh with scala.Double = js.native
  /* 3 */ val msoSharedWorkspaceTaskPriorityLow: msoSharedWorkspaceTaskPriorityLow with scala.Double = js.native
  /* 2 */ val msoSharedWorkspaceTaskPriorityNormal: msoSharedWorkspaceTaskPriorityNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSharedWorkspaceTaskPriority with scala.Double] = js.native
}

