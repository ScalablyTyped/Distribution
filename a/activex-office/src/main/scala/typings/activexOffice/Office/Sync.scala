package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sync extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val ErrorType: MsoSyncErrorType = js.native
  val LastSyncTime: VarDate = js.native
  @JSName("Office.Sync_typekey")
  var OfficeDotSync_typekey: Sync = js.native
  val Parent: js.Any = js.native
  val Status: MsoSyncStatusType = js.native
  val WorkspaceLastChangedBy: String = js.native
  def GetUpdate(): Unit = js.native
  def OpenVersion(SyncVersionType: MsoSyncVersionType): Unit = js.native
  def PutUpdate(): Unit = js.native
  def ResolveConflict(SyncConflictResolution: MsoSyncConflictResolutionType): Unit = js.native
  def Unsuspend(): Unit = js.native
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
  @scala.inline
  implicit class SyncOps[Self <: Sync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorType(value: MsoSyncErrorType): Self = this.set("ErrorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetUpdate(value: () => Unit): Self = this.set("GetUpdate", js.Any.fromFunction0(value))
    @scala.inline
    def setLastSyncTime(value: VarDate): Self = this.set("LastSyncTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotSync_typekey(value: Sync): Self = this.set("Office.Sync_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenVersion(value: MsoSyncVersionType => Unit): Self = this.set("OpenVersion", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPutUpdate(value: () => Unit): Self = this.set("PutUpdate", js.Any.fromFunction0(value))
    @scala.inline
    def setResolveConflict(value: MsoSyncConflictResolutionType => Unit): Self = this.set("ResolveConflict", js.Any.fromFunction1(value))
    @scala.inline
    def setStatus(value: MsoSyncStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsuspend(value: () => Unit): Self = this.set("Unsuspend", js.Any.fromFunction0(value))
    @scala.inline
    def setWorkspaceLastChangedBy(value: String): Self = this.set("WorkspaceLastChangedBy", value.asInstanceOf[js.Any])
  }
  
}

