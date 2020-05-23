package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sync extends js.Object {
  val Application: js.Any
  val Creator: Double
  val ErrorType: MsoSyncErrorType
  val LastSyncTime: VarDate
  @JSName("Office.Sync_typekey")
  var OfficeDotSync_typekey: Sync
  val Parent: js.Any
  val Status: MsoSyncStatusType
  val WorkspaceLastChangedBy: String
  def GetUpdate(): Unit
  def OpenVersion(SyncVersionType: MsoSyncVersionType): Unit
  def PutUpdate(): Unit
  def ResolveConflict(SyncConflictResolution: MsoSyncConflictResolutionType): Unit
  def Unsuspend(): Unit
}

object Sync {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    ErrorType: MsoSyncErrorType,
    GetUpdate: () => Unit,
    LastSyncTime: VarDate,
    OfficeDotSync_typekey: Sync,
    OpenVersion: MsoSyncVersionType => Unit,
    Parent: js.Any,
    PutUpdate: () => Unit,
    ResolveConflict: MsoSyncConflictResolutionType => Unit,
    Status: MsoSyncStatusType,
    Unsuspend: () => Unit,
    WorkspaceLastChangedBy: String
  ): Sync = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ErrorType = ErrorType.asInstanceOf[js.Any], GetUpdate = js.Any.fromFunction0(GetUpdate), LastSyncTime = LastSyncTime.asInstanceOf[js.Any], OpenVersion = js.Any.fromFunction1(OpenVersion), Parent = Parent.asInstanceOf[js.Any], PutUpdate = js.Any.fromFunction0(PutUpdate), ResolveConflict = js.Any.fromFunction1(ResolveConflict), Status = Status.asInstanceOf[js.Any], Unsuspend = js.Any.fromFunction0(Unsuspend), WorkspaceLastChangedBy = WorkspaceLastChangedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Sync_typekey")(OfficeDotSync_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sync]
  }
}

