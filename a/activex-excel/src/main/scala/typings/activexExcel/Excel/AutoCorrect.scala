package typings.activexExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCorrect extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var AutoExpandListRange: Boolean
  var AutoFillFormulasInLists: Boolean
  var CapitalizeNamesOfDays: Boolean
  var CorrectCapsLock: Boolean
  var CorrectSentenceCap: Boolean
  val Creator: XlCreator
  var DisplayAutoCorrectOptions: Boolean
  @JSName("Excel.AutoCorrect_typekey")
  var ExcelDotAutoCorrect_typekey: AutoCorrect
  val Parent: js.Any
  var ReplaceText: Boolean
  var TwoInitialCapitals: Boolean
  /** @returns The string to be replaced */
  def AddReplacement(What: String, Replacement: String): String
  /** @returns The string to be replaced */
  def DeleteReplacement(What: String): String
  def ReplacementList(Index: Double): SafeArray[String]
}

object AutoCorrect {
  @scala.inline
  def apply(
    AddReplacement: (String, String) => String,
    Application: Application,
    AutoExpandListRange: Boolean,
    AutoFillFormulasInLists: Boolean,
    CapitalizeNamesOfDays: Boolean,
    CorrectCapsLock: Boolean,
    CorrectSentenceCap: Boolean,
    Creator: XlCreator,
    DeleteReplacement: String => String,
    DisplayAutoCorrectOptions: Boolean,
    ExcelDotAutoCorrect_typekey: AutoCorrect,
    Parent: js.Any,
    ReplaceText: Boolean,
    ReplacementList: Double => SafeArray[String],
    TwoInitialCapitals: Boolean
  ): AutoCorrect = {
    val __obj = js.Dynamic.literal(AddReplacement = js.Any.fromFunction2(AddReplacement), Application = Application.asInstanceOf[js.Any], AutoExpandListRange = AutoExpandListRange.asInstanceOf[js.Any], AutoFillFormulasInLists = AutoFillFormulasInLists.asInstanceOf[js.Any], CapitalizeNamesOfDays = CapitalizeNamesOfDays.asInstanceOf[js.Any], CorrectCapsLock = CorrectCapsLock.asInstanceOf[js.Any], CorrectSentenceCap = CorrectSentenceCap.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DeleteReplacement = js.Any.fromFunction1(DeleteReplacement), DisplayAutoCorrectOptions = DisplayAutoCorrectOptions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplaceText = ReplaceText.asInstanceOf[js.Any], ReplacementList = js.Any.fromFunction1(ReplacementList), TwoInitialCapitals = TwoInitialCapitals.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.AutoCorrect_typekey")(ExcelDotAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrect]
  }
}

