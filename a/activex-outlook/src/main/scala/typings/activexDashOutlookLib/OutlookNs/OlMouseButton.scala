package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlMouseButton extends js.Object

@JSGlobal("Outlook.OlMouseButton")
@js.native
object OlMouseButton extends js.Object {
  @js.native
  sealed trait olMouseButtonLeft
    extends activexDashOutlookLib.OutlookNs.OlMouseButton
  
  @js.native
  sealed trait olMouseButtonMiddle
    extends activexDashOutlookLib.OutlookNs.OlMouseButton
  
  @js.native
  sealed trait olMouseButtonRight
    extends activexDashOutlookLib.OutlookNs.OlMouseButton
  
  /* 1 */ val olMouseButtonLeft: olMouseButtonLeft with scala.Double = js.native
  /* 4 */ val olMouseButtonMiddle: olMouseButtonMiddle with scala.Double = js.native
  /* 2 */ val olMouseButtonRight: olMouseButtonRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlMouseButton with scala.Double] = js.native
}

