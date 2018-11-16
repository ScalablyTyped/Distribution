package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlTextAlign extends js.Object

@JSGlobal("Outlook.OlTextAlign")
@js.native
object OlTextAlign extends js.Object {
  @js.native
  sealed trait olTextAlignCenter
    extends activexDashOutlookLib.OutlookNs.OlTextAlign
  
  @js.native
  sealed trait olTextAlignLeft
    extends activexDashOutlookLib.OutlookNs.OlTextAlign
  
  @js.native
  sealed trait olTextAlignRight
    extends activexDashOutlookLib.OutlookNs.OlTextAlign
  
  /* 2 */ val olTextAlignCenter: olTextAlignCenter with scala.Double = js.native
  /* 1 */ val olTextAlignLeft: olTextAlignLeft with scala.Double = js.native
  /* 3 */ val olTextAlignRight: olTextAlignRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlTextAlign with scala.Double] = js.native
}

