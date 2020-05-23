package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Find[TParent] extends js.Object {
  val Application: typings.activexWord.Word.Application
  var CorrectHangulEndings: Boolean
  val Creator: Double
  var Font: typings.activexWord.Word.Font
  var Format: Boolean
  var Forward: Boolean
  val Found: Boolean
  val Frame: typings.activexWord.Word.Frame
  var HanjaPhoneticHangul: Boolean
  var Highlight: Double
  var IgnorePunct: Boolean
  var IgnoreSpace: Boolean
  var LanguageID: WdLanguageID
  var LanguageIDFarEast: WdLanguageID
  var LanguageIDOther: WdLanguageID
  var MatchAlefHamza: Boolean
  var MatchAllWordForms: Boolean
  var MatchByte: Boolean
  var MatchCase: Boolean
  var MatchControl: Boolean
  var MatchDiacritics: Boolean
  var MatchFuzzy: Boolean
  var MatchKashida: Boolean
  var MatchPhrase: Boolean
  var MatchPrefix: Boolean
  var MatchSoundsLike: Boolean
  var MatchSuffix: Boolean
  var MatchWholeWord: Boolean
  var MatchWildcards: Boolean
  var NoProofing: Double
  var ParagraphFormat: typings.activexWord.Word.ParagraphFormat
  val Parent: TParent
  val Replacement: typings.activexWord.Word.Replacement
  var Style: js.Any
  var Text: String
  @JSName("Word.Find_typekey")
  var WordDotFind_typekey: Find[Range | Selection]
  var Wrap: WdFindWrap
  def ClearAllFuzzyOptions(): Unit
  def ClearFormatting(): Unit
  def ClearHitHighlight(): Boolean
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
  ): Boolean
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
  ): Boolean
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
  ): Boolean
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
  ): Boolean
  def SetAllFuzzyOptions(): Unit
}

object Find {
  @scala.inline
  def apply[TParent](
    Application: Application,
    ClearAllFuzzyOptions: () => Unit,
    ClearFormatting: () => Unit,
    ClearHitHighlight: () => Boolean,
    CorrectHangulEndings: Boolean,
    Creator: Double,
    Execute: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean,
    Execute2007: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean,
    ExecuteOld: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace]) => Boolean,
    Font: Font,
    Format: Boolean,
    Forward: Boolean,
    Found: Boolean,
    Frame: Frame,
    HanjaPhoneticHangul: Boolean,
    Highlight: Double,
    HitHighlight: (js.Any, js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Boolean,
    IgnorePunct: Boolean,
    IgnoreSpace: Boolean,
    LanguageID: WdLanguageID,
    LanguageIDFarEast: WdLanguageID,
    LanguageIDOther: WdLanguageID,
    MatchAlefHamza: Boolean,
    MatchAllWordForms: Boolean,
    MatchByte: Boolean,
    MatchCase: Boolean,
    MatchControl: Boolean,
    MatchDiacritics: Boolean,
    MatchFuzzy: Boolean,
    MatchKashida: Boolean,
    MatchPhrase: Boolean,
    MatchPrefix: Boolean,
    MatchSoundsLike: Boolean,
    MatchSuffix: Boolean,
    MatchWholeWord: Boolean,
    MatchWildcards: Boolean,
    NoProofing: Double,
    ParagraphFormat: ParagraphFormat,
    Parent: TParent,
    Replacement: Replacement,
    SetAllFuzzyOptions: () => Unit,
    Style: js.Any,
    Text: String,
    WordDotFind_typekey: Find[Range | Selection],
    Wrap: WdFindWrap
  ): Find[TParent] = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearAllFuzzyOptions = js.Any.fromFunction0(ClearAllFuzzyOptions), ClearFormatting = js.Any.fromFunction0(ClearFormatting), ClearHitHighlight = js.Any.fromFunction0(ClearHitHighlight), CorrectHangulEndings = CorrectHangulEndings.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Execute = js.Any.fromFunction15(Execute), Execute2007 = js.Any.fromFunction20(Execute2007), ExecuteOld = js.Any.fromFunction11(ExecuteOld), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any], Found = Found.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], HanjaPhoneticHangul = HanjaPhoneticHangul.asInstanceOf[js.Any], Highlight = Highlight.asInstanceOf[js.Any], HitHighlight = js.Any.fromFunction20(HitHighlight), IgnorePunct = IgnorePunct.asInstanceOf[js.Any], IgnoreSpace = IgnoreSpace.asInstanceOf[js.Any], LanguageID = LanguageID.asInstanceOf[js.Any], LanguageIDFarEast = LanguageIDFarEast.asInstanceOf[js.Any], LanguageIDOther = LanguageIDOther.asInstanceOf[js.Any], MatchAlefHamza = MatchAlefHamza.asInstanceOf[js.Any], MatchAllWordForms = MatchAllWordForms.asInstanceOf[js.Any], MatchByte = MatchByte.asInstanceOf[js.Any], MatchCase = MatchCase.asInstanceOf[js.Any], MatchControl = MatchControl.asInstanceOf[js.Any], MatchDiacritics = MatchDiacritics.asInstanceOf[js.Any], MatchFuzzy = MatchFuzzy.asInstanceOf[js.Any], MatchKashida = MatchKashida.asInstanceOf[js.Any], MatchPhrase = MatchPhrase.asInstanceOf[js.Any], MatchPrefix = MatchPrefix.asInstanceOf[js.Any], MatchSoundsLike = MatchSoundsLike.asInstanceOf[js.Any], MatchSuffix = MatchSuffix.asInstanceOf[js.Any], MatchWholeWord = MatchWholeWord.asInstanceOf[js.Any], MatchWildcards = MatchWildcards.asInstanceOf[js.Any], NoProofing = NoProofing.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Replacement = Replacement.asInstanceOf[js.Any], SetAllFuzzyOptions = js.Any.fromFunction0(SetAllFuzzyOptions), Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Wrap = Wrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Find_typekey")(WordDotFind_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Find[TParent]]
  }
}

