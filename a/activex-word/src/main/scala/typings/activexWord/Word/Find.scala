package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Find[TParent] extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def ClearAllFuzzyOptions(): Unit = js.native
  
  def ClearFormatting(): Unit = js.native
  
  def ClearHitHighlight(): Boolean = js.native
  
  var CorrectHangulEndings: Boolean = js.native
  
  val Creator: Double = js.native
  
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
  
  var Font: typings.activexWord.Word.Font = js.native
  
  var Format: Boolean = js.native
  
  var Forward: Boolean = js.native
  
  val Found: Boolean = js.native
  
  val Frame: typings.activexWord.Word.Frame = js.native
  
  var HanjaPhoneticHangul: Boolean = js.native
  
  var Highlight: Double = js.native
  
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
  
  var ParagraphFormat: typings.activexWord.Word.ParagraphFormat = js.native
  
  val Parent: TParent = js.native
  
  val Replacement: typings.activexWord.Word.Replacement = js.native
  
  def SetAllFuzzyOptions(): Unit = js.native
  
  var Style: js.Any = js.native
  
  var Text: String = js.native
  
  @JSName("Word.Find_typekey")
  var WordDotFind_typekey: Find[Range | Selection] = js.native
  
  var Wrap: WdFindWrap = js.native
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
  
  @scala.inline
  implicit class FindMutableBuilder[Self <: Find[_], TParent] (val x: Self with Find[TParent]) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearAllFuzzyOptions(value: () => Unit): Self = StObject.set(x, "ClearAllFuzzyOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearFormatting(value: () => Unit): Self = StObject.set(x, "ClearFormatting", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearHitHighlight(value: () => Boolean): Self = StObject.set(x, "ClearHitHighlight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCorrectHangulEndings(value: Boolean): Self = StObject.set(x, "CorrectHangulEndings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean
    ): Self = StObject.set(x, "Execute", js.Any.fromFunction15(value))
    
    @scala.inline
    def setExecute2007(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean
    ): Self = StObject.set(x, "Execute2007", js.Any.fromFunction20(value))
    
    @scala.inline
    def setExecuteOld(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace]) => Boolean
    ): Self = StObject.set(x, "ExecuteOld", js.Any.fromFunction11(value))
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Boolean): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: Boolean): Self = StObject.set(x, "Forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFound(value: Boolean): Self = StObject.set(x, "Found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: Frame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHanjaPhoneticHangul(value: Boolean): Self = StObject.set(x, "HanjaPhoneticHangul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight(value: Double): Self = StObject.set(x, "Highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitHighlight(
      value: (js.Any, js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Boolean
    ): Self = StObject.set(x, "HitHighlight", js.Any.fromFunction20(value))
    
    @scala.inline
    def setIgnorePunct(value: Boolean): Self = StObject.set(x, "IgnorePunct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSpace(value: Boolean): Self = StObject.set(x, "IgnoreSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageID(value: WdLanguageID): Self = StObject.set(x, "LanguageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageIDFarEast(value: WdLanguageID): Self = StObject.set(x, "LanguageIDFarEast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageIDOther(value: WdLanguageID): Self = StObject.set(x, "LanguageIDOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchAlefHamza(value: Boolean): Self = StObject.set(x, "MatchAlefHamza", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchAllWordForms(value: Boolean): Self = StObject.set(x, "MatchAllWordForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchByte(value: Boolean): Self = StObject.set(x, "MatchByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = StObject.set(x, "MatchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchControl(value: Boolean): Self = StObject.set(x, "MatchControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchDiacritics(value: Boolean): Self = StObject.set(x, "MatchDiacritics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchFuzzy(value: Boolean): Self = StObject.set(x, "MatchFuzzy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchKashida(value: Boolean): Self = StObject.set(x, "MatchKashida", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPhrase(value: Boolean): Self = StObject.set(x, "MatchPhrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPrefix(value: Boolean): Self = StObject.set(x, "MatchPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchSoundsLike(value: Boolean): Self = StObject.set(x, "MatchSoundsLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchSuffix(value: Boolean): Self = StObject.set(x, "MatchSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchWholeWord(value: Boolean): Self = StObject.set(x, "MatchWholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchWildcards(value: Boolean): Self = StObject.set(x, "MatchWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoProofing(value: Double): Self = StObject.set(x, "NoProofing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphFormat(value: ParagraphFormat): Self = StObject.set(x, "ParagraphFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: TParent): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacement(value: Replacement): Self = StObject.set(x, "Replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAllFuzzyOptions(value: () => Unit): Self = StObject.set(x, "SetAllFuzzyOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFind_typekey(value: Find[Range | Selection]): Self = StObject.set(x, "Word.Find_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrap(value: WdFindWrap): Self = StObject.set(x, "Wrap", value.asInstanceOf[js.Any])
  }
}
