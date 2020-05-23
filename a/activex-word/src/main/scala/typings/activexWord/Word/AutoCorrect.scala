package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCorrect extends js.Object {
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
  val Parent: js.Any
  var ReplaceText: Boolean
  var ReplaceTextFromSpellingChecker: Boolean
  var TwoInitialCapsAutoAdd: Boolean
  val TwoInitialCapsExceptions: typings.activexWord.Word.TwoInitialCapsExceptions
  @JSName("Word.AutoCorrect_typekey")
  var WordDotAutoCorrect_typekey: AutoCorrect
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
}

