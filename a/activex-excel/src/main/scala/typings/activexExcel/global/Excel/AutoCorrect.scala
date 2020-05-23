package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.AutoCorrect")
@js.native
class AutoCorrect protected ()
  extends typings.activexExcel.Excel.AutoCorrect {
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var AutoExpandListRange: Boolean = js.native
  /* CompleteClass */
  override var AutoFillFormulasInLists: Boolean = js.native
  /* CompleteClass */
  override var CapitalizeNamesOfDays: Boolean = js.native
  /* CompleteClass */
  override var CorrectCapsLock: Boolean = js.native
  /* CompleteClass */
  override var CorrectSentenceCap: Boolean = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override var DisplayAutoCorrectOptions: Boolean = js.native
  /* CompleteClass */
  @JSName("Excel.AutoCorrect_typekey")
  override var ExcelDotAutoCorrect_typekey: typings.activexExcel.Excel.AutoCorrect = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var ReplaceText: Boolean = js.native
  /* CompleteClass */
  override var TwoInitialCapitals: Boolean = js.native
  /** @returns The string to be replaced */
  /* CompleteClass */
  override def AddReplacement(What: String, Replacement: String): String = js.native
  /** @returns The string to be replaced */
  /* CompleteClass */
  override def DeleteReplacement(What: String): String = js.native
  /* CompleteClass */
  override def ReplacementList(Index: Double): SafeArray[String] = js.native
}

