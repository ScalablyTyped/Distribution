package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAlignment extends js.Object

@JSGlobal("Outlook.OlAlignment")
@js.native
object OlAlignment extends js.Object {
  @js.native
  sealed trait olAlignmentLeft
    extends activexDashOutlookLib.OutlookNs.OlAlignment
  
  @js.native
  sealed trait olAlignmentRight
    extends activexDashOutlookLib.OutlookNs.OlAlignment
  
  /* 0 */ val olAlignmentLeft: olAlignmentLeft with scala.Double = js.native
  /* 1 */ val olAlignmentRight: olAlignmentRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAlignment with scala.Double] = js.native
}

