package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AutoCorrect")
@js.native
class AutoCorrect protected () extends js.Object {
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

