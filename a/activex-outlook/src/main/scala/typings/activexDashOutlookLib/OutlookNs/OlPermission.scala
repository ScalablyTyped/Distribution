package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlPermission extends js.Object

@JSGlobal("Outlook.OlPermission")
@js.native
object OlPermission extends js.Object {
  @js.native
  sealed trait olDoNotForward
    extends activexDashOutlookLib.OutlookNs.OlPermission
  
  @js.native
  sealed trait olPermissionTemplate
    extends activexDashOutlookLib.OutlookNs.OlPermission
  
  @js.native
  sealed trait olUnrestricted
    extends activexDashOutlookLib.OutlookNs.OlPermission
  
  /* 1 */ val olDoNotForward: olDoNotForward with scala.Double = js.native
  /* 2 */ val olPermissionTemplate: olPermissionTemplate with scala.Double = js.native
  /* 0 */ val olUnrestricted: olUnrestricted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlPermission with scala.Double] = js.native
}

