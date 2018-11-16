package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Paragraph")
@js.native
class Paragraph protected () extends js.Object {
  var AddSpaceBetweenFarEastAndAlpha: scala.Double = js.native
  var AddSpaceBetweenFarEastAndDigit: scala.Double = js.native
  var Alignment: WdParagraphAlignment = js.native
  val Application: Application = js.native
  var AutoAdjustRightIndent: scala.Double = js.native
  var BaseLineAlignment: WdBaselineAlignment = js.native
  var Borders: Borders = js.native
  var CharacterUnitFirstLineIndent: scala.Double = js.native
  var CharacterUnitLeftIndent: scala.Double = js.native
  var CharacterUnitRightIndent: scala.Double = js.native
  val Creator: scala.Double = js.native
  var DisableLineHeightGrid: scala.Double = js.native
  val DropCap: DropCap = js.native
  var FarEastLineBreakControl: scala.Double = js.native
  var FirstLineIndent: scala.Double = js.native
  var Format: ParagraphFormat = js.native
  var HalfWidthPunctuationOnTopOfLine: scala.Double = js.native
  var HangingPunctuation: scala.Double = js.native
  var Hyphenation: scala.Double = js.native
  var ID: java.lang.String = js.native
  val IsStyleSeparator: scala.Boolean = js.native
  var KeepTogether: scala.Double = js.native
  var KeepWithNext: scala.Double = js.native
  var LeftIndent: scala.Double = js.native
  var LineSpacing: scala.Double = js.native
  var LineSpacingRule: WdLineSpacing = js.native
  var LineUnitAfter: scala.Double = js.native
  var LineUnitBefore: scala.Double = js.native
  var MirrorIndents: scala.Double = js.native
  var NoLineNumber: scala.Double = js.native
  var OutlineLevel: WdOutlineLevel = js.native
  var PageBreakBefore: scala.Double = js.native
  val ParaID: scala.Double = js.native
  val Parent: js.Any = js.native
  val Range: Range = js.native
  var ReadingOrder: WdReadingOrder = js.native
  var RightIndent: scala.Double = js.native
  val Shading: Shading = js.native
  var SpaceAfter: scala.Double = js.native
  var SpaceAfterAuto: scala.Double = js.native
  var SpaceBefore: scala.Double = js.native
  var SpaceBeforeAuto: scala.Double = js.native
  var Style: js.Any = js.native
  var TabStops: TabStops = js.native
  val TextID: scala.Double = js.native
  var TextboxTightWrap: WdTextboxTightWrap = js.native
  var WidowControl: scala.Double = js.native
  var `Word.Paragraph_typekey`: Paragraph = js.native
  var WordWrap: scala.Double = js.native
  def CloseUp(): scala.Unit = js.native
  def Indent(): scala.Unit = js.native
  def IndentCharWidth(Count: scala.Double): scala.Unit = js.native
  def IndentFirstLineCharWidth(Count: scala.Double): scala.Unit = js.native
  def JoinList(): scala.Unit = js.native
  /**
           * @param number [Level1=0]
           * @param number [Level2=0]
           * @param number [Level3=0]
           * @param number [Level4=0]
           * @param number [Level5=0]
           * @param number [Level6=0]
           * @param number [Level7=0]
           * @param number [Level8=0]
           * @param number [Level9=0]
           */
  def ListAdvanceTo(
    Level1: js.UndefOr[scala.Double],
    Level2: js.UndefOr[scala.Double],
    Level3: js.UndefOr[scala.Double],
    Level4: js.UndefOr[scala.Double],
    Level5: js.UndefOr[scala.Double],
    Level6: js.UndefOr[scala.Double],
    Level7: js.UndefOr[scala.Double],
    Level8: js.UndefOr[scala.Double],
    Level9: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
  def ListNumberOriginal(Level: scala.Double): scala.Double = js.native
  def Next(): Paragraph = js.native
  def Next(Count: js.Any): Paragraph = js.native
  def OpenOrCloseUp(): scala.Unit = js.native
  def OpenUp(): scala.Unit = js.native
  def Outdent(): scala.Unit = js.native
  def OutlineDemote(): scala.Unit = js.native
  def OutlineDemoteToBody(): scala.Unit = js.native
  def OutlinePromote(): scala.Unit = js.native
  def Previous(): Paragraph = js.native
  def Previous(Count: js.Any): Paragraph = js.native
  def Reset(): scala.Unit = js.native
  def ResetAdvanceTo(): scala.Unit = js.native
  def SelectNumber(): scala.Unit = js.native
  def SeparateList(): scala.Unit = js.native
  def Space1(): scala.Unit = js.native
  def Space15(): scala.Unit = js.native
  def Space2(): scala.Unit = js.native
  def TabHangingIndent(Count: scala.Double): scala.Unit = js.native
  def TabIndent(Count: scala.Double): scala.Unit = js.native
}

