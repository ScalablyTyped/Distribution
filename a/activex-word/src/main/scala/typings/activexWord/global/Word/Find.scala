package typings.activexWord.global.Word

import typings.activexWord.Word.WdFindWrap
import typings.activexWord.Word.WdLanguageID
import typings.activexWord.Word.WdReplace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Find")
@js.native
/* private */ open class Find[TParent] ()
  extends StObject
     with typings.activexWord.Word.Find[TParent] {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override def ClearAllFuzzyOptions(): Unit = js.native
  
  /* CompleteClass */
  override def ClearFormatting(): Unit = js.native
  
  /* CompleteClass */
  override def ClearHitHighlight(): Boolean = js.native
  
  /* CompleteClass */
  var CorrectHangulEndings: Boolean = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
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
  var Font: typings.activexWord.Word.Font = js.native
  
  /* CompleteClass */
  var Format: Boolean = js.native
  
  /* CompleteClass */
  var Forward: Boolean = js.native
  
  /* CompleteClass */
  override val Found: Boolean = js.native
  
  /* CompleteClass */
  override val Frame: typings.activexWord.Word.Frame = js.native
  
  /* CompleteClass */
  var HanjaPhoneticHangul: Boolean = js.native
  
  /* CompleteClass */
  var Highlight: Double = js.native
  
  /* CompleteClass */
  override def HitHighlight(
    FindText: Any,
    HighlightColor: js.UndefOr[Any],
    TextColor: js.UndefOr[Any],
    MatchCase: js.UndefOr[Any],
    MatchWholeWord: js.UndefOr[Any],
    MatchPrefix: js.UndefOr[Any],
    MatchSuffix: js.UndefOr[Any],
    MatchPhrase: js.UndefOr[Any],
    MatchWildcards: js.UndefOr[Any],
    MatchSoundsLike: js.UndefOr[Any],
    MatchAllWordForms: js.UndefOr[Any],
    MatchByte: js.UndefOr[Any],
    MatchFuzzy: js.UndefOr[Any],
    MatchKashida: js.UndefOr[Any],
    MatchDiacritics: js.UndefOr[Any],
    MatchAlefHamza: js.UndefOr[Any],
    MatchControl: js.UndefOr[Any],
    IgnoreSpace: js.UndefOr[Any],
    IgnorePunct: js.UndefOr[Any],
    HanjaPhoneticHangul: js.UndefOr[Any]
  ): Boolean = js.native
  
  /* CompleteClass */
  var IgnorePunct: Boolean = js.native
  
  /* CompleteClass */
  var IgnoreSpace: Boolean = js.native
  
  /* CompleteClass */
  var LanguageID: WdLanguageID = js.native
  
  /* CompleteClass */
  var LanguageIDFarEast: WdLanguageID = js.native
  
  /* CompleteClass */
  var LanguageIDOther: WdLanguageID = js.native
  
  /* CompleteClass */
  var MatchAlefHamza: Boolean = js.native
  
  /* CompleteClass */
  var MatchAllWordForms: Boolean = js.native
  
  /* CompleteClass */
  var MatchByte: Boolean = js.native
  
  /* CompleteClass */
  var MatchCase: Boolean = js.native
  
  /* CompleteClass */
  var MatchControl: Boolean = js.native
  
  /* CompleteClass */
  var MatchDiacritics: Boolean = js.native
  
  /* CompleteClass */
  var MatchFuzzy: Boolean = js.native
  
  /* CompleteClass */
  var MatchKashida: Boolean = js.native
  
  /* CompleteClass */
  var MatchPhrase: Boolean = js.native
  
  /* CompleteClass */
  var MatchPrefix: Boolean = js.native
  
  /* CompleteClass */
  var MatchSoundsLike: Boolean = js.native
  
  /* CompleteClass */
  var MatchSuffix: Boolean = js.native
  
  /* CompleteClass */
  var MatchWholeWord: Boolean = js.native
  
  /* CompleteClass */
  var MatchWildcards: Boolean = js.native
  
  /* CompleteClass */
  var NoProofing: Double = js.native
  
  /* CompleteClass */
  var ParagraphFormat: typings.activexWord.Word.ParagraphFormat = js.native
  
  /* CompleteClass */
  override val Parent: TParent = js.native
  
  /* CompleteClass */
  override val Replacement: typings.activexWord.Word.Replacement = js.native
  
  /* CompleteClass */
  override def SetAllFuzzyOptions(): Unit = js.native
  
  /* CompleteClass */
  var Style: Any = js.native
  
  /* CompleteClass */
  var Text: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.Find_typekey")
  var WordDotFind_typekey: typings.activexWord.Word.Find[typings.activexWord.Word.Range | typings.activexWord.Word.Selection] = js.native
  
  /* CompleteClass */
  var Wrap: WdFindWrap = js.native
}
