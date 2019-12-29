package typings.activexDashExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.AutoCorrect")
@js.native
class AutoCorrect protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var AutoExpandListRange: Boolean = js.native
  var AutoFillFormulasInLists: Boolean = js.native
  var CapitalizeNamesOfDays: Boolean = js.native
  var CorrectCapsLock: Boolean = js.native
  var CorrectSentenceCap: Boolean = js.native
  val Creator: XlCreator = js.native
  var DisplayAutoCorrectOptions: Boolean = js.native
  @JSName("Excel.AutoCorrect_typekey")
  var ExcelDotAutoCorrect_typekey: AutoCorrect = js.native
  val Parent: js.Any = js.native
  var ReplaceText: Boolean = js.native
  var TwoInitialCapitals: Boolean = js.native
  /** @returns The string to be replaced */
  def AddReplacement(What: String, Replacement: String): String = js.native
  /** @returns The string to be replaced */
  def DeleteReplacement(What: String): String = js.native
  def ReplacementList(Index: Double): SafeArray[String] = js.native
}

