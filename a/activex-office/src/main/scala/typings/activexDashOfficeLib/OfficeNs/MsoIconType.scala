package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoIconType extends js.Object

@JSGlobal("Office.MsoIconType")
@js.native
object MsoIconType extends js.Object {
  @js.native
  sealed trait msoIconAlert
    extends activexDashOfficeLib.OfficeNs.MsoIconType
  
  @js.native
  sealed trait msoIconAlertCritical
    extends activexDashOfficeLib.OfficeNs.MsoIconType
  
  @js.native
  sealed trait msoIconAlertInfo
    extends activexDashOfficeLib.OfficeNs.MsoIconType
  
  @js.native
  sealed trait msoIconAlertQuery
    extends activexDashOfficeLib.OfficeNs.MsoIconType
  
  @js.native
  sealed trait msoIconAlertWarning
    extends activexDashOfficeLib.OfficeNs.MsoIconType
  
  @js.native
  sealed trait msoIconNone
    extends activexDashOfficeLib.OfficeNs.MsoIconType
  
  @js.native
  sealed trait msoIconTip
    extends activexDashOfficeLib.OfficeNs.MsoIconType
  
  /* 2 */ val msoIconAlert: msoIconAlert with scala.Double = js.native
  /* 7 */ val msoIconAlertCritical: msoIconAlertCritical with scala.Double = js.native
  /* 4 */ val msoIconAlertInfo: msoIconAlertInfo with scala.Double = js.native
  /* 6 */ val msoIconAlertQuery: msoIconAlertQuery with scala.Double = js.native
  /* 5 */ val msoIconAlertWarning: msoIconAlertWarning with scala.Double = js.native
  /* 0 */ val msoIconNone: msoIconNone with scala.Double = js.native
  /* 3 */ val msoIconTip: msoIconTip with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoIconType with scala.Double] = js.native
}

