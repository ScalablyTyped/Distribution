package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for Folder2.OfflineStatus */
// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - activexDashShellLib.activexDashShellLibNumbers.`3`
  - activexDashShellLib.activexDashShellLibNumbers.`-1`
  - activexDashShellLib.activexDashShellLibNumbers.`1`
  - activexDashShellLib.activexDashShellLibNumbers.`0`
  - activexDashShellLib.activexDashShellLibNumbers.`2`
*/
trait OfflineFolderStatus extends js.Object

object OfflineFolderStatus {
  @scala.inline
  def OFS_DIRTYCACHE: activexDashShellLib.activexDashShellLibNumbers.`3` = this.cast(3)
  @scala.inline
  def OFS_INACTIVE: activexDashShellLib.activexDashShellLibNumbers.`-1` = this.cast(-1)
  @scala.inline
  def OFS_OFFLINE: activexDashShellLib.activexDashShellLibNumbers.`1` = this.cast(1)
  @scala.inline
  def OFS_ONLINE: activexDashShellLib.activexDashShellLibNumbers.`0` = this.cast(0)
  @scala.inline
  def OFS_SERVERBACK: activexDashShellLib.activexDashShellLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

