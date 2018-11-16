package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileOperationFlag extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.FileOperationFlag")
@js.native
object FileOperationFlag extends js.Object {
  /** Preserve undo information, if possible. */
  @js.native
  sealed trait FOF_ALLOWUNDO
    extends activexDashShellLib.Shell32Ns.FileOperationFlag
  
  /** Perform the operation on files only if a wildcard file name (*.*) is specified. */
  @js.native
  sealed trait FOF_FILESONLY
    extends activexDashShellLib.Shell32Ns.FileOperationFlag
  
  /** Respond with "Yes to All" for any dialog box that is displayed. */
  @js.native
  sealed trait FOF_NOCONFIRMATION
    extends activexDashShellLib.Shell32Ns.FileOperationFlag
  
  /** Do not confirm the creation of a new directory if the operation requires one to be created. */
  @js.native
  sealed trait FOF_NOCONFIRMMKDIR
    extends activexDashShellLib.Shell32Ns.FileOperationFlag
  
  /**
           * Do not copy the security attributes of the file.
           *
           * _[Version 4.7.1](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
           */
  @js.native
  sealed trait FOF_NOCOPYSECURITYATTRIBS
    extends activexDashShellLib.Shell32Ns.FileOperationFlag
  
  /** Do not display a user interface if an error occurs. */
  @js.native
  sealed trait FOF_NOERRORUI
    extends activexDashShellLib.Shell32Ns.FileOperationFlag
  
  /** Only operate in the local directory. Do not operate recursively into subdirectories. */
  @js.native
  sealed trait FOF_NORECURSION
    extends activexDashShellLib.Shell32Ns.FileOperationFlag
  
  /**
           * Do not copy connected files as a group. Only copy the specified files.
           *
           * _[Version 5.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
           */
  @js.native
  sealed trait FOF_NO_CONNECTED_ELEMENTS
    extends activexDashShellLib.Shell32Ns.FileOperationFlag
  
  /** Give the file being operated on a new name in a move, copy, or rename operation if a file with the target name already exists. */
  @js.native
  sealed trait FOF_RENAMEONCOLLISION
    extends activexDashShellLib.Shell32Ns.FileOperationFlag
  
  /** Do not display a progress dialog box. */
  @js.native
  sealed trait FOF_SILENT
    extends activexDashShellLib.Shell32Ns.FileOperationFlag
  
  /** Display a progress dialog box but do not show the file names. */
  @js.native
  sealed trait FOF_SIMPLEPROGRESS
    extends activexDashShellLib.Shell32Ns.FileOperationFlag
  
  /* 64 */ val FOF_ALLOWUNDO: FOF_ALLOWUNDO with scala.Double = js.native
  /* 128 */ val FOF_FILESONLY: FOF_FILESONLY with scala.Double = js.native
  /* 16 */ val FOF_NOCONFIRMATION: FOF_NOCONFIRMATION with scala.Double = js.native
  /* 512 */ val FOF_NOCONFIRMMKDIR: FOF_NOCONFIRMMKDIR with scala.Double = js.native
  /* 2048 */ val FOF_NOCOPYSECURITYATTRIBS: FOF_NOCOPYSECURITYATTRIBS with scala.Double = js.native
  /* 1024 */ val FOF_NOERRORUI: FOF_NOERRORUI with scala.Double = js.native
  /* 4096 */ val FOF_NORECURSION: FOF_NORECURSION with scala.Double = js.native
  /* 8192 */ val FOF_NO_CONNECTED_ELEMENTS: FOF_NO_CONNECTED_ELEMENTS with scala.Double = js.native
  /* 8 */ val FOF_RENAMEONCOLLISION: FOF_RENAMEONCOLLISION with scala.Double = js.native
  /* 4 */ val FOF_SILENT: FOF_SILENT with scala.Double = js.native
  /* 256 */ val FOF_SIMPLEPROGRESS: FOF_SIMPLEPROGRESS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.FileOperationFlag with scala.Double] = js.native
}

