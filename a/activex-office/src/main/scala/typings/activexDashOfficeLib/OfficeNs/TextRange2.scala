package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.TextRange2")
@js.native
class TextRange2 protected () extends js.Object {
  val Application: js.Any = js.native
  val BoundHeight: scala.Double = js.native
  val BoundLeft: scala.Double = js.native
  val BoundTop: scala.Double = js.native
  val BoundWidth: scala.Double = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Font: Font2 = js.native
  var LanguageID: MsoLanguageID = js.native
  val Length: scala.Double = js.native
  var `Office.TextRange2_typekey`: TextRange2 = js.native
  val ParagraphFormat: ParagraphFormat2 = js.native
  val Parent: js.Any = js.native
  val Start: scala.Double = js.native
  var Text: java.lang.String = js.native
  def AddPeriods(): scala.Unit = js.native
  def ChangeCase(Type: MsoTextChangeCase): scala.Unit = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Characters(): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Characters(Start: scala.Double): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Characters(Start: scala.Double, Length: scala.Double): TextRange2 = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  /**
           * @param After [After=0]
           * @param MatchCase [MatchCase=0]
           * @param WholeWords [WholeWords=0]
           */
  def Find(FindWhat: java.lang.String): TextRange2 = js.native
  /**
           * @param After [After=0]
           * @param MatchCase [MatchCase=0]
           * @param WholeWords [WholeWords=0]
           */
  def Find(FindWhat: java.lang.String, After: scala.Double): TextRange2 = js.native
  /**
           * @param After [After=0]
           * @param MatchCase [MatchCase=0]
           * @param WholeWords [WholeWords=0]
           */
  def Find(FindWhat: java.lang.String, After: scala.Double, MatchCase: MsoTriState): TextRange2 = js.native
  /**
           * @param After [After=0]
           * @param MatchCase [MatchCase=0]
           * @param WholeWords [WholeWords=0]
           */
  def Find(FindWhat: java.lang.String, After: scala.Double, MatchCase: MsoTriState, WholeWords: MsoTriState): TextRange2 = js.native
  /** @param NewText [NewText=''] */
  def InsertAfter(): TextRange2 = js.native
  /** @param NewText [NewText=''] */
  def InsertAfter(NewText: java.lang.String): TextRange2 = js.native
  /** @param NewText [NewText=''] */
  def InsertBefore(): TextRange2 = js.native
  /** @param NewText [NewText=''] */
  def InsertBefore(NewText: java.lang.String): TextRange2 = js.native
  /**
           * @param Formula [Formula='']
           * @param Position [Position=-1]
           */
  def InsertChartField(ChartFieldType: MsoChartFieldType): TextRange2 = js.native
  /**
           * @param Formula [Formula='']
           * @param Position [Position=-1]
           */
  def InsertChartField(ChartFieldType: MsoChartFieldType, Formula: java.lang.String): TextRange2 = js.native
  /**
           * @param Formula [Formula='']
           * @param Position [Position=-1]
           */
  def InsertChartField(ChartFieldType: MsoChartFieldType, Formula: java.lang.String, Position: scala.Double): TextRange2 = js.native
  /** @param Unicode [Unicode=0] */
  def InsertSymbol(FontName: java.lang.String, CharNumber: scala.Double): TextRange2 = js.native
  /** @param Unicode [Unicode=0] */
  def InsertSymbol(FontName: java.lang.String, CharNumber: scala.Double, Unicode: MsoTriState): TextRange2 = js.native
  def Item(Index: scala.Double): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Lines(): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Lines(Start: scala.Double): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Lines(Start: scala.Double, Length: scala.Double): TextRange2 = js.native
  def LtrRun(): scala.Unit = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def MathZones(): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def MathZones(Start: scala.Double): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def MathZones(Start: scala.Double, Length: scala.Double): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Paragraphs(): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Paragraphs(Start: scala.Double): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Paragraphs(Start: scala.Double, Length: scala.Double): TextRange2 = js.native
  def Paste(): TextRange2 = js.native
  def PasteSpecial(Format: MsoClipboardFormat): TextRange2 = js.native
  def RemovePeriods(): scala.Unit = js.native
  /**
           * @param After [After=0]
           * @param MatchCase [MatchCase=0]
           * @param WholeWords [WholeWords=0]
           */
  def Replace(FindWhat: java.lang.String, ReplaceWhat: java.lang.String): TextRange2 = js.native
  /**
           * @param After [After=0]
           * @param MatchCase [MatchCase=0]
           * @param WholeWords [WholeWords=0]
           */
  def Replace(FindWhat: java.lang.String, ReplaceWhat: java.lang.String, After: scala.Double): TextRange2 = js.native
  /**
           * @param After [After=0]
           * @param MatchCase [MatchCase=0]
           * @param WholeWords [WholeWords=0]
           */
  def Replace(
    FindWhat: java.lang.String,
    ReplaceWhat: java.lang.String,
    After: scala.Double,
    MatchCase: MsoTriState
  ): TextRange2 = js.native
  /**
           * @param After [After=0]
           * @param MatchCase [MatchCase=0]
           * @param WholeWords [WholeWords=0]
           */
  def Replace(
    FindWhat: java.lang.String,
    ReplaceWhat: java.lang.String,
    After: scala.Double,
    MatchCase: MsoTriState,
    WholeWords: MsoTriState
  ): TextRange2 = js.native
  def RotatedBounds(
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double,
    X3: scala.Double,
    Y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double
  ): scala.Unit = js.native
  def RtlRun(): scala.Unit = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Runs(): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Runs(Start: scala.Double): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Runs(Start: scala.Double, Length: scala.Double): TextRange2 = js.native
  def Select(): scala.Unit = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Sentences(): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Sentences(Start: scala.Double): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Sentences(Start: scala.Double, Length: scala.Double): TextRange2 = js.native
  def TrimText(): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Words(): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Words(Start: scala.Double): TextRange2 = js.native
  /**
           * @param Start [Start=-1]
           * @param Length [Length=-1]
           */
  def Words(Start: scala.Double, Length: scala.Double): TextRange2 = js.native
}

