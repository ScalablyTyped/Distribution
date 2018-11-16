package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotTableMissingItems extends js.Object

@JSGlobal("Excel.XlPivotTableMissingItems")
@js.native
object XlPivotTableMissingItems extends js.Object {
  @js.native
  sealed trait xlMissingItemsDefault
    extends activexDashExcelLib.ExcelNs.XlPivotTableMissingItems
  
  @js.native
  sealed trait xlMissingItemsMax
    extends activexDashExcelLib.ExcelNs.XlPivotTableMissingItems
  
  @js.native
  sealed trait xlMissingItemsMax2
    extends activexDashExcelLib.ExcelNs.XlPivotTableMissingItems
  
  @js.native
  sealed trait xlMissingItemsNone
    extends activexDashExcelLib.ExcelNs.XlPivotTableMissingItems
  
  /* -1 */ val xlMissingItemsDefault: xlMissingItemsDefault with scala.Double = js.native
  /* 32500 */ val xlMissingItemsMax: xlMissingItemsMax with scala.Double = js.native
  /* 1048576 */ val xlMissingItemsMax2: xlMissingItemsMax2 with scala.Double = js.native
  /* 0 */ val xlMissingItemsNone: xlMissingItemsNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPivotTableMissingItems with scala.Double] = js.native
}

