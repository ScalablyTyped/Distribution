package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ParagraphFormat")
@js.native
class ParagraphFormat protected () extends js.Object {
  var AddSpaceBetweenFarEastAndAlpha: Double = js.native
  var AddSpaceBetweenFarEastAndDigit: Double = js.native
  var Alignment: WdParagraphAlignment = js.native
  val Application: typings.activexDashWord.Word.Application = js.native
  var AutoAdjustRightIndent: Double = js.native
  var BaseLineAlignment: WdBaselineAlignment = js.native
  var Borders: typings.activexDashWord.Word.Borders = js.native
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
  val Shading: typings.activexDashWord.Word.Shading = js.native
  var SpaceAfter: Double = js.native
  var SpaceAfterAuto: Double = js.native
  var SpaceBefore: Double = js.native
  var SpaceBeforeAuto: Double = js.native
  var Style: js.Any = js.native
  var TabStops: typings.activexDashWord.Word.TabStops = js.native
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

