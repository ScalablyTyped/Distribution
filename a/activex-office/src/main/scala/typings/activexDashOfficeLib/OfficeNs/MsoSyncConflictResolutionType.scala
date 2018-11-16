package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSyncConflictResolutionType extends js.Object

@JSGlobal("Office.MsoSyncConflictResolutionType")
@js.native
object MsoSyncConflictResolutionType extends js.Object {
  @js.native
  sealed trait msoSyncConflictClientWins
    extends activexDashOfficeLib.OfficeNs.MsoSyncConflictResolutionType
  
  @js.native
  sealed trait msoSyncConflictMerge
    extends activexDashOfficeLib.OfficeNs.MsoSyncConflictResolutionType
  
  @js.native
  sealed trait msoSyncConflictServerWins
    extends activexDashOfficeLib.OfficeNs.MsoSyncConflictResolutionType
  
  /* 0 */ val msoSyncConflictClientWins: msoSyncConflictClientWins with scala.Double = js.native
  /* 2 */ val msoSyncConflictMerge: msoSyncConflictMerge with scala.Double = js.native
  /* 1 */ val msoSyncConflictServerWins: msoSyncConflictServerWins with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSyncConflictResolutionType with scala.Double] = js.native
}

