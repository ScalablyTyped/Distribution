package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlRangeValueDataType extends js.Object

@JSGlobal("Excel.XlRangeValueDataType")
@js.native
object XlRangeValueDataType extends js.Object {
  @js.native
  sealed trait xlRangeValueDefault
    extends activexDashExcelLib.ExcelNs.XlRangeValueDataType
  
  @js.native
  sealed trait xlRangeValueMSPersistXML
    extends activexDashExcelLib.ExcelNs.XlRangeValueDataType
  
  @js.native
  sealed trait xlRangeValueXMLSpreadsheet
    extends activexDashExcelLib.ExcelNs.XlRangeValueDataType
  
  /* 10 */ val xlRangeValueDefault: xlRangeValueDefault with scala.Double = js.native
  /* 12 */ val xlRangeValueMSPersistXML: xlRangeValueMSPersistXML with scala.Double = js.native
  /* 11 */ val xlRangeValueXMLSpreadsheet: xlRangeValueXMLSpreadsheet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlRangeValueDataType with scala.Double] = js.native
}

