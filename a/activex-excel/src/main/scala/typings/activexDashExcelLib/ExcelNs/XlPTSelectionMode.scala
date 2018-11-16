package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPTSelectionMode extends js.Object

@JSGlobal("Excel.XlPTSelectionMode")
@js.native
object XlPTSelectionMode extends js.Object {
  @js.native
  sealed trait xlBlanks
    extends activexDashExcelLib.ExcelNs.XlPTSelectionMode
  
  @js.native
  sealed trait xlButton
    extends activexDashExcelLib.ExcelNs.XlPTSelectionMode
  
  @js.native
  sealed trait xlDataAndLabel
    extends activexDashExcelLib.ExcelNs.XlPTSelectionMode
  
  @js.native
  sealed trait xlDataOnly
    extends activexDashExcelLib.ExcelNs.XlPTSelectionMode
  
  @js.native
  sealed trait xlFirstRow
    extends activexDashExcelLib.ExcelNs.XlPTSelectionMode
  
  @js.native
  sealed trait xlLabelOnly
    extends activexDashExcelLib.ExcelNs.XlPTSelectionMode
  
  @js.native
  sealed trait xlOrigin
    extends activexDashExcelLib.ExcelNs.XlPTSelectionMode
  
  /* 4 */ val xlBlanks: xlBlanks with scala.Double = js.native
  /* 15 */ val xlButton: xlButton with scala.Double = js.native
  /* 0 */ val xlDataAndLabel: xlDataAndLabel with scala.Double = js.native
  /* 2 */ val xlDataOnly: xlDataOnly with scala.Double = js.native
  /* 256 */ val xlFirstRow: xlFirstRow with scala.Double = js.native
  /* 1 */ val xlLabelOnly: xlLabelOnly with scala.Double = js.native
  /* 3 */ val xlOrigin: xlOrigin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPTSelectionMode with scala.Double] = js.native
}

