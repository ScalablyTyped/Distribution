package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlPageType extends js.Object

@JSGlobal("Outlook.OlPageType")
@js.native
object OlPageType extends js.Object {
  @js.native
  sealed trait olPageTypePlanner
    extends activexDashOutlookLib.OutlookNs.OlPageType
  
  @js.native
  sealed trait olPageTypeTracker
    extends activexDashOutlookLib.OutlookNs.OlPageType
  
  /* 0 */ val olPageTypePlanner: olPageTypePlanner with scala.Double = js.native
  /* 1 */ val olPageTypeTracker: olPageTypeTracker with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlPageType with scala.Double] = js.native
}

