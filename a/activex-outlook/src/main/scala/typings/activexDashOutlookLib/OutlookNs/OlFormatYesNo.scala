package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormatYesNo extends js.Object

@JSGlobal("Outlook.OlFormatYesNo")
@js.native
object OlFormatYesNo extends js.Object {
  @js.native
  sealed trait olFormatYesNoIcon
    extends activexDashOutlookLib.OutlookNs.OlFormatYesNo
  
  @js.native
  sealed trait olFormatYesNoOnOff
    extends activexDashOutlookLib.OutlookNs.OlFormatYesNo
  
  @js.native
  sealed trait olFormatYesNoTrueFalse
    extends activexDashOutlookLib.OutlookNs.OlFormatYesNo
  
  @js.native
  sealed trait olFormatYesNoYesNo
    extends activexDashOutlookLib.OutlookNs.OlFormatYesNo
  
  /* 4 */ val olFormatYesNoIcon: olFormatYesNoIcon with scala.Double = js.native
  /* 2 */ val olFormatYesNoOnOff: olFormatYesNoOnOff with scala.Double = js.native
  /* 3 */ val olFormatYesNoTrueFalse: olFormatYesNoTrueFalse with scala.Double = js.native
  /* 1 */ val olFormatYesNoYesNo: olFormatYesNoYesNo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormatYesNo with scala.Double] = js.native
}

