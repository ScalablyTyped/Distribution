package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoModeType extends js.Object

@JSGlobal("Office.MsoModeType")
@js.native
object MsoModeType extends js.Object {
  @js.native
  sealed trait msoModeAutoDown
    extends activexDashOfficeLib.OfficeNs.MsoModeType
  
  @js.native
  sealed trait msoModeModal
    extends activexDashOfficeLib.OfficeNs.MsoModeType
  
  @js.native
  sealed trait msoModeModeless
    extends activexDashOfficeLib.OfficeNs.MsoModeType
  
  /* 1 */ val msoModeAutoDown: msoModeAutoDown with scala.Double = js.native
  /* 0 */ val msoModeModal: msoModeModal with scala.Double = js.native
  /* 2 */ val msoModeModeless: msoModeModeless with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoModeType with scala.Double] = js.native
}

