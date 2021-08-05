package typings.activexOffice.Office

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sync extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  val ErrorType: MsoSyncErrorType
  
  def GetUpdate(): Unit
  
  val LastSyncTime: VarDate
  
  /* private */ @JSName("Office.Sync_typekey")
  var OfficeDotSync_typekey: Sync
  
  def OpenVersion(SyncVersionType: MsoSyncVersionType): Unit
  
  val Parent: js.Any
  
  def PutUpdate(): Unit
  
  def ResolveConflict(SyncConflictResolution: MsoSyncConflictResolutionType): Unit
  
  val Status: MsoSyncStatusType
  
  def Unsuspend(): Unit
  
  val WorkspaceLastChangedBy: String
}
object Sync {
  
  inline def apply(
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
  
  extension [Self <: Sync](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setErrorType(value: MsoSyncErrorType): Self = StObject.set(x, "ErrorType", value.asInstanceOf[js.Any])
    
    inline def setGetUpdate(value: () => Unit): Self = StObject.set(x, "GetUpdate", js.Any.fromFunction0(value))
    
    inline def setLastSyncTime(value: VarDate): Self = StObject.set(x, "LastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSync_typekey(value: Sync): Self = StObject.set(x, "Office.Sync_typekey", value.asInstanceOf[js.Any])
    
    inline def setOpenVersion(value: MsoSyncVersionType => Unit): Self = StObject.set(x, "OpenVersion", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPutUpdate(value: () => Unit): Self = StObject.set(x, "PutUpdate", js.Any.fromFunction0(value))
    
    inline def setResolveConflict(value: MsoSyncConflictResolutionType => Unit): Self = StObject.set(x, "ResolveConflict", js.Any.fromFunction1(value))
    
    inline def setStatus(value: MsoSyncStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUnsuspend(value: () => Unit): Self = StObject.set(x, "Unsuspend", js.Any.fromFunction0(value))
    
    inline def setWorkspaceLastChangedBy(value: String): Self = StObject.set(x, "WorkspaceLastChangedBy", value.asInstanceOf[js.Any])
  }
}
