package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlWebSelectionType extends js.Object

@JSGlobal("Excel.XlWebSelectionType")
@js.native
object XlWebSelectionType extends js.Object {
  @js.native
  sealed trait xlAllTables
    extends activexDashExcelLib.ExcelNs.XlWebSelectionType
  
  @js.native
  sealed trait xlEntirePage
    extends activexDashExcelLib.ExcelNs.XlWebSelectionType
  
  @js.native
  sealed trait xlSpecifiedTables
    extends activexDashExcelLib.ExcelNs.XlWebSelectionType
  
  /* 2 */ val xlAllTables: xlAllTables with scala.Double = js.native
  /* 1 */ val xlEntirePage: xlEntirePage with scala.Double = js.native
  /* 3 */ val xlSpecifiedTables: xlSpecifiedTables with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlWebSelectionType with scala.Double] = js.native
}

