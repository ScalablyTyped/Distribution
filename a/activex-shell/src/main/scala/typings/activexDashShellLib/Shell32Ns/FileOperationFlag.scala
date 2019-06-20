package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - activexDashShellLib.activexDashShellLibNumbers.`64`
  - activexDashShellLib.activexDashShellLibNumbers.`128`
  - activexDashShellLib.activexDashShellLibNumbers.`16`
  - activexDashShellLib.activexDashShellLibNumbers.`512`
  - activexDashShellLib.activexDashShellLibNumbers.`8192`
  - activexDashShellLib.activexDashShellLibNumbers.`2048`
  - activexDashShellLib.activexDashShellLibNumbers.`1024`
  - activexDashShellLib.activexDashShellLibNumbers.`4096`
  - activexDashShellLib.activexDashShellLibNumbers.`8`
  - activexDashShellLib.activexDashShellLibNumbers.`4`
  - activexDashShellLib.activexDashShellLibNumbers.`256`
*/
trait FileOperationFlag extends js.Object

object FileOperationFlag {
  /** Preserve undo information, if possible. */
  @scala.inline
  def FOF_ALLOWUNDO: activexDashShellLib.activexDashShellLibNumbers.`64` = this.cast(64)
  /** Perform the operation on files only if a wildcard file name (*.*) is specified. */
  @scala.inline
  def FOF_FILESONLY: activexDashShellLib.activexDashShellLibNumbers.`128` = this.cast(128)
  /** Respond with "Yes to All" for any dialog box that is displayed. */
  @scala.inline
  def FOF_NOCONFIRMATION: activexDashShellLib.activexDashShellLibNumbers.`16` = this.cast(16)
  /** Do not confirm the creation of a new directory if the operation requires one to be created. */
  @scala.inline
  def FOF_NOCONFIRMMKDIR: activexDashShellLib.activexDashShellLibNumbers.`512` = this.cast(512)
  /**
    * Do not copy the security attributes of the file.
    *
    * _[Version 4.7.1](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @scala.inline
  def FOF_NOCOPYSECURITYATTRIBS: activexDashShellLib.activexDashShellLibNumbers.`2048` = this.cast(2048)
  /** Do not display a user interface if an error occurs. */
  @scala.inline
  def FOF_NOERRORUI: activexDashShellLib.activexDashShellLibNumbers.`1024` = this.cast(1024)
  /** Only operate in the local directory. Do not operate recursively into subdirectories. */
  @scala.inline
  def FOF_NORECURSION: activexDashShellLib.activexDashShellLibNumbers.`4096` = this.cast(4096)
  /**
    * Do not copy connected files as a group. Only copy the specified files.
    *
    * _[Version 5.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  @scala.inline
  def FOF_NO_CONNECTED_ELEMENTS: activexDashShellLib.activexDashShellLibNumbers.`8192` = this.cast(8192)
  /** Give the file being operated on a new name in a move, copy, or rename operation if a file with the target name already exists. */
  @scala.inline
  def FOF_RENAMEONCOLLISION: activexDashShellLib.activexDashShellLibNumbers.`8` = this.cast(8)
  /** Do not display a progress dialog box. */
  @scala.inline
  def FOF_SILENT: activexDashShellLib.activexDashShellLibNumbers.`4` = this.cast(4)
  /** Display a progress dialog box but do not show the file names. */
  @scala.inline
  def FOF_SIMPLEPROGRESS: activexDashShellLib.activexDashShellLibNumbers.`256` = this.cast(256)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

