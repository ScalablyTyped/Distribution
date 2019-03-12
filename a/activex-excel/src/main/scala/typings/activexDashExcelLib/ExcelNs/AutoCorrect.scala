package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.AutoCorrect")
@js.native
class AutoCorrect protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var AutoExpandListRange: scala.Boolean = js.native
  var AutoFillFormulasInLists: scala.Boolean = js.native
  var CapitalizeNamesOfDays: scala.Boolean = js.native
  var CorrectCapsLock: scala.Boolean = js.native
  var CorrectSentenceCap: scala.Boolean = js.native
  val Creator: XlCreator = js.native
  var DisplayAutoCorrectOptions: scala.Boolean = js.native
  var `Excel.AutoCorrect_typekey`: AutoCorrect = js.native
  val Parent: js.Any = js.native
  var ReplaceText: scala.Boolean = js.native
  var TwoInitialCapitals: scala.Boolean = js.native
  /** @returns The string to be replaced */
  def AddReplacement(What: java.lang.String, Replacement: java.lang.String): java.lang.String = js.native
  /** @returns The string to be replaced */
  def DeleteReplacement(What: java.lang.String): java.lang.String = js.native
  def ReplacementList(Index: scala.Double): stdLib.SafeArray[java.lang.String] = js.native
}

