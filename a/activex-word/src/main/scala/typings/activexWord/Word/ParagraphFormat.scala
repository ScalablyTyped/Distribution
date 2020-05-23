package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphFormat extends js.Object {
  var AddSpaceBetweenFarEastAndAlpha: Double
  var AddSpaceBetweenFarEastAndDigit: Double
  var Alignment: WdParagraphAlignment
  val Application: typings.activexWord.Word.Application
  var AutoAdjustRightIndent: Double
  var BaseLineAlignment: WdBaselineAlignment
  var Borders: typings.activexWord.Word.Borders
  var CharacterUnitFirstLineIndent: Double
  var CharacterUnitLeftIndent: Double
  var CharacterUnitRightIndent: Double
  val Creator: Double
  var DisableLineHeightGrid: Double
  val Duplicate: ParagraphFormat
  var FarEastLineBreakControl: Double
  var FirstLineIndent: Double
  var HalfWidthPunctuationOnTopOfLine: Double
  var HangingPunctuation: Double
  var Hyphenation: Double
  var KeepTogether: Double
  var KeepWithNext: Double
  var LeftIndent: Double
  var LineSpacing: Double
  var LineSpacingRule: WdLineSpacing
  var LineUnitAfter: Double
  var LineUnitBefore: Double
  var MirrorIndents: Double
  var NoLineNumber: Double
  var OutlineLevel: WdOutlineLevel
  var PageBreakBefore: Double
  val Parent: js.Any
  var ReadingOrder: WdReadingOrder
  var RightIndent: Double
  val Shading: typings.activexWord.Word.Shading
  var SpaceAfter: Double
  var SpaceAfterAuto: Double
  var SpaceBefore: Double
  var SpaceBeforeAuto: Double
  var Style: js.Any
  var TabStops: typings.activexWord.Word.TabStops
  var TextboxTightWrap: WdTextboxTightWrap
  var WidowControl: Double
  @JSName("Word.ParagraphFormat_typekey")
  var WordDotParagraphFormat_typekey: ParagraphFormat
  var WordWrap: Double
  def CloseUp(): Unit
  def IndentCharWidth(Count: Double): Unit
  def IndentFirstLineCharWidth(Count: Double): Unit
  def OpenOrCloseUp(): Unit
  def OpenUp(): Unit
  def Reset(): Unit
  def Space1(): Unit
  def Space15(): Unit
  def Space2(): Unit
  def TabHangingIndent(Count: Double): Unit
  def TabIndent(Count: Double): Unit
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
}

