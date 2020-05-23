package typings.activexWord.global.Word

import typings.activexWord.Word.WdFindWrap
import typings.activexWord.Word.WdLanguageID
import typings.activexWord.Word.WdReplace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Find")
@js.native
class Find[TParent] protected ()
  extends typings.activexWord.Word.Find[TParent] {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var CorrectHangulEndings: Boolean = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Font: typings.activexWord.Word.Font = js.native
  /* CompleteClass */
  override var Format: Boolean = js.native
  /* CompleteClass */
  override var Forward: Boolean = js.native
  /* CompleteClass */
  override val Found: Boolean = js.native
  /* CompleteClass */
  override val Frame: typings.activexWord.Word.Frame = js.native
  /* CompleteClass */
  override var HanjaPhoneticHangul: Boolean = js.native
  /* CompleteClass */
  override var Highlight: Double = js.native
  /* CompleteClass */
  override var IgnorePunct: Boolean = js.native
  /* CompleteClass */
  override var IgnoreSpace: Boolean = js.native
  /* CompleteClass */
  override var LanguageID: WdLanguageID = js.native
  /* CompleteClass */
  override var LanguageIDFarEast: WdLanguageID = js.native
  /* CompleteClass */
  override var LanguageIDOther: WdLanguageID = js.native
  /* CompleteClass */
  override var MatchAlefHamza: Boolean = js.native
  /* CompleteClass */
  override var MatchAllWordForms: Boolean = js.native
  /* CompleteClass */
  override var MatchByte: Boolean = js.native
  /* CompleteClass */
  override var MatchCase: Boolean = js.native
  /* CompleteClass */
  override var MatchControl: Boolean = js.native
  /* CompleteClass */
  override var MatchDiacritics: Boolean = js.native
  /* CompleteClass */
  override var MatchFuzzy: Boolean = js.native
  /* CompleteClass */
  override var MatchKashida: Boolean = js.native
  /* CompleteClass */
  override var MatchPhrase: Boolean = js.native
  /* CompleteClass */
  override var MatchPrefix: Boolean = js.native
  /* CompleteClass */
  override var MatchSoundsLike: Boolean = js.native
  /* CompleteClass */
  override var MatchSuffix: Boolean = js.native
  /* CompleteClass */
  override var MatchWholeWord: Boolean = js.native
  /* CompleteClass */
  override var MatchWildcards: Boolean = js.native
  /* CompleteClass */
  override var NoProofing: Double = js.native
  /* CompleteClass */
  override var ParagraphFormat: typings.activexWord.Word.ParagraphFormat = js.native
  /* CompleteClass */
  override val Parent: TParent = js.native
  /* CompleteClass */
  override val Replacement: typings.activexWord.Word.Replacement = js.native
  /* CompleteClass */
  override var Style: js.Any = js.native
  /* CompleteClass */
  override var Text: String = js.native
  /* CompleteClass */
  @JSName("Word.Find_typekey")
  override var WordDotFind_typekey: typings.activexWord.Word.Find[typings.activexWord.Word.Range | typings.activexWord.Word.Selection] = js.native
  /* CompleteClass */
  override var Wrap: WdFindWrap = js.native
  /* CompleteClass */
  override def ClearAllFuzzyOptions(): Unit = js.native
  /* CompleteClass */
  override def ClearFormatting(): Unit = js.native
  /* CompleteClass */
  override def ClearHitHighlight(): Boolean = js.native
  /* CompleteClass */
  override def Execute(
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
  /* CompleteClass */
  override def Execute2007(
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
  /* CompleteClass */
  override def ExecuteOld(
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
  /* CompleteClass */
  override def HitHighlight(
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
  /* CompleteClass */
  override def SetAllFuzzyOptions(): Unit = js.native
}

