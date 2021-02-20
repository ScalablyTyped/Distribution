package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Paragraph extends StObject {
  
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
  
  def CloseUp(): Unit = js.native
  
  val Creator: Double = js.native
  
  var DisableLineHeightGrid: Double = js.native
  
  val DropCap: typings.activexWord.Word.DropCap = js.native
  
  var FarEastLineBreakControl: Double = js.native
  
  var FirstLineIndent: Double = js.native
  
  var Format: ParagraphFormat = js.native
  
  var HalfWidthPunctuationOnTopOfLine: Double = js.native
  
  var HangingPunctuation: Double = js.native
  
  var Hyphenation: Double = js.native
  
  var ID: String = js.native
  
  def Indent(): Unit = js.native
  
  def IndentCharWidth(Count: Double): Unit = js.native
  
  def IndentFirstLineCharWidth(Count: Double): Unit = js.native
  
  val IsStyleSeparator: Boolean = js.native
  
  def JoinList(): Unit = js.native
  
  var KeepTogether: Double = js.native
  
  var KeepWithNext: Double = js.native
  
  var LeftIndent: Double = js.native
  
  var LineSpacing: Double = js.native
  
  var LineSpacingRule: WdLineSpacing = js.native
  
  var LineUnitAfter: Double = js.native
  
  var LineUnitBefore: Double = js.native
  
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
    Level1: js.UndefOr[Double],
    Level2: js.UndefOr[Double],
    Level3: js.UndefOr[Double],
    Level4: js.UndefOr[Double],
    Level5: js.UndefOr[Double],
    Level6: js.UndefOr[Double],
    Level7: js.UndefOr[Double],
    Level8: js.UndefOr[Double],
    Level9: js.UndefOr[Double]
  ): Unit = js.native
  
  def ListNumberOriginal(Level: Double): Double = js.native
  
  var MirrorIndents: Double = js.native
  
  def Next(): Paragraph = js.native
  def Next(Count: js.Any): Paragraph = js.native
  
  var NoLineNumber: Double = js.native
  
  def OpenOrCloseUp(): Unit = js.native
  
  def OpenUp(): Unit = js.native
  
  def Outdent(): Unit = js.native
  
  def OutlineDemote(): Unit = js.native
  
  def OutlineDemoteToBody(): Unit = js.native
  
  var OutlineLevel: WdOutlineLevel = js.native
  
  def OutlinePromote(): Unit = js.native
  
  var PageBreakBefore: Double = js.native
  
  val ParaID: Double = js.native
  
  val Parent: js.Any = js.native
  
  def Previous(): Paragraph = js.native
  def Previous(Count: js.Any): Paragraph = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  var ReadingOrder: WdReadingOrder = js.native
  
  def Reset(): Unit = js.native
  
  def ResetAdvanceTo(): Unit = js.native
  
  var RightIndent: Double = js.native
  
  def SelectNumber(): Unit = js.native
  
  def SeparateList(): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  def Space1(): Unit = js.native
  
  def Space15(): Unit = js.native
  
  def Space2(): Unit = js.native
  
  var SpaceAfter: Double = js.native
  
  var SpaceAfterAuto: Double = js.native
  
  var SpaceBefore: Double = js.native
  
  var SpaceBeforeAuto: Double = js.native
  
  var Style: js.Any = js.native
  
  def TabHangingIndent(Count: Double): Unit = js.native
  
  def TabIndent(Count: Double): Unit = js.native
  
  var TabStops: typings.activexWord.Word.TabStops = js.native
  
  val TextID: Double = js.native
  
  var TextboxTightWrap: WdTextboxTightWrap = js.native
  
  var WidowControl: Double = js.native
  
  @JSName("Word.Paragraph_typekey")
  var WordDotParagraph_typekey: Paragraph = js.native
  
  var WordWrap: Double = js.native
}
