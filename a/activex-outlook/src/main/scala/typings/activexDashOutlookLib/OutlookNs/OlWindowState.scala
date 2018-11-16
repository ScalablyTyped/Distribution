package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlWindowState extends js.Object

@JSGlobal("Outlook.OlWindowState")
@js.native
object OlWindowState extends js.Object {
  @js.native
  sealed trait olMaximized
    extends activexDashOutlookLib.OutlookNs.OlWindowState
  
  @js.native
  sealed trait olMinimized
    extends activexDashOutlookLib.OutlookNs.OlWindowState
  
  @js.native
  sealed trait olNormalWindow
    extends activexDashOutlookLib.OutlookNs.OlWindowState
  
  /* 0 */ val olMaximized: olMaximized with scala.Double = js.native
  /* 1 */ val olMinimized: olMinimized with scala.Double = js.native
  /* 2 */ val olNormalWindow: olNormalWindow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlWindowState with scala.Double] = js.native
}

