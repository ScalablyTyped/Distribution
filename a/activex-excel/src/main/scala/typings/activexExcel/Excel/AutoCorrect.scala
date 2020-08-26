package typings.activexExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCorrect extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
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
  @scala.inline
  implicit class AutoCorrectOps[Self <: AutoCorrect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddReplacement(value: (String, String) => String): Self = this.set("AddReplacement", js.Any.fromFunction2(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoExpandListRange(value: Boolean): Self = this.set("AutoExpandListRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoFillFormulasInLists(value: Boolean): Self = this.set("AutoFillFormulasInLists", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapitalizeNamesOfDays(value: Boolean): Self = this.set("CapitalizeNamesOfDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setCorrectCapsLock(value: Boolean): Self = this.set("CorrectCapsLock", value.asInstanceOf[js.Any])
    @scala.inline
    def setCorrectSentenceCap(value: Boolean): Self = this.set("CorrectSentenceCap", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteReplacement(value: String => String): Self = this.set("DeleteReplacement", js.Any.fromFunction1(value))
    @scala.inline
    def setDisplayAutoCorrectOptions(value: Boolean): Self = this.set("DisplayAutoCorrectOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotAutoCorrect_typekey(value: AutoCorrect): Self = this.set("Excel.AutoCorrect_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceText(value: Boolean): Self = this.set("ReplaceText", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacementList(value: Double => SafeArray[String]): Self = this.set("ReplacementList", js.Any.fromFunction1(value))
    @scala.inline
    def setTwoInitialCapitals(value: Boolean): Self = this.set("TwoInitialCapitals", value.asInstanceOf[js.Any])
  }
  
}

