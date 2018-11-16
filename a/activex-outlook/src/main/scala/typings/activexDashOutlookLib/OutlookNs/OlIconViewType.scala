package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlIconViewType extends js.Object

@JSGlobal("Outlook.OlIconViewType")
@js.native
object OlIconViewType extends js.Object {
  @js.native
  sealed trait olIconViewLarge
    extends activexDashOutlookLib.OutlookNs.OlIconViewType
  
  @js.native
  sealed trait olIconViewList
    extends activexDashOutlookLib.OutlookNs.OlIconViewType
  
  @js.native
  sealed trait olIconViewSmall
    extends activexDashOutlookLib.OutlookNs.OlIconViewType
  
  /* 0 */ val olIconViewLarge: olIconViewLarge with scala.Double = js.native
  /* 2 */ val olIconViewList: olIconViewList with scala.Double = js.native
  /* 1 */ val olIconViewSmall: olIconViewSmall with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlIconViewType with scala.Double] = js.native
}

