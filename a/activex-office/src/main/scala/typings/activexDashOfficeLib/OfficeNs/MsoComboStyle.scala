package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoComboStyle extends js.Object

@JSGlobal("Office.MsoComboStyle")
@js.native
object MsoComboStyle extends js.Object {
  @js.native
  sealed trait msoComboLabel
    extends activexDashOfficeLib.OfficeNs.MsoComboStyle
  
  @js.native
  sealed trait msoComboNormal
    extends activexDashOfficeLib.OfficeNs.MsoComboStyle
  
  /* 1 */ val msoComboLabel: msoComboLabel with scala.Double = js.native
  /* 0 */ val msoComboNormal: msoComboNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoComboStyle with scala.Double] = js.native
}

