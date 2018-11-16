package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormatNumber extends js.Object

@JSGlobal("Outlook.OlFormatNumber")
@js.native
object OlFormatNumber extends js.Object {
  @js.native
  sealed trait olFormatNumber1Decimal
    extends activexDashOutlookLib.OutlookNs.OlFormatNumber
  
  @js.native
  sealed trait olFormatNumber2Decimal
    extends activexDashOutlookLib.OutlookNs.OlFormatNumber
  
  @js.native
  sealed trait olFormatNumberAllDigits
    extends activexDashOutlookLib.OutlookNs.OlFormatNumber
  
  @js.native
  sealed trait olFormatNumberComputer1
    extends activexDashOutlookLib.OutlookNs.OlFormatNumber
  
  @js.native
  sealed trait olFormatNumberComputer2
    extends activexDashOutlookLib.OutlookNs.OlFormatNumber
  
  @js.native
  sealed trait olFormatNumberComputer3
    extends activexDashOutlookLib.OutlookNs.OlFormatNumber
  
  @js.native
  sealed trait olFormatNumberRaw
    extends activexDashOutlookLib.OutlookNs.OlFormatNumber
  
  @js.native
  sealed trait olFormatNumberScientific
    extends activexDashOutlookLib.OutlookNs.OlFormatNumber
  
  @js.native
  sealed trait olFormatNumberTruncated
    extends activexDashOutlookLib.OutlookNs.OlFormatNumber
  
  /* 3 */ val olFormatNumber1Decimal: olFormatNumber1Decimal with scala.Double = js.native
  /* 4 */ val olFormatNumber2Decimal: olFormatNumber2Decimal with scala.Double = js.native
  /* 1 */ val olFormatNumberAllDigits: olFormatNumberAllDigits with scala.Double = js.native
  /* 6 */ val olFormatNumberComputer1: olFormatNumberComputer1 with scala.Double = js.native
  /* 7 */ val olFormatNumberComputer2: olFormatNumberComputer2 with scala.Double = js.native
  /* 8 */ val olFormatNumberComputer3: olFormatNumberComputer3 with scala.Double = js.native
  /* 9 */ val olFormatNumberRaw: olFormatNumberRaw with scala.Double = js.native
  /* 5 */ val olFormatNumberScientific: olFormatNumberScientific with scala.Double = js.native
  /* 2 */ val olFormatNumberTruncated: olFormatNumberTruncated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormatNumber with scala.Double] = js.native
}

