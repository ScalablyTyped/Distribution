package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlIconViewPlacement extends js.Object

@JSGlobal("Outlook.OlIconViewPlacement")
@js.native
object OlIconViewPlacement extends js.Object {
  @js.native
  sealed trait olIconAutoArrange
    extends activexDashOutlookLib.OutlookNs.OlIconViewPlacement
  
  @js.native
  sealed trait olIconDoNotArrange
    extends activexDashOutlookLib.OutlookNs.OlIconViewPlacement
  
  @js.native
  sealed trait olIconLineUp
    extends activexDashOutlookLib.OutlookNs.OlIconViewPlacement
  
  @js.native
  sealed trait olIconSortAndAutoArrange
    extends activexDashOutlookLib.OutlookNs.OlIconViewPlacement
  
  /* 2 */ val olIconAutoArrange: olIconAutoArrange with scala.Double = js.native
  /* 0 */ val olIconDoNotArrange: olIconDoNotArrange with scala.Double = js.native
  /* 1 */ val olIconLineUp: olIconLineUp with scala.Double = js.native
  /* 3 */ val olIconSortAndAutoArrange: olIconSortAndAutoArrange with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlIconViewPlacement with scala.Double] = js.native
}

