package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShellFolderEnumerationFlags extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.ShellFolderEnumerationFlags")
@js.native
object ShellFolderEnumerationFlags extends js.Object {
  /** **Windows 7 and later** The calling application is checking for the existence of child items in the folder. */
  @js.native
  sealed trait SHCONTF_CHECKING_FOR_CHILDREN
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /**
    * **Windows Vista and later**. The calling application is monitoring for change notifications.This means that the enumerator does not have to return all results.
    * Items can be reported through change notifications.
    */
  @js.native
  sealed trait SHCONTF_ENABLE_ASYNC
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /** **Windows Vista and later**. The calling application is looking for resources that can be enumerated quickly. */
  @js.native
  sealed trait SHCONTF_FASTITEMS
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /** **Windows Vista and later**. Enumerate items as a simple list even if the folder itself is not structured in that way. */
  @js.native
  sealed trait SHCONTF_FLATLIST
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /** Include items that are folders in the enumeration. */
  @js.native
  sealed trait SHCONTF_FOLDERS
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /** Include hidden items in the enumeration. This does not include hidden system items. (To include hidden system items, use SHCONTF_INCLUDESUPERHIDDEN.) */
  @js.native
  sealed trait SHCONTF_INCLUDEHIDDEN
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /**
    * **Windows 7 and later**. Include hidden system items in the enumeration. This value does not include hidden non-system items.
    * (To include hidden non-system items, use SHCONTF_INCLUDEHIDDEN.)
    */
  @js.native
  sealed trait SHCONTF_INCLUDESUPERHIDDEN
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /** **Windows 7 and later**. Child folders should provide a navigation enumeration. */
  @js.native
  sealed trait SHCONTF_NAVIGATION_ENUM
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /** The calling application is looking for printer objects. */
  @js.native
  sealed trait SHCONTF_NETPRINTERSRCH
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /** Include items that are not folders in the enumeration. */
  @js.native
  sealed trait SHCONTF_NONFOLDERS
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /** The calling application is looking for resources that can be shared. */
  @js.native
  sealed trait SHCONTF_SHAREABLE
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /** Include items with accessible storage and their ancestors, including hidden items. */
  @js.native
  sealed trait SHCONTF_STORAGE
    extends activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags
  
  /* 0x00010 */ val SHCONTF_CHECKING_FOR_CHILDREN: SHCONTF_CHECKING_FOR_CHILDREN with scala.Double = js.native
  /* 0x08000 */ val SHCONTF_ENABLE_ASYNC: SHCONTF_ENABLE_ASYNC with scala.Double = js.native
  /* 0x02000 */ val SHCONTF_FASTITEMS: SHCONTF_FASTITEMS with scala.Double = js.native
  /* 0x04000 */ val SHCONTF_FLATLIST: SHCONTF_FLATLIST with scala.Double = js.native
  /* 0x00020 */ val SHCONTF_FOLDERS: SHCONTF_FOLDERS with scala.Double = js.native
  /* 0x00080 */ val SHCONTF_INCLUDEHIDDEN: SHCONTF_INCLUDEHIDDEN with scala.Double = js.native
  /* 0x10000 */ val SHCONTF_INCLUDESUPERHIDDEN: SHCONTF_INCLUDESUPERHIDDEN with scala.Double = js.native
  /* 0x01000 */ val SHCONTF_NAVIGATION_ENUM: SHCONTF_NAVIGATION_ENUM with scala.Double = js.native
  /* 0x00200 */ val SHCONTF_NETPRINTERSRCH: SHCONTF_NETPRINTERSRCH with scala.Double = js.native
  /* 0x00040 */ val SHCONTF_NONFOLDERS: SHCONTF_NONFOLDERS with scala.Double = js.native
  /* 0x00400 */ val SHCONTF_SHAREABLE: SHCONTF_SHAREABLE with scala.Double = js.native
  /* 0x00800 */ val SHCONTF_STORAGE: SHCONTF_STORAGE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.ShellFolderEnumerationFlags with scala.Double] = js.native
}

