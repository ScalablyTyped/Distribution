package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Paragraphs")
@js.native
class Paragraphs protected () extends js.Object {
  var AddSpaceBetweenFarEastAndAlpha: scala.Double = js.native
  var AddSpaceBetweenFarEastAndDigit: scala.Double = js.native
  var Alignment: WdParagraphAlignment = js.native
  val Application: activexDashWordLib.WordNs.Application = js.native
  var AutoAdjustRightIndent: scala.Double = js.native
  var BaseLineAlignment: WdBaselineAlignment = js.native
  var Borders: activexDashWordLib.WordNs.Borders = js.native
  var CharacterUnitFirstLineIndent: scala.Double = js.native
  var CharacterUnitLeftIndent: scala.Double = js.native
  var CharacterUnitRightIndent: scala.Double = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var DisableLineHeightGrid: scala.Double = js.native
  var FarEastLineBreakControl: scala.Double = js.native
  val First: Paragraph = js.native
  var FirstLineIndent: scala.Double = js.native
  var Format: ParagraphFormat = js.native
  var HalfWidthPunctuationOnTopOfLine: scala.Double = js.native
  var HangingPunctuation: scala.Double = js.native
  var Hyphenation: scala.Double = js.native
  var KeepTogether: scala.Double = js.native
  var KeepWithNext: scala.Double = js.native
  val Last: Paragraph = js.native
  var LeftIndent: scala.Double = js.native
  var LineSpacing: scala.Double = js.native
  var LineSpacingRule: WdLineSpacing = js.native
  var LineUnitAfter: scala.Double = js.native
  var LineUnitBefore: scala.Double = js.native
  var NoLineNumber: scala.Double = js.native
  var OutlineLevel: WdOutlineLevel = js.native
  var PageBreakBefore: scala.Double = js.native
  val Parent: js.Any = js.native
  var ReadingOrder: WdReadingOrder = js.native
  var RightIndent: scala.Double = js.native
  val Shading: activexDashWordLib.WordNs.Shading = js.native
  var SpaceAfter: scala.Double = js.native
  var SpaceAfterAuto: scala.Double = js.native
  var SpaceBefore: scala.Double = js.native
  var SpaceBeforeAuto: scala.Double = js.native
  var Style: js.Any = js.native
  var TabStops: activexDashWordLib.WordNs.TabStops = js.native
  var WidowControl: scala.Double = js.native
  var `Word.Paragraphs_typekey`: Paragraphs = js.native
  var WordWrap: scala.Double = js.native
  def Add(): Paragraph = js.native
  def Add(Range: js.Any): Paragraph = js.native
  def CloseUp(): scala.Unit = js.native
  def DecreaseSpacing(): scala.Unit = js.native
  def IncreaseSpacing(): scala.Unit = js.native
  def Indent(): scala.Unit = js.native
  def IndentCharWidth(Count: scala.Double): scala.Unit = js.native
  def IndentFirstLineCharWidth(Count: scala.Double): scala.Unit = js.native
  def Item(Index: scala.Double): Paragraph = js.native
  def OpenOrCloseUp(): scala.Unit = js.native
  def OpenUp(): scala.Unit = js.native
  def Outdent(): scala.Unit = js.native
  def OutlineDemote(): scala.Unit = js.native
  def OutlineDemoteToBody(): scala.Unit = js.native
  def OutlinePromote(): scala.Unit = js.native
  def Reset(): scala.Unit = js.native
  def Space1(): scala.Unit = js.native
  def Space15(): scala.Unit = js.native
  def Space2(): scala.Unit = js.native
  def TabHangingIndent(Count: scala.Double): scala.Unit = js.native
  def TabIndent(Count: scala.Double): scala.Unit = js.native
}

