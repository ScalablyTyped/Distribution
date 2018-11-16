package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPhoneticCharacterType extends js.Object

@JSGlobal("Excel.XlPhoneticCharacterType")
@js.native
object XlPhoneticCharacterType extends js.Object {
  @js.native
  sealed trait xlHiragana
    extends activexDashExcelLib.ExcelNs.XlPhoneticCharacterType
  
  @js.native
  sealed trait xlKatakana
    extends activexDashExcelLib.ExcelNs.XlPhoneticCharacterType
  
  @js.native
  sealed trait xlKatakanaHalf
    extends activexDashExcelLib.ExcelNs.XlPhoneticCharacterType
  
  @js.native
  sealed trait xlNoConversion
    extends activexDashExcelLib.ExcelNs.XlPhoneticCharacterType
  
  /* 2 */ val xlHiragana: xlHiragana with scala.Double = js.native
  /* 1 */ val xlKatakana: xlKatakana with scala.Double = js.native
  /* 0 */ val xlKatakanaHalf: xlKatakanaHalf with scala.Double = js.native
  /* 3 */ val xlNoConversion: xlNoConversion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPhoneticCharacterType with scala.Double] = js.native
}

