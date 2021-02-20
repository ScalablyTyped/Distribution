package typings.activexExcel.Excel

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCorrect extends StObject {
  
  /** @returns The string to be replaced */
  def AddReplacement(What: String, Replacement: String): String = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var AutoExpandListRange: Boolean = js.native
  
  var AutoFillFormulasInLists: Boolean = js.native
  
  var CapitalizeNamesOfDays: Boolean = js.native
  
  var CorrectCapsLock: Boolean = js.native
  
  var CorrectSentenceCap: Boolean = js.native
  
  val Creator: XlCreator = js.native
  
  /** @returns The string to be replaced */
  def DeleteReplacement(What: String): String = js.native
  
  var DisplayAutoCorrectOptions: Boolean = js.native
  
  @JSName("Excel.AutoCorrect_typekey")
  var ExcelDotAutoCorrect_typekey: AutoCorrect = js.native
  
  val Parent: js.Any = js.native
  
  var ReplaceText: Boolean = js.native
  
  def ReplacementList(Index: Double): SafeArray[String] = js.native
  
  var TwoInitialCapitals: Boolean = js.native
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
  implicit class AutoCorrectMutableBuilder[Self <: AutoCorrect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddReplacement(value: (String, String) => String): Self = StObject.set(x, "AddReplacement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoExpandListRange(value: Boolean): Self = StObject.set(x, "AutoExpandListRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFillFormulasInLists(value: Boolean): Self = StObject.set(x, "AutoFillFormulasInLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapitalizeNamesOfDays(value: Boolean): Self = StObject.set(x, "CapitalizeNamesOfDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectCapsLock(value: Boolean): Self = StObject.set(x, "CorrectCapsLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectSentenceCap(value: Boolean): Self = StObject.set(x, "CorrectSentenceCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteReplacement(value: String => String): Self = StObject.set(x, "DeleteReplacement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayAutoCorrectOptions(value: Boolean): Self = StObject.set(x, "DisplayAutoCorrectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotAutoCorrect_typekey(value: AutoCorrect): Self = StObject.set(x, "Excel.AutoCorrect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceText(value: Boolean): Self = StObject.set(x, "ReplaceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementList(value: Double => SafeArray[String]): Self = StObject.set(x, "ReplacementList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTwoInitialCapitals(value: Boolean): Self = StObject.set(x, "TwoInitialCapitals", value.asInstanceOf[js.Any])
  }
}
