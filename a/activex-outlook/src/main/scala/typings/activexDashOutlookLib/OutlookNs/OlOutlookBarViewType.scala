package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlOutlookBarViewType extends js.Object

@JSGlobal("Outlook.OlOutlookBarViewType")
@js.native
object OlOutlookBarViewType extends js.Object {
  @js.native
  sealed trait olLargeIcon
    extends activexDashOutlookLib.OutlookNs.OlOutlookBarViewType
  
  @js.native
  sealed trait olSmallIcon
    extends activexDashOutlookLib.OutlookNs.OlOutlookBarViewType
  
  /* 0 */ val olLargeIcon: olLargeIcon with scala.Double = js.native
  /* 1 */ val olSmallIcon: olSmallIcon with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlOutlookBarViewType with scala.Double] = js.native
}

