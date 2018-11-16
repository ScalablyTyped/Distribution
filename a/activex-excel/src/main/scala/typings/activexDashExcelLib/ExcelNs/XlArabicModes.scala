package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlArabicModes extends js.Object

@JSGlobal("Excel.XlArabicModes")
@js.native
object XlArabicModes extends js.Object {
  @js.native
  sealed trait xlArabicBothStrict
    extends activexDashExcelLib.ExcelNs.XlArabicModes
  
  @js.native
  sealed trait xlArabicNone
    extends activexDashExcelLib.ExcelNs.XlArabicModes
  
  @js.native
  sealed trait xlArabicStrictAlefHamza
    extends activexDashExcelLib.ExcelNs.XlArabicModes
  
  @js.native
  sealed trait xlArabicStrictFinalYaa
    extends activexDashExcelLib.ExcelNs.XlArabicModes
  
  /* 3 */ val xlArabicBothStrict: xlArabicBothStrict with scala.Double = js.native
  /* 0 */ val xlArabicNone: xlArabicNone with scala.Double = js.native
  /* 1 */ val xlArabicStrictAlefHamza: xlArabicStrictAlefHamza with scala.Double = js.native
  /* 2 */ val xlArabicStrictFinalYaa: xlArabicStrictFinalYaa with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlArabicModes with scala.Double] = js.native
}

