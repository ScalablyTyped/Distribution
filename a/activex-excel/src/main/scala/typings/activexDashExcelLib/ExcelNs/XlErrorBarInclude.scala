package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorBarInclude extends js.Object

@JSGlobal("Excel.XlErrorBarInclude")
@js.native
object XlErrorBarInclude extends js.Object {
  @js.native
  sealed trait xlErrorBarIncludeBoth
    extends activexDashExcelLib.ExcelNs.XlErrorBarInclude
  
  @js.native
  sealed trait xlErrorBarIncludeMinusValues
    extends activexDashExcelLib.ExcelNs.XlErrorBarInclude
  
  @js.native
  sealed trait xlErrorBarIncludeNone
    extends activexDashExcelLib.ExcelNs.XlErrorBarInclude
  
  @js.native
  sealed trait xlErrorBarIncludePlusValues
    extends activexDashExcelLib.ExcelNs.XlErrorBarInclude
  
  /* 1 */ val xlErrorBarIncludeBoth: xlErrorBarIncludeBoth with scala.Double = js.native
  /* 3 */ val xlErrorBarIncludeMinusValues: xlErrorBarIncludeMinusValues with scala.Double = js.native
  /* -4142 */ val xlErrorBarIncludeNone: xlErrorBarIncludeNone with scala.Double = js.native
  /* 2 */ val xlErrorBarIncludePlusValues: xlErrorBarIncludePlusValues with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlErrorBarInclude with scala.Double] = js.native
}

