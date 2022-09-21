package typings.activexExcel.Excel

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCorrect extends StObject {
  
  /** @returns The string to be replaced */
  def AddReplacement(What: String, Replacement: String): String
  
  val Application: typings.activexExcel.Excel.Application
  
  var AutoExpandListRange: Boolean
  
  var AutoFillFormulasInLists: Boolean
  
  var CapitalizeNamesOfDays: Boolean
  
  var CorrectCapsLock: Boolean
  
  var CorrectSentenceCap: Boolean
  
  val Creator: XlCreator
  
  /** @returns The string to be replaced */
  def DeleteReplacement(What: String): String
  
  var DisplayAutoCorrectOptions: Boolean
  
  /* private */ @JSName("Excel.AutoCorrect_typekey")
  var ExcelDotAutoCorrect_typekey: AutoCorrect
  
  val Parent: Any
  
  var ReplaceText: Boolean
  
  def ReplacementList(Index: Double): SafeArray[String]
  
  var TwoInitialCapitals: Boolean
}
object AutoCorrect {
  
  inline def apply(
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
    Parent: Any,
    ReplaceText: Boolean,
    ReplacementList: Double => SafeArray[String],
    TwoInitialCapitals: Boolean
  ): AutoCorrect = {
    val __obj = js.Dynamic.literal(AddReplacement = js.Any.fromFunction2(AddReplacement), Application = Application.asInstanceOf[js.Any], AutoExpandListRange = AutoExpandListRange.asInstanceOf[js.Any], AutoFillFormulasInLists = AutoFillFormulasInLists.asInstanceOf[js.Any], CapitalizeNamesOfDays = CapitalizeNamesOfDays.asInstanceOf[js.Any], CorrectCapsLock = CorrectCapsLock.asInstanceOf[js.Any], CorrectSentenceCap = CorrectSentenceCap.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DeleteReplacement = js.Any.fromFunction1(DeleteReplacement), DisplayAutoCorrectOptions = DisplayAutoCorrectOptions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplaceText = ReplaceText.asInstanceOf[js.Any], ReplacementList = js.Any.fromFunction1(ReplacementList), TwoInitialCapitals = TwoInitialCapitals.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.AutoCorrect_typekey")(ExcelDotAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrect]
  }
  
  extension [Self <: AutoCorrect](x: Self) {
    
    inline def setAddReplacement(value: (String, String) => String): Self = StObject.set(x, "AddReplacement", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoExpandListRange(value: Boolean): Self = StObject.set(x, "AutoExpandListRange", value.asInstanceOf[js.Any])
    
    inline def setAutoFillFormulasInLists(value: Boolean): Self = StObject.set(x, "AutoFillFormulasInLists", value.asInstanceOf[js.Any])
    
    inline def setCapitalizeNamesOfDays(value: Boolean): Self = StObject.set(x, "CapitalizeNamesOfDays", value.asInstanceOf[js.Any])
    
    inline def setCorrectCapsLock(value: Boolean): Self = StObject.set(x, "CorrectCapsLock", value.asInstanceOf[js.Any])
    
    inline def setCorrectSentenceCap(value: Boolean): Self = StObject.set(x, "CorrectSentenceCap", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDeleteReplacement(value: String => String): Self = StObject.set(x, "DeleteReplacement", js.Any.fromFunction1(value))
    
    inline def setDisplayAutoCorrectOptions(value: Boolean): Self = StObject.set(x, "DisplayAutoCorrectOptions", value.asInstanceOf[js.Any])
    
    inline def setExcelDotAutoCorrect_typekey(value: AutoCorrect): Self = StObject.set(x, "Excel.AutoCorrect_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReplaceText(value: Boolean): Self = StObject.set(x, "ReplaceText", value.asInstanceOf[js.Any])
    
    inline def setReplacementList(value: Double => SafeArray[String]): Self = StObject.set(x, "ReplacementList", js.Any.fromFunction1(value))
    
    inline def setTwoInitialCapitals(value: Boolean): Self = StObject.set(x, "TwoInitialCapitals", value.asInstanceOf[js.Any])
  }
}
