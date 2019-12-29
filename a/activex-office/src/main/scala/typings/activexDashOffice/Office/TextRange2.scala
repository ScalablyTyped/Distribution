package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.TextRange2")
@js.native
class TextRange2 protected () extends js.Object {
  val Application: js.Any = js.native
  val BoundHeight: Double = js.native
  val BoundLeft: Double = js.native
  val BoundTop: Double = js.native
  val BoundWidth: Double = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Font: Font2 = js.native
  var LanguageID: MsoLanguageID = js.native
  val Length: Double = js.native
  @JSName("Office.TextRange2_typekey")
  var OfficeDotTextRange2_typekey: TextRange2 = js.native
  val ParagraphFormat: ParagraphFormat2 = js.native
  val Parent: js.Any = js.native
  val Start: Double = js.native
  var Text: String = js.native
  def AddPeriods(): Unit = js.native
  def ChangeCase(Type: MsoTextChangeCase): Unit = js.native
  /**
    * @param Start [Start=-1]
    * @param Length [Length=-1]
    */
  def Characters(): TextRange2 = js.native
  def Characters(Start: Double): TextRange2 = js.native
  def Characters(Start: Double, Length: Double): TextRange2 = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  /**
    * @param After [After=0]
    * @param MatchCase [MatchCase=0]
    * @param WholeWords [WholeWords=0]
    */
  def Find(FindWhat: String): TextRange2 = js.native
  def Find(FindWhat: String, After: Double): TextRange2 = js.native
  def Find(FindWhat: String, After: Double, MatchCase: MsoTriState): TextRange2 = js.native
  def Find(FindWhat: String, After: Double, MatchCase: MsoTriState, WholeWords: MsoTriState): TextRange2 = js.native
  /** @param NewText [NewText=''] */
  def InsertAfter(): TextRange2 = js.native
  def InsertAfter(NewText: String): TextRange2 = js.native
  /** @param NewText [NewText=''] */
  def InsertBefore(): TextRange2 = js.native
  def InsertBefore(NewText: String): TextRange2 = js.native
  /**
    * @param Formula [Formula='']
    * @param Position [Position=-1]
    */
  def InsertChartField(ChartFieldType: MsoChartFieldType): TextRange2 = js.native
  def InsertChartField(ChartFieldType: MsoChartFieldType, Formula: String): TextRange2 = js.native
  def InsertChartField(ChartFieldType: MsoChartFieldType, Formula: String, Position: Double): TextRange2 = js.native
  /** @param Unicode [Unicode=0] */
  def InsertSymbol(FontName: String, CharNumber: Double): TextRange2 = js.native
  def InsertSymbol(FontName: String, CharNumber: Double, Unicode: MsoTriState): TextRange2 = js.native
  def Item(Index: Double): TextRange2 = js.native
  /**
    * @param Start [Start=-1]
    * @param Length [Length=-1]
    */
  def Lines(): TextRange2 = js.native
  def Lines(Start: Double): TextRange2 = js.native
  def Lines(Start: Double, Length: Double): TextRange2 = js.native
  def LtrRun(): Unit = js.native
  /**
    * @param Start [Start=-1]
    * @param Length [Length=-1]
    */
  def MathZones(): TextRange2 = js.native
  def MathZones(Start: Double): TextRange2 = js.native
  def MathZones(Start: Double, Length: Double): TextRange2 = js.native
  /**
    * @param Start [Start=-1]
    * @param Length [Length=-1]
    */
  def Paragraphs(): TextRange2 = js.native
  def Paragraphs(Start: Double): TextRange2 = js.native
  def Paragraphs(Start: Double, Length: Double): TextRange2 = js.native
  def Paste(): TextRange2 = js.native
  def PasteSpecial(Format: MsoClipboardFormat): TextRange2 = js.native
  def RemovePeriods(): Unit = js.native
  /**
    * @param After [After=0]
    * @param MatchCase [MatchCase=0]
    * @param WholeWords [WholeWords=0]
    */
  def Replace(FindWhat: String, ReplaceWhat: String): TextRange2 = js.native
  def Replace(FindWhat: String, ReplaceWhat: String, After: Double): TextRange2 = js.native
  def Replace(FindWhat: String, ReplaceWhat: String, After: Double, MatchCase: MsoTriState): TextRange2 = js.native
  def Replace(
    FindWhat: String,
    ReplaceWhat: String,
    After: Double,
    MatchCase: MsoTriState,
    WholeWords: MsoTriState
  ): TextRange2 = js.native
  def RotatedBounds(X1: Double, Y1: Double, X2: Double, Y2: Double, X3: Double, Y3: Double, x4: Double, y4: Double): Unit = js.native
  def RtlRun(): Unit = js.native
  /**
    * @param Start [Start=-1]
    * @param Length [Length=-1]
    */
  def Runs(): TextRange2 = js.native
  def Runs(Start: Double): TextRange2 = js.native
  def Runs(Start: Double, Length: Double): TextRange2 = js.native
  def Select(): Unit = js.native
  /**
    * @param Start [Start=-1]
    * @param Length [Length=-1]
    */
  def Sentences(): TextRange2 = js.native
  def Sentences(Start: Double): TextRange2 = js.native
  def Sentences(Start: Double, Length: Double): TextRange2 = js.native
  def TrimText(): TextRange2 = js.native
  /**
    * @param Start [Start=-1]
    * @param Length [Length=-1]
    */
  def Words(): TextRange2 = js.native
  def Words(Start: Double): TextRange2 = js.native
  def Words(Start: Double, Length: Double): TextRange2 = js.native
}

