package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlBorderStyle extends js.Object

@JSGlobal("Outlook.OlBorderStyle")
@js.native
object OlBorderStyle extends js.Object {
  @js.native
  sealed trait olBorderStyleNone
    extends activexDashOutlookLib.OutlookNs.OlBorderStyle
  
  @js.native
  sealed trait olBorderStyleSingle
    extends activexDashOutlookLib.OutlookNs.OlBorderStyle
  
  /* 0 */ val olBorderStyleNone: olBorderStyleNone with scala.Double = js.native
  /* 1 */ val olBorderStyleSingle: olBorderStyleSingle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlBorderStyle with scala.Double] = js.native
}

