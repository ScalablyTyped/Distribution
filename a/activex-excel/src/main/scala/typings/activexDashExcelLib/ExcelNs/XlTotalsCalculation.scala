package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTotalsCalculation extends js.Object

@JSGlobal("Excel.XlTotalsCalculation")
@js.native
object XlTotalsCalculation extends js.Object {
  @js.native
  sealed trait xlTotalsCalculationAverage
    extends activexDashExcelLib.ExcelNs.XlTotalsCalculation
  
  @js.native
  sealed trait xlTotalsCalculationCount
    extends activexDashExcelLib.ExcelNs.XlTotalsCalculation
  
  @js.native
  sealed trait xlTotalsCalculationCountNums
    extends activexDashExcelLib.ExcelNs.XlTotalsCalculation
  
  @js.native
  sealed trait xlTotalsCalculationCustom
    extends activexDashExcelLib.ExcelNs.XlTotalsCalculation
  
  @js.native
  sealed trait xlTotalsCalculationMax
    extends activexDashExcelLib.ExcelNs.XlTotalsCalculation
  
  @js.native
  sealed trait xlTotalsCalculationMin
    extends activexDashExcelLib.ExcelNs.XlTotalsCalculation
  
  @js.native
  sealed trait xlTotalsCalculationNone
    extends activexDashExcelLib.ExcelNs.XlTotalsCalculation
  
  @js.native
  sealed trait xlTotalsCalculationStdDev
    extends activexDashExcelLib.ExcelNs.XlTotalsCalculation
  
  @js.native
  sealed trait xlTotalsCalculationSum
    extends activexDashExcelLib.ExcelNs.XlTotalsCalculation
  
  @js.native
  sealed trait xlTotalsCalculationVar
    extends activexDashExcelLib.ExcelNs.XlTotalsCalculation
  
  /* 2 */ val xlTotalsCalculationAverage: xlTotalsCalculationAverage with scala.Double = js.native
  /* 3 */ val xlTotalsCalculationCount: xlTotalsCalculationCount with scala.Double = js.native
  /* 4 */ val xlTotalsCalculationCountNums: xlTotalsCalculationCountNums with scala.Double = js.native
  /* 9 */ val xlTotalsCalculationCustom: xlTotalsCalculationCustom with scala.Double = js.native
  /* 6 */ val xlTotalsCalculationMax: xlTotalsCalculationMax with scala.Double = js.native
  /* 5 */ val xlTotalsCalculationMin: xlTotalsCalculationMin with scala.Double = js.native
  /* 0 */ val xlTotalsCalculationNone: xlTotalsCalculationNone with scala.Double = js.native
  /* 7 */ val xlTotalsCalculationStdDev: xlTotalsCalculationStdDev with scala.Double = js.native
  /* 1 */ val xlTotalsCalculationSum: xlTotalsCalculationSum with scala.Double = js.native
  /* 8 */ val xlTotalsCalculationVar: xlTotalsCalculationVar with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlTotalsCalculation with scala.Double] = js.native
}

