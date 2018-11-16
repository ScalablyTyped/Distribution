package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDVType extends js.Object

@JSGlobal("Excel.XlDVType")
@js.native
object XlDVType extends js.Object {
  @js.native
  sealed trait xlValidateCustom
    extends activexDashExcelLib.ExcelNs.XlDVType
  
  @js.native
  sealed trait xlValidateDate
    extends activexDashExcelLib.ExcelNs.XlDVType
  
  @js.native
  sealed trait xlValidateDecimal
    extends activexDashExcelLib.ExcelNs.XlDVType
  
  @js.native
  sealed trait xlValidateInputOnly
    extends activexDashExcelLib.ExcelNs.XlDVType
  
  @js.native
  sealed trait xlValidateList
    extends activexDashExcelLib.ExcelNs.XlDVType
  
  @js.native
  sealed trait xlValidateTextLength
    extends activexDashExcelLib.ExcelNs.XlDVType
  
  @js.native
  sealed trait xlValidateTime
    extends activexDashExcelLib.ExcelNs.XlDVType
  
  @js.native
  sealed trait xlValidateWholeNumber
    extends activexDashExcelLib.ExcelNs.XlDVType
  
  /* 7 */ val xlValidateCustom: xlValidateCustom with scala.Double = js.native
  /* 4 */ val xlValidateDate: xlValidateDate with scala.Double = js.native
  /* 2 */ val xlValidateDecimal: xlValidateDecimal with scala.Double = js.native
  /* 0 */ val xlValidateInputOnly: xlValidateInputOnly with scala.Double = js.native
  /* 3 */ val xlValidateList: xlValidateList with scala.Double = js.native
  /* 6 */ val xlValidateTextLength: xlValidateTextLength with scala.Double = js.native
  /* 5 */ val xlValidateTime: xlValidateTime with scala.Double = js.native
  /* 1 */ val xlValidateWholeNumber: xlValidateWholeNumber with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDVType with scala.Double] = js.native
}

