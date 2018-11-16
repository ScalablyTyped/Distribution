package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSyncStatusType extends js.Object

@JSGlobal("Office.MsoSyncStatusType")
@js.native
object MsoSyncStatusType extends js.Object {
  @js.native
  sealed trait msoSyncStatusConflict
    extends activexDashOfficeLib.OfficeNs.MsoSyncStatusType
  
  @js.native
  sealed trait msoSyncStatusError
    extends activexDashOfficeLib.OfficeNs.MsoSyncStatusType
  
  @js.native
  sealed trait msoSyncStatusLatest
    extends activexDashOfficeLib.OfficeNs.MsoSyncStatusType
  
  @js.native
  sealed trait msoSyncStatusLocalChanges
    extends activexDashOfficeLib.OfficeNs.MsoSyncStatusType
  
  @js.native
  sealed trait msoSyncStatusNewerAvailable
    extends activexDashOfficeLib.OfficeNs.MsoSyncStatusType
  
  @js.native
  sealed trait msoSyncStatusNoSharedWorkspace
    extends activexDashOfficeLib.OfficeNs.MsoSyncStatusType
  
  @js.native
  sealed trait msoSyncStatusNotRoaming
    extends activexDashOfficeLib.OfficeNs.MsoSyncStatusType
  
  @js.native
  sealed trait msoSyncStatusSuspended
    extends activexDashOfficeLib.OfficeNs.MsoSyncStatusType
  
  /* 4 */ val msoSyncStatusConflict: msoSyncStatusConflict with scala.Double = js.native
  /* 6 */ val msoSyncStatusError: msoSyncStatusError with scala.Double = js.native
  /* 1 */ val msoSyncStatusLatest: msoSyncStatusLatest with scala.Double = js.native
  /* 3 */ val msoSyncStatusLocalChanges: msoSyncStatusLocalChanges with scala.Double = js.native
  /* 2 */ val msoSyncStatusNewerAvailable: msoSyncStatusNewerAvailable with scala.Double = js.native
  /* 0 */ val msoSyncStatusNoSharedWorkspace: msoSyncStatusNoSharedWorkspace with scala.Double = js.native
  /* 0 */ val msoSyncStatusNotRoaming: msoSyncStatusNotRoaming with scala.Double = js.native
  /* 5 */ val msoSyncStatusSuspended: msoSyncStatusSuspended with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSyncStatusType with scala.Double] = js.native
}

