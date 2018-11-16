package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.Sync")
@js.native
class Sync protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  val ErrorType: MsoSyncErrorType = js.native
  val LastSyncTime: activexDashInteropLib.VarDate = js.native
  var `Office.Sync_typekey`: Sync = js.native
  val Parent: js.Any = js.native
  val Status: MsoSyncStatusType = js.native
  val WorkspaceLastChangedBy: java.lang.String = js.native
  def GetUpdate(): scala.Unit = js.native
  def OpenVersion(SyncVersionType: MsoSyncVersionType): scala.Unit = js.native
  def PutUpdate(): scala.Unit = js.native
  def ResolveConflict(SyncConflictResolution: MsoSyncConflictResolutionType): scala.Unit = js.native
  def Unsuspend(): scala.Unit = js.native
}

