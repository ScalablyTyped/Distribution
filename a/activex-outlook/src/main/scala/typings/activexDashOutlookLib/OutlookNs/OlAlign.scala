package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAlign extends js.Object

@JSGlobal("Outlook.OlAlign")
@js.native
object OlAlign extends js.Object {
  @js.native
  sealed trait olAlignCenter
    extends activexDashOutlookLib.OutlookNs.OlAlign
  
  @js.native
  sealed trait olAlignLeft
    extends activexDashOutlookLib.OutlookNs.OlAlign
  
  @js.native
  sealed trait olAlignRight
    extends activexDashOutlookLib.OutlookNs.OlAlign
  
  /* 1 */ val olAlignCenter: olAlignCenter with scala.Double = js.native
  /* 0 */ val olAlignLeft: olAlignLeft with scala.Double = js.native
  /* 2 */ val olAlignRight: olAlignRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAlign with scala.Double] = js.native
}

