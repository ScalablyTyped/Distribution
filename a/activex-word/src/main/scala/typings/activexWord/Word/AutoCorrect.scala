package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCorrect extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var CorrectCapsLock: Boolean
  
  var CorrectDays: Boolean
  
  var CorrectHangulAndAlphabet: Boolean
  
  var CorrectInitialCaps: Boolean
  
  var CorrectKeyboardSetting: Boolean
  
  var CorrectSentenceCaps: Boolean
  
  var CorrectTableCells: Boolean
  
  val Creator: Double
  
  var DisplayAutoCorrectOptions: Boolean
  
  val Entries: AutoCorrectEntries
  
  var FirstLetterAutoAdd: Boolean
  
  val FirstLetterExceptions: typings.activexWord.Word.FirstLetterExceptions
  
  var HangulAndAlphabetAutoAdd: Boolean
  
  val HangulAndAlphabetExceptions: typings.activexWord.Word.HangulAndAlphabetExceptions
  
  var OtherCorrectionsAutoAdd: Boolean
  
  val OtherCorrectionsExceptions: typings.activexWord.Word.OtherCorrectionsExceptions
  
  val Parent: Any
  
  var ReplaceText: Boolean
  
  var ReplaceTextFromSpellingChecker: Boolean
  
  var TwoInitialCapsAutoAdd: Boolean
  
  val TwoInitialCapsExceptions: typings.activexWord.Word.TwoInitialCapsExceptions
  
  /* private */ @JSName("Word.AutoCorrect_typekey")
  var WordDotAutoCorrect_typekey: AutoCorrect
}
object AutoCorrect {
  
  inline def apply(
    Application: Application,
    CorrectCapsLock: Boolean,
    CorrectDays: Boolean,
    CorrectHangulAndAlphabet: Boolean,
    CorrectInitialCaps: Boolean,
    CorrectKeyboardSetting: Boolean,
    CorrectSentenceCaps: Boolean,
    CorrectTableCells: Boolean,
    Creator: Double,
    DisplayAutoCorrectOptions: Boolean,
    Entries: AutoCorrectEntries,
    FirstLetterAutoAdd: Boolean,
    FirstLetterExceptions: FirstLetterExceptions,
    HangulAndAlphabetAutoAdd: Boolean,
    HangulAndAlphabetExceptions: HangulAndAlphabetExceptions,
    OtherCorrectionsAutoAdd: Boolean,
    OtherCorrectionsExceptions: OtherCorrectionsExceptions,
    Parent: Any,
    ReplaceText: Boolean,
    ReplaceTextFromSpellingChecker: Boolean,
    TwoInitialCapsAutoAdd: Boolean,
    TwoInitialCapsExceptions: TwoInitialCapsExceptions,
    WordDotAutoCorrect_typekey: AutoCorrect
  ): AutoCorrect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CorrectCapsLock = CorrectCapsLock.asInstanceOf[js.Any], CorrectDays = CorrectDays.asInstanceOf[js.Any], CorrectHangulAndAlphabet = CorrectHangulAndAlphabet.asInstanceOf[js.Any], CorrectInitialCaps = CorrectInitialCaps.asInstanceOf[js.Any], CorrectKeyboardSetting = CorrectKeyboardSetting.asInstanceOf[js.Any], CorrectSentenceCaps = CorrectSentenceCaps.asInstanceOf[js.Any], CorrectTableCells = CorrectTableCells.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplayAutoCorrectOptions = DisplayAutoCorrectOptions.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], FirstLetterAutoAdd = FirstLetterAutoAdd.asInstanceOf[js.Any], FirstLetterExceptions = FirstLetterExceptions.asInstanceOf[js.Any], HangulAndAlphabetAutoAdd = HangulAndAlphabetAutoAdd.asInstanceOf[js.Any], HangulAndAlphabetExceptions = HangulAndAlphabetExceptions.asInstanceOf[js.Any], OtherCorrectionsAutoAdd = OtherCorrectionsAutoAdd.asInstanceOf[js.Any], OtherCorrectionsExceptions = OtherCorrectionsExceptions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplaceText = ReplaceText.asInstanceOf[js.Any], ReplaceTextFromSpellingChecker = ReplaceTextFromSpellingChecker.asInstanceOf[js.Any], TwoInitialCapsAutoAdd = TwoInitialCapsAutoAdd.asInstanceOf[js.Any], TwoInitialCapsExceptions = TwoInitialCapsExceptions.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCorrect_typekey")(WordDotAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoCorrect] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCorrectCapsLock(value: Boolean): Self = StObject.set(x, "CorrectCapsLock", value.asInstanceOf[js.Any])
    
    inline def setCorrectDays(value: Boolean): Self = StObject.set(x, "CorrectDays", value.asInstanceOf[js.Any])
    
    inline def setCorrectHangulAndAlphabet(value: Boolean): Self = StObject.set(x, "CorrectHangulAndAlphabet", value.asInstanceOf[js.Any])
    
    inline def setCorrectInitialCaps(value: Boolean): Self = StObject.set(x, "CorrectInitialCaps", value.asInstanceOf[js.Any])
    
    inline def setCorrectKeyboardSetting(value: Boolean): Self = StObject.set(x, "CorrectKeyboardSetting", value.asInstanceOf[js.Any])
    
    inline def setCorrectSentenceCaps(value: Boolean): Self = StObject.set(x, "CorrectSentenceCaps", value.asInstanceOf[js.Any])
    
    inline def setCorrectTableCells(value: Boolean): Self = StObject.set(x, "CorrectTableCells", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDisplayAutoCorrectOptions(value: Boolean): Self = StObject.set(x, "DisplayAutoCorrectOptions", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: AutoCorrectEntries): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setFirstLetterAutoAdd(value: Boolean): Self = StObject.set(x, "FirstLetterAutoAdd", value.asInstanceOf[js.Any])
    
    inline def setFirstLetterExceptions(value: FirstLetterExceptions): Self = StObject.set(x, "FirstLetterExceptions", value.asInstanceOf[js.Any])
    
    inline def setHangulAndAlphabetAutoAdd(value: Boolean): Self = StObject.set(x, "HangulAndAlphabetAutoAdd", value.asInstanceOf[js.Any])
    
    inline def setHangulAndAlphabetExceptions(value: HangulAndAlphabetExceptions): Self = StObject.set(x, "HangulAndAlphabetExceptions", value.asInstanceOf[js.Any])
    
    inline def setOtherCorrectionsAutoAdd(value: Boolean): Self = StObject.set(x, "OtherCorrectionsAutoAdd", value.asInstanceOf[js.Any])
    
    inline def setOtherCorrectionsExceptions(value: OtherCorrectionsExceptions): Self = StObject.set(x, "OtherCorrectionsExceptions", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReplaceText(value: Boolean): Self = StObject.set(x, "ReplaceText", value.asInstanceOf[js.Any])
    
    inline def setReplaceTextFromSpellingChecker(value: Boolean): Self = StObject.set(x, "ReplaceTextFromSpellingChecker", value.asInstanceOf[js.Any])
    
    inline def setTwoInitialCapsAutoAdd(value: Boolean): Self = StObject.set(x, "TwoInitialCapsAutoAdd", value.asInstanceOf[js.Any])
    
    inline def setTwoInitialCapsExceptions(value: TwoInitialCapsExceptions): Self = StObject.set(x, "TwoInitialCapsExceptions", value.asInstanceOf[js.Any])
    
    inline def setWordDotAutoCorrect_typekey(value: AutoCorrect): Self = StObject.set(x, "Word.AutoCorrect_typekey", value.asInstanceOf[js.Any])
  }
}
