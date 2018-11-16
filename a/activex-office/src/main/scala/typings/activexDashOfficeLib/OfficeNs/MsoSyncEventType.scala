package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSyncEventType extends js.Object

@JSGlobal("Office.MsoSyncEventType")
@js.native
object MsoSyncEventType extends js.Object {
  @js.native
  sealed trait msoSyncEventDownloadFailed
    extends activexDashOfficeLib.OfficeNs.MsoSyncEventType
  
  @js.native
  sealed trait msoSyncEventDownloadInitiated
    extends activexDashOfficeLib.OfficeNs.MsoSyncEventType
  
  @js.native
  sealed trait msoSyncEventDownloadNoChange
    extends activexDashOfficeLib.OfficeNs.MsoSyncEventType
  
  @js.native
  sealed trait msoSyncEventDownloadSucceeded
    extends activexDashOfficeLib.OfficeNs.MsoSyncEventType
  
  @js.native
  sealed trait msoSyncEventOffline
    extends activexDashOfficeLib.OfficeNs.MsoSyncEventType
  
  @js.native
  sealed trait msoSyncEventUploadFailed
    extends activexDashOfficeLib.OfficeNs.MsoSyncEventType
  
  @js.native
  sealed trait msoSyncEventUploadInitiated
    extends activexDashOfficeLib.OfficeNs.MsoSyncEventType
  
  @js.native
  sealed trait msoSyncEventUploadSucceeded
    extends activexDashOfficeLib.OfficeNs.MsoSyncEventType
  
  /* 2 */ val msoSyncEventDownloadFailed: msoSyncEventDownloadFailed with scala.Double = js.native
  /* 0 */ val msoSyncEventDownloadInitiated: msoSyncEventDownloadInitiated with scala.Double = js.native
  /* 6 */ val msoSyncEventDownloadNoChange: msoSyncEventDownloadNoChange with scala.Double = js.native
  /* 1 */ val msoSyncEventDownloadSucceeded: msoSyncEventDownloadSucceeded with scala.Double = js.native
  /* 7 */ val msoSyncEventOffline: msoSyncEventOffline with scala.Double = js.native
  /* 5 */ val msoSyncEventUploadFailed: msoSyncEventUploadFailed with scala.Double = js.native
  /* 3 */ val msoSyncEventUploadInitiated: msoSyncEventUploadInitiated with scala.Double = js.native
  /* 4 */ val msoSyncEventUploadSucceeded: msoSyncEventUploadSucceeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSyncEventType with scala.Double] = js.native
}

