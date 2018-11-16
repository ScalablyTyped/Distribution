package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlDefaultExpandCollapseSetting extends js.Object

@JSGlobal("Outlook.OlDefaultExpandCollapseSetting")
@js.native
object OlDefaultExpandCollapseSetting extends js.Object {
  @js.native
  sealed trait olAllCollapsed
    extends activexDashOutlookLib.OutlookNs.OlDefaultExpandCollapseSetting
  
  @js.native
  sealed trait olAllExpanded
    extends activexDashOutlookLib.OutlookNs.OlDefaultExpandCollapseSetting
  
  @js.native
  sealed trait olLastViewed
    extends activexDashOutlookLib.OutlookNs.OlDefaultExpandCollapseSetting
  
  /* 1 */ val olAllCollapsed: olAllCollapsed with scala.Double = js.native
  /* 0 */ val olAllExpanded: olAllExpanded with scala.Double = js.native
  /* 2 */ val olLastViewed: olLastViewed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlDefaultExpandCollapseSetting with scala.Double] = js.native
}

