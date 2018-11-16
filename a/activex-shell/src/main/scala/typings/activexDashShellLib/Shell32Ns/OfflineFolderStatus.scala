package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OfflineFolderStatus extends js.Object

/** Constants for Folder2.OfflineStatus */
// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.OfflineFolderStatus")
@js.native
object OfflineFolderStatus extends js.Object {
  @js.native
  sealed trait OFS_DIRTYCACHE
    extends activexDashShellLib.Shell32Ns.OfflineFolderStatus
  
  @js.native
  sealed trait OFS_INACTIVE
    extends activexDashShellLib.Shell32Ns.OfflineFolderStatus
  
  @js.native
  sealed trait OFS_OFFLINE
    extends activexDashShellLib.Shell32Ns.OfflineFolderStatus
  
  @js.native
  sealed trait OFS_ONLINE
    extends activexDashShellLib.Shell32Ns.OfflineFolderStatus
  
  @js.native
  sealed trait OFS_SERVERBACK
    extends activexDashShellLib.Shell32Ns.OfflineFolderStatus
  
  /* 3 */ val OFS_DIRTYCACHE: OFS_DIRTYCACHE with scala.Double = js.native
  /* -1 */ val OFS_INACTIVE: OFS_INACTIVE with scala.Double = js.native
  /* 1 */ val OFS_OFFLINE: OFS_OFFLINE with scala.Double = js.native
  /* 0 */ val OFS_ONLINE: OFS_ONLINE with scala.Double = js.native
  /* 2 */ val OFS_SERVERBACK: OFS_SERVERBACK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.OfflineFolderStatus with scala.Double] = js.native
}

