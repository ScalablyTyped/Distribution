package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlApplicationInternationalNumbers extends XlApplicationInternational

@JSGlobal("Excel.XlApplicationInternationalNumbers")
@js.native
object XlApplicationInternationalNumbers extends js.Object {
  @js.native
  sealed trait xlCountryCode
    extends activexDashExcelLib.ExcelNs.XlApplicationInternationalNumbers
  
  @js.native
  sealed trait xlCountrySetting
    extends activexDashExcelLib.ExcelNs.XlApplicationInternationalNumbers
  
  @js.native
  sealed trait xlCurrencyDigits
    extends activexDashExcelLib.ExcelNs.XlApplicationInternationalNumbers
  
  @js.native
  sealed trait xlCurrencyNegative
    extends activexDashExcelLib.ExcelNs.XlApplicationInternationalNumbers
  
  @js.native
  sealed trait xlDateOrder
    extends activexDashExcelLib.ExcelNs.XlApplicationInternationalNumbers
  
  @js.native
  sealed trait xlMonthNameChars
    extends activexDashExcelLib.ExcelNs.XlApplicationInternationalNumbers
  
  @js.native
  sealed trait xlNoncurrencyDigits
    extends activexDashExcelLib.ExcelNs.XlApplicationInternationalNumbers
  
  @js.native
  sealed trait xlWeekdayNameChars
    extends activexDashExcelLib.ExcelNs.XlApplicationInternationalNumbers
  
  /* 1 */ val xlCountryCode: xlCountryCode with scala.Double = js.native
  /* 2 */ val xlCountrySetting: xlCountrySetting with scala.Double = js.native
  /* 27 */ val xlCurrencyDigits: xlCurrencyDigits with scala.Double = js.native
  /* 28 */ val xlCurrencyNegative: xlCurrencyNegative with scala.Double = js.native
  /* 32 */ val xlDateOrder: xlDateOrder with scala.Double = js.native
  /* 30 */ val xlMonthNameChars: xlMonthNameChars with scala.Double = js.native
  /* 29 */ val xlNoncurrencyDigits: xlNoncurrencyDigits with scala.Double = js.native
  /* 31 */ val xlWeekdayNameChars: xlWeekdayNameChars with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlApplicationInternationalNumbers with scala.Double] = js.native
}

