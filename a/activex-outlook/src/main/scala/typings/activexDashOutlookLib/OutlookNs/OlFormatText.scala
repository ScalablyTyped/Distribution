package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormatText extends js.Object

@JSGlobal("Outlook.OlFormatText")
@js.native
object OlFormatText extends js.Object {
  @js.native
  sealed trait olFormatTextText
    extends activexDashOutlookLib.OutlookNs.OlFormatText
  
  /* 1 */ val olFormatTextText: olFormatTextText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormatText with scala.Double] = js.native
}

