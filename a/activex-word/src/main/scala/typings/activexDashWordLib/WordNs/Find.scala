package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Find")
@js.native
class Find[TParent] protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  var CorrectHangulEndings: scala.Boolean = js.native
  val Creator: scala.Double = js.native
  var Font: activexDashWordLib.WordNs.Font = js.native
  var Format: scala.Boolean = js.native
  var Forward: scala.Boolean = js.native
  val Found: scala.Boolean = js.native
  val Frame: activexDashWordLib.WordNs.Frame = js.native
  var HanjaPhoneticHangul: scala.Boolean = js.native
  var Highlight: scala.Double = js.native
  var IgnorePunct: scala.Boolean = js.native
  var IgnoreSpace: scala.Boolean = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  var LanguageIDOther: WdLanguageID = js.native
  var MatchAlefHamza: scala.Boolean = js.native
  var MatchAllWordForms: scala.Boolean = js.native
  var MatchByte: scala.Boolean = js.native
  var MatchCase: scala.Boolean = js.native
  var MatchControl: scala.Boolean = js.native
  var MatchDiacritics: scala.Boolean = js.native
  var MatchFuzzy: scala.Boolean = js.native
  var MatchKashida: scala.Boolean = js.native
  var MatchPhrase: scala.Boolean = js.native
  var MatchPrefix: scala.Boolean = js.native
  var MatchSoundsLike: scala.Boolean = js.native
  var MatchSuffix: scala.Boolean = js.native
  var MatchWholeWord: scala.Boolean = js.native
  var MatchWildcards: scala.Boolean = js.native
  var NoProofing: scala.Double = js.native
  var ParagraphFormat: activexDashWordLib.WordNs.ParagraphFormat = js.native
  val Parent: TParent = js.native
  val Replacement: activexDashWordLib.WordNs.Replacement = js.native
  var Style: js.Any = js.native
  var Text: java.lang.String = js.native
  var `Word.Find_typekey`: Find[Range | Selection] = js.native
  var Wrap: WdFindWrap = js.native
  def ClearAllFuzzyOptions(): scala.Unit = js.native
  def ClearFormatting(): scala.Unit = js.native
  def ClearHitHighlight(): scala.Boolean = js.native
  def Execute(
    FindText: js.UndefOr[java.lang.String],
    MatchCase: js.UndefOr[scala.Boolean],
    MatchWholeWord: js.UndefOr[scala.Boolean],
    MatchWildcards: js.UndefOr[scala.Boolean],
    MatchSoundsLike: js.UndefOr[scala.Boolean],
    MatchAllWordForms: js.UndefOr[scala.Boolean],
    Forward: js.UndefOr[scala.Boolean],
    Wrap: js.UndefOr[WdFindWrap],
    Format: js.UndefOr[scala.Boolean],
    ReplaceWith: js.UndefOr[java.lang.String],
    Replace: js.UndefOr[WdReplace],
    MatchKashida: js.UndefOr[scala.Boolean],
    MatchDiacritics: js.UndefOr[scala.Boolean],
    MatchAlefHamza: js.UndefOr[scala.Boolean],
    MatchControl: js.UndefOr[scala.Boolean]
  ): scala.Boolean = js.native
  def Execute2007(
    FindText: js.UndefOr[java.lang.String],
    MatchCase: js.UndefOr[scala.Boolean],
    MatchWholeWord: js.UndefOr[scala.Boolean],
    MatchWildcards: js.UndefOr[scala.Boolean],
    MatchSoundsLike: js.UndefOr[scala.Boolean],
    MatchAllWordForms: js.UndefOr[scala.Boolean],
    Forward: js.UndefOr[scala.Boolean],
    Wrap: js.UndefOr[WdFindWrap],
    Format: js.UndefOr[scala.Boolean],
    ReplaceWith: js.UndefOr[java.lang.String],
    Replace: js.UndefOr[WdReplace],
    MatchKashida: js.UndefOr[scala.Boolean],
    MatchDiacritics: js.UndefOr[scala.Boolean],
    MatchAlefHamza: js.UndefOr[scala.Boolean],
    MatchControl: js.UndefOr[scala.Boolean],
    MatchPrefix: js.UndefOr[scala.Boolean],
    MatchSuffix: js.UndefOr[scala.Boolean],
    MatchPhrase: js.UndefOr[scala.Boolean],
    IgnoreSpace: js.UndefOr[scala.Boolean],
    IgnorePunct: js.UndefOr[scala.Boolean]
  ): scala.Boolean = js.native
  def ExecuteOld(
    FindText: js.UndefOr[java.lang.String],
    MatchCase: js.UndefOr[scala.Boolean],
    MatchWholeWord: js.UndefOr[scala.Boolean],
    MatchWildcards: js.UndefOr[scala.Boolean],
    MatchSoundsLike: js.UndefOr[scala.Boolean],
    MatchAllWordForms: js.UndefOr[scala.Boolean],
    Forward: js.UndefOr[scala.Boolean],
    Wrap: js.UndefOr[WdFindWrap],
    Format: js.UndefOr[scala.Boolean],
    ReplaceWith: js.UndefOr[java.lang.String],
    Replace: js.UndefOr[WdReplace]
  ): scala.Boolean = js.native
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
  ): scala.Boolean = js.native
  def SetAllFuzzyOptions(): scala.Unit = js.native
}

