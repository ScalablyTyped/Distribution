package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShellFolderViewOptions extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.ShellFolderViewOptions")
@js.native
object ShellFolderViewOptions extends js.Object {
  /** The **Active Desktop – View as Web Page** option is enabled. */
  @js.native
  sealed trait SFVVO_DESKTOPHTML
    extends activexDashShellLib.Shell32Ns.ShellFolderViewOptions
  
  /** The **Double-Click to Open an Item** option is enabled. */
  @js.native
  sealed trait SFVVO_DOUBLECLICKINWEBVIEW
    extends activexDashShellLib.Shell32Ns.ShellFolderViewOptions
  
  /** The **Show All Files** option is enabled. */
  @js.native
  sealed trait SFVVO_SHOWALLOBJECTS
    extends activexDashShellLib.Shell32Ns.ShellFolderViewOptions
  
  /** The **Display Compressed Files and Folders with Alternate Color** option is enabled. */
  @js.native
  sealed trait SFVVO_SHOWCOMPCOLOR
    extends activexDashShellLib.Shell32Ns.ShellFolderViewOptions
  
  /** The **Hide extensions for known file types** option is disabled. */
  @js.native
  sealed trait SFVVO_SHOWEXTENSIONS
    extends activexDashShellLib.Shell32Ns.ShellFolderViewOptions
  
  /** The **Do Not Show Hidden Files** option is enabled. */
  @js.native
  sealed trait SFVVO_SHOWSYSFILES
    extends activexDashShellLib.Shell32Ns.ShellFolderViewOptions
  
  /** The **Classic Style** option is enabled. */
  @js.native
  sealed trait SFVVO_WIN95CLASSIC
    extends activexDashShellLib.Shell32Ns.ShellFolderViewOptions
  
  /* 0x00000200 */ val SFVVO_DESKTOPHTML: SFVVO_DESKTOPHTML with scala.Double = js.native
  /* 0x00000080 */ val SFVVO_DOUBLECLICKINWEBVIEW: SFVVO_DOUBLECLICKINWEBVIEW with scala.Double = js.native
  /* 0x00000001 */ val SFVVO_SHOWALLOBJECTS: SFVVO_SHOWALLOBJECTS with scala.Double = js.native
  /* 0x00000008 */ val SFVVO_SHOWCOMPCOLOR: SFVVO_SHOWCOMPCOLOR with scala.Double = js.native
  /* 0x00000002 */ val SFVVO_SHOWEXTENSIONS: SFVVO_SHOWEXTENSIONS with scala.Double = js.native
  /* 0x00000020 */ val SFVVO_SHOWSYSFILES: SFVVO_SHOWSYSFILES with scala.Double = js.native
  /* 0x00000040 */ val SFVVO_WIN95CLASSIC: SFVVO_WIN95CLASSIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.ShellFolderViewOptions with scala.Double] = js.native
}

