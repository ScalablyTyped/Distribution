package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlRowCol extends js.Object

@JSGlobal("Office.XlRowCol")
@js.native
object XlRowCol extends js.Object {
  @js.native
  sealed trait xlColumns
    extends activexDashOfficeLib.OfficeNs.XlRowCol
  
  @js.native
  sealed trait xlRows
    extends activexDashOfficeLib.OfficeNs.XlRowCol
  
  /* 2 */ val xlColumns: xlColumns with scala.Double = js.native
  /* 1 */ val xlRows: xlRows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlRowCol with scala.Double] = js.native
}

