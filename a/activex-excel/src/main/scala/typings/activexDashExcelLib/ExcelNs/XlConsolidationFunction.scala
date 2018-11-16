package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlConsolidationFunction extends js.Object

@JSGlobal("Excel.XlConsolidationFunction")
@js.native
object XlConsolidationFunction extends js.Object {
  @js.native
  sealed trait xlAverage
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  @js.native
  sealed trait xlCount
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  @js.native
  sealed trait xlCountNums
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  @js.native
  sealed trait xlMax
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  @js.native
  sealed trait xlMin
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  @js.native
  sealed trait xlProduct
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  @js.native
  sealed trait xlStDev
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  @js.native
  sealed trait xlStDevP
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  @js.native
  sealed trait xlSum
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  @js.native
  sealed trait xlUnknown
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  @js.native
  sealed trait xlVar
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  @js.native
  sealed trait xlVarP
    extends activexDashExcelLib.ExcelNs.XlConsolidationFunction
  
  /* -4106 */ val xlAverage: xlAverage with scala.Double = js.native
  /* -4112 */ val xlCount: xlCount with scala.Double = js.native
  /* -4113 */ val xlCountNums: xlCountNums with scala.Double = js.native
  /* -4136 */ val xlMax: xlMax with scala.Double = js.native
  /* -4139 */ val xlMin: xlMin with scala.Double = js.native
  /* -4149 */ val xlProduct: xlProduct with scala.Double = js.native
  /* -4155 */ val xlStDev: xlStDev with scala.Double = js.native
  /* -4156 */ val xlStDevP: xlStDevP with scala.Double = js.native
  /* -4157 */ val xlSum: xlSum with scala.Double = js.native
  /* 1000 */ val xlUnknown: xlUnknown with scala.Double = js.native
  /* -4164 */ val xlVar: xlVar with scala.Double = js.native
  /* -4165 */ val xlVarP: xlVarP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlConsolidationFunction with scala.Double] = js.native
}

