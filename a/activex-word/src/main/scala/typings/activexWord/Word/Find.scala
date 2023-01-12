package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Find[TParent] extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  def ClearAllFuzzyOptions(): Unit
  
  def ClearFormatting(): Unit
  
  def ClearHitHighlight(): Boolean
  
  var CorrectHangulEndings: Boolean
  
  val Creator: Double
  
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
  
  var Font: typings.activexWord.Word.Font
  
  var Format: Boolean
  
  var Forward: Boolean
  
  val Found: Boolean
  
  val Frame: typings.activexWord.Word.Frame
  
  var HanjaPhoneticHangul: Boolean
  
  var Highlight: Double
  
  def HitHighlight(
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
  ): Boolean
  
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
  
  def SetAllFuzzyOptions(): Unit
  
  var Style: Any
  
  var Text: String
  
  /* private */ @JSName("Word.Find_typekey")
  var WordDotFind_typekey: Find[Range | Selection]
  
  var Wrap: WdFindWrap
}
object Find {
  
  inline def apply[TParent](
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
    HitHighlight: (Any, js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Boolean,
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
    Style: Any,
    Text: String,
    WordDotFind_typekey: Find[Range | Selection],
    Wrap: WdFindWrap
  ): Find[TParent] = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearAllFuzzyOptions = js.Any.fromFunction0(ClearAllFuzzyOptions), ClearFormatting = js.Any.fromFunction0(ClearFormatting), ClearHitHighlight = js.Any.fromFunction0(ClearHitHighlight), CorrectHangulEndings = CorrectHangulEndings.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Execute = js.Any.fromFunction15(Execute), Execute2007 = js.Any.fromFunction20(Execute2007), ExecuteOld = js.Any.fromFunction11(ExecuteOld), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any], Found = Found.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], HanjaPhoneticHangul = HanjaPhoneticHangul.asInstanceOf[js.Any], Highlight = Highlight.asInstanceOf[js.Any], HitHighlight = js.Any.fromFunction20(HitHighlight), IgnorePunct = IgnorePunct.asInstanceOf[js.Any], IgnoreSpace = IgnoreSpace.asInstanceOf[js.Any], LanguageID = LanguageID.asInstanceOf[js.Any], LanguageIDFarEast = LanguageIDFarEast.asInstanceOf[js.Any], LanguageIDOther = LanguageIDOther.asInstanceOf[js.Any], MatchAlefHamza = MatchAlefHamza.asInstanceOf[js.Any], MatchAllWordForms = MatchAllWordForms.asInstanceOf[js.Any], MatchByte = MatchByte.asInstanceOf[js.Any], MatchCase = MatchCase.asInstanceOf[js.Any], MatchControl = MatchControl.asInstanceOf[js.Any], MatchDiacritics = MatchDiacritics.asInstanceOf[js.Any], MatchFuzzy = MatchFuzzy.asInstanceOf[js.Any], MatchKashida = MatchKashida.asInstanceOf[js.Any], MatchPhrase = MatchPhrase.asInstanceOf[js.Any], MatchPrefix = MatchPrefix.asInstanceOf[js.Any], MatchSoundsLike = MatchSoundsLike.asInstanceOf[js.Any], MatchSuffix = MatchSuffix.asInstanceOf[js.Any], MatchWholeWord = MatchWholeWord.asInstanceOf[js.Any], MatchWildcards = MatchWildcards.asInstanceOf[js.Any], NoProofing = NoProofing.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Replacement = Replacement.asInstanceOf[js.Any], SetAllFuzzyOptions = js.Any.fromFunction0(SetAllFuzzyOptions), Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Wrap = Wrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Find_typekey")(WordDotFind_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Find[TParent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Find[?], TParent] (val x: Self & Find[TParent]) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClearAllFuzzyOptions(value: () => Unit): Self = StObject.set(x, "ClearAllFuzzyOptions", js.Any.fromFunction0(value))
    
    inline def setClearFormatting(value: () => Unit): Self = StObject.set(x, "ClearFormatting", js.Any.fromFunction0(value))
    
    inline def setClearHitHighlight(value: () => Boolean): Self = StObject.set(x, "ClearHitHighlight", js.Any.fromFunction0(value))
    
    inline def setCorrectHangulEndings(value: Boolean): Self = StObject.set(x, "CorrectHangulEndings", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExecute(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean
    ): Self = StObject.set(x, "Execute", js.Any.fromFunction15(value))
    
    inline def setExecute2007(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean
    ): Self = StObject.set(x, "Execute2007", js.Any.fromFunction20(value))
    
    inline def setExecuteOld(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace]) => Boolean
    ): Self = StObject.set(x, "ExecuteOld", js.Any.fromFunction11(value))
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Boolean): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setForward(value: Boolean): Self = StObject.set(x, "Forward", value.asInstanceOf[js.Any])
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "Found", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: Frame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    inline def setHanjaPhoneticHangul(value: Boolean): Self = StObject.set(x, "HanjaPhoneticHangul", value.asInstanceOf[js.Any])
    
    inline def setHighlight(value: Double): Self = StObject.set(x, "Highlight", value.asInstanceOf[js.Any])
    
    inline def setHitHighlight(
      value: (Any, js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Boolean
    ): Self = StObject.set(x, "HitHighlight", js.Any.fromFunction20(value))
    
    inline def setIgnorePunct(value: Boolean): Self = StObject.set(x, "IgnorePunct", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSpace(value: Boolean): Self = StObject.set(x, "IgnoreSpace", value.asInstanceOf[js.Any])
    
    inline def setLanguageID(value: WdLanguageID): Self = StObject.set(x, "LanguageID", value.asInstanceOf[js.Any])
    
    inline def setLanguageIDFarEast(value: WdLanguageID): Self = StObject.set(x, "LanguageIDFarEast", value.asInstanceOf[js.Any])
    
    inline def setLanguageIDOther(value: WdLanguageID): Self = StObject.set(x, "LanguageIDOther", value.asInstanceOf[js.Any])
    
    inline def setMatchAlefHamza(value: Boolean): Self = StObject.set(x, "MatchAlefHamza", value.asInstanceOf[js.Any])
    
    inline def setMatchAllWordForms(value: Boolean): Self = StObject.set(x, "MatchAllWordForms", value.asInstanceOf[js.Any])
    
    inline def setMatchByte(value: Boolean): Self = StObject.set(x, "MatchByte", value.asInstanceOf[js.Any])
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "MatchCase", value.asInstanceOf[js.Any])
    
    inline def setMatchControl(value: Boolean): Self = StObject.set(x, "MatchControl", value.asInstanceOf[js.Any])
    
    inline def setMatchDiacritics(value: Boolean): Self = StObject.set(x, "MatchDiacritics", value.asInstanceOf[js.Any])
    
    inline def setMatchFuzzy(value: Boolean): Self = StObject.set(x, "MatchFuzzy", value.asInstanceOf[js.Any])
    
    inline def setMatchKashida(value: Boolean): Self = StObject.set(x, "MatchKashida", value.asInstanceOf[js.Any])
    
    inline def setMatchPhrase(value: Boolean): Self = StObject.set(x, "MatchPhrase", value.asInstanceOf[js.Any])
    
    inline def setMatchPrefix(value: Boolean): Self = StObject.set(x, "MatchPrefix", value.asInstanceOf[js.Any])
    
    inline def setMatchSoundsLike(value: Boolean): Self = StObject.set(x, "MatchSoundsLike", value.asInstanceOf[js.Any])
    
    inline def setMatchSuffix(value: Boolean): Self = StObject.set(x, "MatchSuffix", value.asInstanceOf[js.Any])
    
    inline def setMatchWholeWord(value: Boolean): Self = StObject.set(x, "MatchWholeWord", value.asInstanceOf[js.Any])
    
    inline def setMatchWildcards(value: Boolean): Self = StObject.set(x, "MatchWildcards", value.asInstanceOf[js.Any])
    
    inline def setNoProofing(value: Double): Self = StObject.set(x, "NoProofing", value.asInstanceOf[js.Any])
    
    inline def setParagraphFormat(value: ParagraphFormat): Self = StObject.set(x, "ParagraphFormat", value.asInstanceOf[js.Any])
    
    inline def setParent(value: TParent): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: Replacement): Self = StObject.set(x, "Replacement", value.asInstanceOf[js.Any])
    
    inline def setSetAllFuzzyOptions(value: () => Unit): Self = StObject.set(x, "SetAllFuzzyOptions", js.Any.fromFunction0(value))
    
    inline def setStyle(value: Any): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setWordDotFind_typekey(value: Find[Range | Selection]): Self = StObject.set(x, "Word.Find_typekey", value.asInstanceOf[js.Any])
    
    inline def setWrap(value: WdFindWrap): Self = StObject.set(x, "Wrap", value.asInstanceOf[js.Any])
  }
}
