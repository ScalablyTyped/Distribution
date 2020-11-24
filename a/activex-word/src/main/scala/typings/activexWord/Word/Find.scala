package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Find[TParent] extends js.Object {
  
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
  implicit class FindOps[Self <: Find[_], TParent] (val x: Self with Find[TParent]) extends AnyVal {
    
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
    def setClearAllFuzzyOptions(value: () => Unit): Self = this.set("ClearAllFuzzyOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearFormatting(value: () => Unit): Self = this.set("ClearFormatting", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearHitHighlight(value: () => Boolean): Self = this.set("ClearHitHighlight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCorrectHangulEndings(value: Boolean): Self = this.set("CorrectHangulEndings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean
    ): Self = this.set("Execute", js.Any.fromFunction15(value))
    
    @scala.inline
    def setExecute2007(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean
    ): Self = this.set("Execute2007", js.Any.fromFunction20(value))
    
    @scala.inline
    def setExecuteOld(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace]) => Boolean
    ): Self = this.set("ExecuteOld", js.Any.fromFunction11(value))
    
    @scala.inline
    def setFont(value: Font): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Boolean): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: Boolean): Self = this.set("Forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFound(value: Boolean): Self = this.set("Found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: Frame): Self = this.set("Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHanjaPhoneticHangul(value: Boolean): Self = this.set("HanjaPhoneticHangul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight(value: Double): Self = this.set("Highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitHighlight(
      value: (js.Any, js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Boolean
    ): Self = this.set("HitHighlight", js.Any.fromFunction20(value))
    
    @scala.inline
    def setIgnorePunct(value: Boolean): Self = this.set("IgnorePunct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSpace(value: Boolean): Self = this.set("IgnoreSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageID(value: WdLanguageID): Self = this.set("LanguageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageIDFarEast(value: WdLanguageID): Self = this.set("LanguageIDFarEast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageIDOther(value: WdLanguageID): Self = this.set("LanguageIDOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchAlefHamza(value: Boolean): Self = this.set("MatchAlefHamza", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchAllWordForms(value: Boolean): Self = this.set("MatchAllWordForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchByte(value: Boolean): Self = this.set("MatchByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("MatchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchControl(value: Boolean): Self = this.set("MatchControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchDiacritics(value: Boolean): Self = this.set("MatchDiacritics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchFuzzy(value: Boolean): Self = this.set("MatchFuzzy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchKashida(value: Boolean): Self = this.set("MatchKashida", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPhrase(value: Boolean): Self = this.set("MatchPhrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPrefix(value: Boolean): Self = this.set("MatchPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchSoundsLike(value: Boolean): Self = this.set("MatchSoundsLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchSuffix(value: Boolean): Self = this.set("MatchSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchWholeWord(value: Boolean): Self = this.set("MatchWholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchWildcards(value: Boolean): Self = this.set("MatchWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoProofing(value: Double): Self = this.set("NoProofing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphFormat(value: ParagraphFormat): Self = this.set("ParagraphFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: TParent): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacement(value: Replacement): Self = this.set("Replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAllFuzzyOptions(value: () => Unit): Self = this.set("SetAllFuzzyOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFind_typekey(value: Find[Range | Selection]): Self = this.set("Word.Find_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrap(value: WdFindWrap): Self = this.set("Wrap", value.asInstanceOf[js.Any])
  }
}
