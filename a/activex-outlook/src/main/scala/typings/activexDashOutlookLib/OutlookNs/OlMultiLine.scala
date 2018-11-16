package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlMultiLine extends js.Object

@JSGlobal("Outlook.OlMultiLine")
@js.native
object OlMultiLine extends js.Object {
  @js.native
  sealed trait olAlwaysMultiLine
    extends activexDashOutlookLib.OutlookNs.OlMultiLine
  
  @js.native
  sealed trait olAlwaysSingleLine
    extends activexDashOutlookLib.OutlookNs.OlMultiLine
  
  @js.native
  sealed trait olWidthMultiLine
    extends activexDashOutlookLib.OutlookNs.OlMultiLine
  
  /* 2 */ val olAlwaysMultiLine: olAlwaysMultiLine with scala.Double = js.native
  /* 1 */ val olAlwaysSingleLine: olAlwaysSingleLine with scala.Double = js.native
  /* 0 */ val olWidthMultiLine: olWidthMultiLine with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlMultiLine with scala.Double] = js.native
}

