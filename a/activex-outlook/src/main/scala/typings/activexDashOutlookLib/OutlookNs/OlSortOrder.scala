package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlSortOrder extends js.Object

@JSGlobal("Outlook.OlSortOrder")
@js.native
object OlSortOrder extends js.Object {
  @js.native
  sealed trait olAscending
    extends activexDashOutlookLib.OutlookNs.OlSortOrder
  
  @js.native
  sealed trait olDescending
    extends activexDashOutlookLib.OutlookNs.OlSortOrder
  
  @js.native
  sealed trait olSortNone
    extends activexDashOutlookLib.OutlookNs.OlSortOrder
  
  /* 1 */ val olAscending: olAscending with scala.Double = js.native
  /* 2 */ val olDescending: olDescending with scala.Double = js.native
  /* 0 */ val olSortNone: olSortNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlSortOrder with scala.Double] = js.native
}

