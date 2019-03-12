package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TextRange")
@js.native
class TextRange protected () extends js.Object {
  val ActionSettings: activexDashPowerpointLib.PowerPointNs.ActionSettings = js.native
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val BoundHeight: scala.Double = js.native
  val BoundLeft: scala.Double = js.native
  val BoundTop: scala.Double = js.native
  val BoundWidth: scala.Double = js.native
  val Count: scala.Double = js.native
  val Font: activexDashPowerpointLib.PowerPointNs.Font = js.native
  var IndentLevel: scala.Double = js.native
  var LanguageID: activexDashOfficeLib.OfficeNs.MsoLanguageID = js.native
  val Length: scala.Double = js.native
  val ParagraphFormat: activexDashPowerpointLib.PowerPointNs.ParagraphFormat = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.TextRange_typekey`: TextRange = js.native
  val Start: scala.Double = js.native
  var Text: java.lang.String = js.native
  def AddPeriods(): scala.Unit = js.native
  def ChangeCase(Type: PpChangeCase): scala.Unit = js.native
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Characters(): TextRange = js.native
  def Characters(Start: scala.Double): TextRange = js.native
  def Characters(Start: scala.Double, Length: scala.Double): TextRange = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  /**
    * @param number [After=0]
    * @param Office.MsoTriState [MatchCase=0]
    * @param Office.MsoTriState [WholeWords=0]
    */
  def Find(FindWhat: java.lang.String): TextRange = js.native
  def Find(FindWhat: java.lang.String, After: scala.Double): TextRange = js.native
  def Find(
    FindWhat: java.lang.String,
    After: scala.Double,
    MatchCase: activexDashOfficeLib.OfficeNs.MsoTriState
  ): TextRange = js.native
  def Find(
    FindWhat: java.lang.String,
    After: scala.Double,
    MatchCase: activexDashOfficeLib.OfficeNs.MsoTriState,
    WholeWords: activexDashOfficeLib.OfficeNs.MsoTriState
  ): TextRange = js.native
  /** @param string [NewText=''] */
  def InsertAfter(): TextRange = js.native
  def InsertAfter(NewText: java.lang.String): TextRange = js.native
  /** @param string [NewText=''] */
  def InsertBefore(): TextRange = js.native
  def InsertBefore(NewText: java.lang.String): TextRange = js.native
  /** @param Office.MsoTriState [InsertAsField=0] */
  def InsertDateTime(DateTimeFormat: PpDateTimeFormat): TextRange = js.native
  def InsertDateTime(DateTimeFormat: PpDateTimeFormat, InsertAsField: activexDashOfficeLib.OfficeNs.MsoTriState): TextRange = js.native
  def InsertSlideNumber(): TextRange = js.native
  /** @param Office.MsoTriState [Unicode=0] */
  def InsertSymbol(FontName: java.lang.String, CharNumber: scala.Double): TextRange = js.native
  def InsertSymbol(
    FontName: java.lang.String,
    CharNumber: scala.Double,
    Unicode: activexDashOfficeLib.OfficeNs.MsoTriState
  ): TextRange = js.native
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Lines(): TextRange = js.native
  def Lines(Start: scala.Double): TextRange = js.native
  def Lines(Start: scala.Double, Length: scala.Double): TextRange = js.native
  def LtrRun(): scala.Unit = js.native
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Paragraphs(): TextRange = js.native
  def Paragraphs(Start: scala.Double): TextRange = js.native
  def Paragraphs(Start: scala.Double, Length: scala.Double): TextRange = js.native
  def Paste(): TextRange = js.native
  /**
    * @param PowerPoint.PpPasteDataType [DataType=0]
    * @param Office.MsoTriState [DisplayAsIcon=0]
    * @param string [IconFileName='']
    * @param number [IconIndex=0]
    * @param string [IconLabel='']
    * @param Office.MsoTriState [Link=0]
    */
  def PasteSpecial(
    DataType: js.UndefOr[PpPasteDataType],
    DisplayAsIcon: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState],
    IconFileName: js.UndefOr[java.lang.String],
    IconIndex: js.UndefOr[scala.Double],
    IconLabel: js.UndefOr[java.lang.String],
    Link: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState]
  ): TextRange = js.native
  def RemovePeriods(): scala.Unit = js.native
  /**
    * @param number [After=0]
    * @param Office.MsoTriState [MatchCase=0]
    * @param Office.MsoTriState [WholeWords=0]
    */
  def Replace(FindWhat: java.lang.String, ReplaceWhat: java.lang.String): TextRange = js.native
  def Replace(FindWhat: java.lang.String, ReplaceWhat: java.lang.String, After: scala.Double): TextRange = js.native
  def Replace(
    FindWhat: java.lang.String,
    ReplaceWhat: java.lang.String,
    After: scala.Double,
    MatchCase: activexDashOfficeLib.OfficeNs.MsoTriState
  ): TextRange = js.native
  def Replace(
    FindWhat: java.lang.String,
    ReplaceWhat: java.lang.String,
    After: scala.Double,
    MatchCase: activexDashOfficeLib.OfficeNs.MsoTriState,
    WholeWords: activexDashOfficeLib.OfficeNs.MsoTriState
  ): TextRange = js.native
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
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Runs(): TextRange = js.native
  def Runs(Start: scala.Double): TextRange = js.native
  def Runs(Start: scala.Double, Length: scala.Double): TextRange = js.native
  def Select(): scala.Unit = js.native
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Sentences(): TextRange = js.native
  def Sentences(Start: scala.Double): TextRange = js.native
  def Sentences(Start: scala.Double, Length: scala.Double): TextRange = js.native
  def TrimText(): TextRange = js.native
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Words(): TextRange = js.native
  def Words(Start: scala.Double): TextRange = js.native
  def Words(Start: scala.Double, Length: scala.Double): TextRange = js.native
}

