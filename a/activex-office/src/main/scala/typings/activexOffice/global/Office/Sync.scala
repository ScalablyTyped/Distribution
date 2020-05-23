package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoSyncConflictResolutionType
import typings.activexOffice.Office.MsoSyncErrorType
import typings.activexOffice.Office.MsoSyncStatusType
import typings.activexOffice.Office.MsoSyncVersionType
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.Sync")
@js.native
class Sync protected ()
  extends typings.activexOffice.Office.Sync {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val ErrorType: MsoSyncErrorType = js.native
  /* CompleteClass */
  override val LastSyncTime: VarDate = js.native
  /* CompleteClass */
  @JSName("Office.Sync_typekey")
  override var OfficeDotSync_typekey: typings.activexOffice.Office.Sync = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Status: MsoSyncStatusType = js.native
  /* CompleteClass */
  override val WorkspaceLastChangedBy: String = js.native
  /* CompleteClass */
  override def GetUpdate(): Unit = js.native
  /* CompleteClass */
  override def OpenVersion(SyncVersionType: MsoSyncVersionType): Unit = js.native
  /* CompleteClass */
  override def PutUpdate(): Unit = js.native
  /* CompleteClass */
  override def ResolveConflict(SyncConflictResolution: MsoSyncConflictResolutionType): Unit = js.native
  /* CompleteClass */
  override def Unsuspend(): Unit = js.native
}

