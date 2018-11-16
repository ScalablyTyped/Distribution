package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlGridLineStyle extends js.Object

@JSGlobal("Outlook.OlGridLineStyle")
@js.native
object OlGridLineStyle extends js.Object {
  @js.native
  sealed trait olGridLineDashes
    extends activexDashOutlookLib.OutlookNs.OlGridLineStyle
  
  @js.native
  sealed trait olGridLineLargeDots
    extends activexDashOutlookLib.OutlookNs.OlGridLineStyle
  
  @js.native
  sealed trait olGridLineNone
    extends activexDashOutlookLib.OutlookNs.OlGridLineStyle
  
  @js.native
  sealed trait olGridLineSmallDots
    extends activexDashOutlookLib.OutlookNs.OlGridLineStyle
  
  @js.native
  sealed trait olGridLineSolid
    extends activexDashOutlookLib.OutlookNs.OlGridLineStyle
  
  /* 3 */ val olGridLineDashes: olGridLineDashes with scala.Double = js.native
  /* 2 */ val olGridLineLargeDots: olGridLineLargeDots with scala.Double = js.native
  /* 0 */ val olGridLineNone: olGridLineNone with scala.Double = js.native
  /* 1 */ val olGridLineSmallDots: olGridLineSmallDots with scala.Double = js.native
  /* 4 */ val olGridLineSolid: olGridLineSolid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlGridLineStyle with scala.Double] = js.native
}

