package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlPermissionService extends js.Object

@JSGlobal("Outlook.OlPermissionService")
@js.native
object OlPermissionService extends js.Object {
  @js.native
  sealed trait olPassport
    extends activexDashOutlookLib.OutlookNs.OlPermissionService
  
  @js.native
  sealed trait olUnknown
    extends activexDashOutlookLib.OutlookNs.OlPermissionService
  
  @js.native
  sealed trait olWindows
    extends activexDashOutlookLib.OutlookNs.OlPermissionService
  
  /* 2 */ val olPassport: olPassport with scala.Double = js.native
  /* 0 */ val olUnknown: olUnknown with scala.Double = js.native
  /* 1 */ val olWindows: olWindows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlPermissionService with scala.Double] = js.native
}

