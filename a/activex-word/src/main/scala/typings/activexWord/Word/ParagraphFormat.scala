package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphFormat extends js.Object {
  var AddSpaceBetweenFarEastAndAlpha: Double = js.native
  var AddSpaceBetweenFarEastAndDigit: Double = js.native
  var Alignment: WdParagraphAlignment = js.native
  val Application: typings.activexWord.Word.Application = js.native
  var AutoAdjustRightIndent: Double = js.native
  var BaseLineAlignment: WdBaselineAlignment = js.native
  var Borders: typings.activexWord.Word.Borders = js.native
  var CharacterUnitFirstLineIndent: Double = js.native
  var CharacterUnitLeftIndent: Double = js.native
  var CharacterUnitRightIndent: Double = js.native
  val Creator: Double = js.native
  var DisableLineHeightGrid: Double = js.native
  val Duplicate: ParagraphFormat = js.native
  var FarEastLineBreakControl: Double = js.native
  var FirstLineIndent: Double = js.native
  var HalfWidthPunctuationOnTopOfLine: Double = js.native
  var HangingPunctuation: Double = js.native
  var Hyphenation: Double = js.native
  var KeepTogether: Double = js.native
  var KeepWithNext: Double = js.native
  var LeftIndent: Double = js.native
  var LineSpacing: Double = js.native
  var LineSpacingRule: WdLineSpacing = js.native
  var LineUnitAfter: Double = js.native
  var LineUnitBefore: Double = js.native
  var MirrorIndents: Double = js.native
  var NoLineNumber: Double = js.native
  var OutlineLevel: WdOutlineLevel = js.native
  var PageBreakBefore: Double = js.native
  val Parent: js.Any = js.native
  var ReadingOrder: WdReadingOrder = js.native
  var RightIndent: Double = js.native
  val Shading: typings.activexWord.Word.Shading = js.native
  var SpaceAfter: Double = js.native
  var SpaceAfterAuto: Double = js.native
  var SpaceBefore: Double = js.native
  var SpaceBeforeAuto: Double = js.native
  var Style: js.Any = js.native
  var TabStops: typings.activexWord.Word.TabStops = js.native
  var TextboxTightWrap: WdTextboxTightWrap = js.native
  var WidowControl: Double = js.native
  @JSName("Word.ParagraphFormat_typekey")
  var WordDotParagraphFormat_typekey: ParagraphFormat = js.native
  var WordWrap: Double = js.native
  def CloseUp(): Unit = js.native
  def IndentCharWidth(Count: Double): Unit = js.native
  def IndentFirstLineCharWidth(Count: Double): Unit = js.native
  def OpenOrCloseUp(): Unit = js.native
  def OpenUp(): Unit = js.native
  def Reset(): Unit = js.native
  def Space1(): Unit = js.native
  def Space15(): Unit = js.native
  def Space2(): Unit = js.native
  def TabHangingIndent(Count: Double): Unit = js.native
  def TabIndent(Count: Double): Unit = js.native
}

object ParagraphFormat {
  @scala.inline
  def apply(
    AddSpaceBetweenFarEastAndAlpha: Double,
    AddSpaceBetweenFarEastAndDigit: Double,
    Alignment: WdParagraphAlignment,
    Application: Application,
    AutoAdjustRightIndent: Double,
    BaseLineAlignment: WdBaselineAlignment,
    Borders: Borders,
    CharacterUnitFirstLineIndent: Double,
    CharacterUnitLeftIndent: Double,
    CharacterUnitRightIndent: Double,
    CloseUp: () => Unit,
    Creator: Double,
    DisableLineHeightGrid: Double,
    Duplicate: ParagraphFormat,
    FarEastLineBreakControl: Double,
    FirstLineIndent: Double,
    HalfWidthPunctuationOnTopOfLine: Double,
    HangingPunctuation: Double,
    Hyphenation: Double,
    IndentCharWidth: Double => Unit,
    IndentFirstLineCharWidth: Double => Unit,
    KeepTogether: Double,
    KeepWithNext: Double,
    LeftIndent: Double,
    LineSpacing: Double,
    LineSpacingRule: WdLineSpacing,
    LineUnitAfter: Double,
    LineUnitBefore: Double,
    MirrorIndents: Double,
    NoLineNumber: Double,
    OpenOrCloseUp: () => Unit,
    OpenUp: () => Unit,
    OutlineLevel: WdOutlineLevel,
    PageBreakBefore: Double,
    Parent: js.Any,
    ReadingOrder: WdReadingOrder,
    Reset: () => Unit,
    RightIndent: Double,
    Shading: Shading,
    Space1: () => Unit,
    Space15: () => Unit,
    Space2: () => Unit,
    SpaceAfter: Double,
    SpaceAfterAuto: Double,
    SpaceBefore: Double,
    SpaceBeforeAuto: Double,
    Style: js.Any,
    TabHangingIndent: Double => Unit,
    TabIndent: Double => Unit,
    TabStops: TabStops,
    TextboxTightWrap: WdTextboxTightWrap,
    WidowControl: Double,
    WordDotParagraphFormat_typekey: ParagraphFormat,
    WordWrap: Double
  ): ParagraphFormat = {
    val __obj = js.Dynamic.literal(AddSpaceBetweenFarEastAndAlpha = AddSpaceBetweenFarEastAndAlpha.asInstanceOf[js.Any], AddSpaceBetweenFarEastAndDigit = AddSpaceBetweenFarEastAndDigit.asInstanceOf[js.Any], Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoAdjustRightIndent = AutoAdjustRightIndent.asInstanceOf[js.Any], BaseLineAlignment = BaseLineAlignment.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], CharacterUnitFirstLineIndent = CharacterUnitFirstLineIndent.asInstanceOf[js.Any], CharacterUnitLeftIndent = CharacterUnitLeftIndent.asInstanceOf[js.Any], CharacterUnitRightIndent = CharacterUnitRightIndent.asInstanceOf[js.Any], CloseUp = js.Any.fromFunction0(CloseUp), Creator = Creator.asInstanceOf[js.Any], DisableLineHeightGrid = DisableLineHeightGrid.asInstanceOf[js.Any], Duplicate = Duplicate.asInstanceOf[js.Any], FarEastLineBreakControl = FarEastLineBreakControl.asInstanceOf[js.Any], FirstLineIndent = FirstLineIndent.asInstanceOf[js.Any], HalfWidthPunctuationOnTopOfLine = HalfWidthPunctuationOnTopOfLine.asInstanceOf[js.Any], HangingPunctuation = HangingPunctuation.asInstanceOf[js.Any], Hyphenation = Hyphenation.asInstanceOf[js.Any], IndentCharWidth = js.Any.fromFunction1(IndentCharWidth), IndentFirstLineCharWidth = js.Any.fromFunction1(IndentFirstLineCharWidth), KeepTogether = KeepTogether.asInstanceOf[js.Any], KeepWithNext = KeepWithNext.asInstanceOf[js.Any], LeftIndent = LeftIndent.asInstanceOf[js.Any], LineSpacing = LineSpacing.asInstanceOf[js.Any], LineSpacingRule = LineSpacingRule.asInstanceOf[js.Any], LineUnitAfter = LineUnitAfter.asInstanceOf[js.Any], LineUnitBefore = LineUnitBefore.asInstanceOf[js.Any], MirrorIndents = MirrorIndents.asInstanceOf[js.Any], NoLineNumber = NoLineNumber.asInstanceOf[js.Any], OpenOrCloseUp = js.Any.fromFunction0(OpenOrCloseUp), OpenUp = js.Any.fromFunction0(OpenUp), OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageBreakBefore = PageBreakBefore.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadingOrder = ReadingOrder.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), RightIndent = RightIndent.asInstanceOf[js.Any], Shading = Shading.asInstanceOf[js.Any], Space1 = js.Any.fromFunction0(Space1), Space15 = js.Any.fromFunction0(Space15), Space2 = js.Any.fromFunction0(Space2), SpaceAfter = SpaceAfter.asInstanceOf[js.Any], SpaceAfterAuto = SpaceAfterAuto.asInstanceOf[js.Any], SpaceBefore = SpaceBefore.asInstanceOf[js.Any], SpaceBeforeAuto = SpaceBeforeAuto.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], TabHangingIndent = js.Any.fromFunction1(TabHangingIndent), TabIndent = js.Any.fromFunction1(TabIndent), TabStops = TabStops.asInstanceOf[js.Any], TextboxTightWrap = TextboxTightWrap.asInstanceOf[js.Any], WidowControl = WidowControl.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ParagraphFormat_typekey")(WordDotParagraphFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphFormat]
  }
  @scala.inline
  implicit class ParagraphFormatOps[Self <: ParagraphFormat] (val x: Self) extends AnyVal {
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
    def setAddSpaceBetweenFarEastAndAlpha(value: Double): Self = this.set("AddSpaceBetweenFarEastAndAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddSpaceBetweenFarEastAndDigit(value: Double): Self = this.set("AddSpaceBetweenFarEastAndDigit", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlignment(value: WdParagraphAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoAdjustRightIndent(value: Double): Self = this.set("AutoAdjustRightIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseLineAlignment(value: WdBaselineAlignment): Self = this.set("BaseLineAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorders(value: Borders): Self = this.set("Borders", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharacterUnitFirstLineIndent(value: Double): Self = this.set("CharacterUnitFirstLineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharacterUnitLeftIndent(value: Double): Self = this.set("CharacterUnitLeftIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharacterUnitRightIndent(value: Double): Self = this.set("CharacterUnitRightIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseUp(value: () => Unit): Self = this.set("CloseUp", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableLineHeightGrid(value: Double): Self = this.set("DisableLineHeightGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuplicate(value: ParagraphFormat): Self = this.set("Duplicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFarEastLineBreakControl(value: Double): Self = this.set("FarEastLineBreakControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstLineIndent(value: Double): Self = this.set("FirstLineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setHalfWidthPunctuationOnTopOfLine(value: Double): Self = this.set("HalfWidthPunctuationOnTopOfLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setHangingPunctuation(value: Double): Self = this.set("HangingPunctuation", value.asInstanceOf[js.Any])
    @scala.inline
    def setHyphenation(value: Double): Self = this.set("Hyphenation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndentCharWidth(value: Double => Unit): Self = this.set("IndentCharWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setIndentFirstLineCharWidth(value: Double => Unit): Self = this.set("IndentFirstLineCharWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setKeepTogether(value: Double): Self = this.set("KeepTogether", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepWithNext(value: Double): Self = this.set("KeepWithNext", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftIndent(value: Double): Self = this.set("LeftIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineSpacing(value: Double): Self = this.set("LineSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineSpacingRule(value: WdLineSpacing): Self = this.set("LineSpacingRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineUnitAfter(value: Double): Self = this.set("LineUnitAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineUnitBefore(value: Double): Self = this.set("LineUnitBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setMirrorIndents(value: Double): Self = this.set("MirrorIndents", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoLineNumber(value: Double): Self = this.set("NoLineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenOrCloseUp(value: () => Unit): Self = this.set("OpenOrCloseUp", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenUp(value: () => Unit): Self = this.set("OpenUp", js.Any.fromFunction0(value))
    @scala.inline
    def setOutlineLevel(value: WdOutlineLevel): Self = this.set("OutlineLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageBreakBefore(value: Double): Self = this.set("PageBreakBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadingOrder(value: WdReadingOrder): Self = this.set("ReadingOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("Reset", js.Any.fromFunction0(value))
    @scala.inline
    def setRightIndent(value: Double): Self = this.set("RightIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setShading(value: Shading): Self = this.set("Shading", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpace1(value: () => Unit): Self = this.set("Space1", js.Any.fromFunction0(value))
    @scala.inline
    def setSpace15(value: () => Unit): Self = this.set("Space15", js.Any.fromFunction0(value))
    @scala.inline
    def setSpace2(value: () => Unit): Self = this.set("Space2", js.Any.fromFunction0(value))
    @scala.inline
    def setSpaceAfter(value: Double): Self = this.set("SpaceAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpaceAfterAuto(value: Double): Self = this.set("SpaceAfterAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpaceBefore(value: Double): Self = this.set("SpaceBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpaceBeforeAuto(value: Double): Self = this.set("SpaceBeforeAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("Style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabHangingIndent(value: Double => Unit): Self = this.set("TabHangingIndent", js.Any.fromFunction1(value))
    @scala.inline
    def setTabIndent(value: Double => Unit): Self = this.set("TabIndent", js.Any.fromFunction1(value))
    @scala.inline
    def setTabStops(value: TabStops): Self = this.set("TabStops", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextboxTightWrap(value: WdTextboxTightWrap): Self = this.set("TextboxTightWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidowControl(value: Double): Self = this.set("WidowControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotParagraphFormat_typekey(value: ParagraphFormat): Self = this.set("Word.ParagraphFormat_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrap(value: Double): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
  }
  
}

