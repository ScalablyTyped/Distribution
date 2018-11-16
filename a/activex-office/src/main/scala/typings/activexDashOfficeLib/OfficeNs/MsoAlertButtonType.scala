package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAlertButtonType extends js.Object

@JSGlobal("Office.MsoAlertButtonType")
@js.native
object MsoAlertButtonType extends js.Object {
  @js.native
  sealed trait msoAlertButtonAbortRetryIgnore
    extends activexDashOfficeLib.OfficeNs.MsoAlertButtonType
  
  @js.native
  sealed trait msoAlertButtonOK
    extends activexDashOfficeLib.OfficeNs.MsoAlertButtonType
  
  @js.native
  sealed trait msoAlertButtonOKCancel
    extends activexDashOfficeLib.OfficeNs.MsoAlertButtonType
  
  @js.native
  sealed trait msoAlertButtonRetryCancel
    extends activexDashOfficeLib.OfficeNs.MsoAlertButtonType
  
  @js.native
  sealed trait msoAlertButtonYesAllNoCancel
    extends activexDashOfficeLib.OfficeNs.MsoAlertButtonType
  
  @js.native
  sealed trait msoAlertButtonYesNo
    extends activexDashOfficeLib.OfficeNs.MsoAlertButtonType
  
  @js.native
  sealed trait msoAlertButtonYesNoCancel
    extends activexDashOfficeLib.OfficeNs.MsoAlertButtonType
  
  /* 2 */ val msoAlertButtonAbortRetryIgnore: msoAlertButtonAbortRetryIgnore with scala.Double = js.native
  /* 0 */ val msoAlertButtonOK: msoAlertButtonOK with scala.Double = js.native
  /* 1 */ val msoAlertButtonOKCancel: msoAlertButtonOKCancel with scala.Double = js.native
  /* 5 */ val msoAlertButtonRetryCancel: msoAlertButtonRetryCancel with scala.Double = js.native
  /* 6 */ val msoAlertButtonYesAllNoCancel: msoAlertButtonYesAllNoCancel with scala.Double = js.native
  /* 4 */ val msoAlertButtonYesNo: msoAlertButtonYesNo with scala.Double = js.native
  /* 3 */ val msoAlertButtonYesNoCancel: msoAlertButtonYesNoCancel with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoAlertButtonType with scala.Double] = js.native
}

