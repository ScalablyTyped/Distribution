package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlThemeFont extends js.Object

@JSGlobal("Excel.XlThemeFont")
@js.native
object XlThemeFont extends js.Object {
  @js.native
  sealed trait xlThemeFontMajor
    extends activexDashExcelLib.ExcelNs.XlThemeFont
  
  @js.native
  sealed trait xlThemeFontMinor
    extends activexDashExcelLib.ExcelNs.XlThemeFont
  
  @js.native
  sealed trait xlThemeFontNone
    extends activexDashExcelLib.ExcelNs.XlThemeFont
  
  /* 1 */ val xlThemeFontMajor: xlThemeFontMajor with scala.Double = js.native
  /* 2 */ val xlThemeFontMinor: xlThemeFontMinor with scala.Double = js.native
  /* 0 */ val xlThemeFontNone: xlThemeFontNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlThemeFont with scala.Double] = js.native
}

