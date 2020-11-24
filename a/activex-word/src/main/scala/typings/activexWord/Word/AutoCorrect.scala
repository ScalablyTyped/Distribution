package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCorrect extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var CorrectCapsLock: Boolean = js.native
  
  var CorrectDays: Boolean = js.native
  
  var CorrectHangulAndAlphabet: Boolean = js.native
  
  var CorrectInitialCaps: Boolean = js.native
  
  var CorrectKeyboardSetting: Boolean = js.native
  
  var CorrectSentenceCaps: Boolean = js.native
  
  var CorrectTableCells: Boolean = js.native
  
  val Creator: Double = js.native
  
  var DisplayAutoCorrectOptions: Boolean = js.native
  
  val Entries: AutoCorrectEntries = js.native
  
  var FirstLetterAutoAdd: Boolean = js.native
  
  val FirstLetterExceptions: typings.activexWord.Word.FirstLetterExceptions = js.native
  
  var HangulAndAlphabetAutoAdd: Boolean = js.native
  
  val HangulAndAlphabetExceptions: typings.activexWord.Word.HangulAndAlphabetExceptions = js.native
  
  var OtherCorrectionsAutoAdd: Boolean = js.native
  
  val OtherCorrectionsExceptions: typings.activexWord.Word.OtherCorrectionsExceptions = js.native
  
  val Parent: js.Any = js.native
  
  var ReplaceText: Boolean = js.native
  
  var ReplaceTextFromSpellingChecker: Boolean = js.native
  
  var TwoInitialCapsAutoAdd: Boolean = js.native
  
  val TwoInitialCapsExceptions: typings.activexWord.Word.TwoInitialCapsExceptions = js.native
  
  @JSName("Word.AutoCorrect_typekey")
  var WordDotAutoCorrect_typekey: AutoCorrect = js.native
}
object AutoCorrect {
  
  @scala.inline
  def apply(
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
    Parent: js.Any,
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectCapsLock(value: Boolean): Self = this.set("CorrectCapsLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectDays(value: Boolean): Self = this.set("CorrectDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectHangulAndAlphabet(value: Boolean): Self = this.set("CorrectHangulAndAlphabet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectInitialCaps(value: Boolean): Self = this.set("CorrectInitialCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectKeyboardSetting(value: Boolean): Self = this.set("CorrectKeyboardSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectSentenceCaps(value: Boolean): Self = this.set("CorrectSentenceCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectTableCells(value: Boolean): Self = this.set("CorrectTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAutoCorrectOptions(value: Boolean): Self = this.set("DisplayAutoCorrectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntries(value: AutoCorrectEntries): Self = this.set("Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLetterAutoAdd(value: Boolean): Self = this.set("FirstLetterAutoAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLetterExceptions(value: FirstLetterExceptions): Self = this.set("FirstLetterExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangulAndAlphabetAutoAdd(value: Boolean): Self = this.set("HangulAndAlphabetAutoAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangulAndAlphabetExceptions(value: HangulAndAlphabetExceptions): Self = this.set("HangulAndAlphabetExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherCorrectionsAutoAdd(value: Boolean): Self = this.set("OtherCorrectionsAutoAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherCorrectionsExceptions(value: OtherCorrectionsExceptions): Self = this.set("OtherCorrectionsExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceText(value: Boolean): Self = this.set("ReplaceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceTextFromSpellingChecker(value: Boolean): Self = this.set("ReplaceTextFromSpellingChecker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoInitialCapsAutoAdd(value: Boolean): Self = this.set("TwoInitialCapsAutoAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoInitialCapsExceptions(value: TwoInitialCapsExceptions): Self = this.set("TwoInitialCapsExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotAutoCorrect_typekey(value: AutoCorrect): Self = this.set("Word.AutoCorrect_typekey", value.asInstanceOf[js.Any])
  }
}
