package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCorruptLoad extends js.Object

@JSGlobal("Excel.XlCorruptLoad")
@js.native
object XlCorruptLoad extends js.Object {
  @js.native
  sealed trait xlExtractData
    extends activexDashExcelLib.ExcelNs.XlCorruptLoad
  
  @js.native
  sealed trait xlNormalLoad
    extends activexDashExcelLib.ExcelNs.XlCorruptLoad
  
  @js.native
  sealed trait xlRepairFile
    extends activexDashExcelLib.ExcelNs.XlCorruptLoad
  
  /* 2 */ val xlExtractData: xlExtractData with scala.Double = js.native
  /* 0 */ val xlNormalLoad: xlNormalLoad with scala.Double = js.native
  /* 1 */ val xlRepairFile: xlRepairFile with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCorruptLoad with scala.Double] = js.native
}

