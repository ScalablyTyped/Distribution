package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoButtonState extends js.Object

@JSGlobal("Office.MsoButtonState")
@js.native
object MsoButtonState extends js.Object {
  @js.native
  sealed trait msoButtonDown
    extends activexDashOfficeLib.OfficeNs.MsoButtonState
  
  @js.native
  sealed trait msoButtonMixed
    extends activexDashOfficeLib.OfficeNs.MsoButtonState
  
  @js.native
  sealed trait msoButtonUp
    extends activexDashOfficeLib.OfficeNs.MsoButtonState
  
  /* -1 */ val msoButtonDown: msoButtonDown with scala.Double = js.native
  /* 2 */ val msoButtonMixed: msoButtonMixed with scala.Double = js.native
  /* 0 */ val msoButtonUp: msoButtonUp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoButtonState with scala.Double] = js.native
}

