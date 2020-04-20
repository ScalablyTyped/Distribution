package typings.activexShell.Shell32

import typings.activexShell.activexShellNumbers.`128`
import typings.activexShell.activexShellNumbers.`16`
import typings.activexShell.activexShellNumbers.`1`
import typings.activexShell.activexShellNumbers.`32`
import typings.activexShell.activexShellNumbers.`4`
import typings.activexShell.activexShellNumbers.`64`
import typings.activexShell.activexShellNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.activexShell.activexShellNumbers.`1`
  - typings.activexShell.activexShellNumbers.`4`
  - typings.activexShell.activexShellNumbers.`8`
  - typings.activexShell.activexShellNumbers.`16`
  - typings.activexShell.activexShellNumbers.`32`
  - typings.activexShell.activexShellNumbers.`64`
  - typings.activexShell.activexShellNumbers.`128`
*/
trait ShellLinkResolveFlags extends js.Object

object ShellLinkResolveFlags {
  /** Call the Windows Installer. */
  @scala.inline
  def InvokeMSI: `128` = 128.asInstanceOf[`128`]
  /**
    * Disable distributed link tracking. By default, distributed link tracking tracks removable media across multiple devices based on the volume name.
    * It also uses the UNC path to track remote file systems whose drive letter has changed. Setting this flag disables both types of tracking.
    */
  @scala.inline
  def NoLinkInfo: `64` = 64.asInstanceOf[`64`]
  /** Do not execute the search heuristics. */
  @scala.inline
  def NoSearch: `16` = 16.asInstanceOf[`16`]
  /** Do not use distributed link tracking. */
  @scala.inline
  def NoTrack: `32` = 32.asInstanceOf[`32`]
  /**
    * Do not display a dialog box if the link cannot be resolved. When this flag is set, the high-order word of _fFlags_ specifies a time-out duration, in milliseconds.
    * The method returns if the link cannot be resolved within the time-out duration. If the high-order word is set to zero, the time-out duration defaults to 3000 milliseconds (3 seconds).
    */
  @scala.inline
  def NoUI: `1` = 1.asInstanceOf[`1`]
  /** Do not update the link information. */
  @scala.inline
  def NoUpdate: `8` = 8.asInstanceOf[`8`]
  /** If the link has changed, update its path and list of identifiers. */
  @scala.inline
  def Update: `4` = 4.asInstanceOf[`4`]
}

