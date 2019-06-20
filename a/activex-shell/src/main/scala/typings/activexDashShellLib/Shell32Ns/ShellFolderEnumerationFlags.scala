package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - activexDashShellLib.activexDashShellLibNumbers.`0x00010`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00020`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00040`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00080`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00200`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00400`
  - activexDashShellLib.activexDashShellLibNumbers.`0x00800`
  - activexDashShellLib.activexDashShellLibNumbers.`0x01000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x02000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x04000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x08000`
  - activexDashShellLib.activexDashShellLibNumbers.`0x10000`
*/
trait ShellFolderEnumerationFlags extends js.Object

object ShellFolderEnumerationFlags {
  /** **Windows 7 and later** The calling application is checking for the existence of child items in the folder. */
  @scala.inline
  def SHCONTF_CHECKING_FOR_CHILDREN: activexDashShellLib.activexDashShellLibNumbers.`0x00010` = this.cast(0x00010)
  /**
    * **Windows Vista and later**. The calling application is monitoring for change notifications.This means that the enumerator does not have to return all results.
    * Items can be reported through change notifications.
    */
  @scala.inline
  def SHCONTF_ENABLE_ASYNC: activexDashShellLib.activexDashShellLibNumbers.`0x08000` = this.cast(0x08000)
  /** **Windows Vista and later**. The calling application is looking for resources that can be enumerated quickly. */
  @scala.inline
  def SHCONTF_FASTITEMS: activexDashShellLib.activexDashShellLibNumbers.`0x02000` = this.cast(0x02000)
  /** **Windows Vista and later**. Enumerate items as a simple list even if the folder itself is not structured in that way. */
  @scala.inline
  def SHCONTF_FLATLIST: activexDashShellLib.activexDashShellLibNumbers.`0x04000` = this.cast(0x04000)
  /** Include items that are folders in the enumeration. */
  @scala.inline
  def SHCONTF_FOLDERS: activexDashShellLib.activexDashShellLibNumbers.`0x00020` = this.cast(0x00020)
  /** Include hidden items in the enumeration. This does not include hidden system items. (To include hidden system items, use SHCONTF_INCLUDESUPERHIDDEN.) */
  @scala.inline
  def SHCONTF_INCLUDEHIDDEN: activexDashShellLib.activexDashShellLibNumbers.`0x00080` = this.cast(0x00080)
  /**
    * **Windows 7 and later**. Include hidden system items in the enumeration. This value does not include hidden non-system items.
    * (To include hidden non-system items, use SHCONTF_INCLUDEHIDDEN.)
    */
  @scala.inline
  def SHCONTF_INCLUDESUPERHIDDEN: activexDashShellLib.activexDashShellLibNumbers.`0x10000` = this.cast(0x10000)
  /** **Windows 7 and later**. Child folders should provide a navigation enumeration. */
  @scala.inline
  def SHCONTF_NAVIGATION_ENUM: activexDashShellLib.activexDashShellLibNumbers.`0x01000` = this.cast(0x01000)
  /** The calling application is looking for printer objects. */
  @scala.inline
  def SHCONTF_NETPRINTERSRCH: activexDashShellLib.activexDashShellLibNumbers.`0x00200` = this.cast(0x00200)
  /** Include items that are not folders in the enumeration. */
  @scala.inline
  def SHCONTF_NONFOLDERS: activexDashShellLib.activexDashShellLibNumbers.`0x00040` = this.cast(0x00040)
  /** The calling application is looking for resources that can be shared. */
  @scala.inline
  def SHCONTF_SHAREABLE: activexDashShellLib.activexDashShellLibNumbers.`0x00400` = this.cast(0x00400)
  /** Include items with accessible storage and their ancestors, including hidden items. */
  @scala.inline
  def SHCONTF_STORAGE: activexDashShellLib.activexDashShellLibNumbers.`0x00800` = this.cast(0x00800)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

