package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlMarkInterval extends js.Object

@JSGlobal("Outlook.OlMarkInterval")
@js.native
object OlMarkInterval extends js.Object {
  @js.native
  sealed trait olMarkComplete
    extends activexDashOutlookLib.OutlookNs.OlMarkInterval
  
  @js.native
  sealed trait olMarkNextWeek
    extends activexDashOutlookLib.OutlookNs.OlMarkInterval
  
  @js.native
  sealed trait olMarkNoDate
    extends activexDashOutlookLib.OutlookNs.OlMarkInterval
  
  @js.native
  sealed trait olMarkThisWeek
    extends activexDashOutlookLib.OutlookNs.OlMarkInterval
  
  @js.native
  sealed trait olMarkToday
    extends activexDashOutlookLib.OutlookNs.OlMarkInterval
  
  @js.native
  sealed trait olMarkTomorrow
    extends activexDashOutlookLib.OutlookNs.OlMarkInterval
  
  /* 5 */ val olMarkComplete: olMarkComplete with scala.Double = js.native
  /* 3 */ val olMarkNextWeek: olMarkNextWeek with scala.Double = js.native
  /* 4 */ val olMarkNoDate: olMarkNoDate with scala.Double = js.native
  /* 2 */ val olMarkThisWeek: olMarkThisWeek with scala.Double = js.native
  /* 0 */ val olMarkToday: olMarkToday with scala.Double = js.native
  /* 1 */ val olMarkTomorrow: olMarkTomorrow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlMarkInterval with scala.Double] = js.native
}

