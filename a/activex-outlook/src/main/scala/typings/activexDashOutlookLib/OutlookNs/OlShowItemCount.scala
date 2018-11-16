package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlShowItemCount extends js.Object

@JSGlobal("Outlook.OlShowItemCount")
@js.native
object OlShowItemCount extends js.Object {
  @js.native
  sealed trait olNoItemCount
    extends activexDashOutlookLib.OutlookNs.OlShowItemCount
  
  @js.native
  sealed trait olShowTotalItemCount
    extends activexDashOutlookLib.OutlookNs.OlShowItemCount
  
  @js.native
  sealed trait olShowUnreadItemCount
    extends activexDashOutlookLib.OutlookNs.OlShowItemCount
  
  /* 0 */ val olNoItemCount: olNoItemCount with scala.Double = js.native
  /* 2 */ val olShowTotalItemCount: olShowTotalItemCount with scala.Double = js.native
  /* 1 */ val olShowUnreadItemCount: olShowUnreadItemCount with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlShowItemCount with scala.Double] = js.native
}

