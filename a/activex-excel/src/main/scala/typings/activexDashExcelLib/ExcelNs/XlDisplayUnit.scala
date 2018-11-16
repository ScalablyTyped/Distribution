package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDisplayUnit extends js.Object

@JSGlobal("Excel.XlDisplayUnit")
@js.native
object XlDisplayUnit extends js.Object {
  @js.native
  sealed trait xlHundredMillions
    extends activexDashExcelLib.ExcelNs.XlDisplayUnit
  
  @js.native
  sealed trait xlHundredThousands
    extends activexDashExcelLib.ExcelNs.XlDisplayUnit
  
  @js.native
  sealed trait xlHundreds
    extends activexDashExcelLib.ExcelNs.XlDisplayUnit
  
  @js.native
  sealed trait xlMillionMillions
    extends activexDashExcelLib.ExcelNs.XlDisplayUnit
  
  @js.native
  sealed trait xlMillions
    extends activexDashExcelLib.ExcelNs.XlDisplayUnit
  
  @js.native
  sealed trait xlTenMillions
    extends activexDashExcelLib.ExcelNs.XlDisplayUnit
  
  @js.native
  sealed trait xlTenThousands
    extends activexDashExcelLib.ExcelNs.XlDisplayUnit
  
  @js.native
  sealed trait xlThousandMillions
    extends activexDashExcelLib.ExcelNs.XlDisplayUnit
  
  @js.native
  sealed trait xlThousands
    extends activexDashExcelLib.ExcelNs.XlDisplayUnit
  
  /* -8 */ val xlHundredMillions: xlHundredMillions with scala.Double = js.native
  /* -5 */ val xlHundredThousands: xlHundredThousands with scala.Double = js.native
  /* -2 */ val xlHundreds: xlHundreds with scala.Double = js.native
  /* -10 */ val xlMillionMillions: xlMillionMillions with scala.Double = js.native
  /* -6 */ val xlMillions: xlMillions with scala.Double = js.native
  /* -7 */ val xlTenMillions: xlTenMillions with scala.Double = js.native
  /* -4 */ val xlTenThousands: xlTenThousands with scala.Double = js.native
  /* -9 */ val xlThousandMillions: xlThousandMillions with scala.Double = js.native
  /* -3 */ val xlThousands: xlThousands with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDisplayUnit with scala.Double] = js.native
}

