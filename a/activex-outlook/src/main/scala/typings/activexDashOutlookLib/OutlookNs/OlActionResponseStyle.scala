package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlActionResponseStyle extends js.Object

@JSGlobal("Outlook.OlActionResponseStyle")
@js.native
object OlActionResponseStyle extends js.Object {
  @js.native
  sealed trait olOpen
    extends activexDashOutlookLib.OutlookNs.OlActionResponseStyle
  
  @js.native
  sealed trait olPrompt
    extends activexDashOutlookLib.OutlookNs.OlActionResponseStyle
  
  @js.native
  sealed trait olSend
    extends activexDashOutlookLib.OutlookNs.OlActionResponseStyle
  
  /* 0 */ val olOpen: olOpen with scala.Double = js.native
  /* 2 */ val olPrompt: olPrompt with scala.Double = js.native
  /* 1 */ val olSend: olSend with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlActionResponseStyle with scala.Double] = js.native
}

