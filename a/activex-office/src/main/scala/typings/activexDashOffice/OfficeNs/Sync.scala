package typings.activexDashOffice.OfficeNs

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.Sync")
@js.native
class Sync protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val ErrorType: MsoSyncErrorType = js.native
  val LastSyncTime: VarDate = js.native
  var `Office.Sync_typekey`: Sync = js.native
  val Parent: js.Any = js.native
  val Status: MsoSyncStatusType = js.native
  val WorkspaceLastChangedBy: String = js.native
  def GetUpdate(): Unit = js.native
  def OpenVersion(SyncVersionType: MsoSyncVersionType): Unit = js.native
  def PutUpdate(): Unit = js.native
  def ResolveConflict(SyncConflictResolution: MsoSyncConflictResolutionType): Unit = js.native
  def Unsuspend(): Unit = js.native
}

