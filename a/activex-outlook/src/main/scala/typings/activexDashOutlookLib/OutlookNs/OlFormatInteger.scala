package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormatInteger extends js.Object

@JSGlobal("Outlook.OlFormatInteger")
@js.native
object OlFormatInteger extends js.Object {
  @js.native
  sealed trait olFormatIntegerComputer1
    extends activexDashOutlookLib.OutlookNs.OlFormatInteger
  
  @js.native
  sealed trait olFormatIntegerComputer2
    extends activexDashOutlookLib.OutlookNs.OlFormatInteger
  
  @js.native
  sealed trait olFormatIntegerComputer3
    extends activexDashOutlookLib.OutlookNs.OlFormatInteger
  
  @js.native
  sealed trait olFormatIntegerPlain
    extends activexDashOutlookLib.OutlookNs.OlFormatInteger
  
  /* 2 */ val olFormatIntegerComputer1: olFormatIntegerComputer1 with scala.Double = js.native
  /* 3 */ val olFormatIntegerComputer2: olFormatIntegerComputer2 with scala.Double = js.native
  /* 4 */ val olFormatIntegerComputer3: olFormatIntegerComputer3 with scala.Double = js.native
  /* 1 */ val olFormatIntegerPlain: olFormatIntegerPlain with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormatInteger with scala.Double] = js.native
}

