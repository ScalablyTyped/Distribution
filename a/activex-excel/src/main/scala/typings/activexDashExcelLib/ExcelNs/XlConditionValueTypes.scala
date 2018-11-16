package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlConditionValueTypes extends js.Object

@JSGlobal("Excel.XlConditionValueTypes")
@js.native
object XlConditionValueTypes extends js.Object {
  @js.native
  sealed trait xlConditionValueAutomaticMax
    extends activexDashExcelLib.ExcelNs.XlConditionValueTypes
  
  @js.native
  sealed trait xlConditionValueAutomaticMin
    extends activexDashExcelLib.ExcelNs.XlConditionValueTypes
  
  @js.native
  sealed trait xlConditionValueFormula
    extends activexDashExcelLib.ExcelNs.XlConditionValueTypes
  
  @js.native
  sealed trait xlConditionValueHighestValue
    extends activexDashExcelLib.ExcelNs.XlConditionValueTypes
  
  @js.native
  sealed trait xlConditionValueLowestValue
    extends activexDashExcelLib.ExcelNs.XlConditionValueTypes
  
  @js.native
  sealed trait xlConditionValueNone
    extends activexDashExcelLib.ExcelNs.XlConditionValueTypes
  
  @js.native
  sealed trait xlConditionValueNumber
    extends activexDashExcelLib.ExcelNs.XlConditionValueTypes
  
  @js.native
  sealed trait xlConditionValuePercent
    extends activexDashExcelLib.ExcelNs.XlConditionValueTypes
  
  @js.native
  sealed trait xlConditionValuePercentile
    extends activexDashExcelLib.ExcelNs.XlConditionValueTypes
  
  /* 7 */ val xlConditionValueAutomaticMax: xlConditionValueAutomaticMax with scala.Double = js.native
  /* 6 */ val xlConditionValueAutomaticMin: xlConditionValueAutomaticMin with scala.Double = js.native
  /* 4 */ val xlConditionValueFormula: xlConditionValueFormula with scala.Double = js.native
  /* 2 */ val xlConditionValueHighestValue: xlConditionValueHighestValue with scala.Double = js.native
  /* 1 */ val xlConditionValueLowestValue: xlConditionValueLowestValue with scala.Double = js.native
  /* -1 */ val xlConditionValueNone: xlConditionValueNone with scala.Double = js.native
  /* 0 */ val xlConditionValueNumber: xlConditionValueNumber with scala.Double = js.native
  /* 3 */ val xlConditionValuePercent: xlConditionValuePercent with scala.Double = js.native
  /* 5 */ val xlConditionValuePercentile: xlConditionValuePercentile with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlConditionValueTypes with scala.Double] = js.native
}

