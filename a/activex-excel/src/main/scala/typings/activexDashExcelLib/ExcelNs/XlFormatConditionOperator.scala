package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFormatConditionOperator extends js.Object

@JSGlobal("Excel.XlFormatConditionOperator")
@js.native
object XlFormatConditionOperator extends js.Object {
  @js.native
  sealed trait xlBetween
    extends activexDashExcelLib.ExcelNs.XlFormatConditionOperator
  
  @js.native
  sealed trait xlEqual
    extends activexDashExcelLib.ExcelNs.XlFormatConditionOperator
  
  @js.native
  sealed trait xlGreater
    extends activexDashExcelLib.ExcelNs.XlFormatConditionOperator
  
  @js.native
  sealed trait xlGreaterEqual
    extends activexDashExcelLib.ExcelNs.XlFormatConditionOperator
  
  @js.native
  sealed trait xlLess
    extends activexDashExcelLib.ExcelNs.XlFormatConditionOperator
  
  @js.native
  sealed trait xlLessEqual
    extends activexDashExcelLib.ExcelNs.XlFormatConditionOperator
  
  @js.native
  sealed trait xlNotBetween
    extends activexDashExcelLib.ExcelNs.XlFormatConditionOperator
  
  @js.native
  sealed trait xlNotEqual
    extends activexDashExcelLib.ExcelNs.XlFormatConditionOperator
  
  /* 1 */ val xlBetween: xlBetween with scala.Double = js.native
  /* 3 */ val xlEqual: xlEqual with scala.Double = js.native
  /* 5 */ val xlGreater: xlGreater with scala.Double = js.native
  /* 7 */ val xlGreaterEqual: xlGreaterEqual with scala.Double = js.native
  /* 6 */ val xlLess: xlLess with scala.Double = js.native
  /* 8 */ val xlLessEqual: xlLessEqual with scala.Double = js.native
  /* 2 */ val xlNotBetween: xlNotBetween with scala.Double = js.native
  /* 4 */ val xlNotEqual: xlNotEqual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFormatConditionOperator with scala.Double] = js.native
}

