package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlSelectionContents extends js.Object

@JSGlobal("Outlook.OlSelectionContents")
@js.native
object OlSelectionContents extends js.Object {
  @js.native
  sealed trait olConversationHeaders
    extends activexDashOutlookLib.OutlookNs.OlSelectionContents
  
  /* 1 */ val olConversationHeaders: olConversationHeaders with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlSelectionContents with scala.Double] = js.native
}

