package typings.activexOffice.Office

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sync extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val ErrorType: MsoSyncErrorType = js.native
  
  def GetUpdate(): Unit = js.native
  
  val LastSyncTime: VarDate = js.native
  
  @JSName("Office.Sync_typekey")
  var OfficeDotSync_typekey: Sync = js.native
  
  def OpenVersion(SyncVersionType: MsoSyncVersionType): Unit = js.native
  
  val Parent: js.Any = js.native
  
  def PutUpdate(): Unit = js.native
  
  def ResolveConflict(SyncConflictResolution: MsoSyncConflictResolutionType): Unit = js.native
  
  val Status: MsoSyncStatusType = js.native
  
  def Unsuspend(): Unit = js.native
  
  val WorkspaceLastChangedBy: String = js.native
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
  implicit class SyncMutableBuilder[Self <: Sync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorType(value: MsoSyncErrorType): Self = StObject.set(x, "ErrorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUpdate(value: () => Unit): Self = StObject.set(x, "GetUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastSyncTime(value: VarDate): Self = StObject.set(x, "LastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotSync_typekey(value: Sync): Self = StObject.set(x, "Office.Sync_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenVersion(value: MsoSyncVersionType => Unit): Self = StObject.set(x, "OpenVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPutUpdate(value: () => Unit): Self = StObject.set(x, "PutUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResolveConflict(value: MsoSyncConflictResolutionType => Unit): Self = StObject.set(x, "ResolveConflict", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatus(value: MsoSyncStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuspend(value: () => Unit): Self = StObject.set(x, "Unsuspend", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWorkspaceLastChangedBy(value: String): Self = StObject.set(x, "WorkspaceLastChangedBy", value.asInstanceOf[js.Any])
  }
}
