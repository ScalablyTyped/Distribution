package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Find")
@js.native
class Find[TParent] protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  var CorrectHangulEndings: Boolean = js.native
  val Creator: Double = js.native
  var Font: typings.activexDashWord.Word.Font = js.native
  var Format: Boolean = js.native
  var Forward: Boolean = js.native
  val Found: Boolean = js.native
  val Frame: typings.activexDashWord.Word.Frame = js.native
  var HanjaPhoneticHangul: Boolean = js.native
  var Highlight: Double = js.native
  var IgnorePunct: Boolean = js.native
  var IgnoreSpace: Boolean = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  var LanguageIDOther: WdLanguageID = js.native
  var MatchAlefHamza: Boolean = js.native
  var MatchAllWordForms: Boolean = js.native
  var MatchByte: Boolean = js.native
  var MatchCase: Boolean = js.native
  var MatchControl: Boolean = js.native
  var MatchDiacritics: Boolean = js.native
  var MatchFuzzy: Boolean = js.native
  var MatchKashida: Boolean = js.native
  var MatchPhrase: Boolean = js.native
  var MatchPrefix: Boolean = js.native
  var MatchSoundsLike: Boolean = js.native
  var MatchSuffix: Boolean = js.native
  var MatchWholeWord: Boolean = js.native
  var MatchWildcards: Boolean = js.native
  var NoProofing: Double = js.native
  var ParagraphFormat: typings.activexDashWord.Word.ParagraphFormat = js.native
  val Parent: TParent = js.native
  val Replacement: typings.activexDashWord.Word.Replacement = js.native
  var Style: js.Any = js.native
  var Text: String = js.native
  var `Word.Find_typekey`: Find[Range | Selection] = js.native
  var Wrap: WdFindWrap = js.native
  def ClearAllFuzzyOptions(): Unit = js.native
  def ClearFormatting(): Unit = js.native
  def ClearHitHighlight(): Boolean = js.native
  def Execute(
    FindText: js.UndefOr[String],
    MatchCase: js.UndefOr[Boolean],
    MatchWholeWord: js.UndefOr[Boolean],
    MatchWildcards: js.UndefOr[Boolean],
    MatchSoundsLike: js.UndefOr[Boolean],
    MatchAllWordForms: js.UndefOr[Boolean],
    Forward: js.UndefOr[Boolean],
    Wrap: js.UndefOr[WdFindWrap],
    Format: js.UndefOr[Boolean],
    ReplaceWith: js.UndefOr[String],
    Replace: js.UndefOr[WdReplace],
    MatchKashida: js.UndefOr[Boolean],
    MatchDiacritics: js.UndefOr[Boolean],
    MatchAlefHamza: js.UndefOr[Boolean],
    MatchControl: js.UndefOr[Boolean]
  ): Boolean = js.native
  def Execute2007(
    FindText: js.UndefOr[String],
    MatchCase: js.UndefOr[Boolean],
    MatchWholeWord: js.UndefOr[Boolean],
    MatchWildcards: js.UndefOr[Boolean],
    MatchSoundsLike: js.UndefOr[Boolean],
    MatchAllWordForms: js.UndefOr[Boolean],
    Forward: js.UndefOr[Boolean],
    Wrap: js.UndefOr[WdFindWrap],
    Format: js.UndefOr[Boolean],
    ReplaceWith: js.UndefOr[String],
    Replace: js.UndefOr[WdReplace],
    MatchKashida: js.UndefOr[Boolean],
    MatchDiacritics: js.UndefOr[Boolean],
    MatchAlefHamza: js.UndefOr[Boolean],
    MatchControl: js.UndefOr[Boolean],
    MatchPrefix: js.UndefOr[Boolean],
    MatchSuffix: js.UndefOr[Boolean],
    MatchPhrase: js.UndefOr[Boolean],
    IgnoreSpace: js.UndefOr[Boolean],
    IgnorePunct: js.UndefOr[Boolean]
  ): Boolean = js.native
  def ExecuteOld(
    FindText: js.UndefOr[String],
    MatchCase: js.UndefOr[Boolean],
    MatchWholeWord: js.UndefOr[Boolean],
    MatchWildcards: js.UndefOr[Boolean],
    MatchSoundsLike: js.UndefOr[Boolean],
    MatchAllWordForms: js.UndefOr[Boolean],
    Forward: js.UndefOr[Boolean],
    Wrap: js.UndefOr[WdFindWrap],
    Format: js.UndefOr[Boolean],
    ReplaceWith: js.UndefOr[String],
    Replace: js.UndefOr[WdReplace]
  ): Boolean = js.native
  def HitHighlight(
    FindText: js.Any,
    HighlightColor: js.UndefOr[js.Any],
    TextColor: js.UndefOr[js.Any],
    MatchCase: js.UndefOr[js.Any],
    MatchWholeWord: js.UndefOr[js.Any],
    MatchPrefix: js.UndefOr[js.Any],
    MatchSuffix: js.UndefOr[js.Any],
    MatchPhrase: js.UndefOr[js.Any],
    MatchWildcards: js.UndefOr[js.Any],
    MatchSoundsLike: js.UndefOr[js.Any],
    MatchAllWordForms: js.UndefOr[js.Any],
    MatchByte: js.UndefOr[js.Any],
    MatchFuzzy: js.UndefOr[js.Any],
    MatchKashida: js.UndefOr[js.Any],
    MatchDiacritics: js.UndefOr[js.Any],
    MatchAlefHamza: js.UndefOr[js.Any],
    MatchControl: js.UndefOr[js.Any],
    IgnoreSpace: js.UndefOr[js.Any],
    IgnorePunct: js.UndefOr[js.Any],
    HanjaPhoneticHangul: js.UndefOr[js.Any]
  ): Boolean = js.native
  def SetAllFuzzyOptions(): Unit = js.native
}

