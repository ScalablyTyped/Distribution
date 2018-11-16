package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAlertIconType extends js.Object

@JSGlobal("Office.MsoAlertIconType")
@js.native
object MsoAlertIconType extends js.Object {
  @js.native
  sealed trait msoAlertIconCritical
    extends activexDashOfficeLib.OfficeNs.MsoAlertIconType
  
  @js.native
  sealed trait msoAlertIconInfo
    extends activexDashOfficeLib.OfficeNs.MsoAlertIconType
  
  @js.native
  sealed trait msoAlertIconNoIcon
    extends activexDashOfficeLib.OfficeNs.MsoAlertIconType
  
  @js.native
  sealed trait msoAlertIconQuery
    extends activexDashOfficeLib.OfficeNs.MsoAlertIconType
  
  @js.native
  sealed trait msoAlertIconWarning
    extends activexDashOfficeLib.OfficeNs.MsoAlertIconType
  
  /* 1 */ val msoAlertIconCritical: msoAlertIconCritical with scala.Double = js.native
  /* 4 */ val msoAlertIconInfo: msoAlertIconInfo with scala.Double = js.native
  /* 0 */ val msoAlertIconNoIcon: msoAlertIconNoIcon with scala.Double = js.native
  /* 2 */ val msoAlertIconQuery: msoAlertIconQuery with scala.Double = js.native
  /* 3 */ val msoAlertIconWarning: msoAlertIconWarning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoAlertIconType with scala.Double] = js.native
}

