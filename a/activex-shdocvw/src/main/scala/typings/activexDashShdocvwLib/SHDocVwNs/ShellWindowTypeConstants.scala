package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShellWindowTypeConstants extends js.Object

/** Constants for ShellWindows registration */
// tslint:disable-next-line no-const-enum
@JSGlobal("SHDocVw.ShellWindowTypeConstants")
@js.native
object ShellWindowTypeConstants extends js.Object {
  @js.native
  sealed trait SWC_3RDPARTY
    extends activexDashShdocvwLib.SHDocVwNs.ShellWindowTypeConstants
  
  @js.native
  sealed trait SWC_BROWSER
    extends activexDashShdocvwLib.SHDocVwNs.ShellWindowTypeConstants
  
  @js.native
  sealed trait SWC_CALLBACK
    extends activexDashShdocvwLib.SHDocVwNs.ShellWindowTypeConstants
  
  @js.native
  sealed trait SWC_DESKTOP
    extends activexDashShdocvwLib.SHDocVwNs.ShellWindowTypeConstants
  
  @js.native
  sealed trait SWC_EXPLORER
    extends activexDashShdocvwLib.SHDocVwNs.ShellWindowTypeConstants
  
  /* 2 */ val SWC_3RDPARTY: SWC_3RDPARTY with scala.Double = js.native
  /* 1 */ val SWC_BROWSER: SWC_BROWSER with scala.Double = js.native
  /* 4 */ val SWC_CALLBACK: SWC_CALLBACK with scala.Double = js.native
  /* 8 */ val SWC_DESKTOP: SWC_DESKTOP with scala.Double = js.native
  /* 0 */ val SWC_EXPLORER: SWC_EXPLORER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShdocvwLib.SHDocVwNs.ShellWindowTypeConstants with scala.Double] = js.native
}

