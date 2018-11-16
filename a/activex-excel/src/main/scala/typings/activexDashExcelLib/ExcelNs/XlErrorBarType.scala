package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorBarType extends js.Object

@JSGlobal("Excel.XlErrorBarType")
@js.native
object XlErrorBarType extends js.Object {
  @js.native
  sealed trait xlErrorBarTypeCustom
    extends activexDashExcelLib.ExcelNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeFixedValue
    extends activexDashExcelLib.ExcelNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypePercent
    extends activexDashExcelLib.ExcelNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeStDev
    extends activexDashExcelLib.ExcelNs.XlErrorBarType
  
  @js.native
  sealed trait xlErrorBarTypeStError
    extends activexDashExcelLib.ExcelNs.XlErrorBarType
  
  /* -4114 */ val xlErrorBarTypeCustom: xlErrorBarTypeCustom with scala.Double = js.native
  /* 1 */ val xlErrorBarTypeFixedValue: xlErrorBarTypeFixedValue with scala.Double = js.native
  /* 2 */ val xlErrorBarTypePercent: xlErrorBarTypePercent with scala.Double = js.native
  /* -4155 */ val xlErrorBarTypeStDev: xlErrorBarTypeStDev with scala.Double = js.native
  /* 4 */ val xlErrorBarTypeStError: xlErrorBarTypeStError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlErrorBarType with scala.Double] = js.native
}

