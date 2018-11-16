package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlTimeStyle extends js.Object

@JSGlobal("Outlook.OlTimeStyle")
@js.native
object OlTimeStyle extends js.Object {
  @js.native
  sealed trait olTimeStyleShortDuration
    extends activexDashOutlookLib.OutlookNs.OlTimeStyle
  
  @js.native
  sealed trait olTimeStyleTimeDuration
    extends activexDashOutlookLib.OutlookNs.OlTimeStyle
  
  @js.native
  sealed trait olTimeStyleTimeOnly
    extends activexDashOutlookLib.OutlookNs.OlTimeStyle
  
  /* 4 */ val olTimeStyleShortDuration: olTimeStyleShortDuration with scala.Double = js.native
  /* 1 */ val olTimeStyleTimeDuration: olTimeStyleTimeDuration with scala.Double = js.native
  /* 0 */ val olTimeStyleTimeOnly: olTimeStyleTimeOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlTimeStyle with scala.Double] = js.native
}

