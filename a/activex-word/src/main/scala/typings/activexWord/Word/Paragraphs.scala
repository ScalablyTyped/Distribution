package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Paragraphs")
@js.native
class Paragraphs protected () extends js.Object {
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
  val Count: Double = js.native
  val Creator: Double = js.native
  var DisableLineHeightGrid: Double = js.native
  var FarEastLineBreakControl: Double = js.native
  val First: Paragraph = js.native
  var FirstLineIndent: Double = js.native
  var Format: ParagraphFormat = js.native
  var HalfWidthPunctuationOnTopOfLine: Double = js.native
  var HangingPunctuation: Double = js.native
  var Hyphenation: Double = js.native
  var KeepTogether: Double = js.native
  var KeepWithNext: Double = js.native
  val Last: Paragraph = js.native
  var LeftIndent: Double = js.native
  var LineSpacing: Double = js.native
  var LineSpacingRule: WdLineSpacing = js.native
  var LineUnitAfter: Double = js.native
  var LineUnitBefore: Double = js.native
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
  var WidowControl: Double = js.native
  @JSName("Word.Paragraphs_typekey")
  var WordDotParagraphs_typekey: Paragraphs = js.native
  var WordWrap: Double = js.native
  def Add(): Paragraph = js.native
  def Add(Range: js.Any): Paragraph = js.native
  def CloseUp(): Unit = js.native
  def DecreaseSpacing(): Unit = js.native
  def IncreaseSpacing(): Unit = js.native
  def Indent(): Unit = js.native
  def IndentCharWidth(Count: Double): Unit = js.native
  def IndentFirstLineCharWidth(Count: Double): Unit = js.native
  def Item(Index: Double): Paragraph = js.native
  def OpenOrCloseUp(): Unit = js.native
  def OpenUp(): Unit = js.native
  def Outdent(): Unit = js.native
  def OutlineDemote(): Unit = js.native
  def OutlineDemoteToBody(): Unit = js.native
  def OutlinePromote(): Unit = js.native
  def Reset(): Unit = js.native
  def Space1(): Unit = js.native
  def Space15(): Unit = js.native
  def Space2(): Unit = js.native
  def TabHangingIndent(Count: Double): Unit = js.native
  def TabIndent(Count: Double): Unit = js.native
}

