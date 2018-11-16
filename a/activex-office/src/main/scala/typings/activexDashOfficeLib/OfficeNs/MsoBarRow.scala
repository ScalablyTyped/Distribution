package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoBarRow extends js.Object

@JSGlobal("Office.MsoBarRow")
@js.native
object MsoBarRow extends js.Object {
  @js.native
  sealed trait msoBarRowFirst
    extends activexDashOfficeLib.OfficeNs.MsoBarRow
  
  @js.native
  sealed trait msoBarRowLast
    extends activexDashOfficeLib.OfficeNs.MsoBarRow
  
  /* 0 */ val msoBarRowFirst: msoBarRowFirst with scala.Double = js.native
  /* -1 */ val msoBarRowLast: msoBarRowLast with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoBarRow with scala.Double] = js.native
}

