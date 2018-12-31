package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShellLinkResolveFlags extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("Shell32.ShellLinkResolveFlags")
@js.native
object ShellLinkResolveFlags extends js.Object {
  /** Call the Windows Installer. */
  @js.native
  sealed trait InvokeMSI
    extends activexDashShellLib.Shell32Ns.ShellLinkResolveFlags
  
  /**
    * Disable distributed link tracking. By default, distributed link tracking tracks removable media across multiple devices based on the volume name.
    * It also uses the UNC path to track remote file systems whose drive letter has changed. Setting this flag disables both types of tracking.
    */
  @js.native
  sealed trait NoLinkInfo
    extends activexDashShellLib.Shell32Ns.ShellLinkResolveFlags
  
  /** Do not execute the search heuristics. */
  @js.native
  sealed trait NoSearch
    extends activexDashShellLib.Shell32Ns.ShellLinkResolveFlags
  
  /** Do not use distributed link tracking. */
  @js.native
  sealed trait NoTrack
    extends activexDashShellLib.Shell32Ns.ShellLinkResolveFlags
  
  /**
    * Do not display a dialog box if the link cannot be resolved. When this flag is set, the high-order word of _fFlags_ specifies a time-out duration, in milliseconds.
    * The method returns if the link cannot be resolved within the time-out duration. If the high-order word is set to zero, the time-out duration defaults to 3000 milliseconds (3 seconds).
    */
  @js.native
  sealed trait NoUI
    extends activexDashShellLib.Shell32Ns.ShellLinkResolveFlags
  
  /** Do not update the link information. */
  @js.native
  sealed trait NoUpdate
    extends activexDashShellLib.Shell32Ns.ShellLinkResolveFlags
  
  /** If the link has changed, update its path and list of identifiers. */
  @js.native
  sealed trait Update
    extends activexDashShellLib.Shell32Ns.ShellLinkResolveFlags
  
  /* 128 */ val InvokeMSI: InvokeMSI with scala.Double = js.native
  /* 64 */ val NoLinkInfo: NoLinkInfo with scala.Double = js.native
  /* 16 */ val NoSearch: NoSearch with scala.Double = js.native
  /* 32 */ val NoTrack: NoTrack with scala.Double = js.native
  /* 1 */ val NoUI: NoUI with scala.Double = js.native
  /* 8 */ val NoUpdate: NoUpdate with scala.Double = js.native
  /* 4 */ val Update: Update with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShellLib.Shell32Ns.ShellLinkResolveFlags with scala.Double] = js.native
}

