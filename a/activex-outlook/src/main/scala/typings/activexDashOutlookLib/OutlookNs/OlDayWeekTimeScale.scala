package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlDayWeekTimeScale extends js.Object

@JSGlobal("Outlook.OlDayWeekTimeScale")
@js.native
object OlDayWeekTimeScale extends js.Object {
  @js.native
  sealed trait olTimeScale10Minutes
    extends activexDashOutlookLib.OutlookNs.OlDayWeekTimeScale
  
  @js.native
  sealed trait olTimeScale15Minutes
    extends activexDashOutlookLib.OutlookNs.OlDayWeekTimeScale
  
  @js.native
  sealed trait olTimeScale30Minutes
    extends activexDashOutlookLib.OutlookNs.OlDayWeekTimeScale
  
  @js.native
  sealed trait olTimeScale5Minutes
    extends activexDashOutlookLib.OutlookNs.OlDayWeekTimeScale
  
  @js.native
  sealed trait olTimeScale60Minutes
    extends activexDashOutlookLib.OutlookNs.OlDayWeekTimeScale
  
  @js.native
  sealed trait olTimeScale6Minutes
    extends activexDashOutlookLib.OutlookNs.OlDayWeekTimeScale
  
  /* 2 */ val olTimeScale10Minutes: olTimeScale10Minutes with scala.Double = js.native
  /* 3 */ val olTimeScale15Minutes: olTimeScale15Minutes with scala.Double = js.native
  /* 4 */ val olTimeScale30Minutes: olTimeScale30Minutes with scala.Double = js.native
  /* 0 */ val olTimeScale5Minutes: olTimeScale5Minutes with scala.Double = js.native
  /* 5 */ val olTimeScale60Minutes: olTimeScale60Minutes with scala.Double = js.native
  /* 1 */ val olTimeScale6Minutes: olTimeScale6Minutes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlDayWeekTimeScale with scala.Double] = js.native
}

