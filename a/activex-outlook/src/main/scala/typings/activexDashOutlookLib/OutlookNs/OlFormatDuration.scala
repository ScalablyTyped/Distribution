package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormatDuration extends js.Object

@JSGlobal("Outlook.OlFormatDuration")
@js.native
object OlFormatDuration extends js.Object {
  @js.native
  sealed trait olFormatDurationLong
    extends activexDashOutlookLib.OutlookNs.OlFormatDuration
  
  @js.native
  sealed trait olFormatDurationLongBusiness
    extends activexDashOutlookLib.OutlookNs.OlFormatDuration
  
  @js.native
  sealed trait olFormatDurationShort
    extends activexDashOutlookLib.OutlookNs.OlFormatDuration
  
  @js.native
  sealed trait olFormatDurationShortBusiness
    extends activexDashOutlookLib.OutlookNs.OlFormatDuration
  
  /* 2 */ val olFormatDurationLong: olFormatDurationLong with scala.Double = js.native
  /* 4 */ val olFormatDurationLongBusiness: olFormatDurationLongBusiness with scala.Double = js.native
  /* 1 */ val olFormatDurationShort: olFormatDurationShort with scala.Double = js.native
  /* 3 */ val olFormatDurationShortBusiness: olFormatDurationShortBusiness with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormatDuration with scala.Double] = js.native
}

