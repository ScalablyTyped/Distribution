package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoLanguageID
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextRange extends js.Object {
  val ActionSettings: typings.activexPowerpoint.PowerPoint.ActionSettings = js.native
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val BoundHeight: Double = js.native
  val BoundLeft: Double = js.native
  val BoundTop: Double = js.native
  val BoundWidth: Double = js.native
  val Count: Double = js.native
  val Font: typings.activexPowerpoint.PowerPoint.Font = js.native
  var IndentLevel: Double = js.native
  var LanguageID: MsoLanguageID = js.native
  val Length: Double = js.native
  val ParagraphFormat: typings.activexPowerpoint.PowerPoint.ParagraphFormat = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.TextRange_typekey")
  var PowerPointDotTextRange_typekey: TextRange = js.native
  val Start: Double = js.native
  var Text: String = js.native
  def AddPeriods(): Unit = js.native
  def ChangeCase(Type: PpChangeCase): Unit = js.native
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Characters(): TextRange = js.native
  def Characters(Start: js.UndefOr[scala.Nothing], Length: Double): TextRange = js.native
  def Characters(Start: Double): TextRange = js.native
  def Characters(Start: Double, Length: Double): TextRange = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  /**
    * @param number [After=0]
    * @param Office.MsoTriState [MatchCase=0]
    * @param Office.MsoTriState [WholeWords=0]
    */
  def Find(FindWhat: String): TextRange = js.native
  def Find(
    FindWhat: String,
    After: js.UndefOr[scala.Nothing],
    MatchCase: js.UndefOr[scala.Nothing],
    WholeWords: MsoTriState
  ): TextRange = js.native
  def Find(FindWhat: String, After: js.UndefOr[scala.Nothing], MatchCase: MsoTriState): TextRange = js.native
  def Find(
    FindWhat: String,
    After: js.UndefOr[scala.Nothing],
    MatchCase: MsoTriState,
    WholeWords: MsoTriState
  ): TextRange = js.native
  def Find(FindWhat: String, After: Double): TextRange = js.native
  def Find(FindWhat: String, After: Double, MatchCase: js.UndefOr[scala.Nothing], WholeWords: MsoTriState): TextRange = js.native
  def Find(FindWhat: String, After: Double, MatchCase: MsoTriState): TextRange = js.native
  def Find(FindWhat: String, After: Double, MatchCase: MsoTriState, WholeWords: MsoTriState): TextRange = js.native
  /** @param string [NewText=''] */
  def InsertAfter(): TextRange = js.native
  def InsertAfter(NewText: String): TextRange = js.native
  /** @param string [NewText=''] */
  def InsertBefore(): TextRange = js.native
  def InsertBefore(NewText: String): TextRange = js.native
  /** @param Office.MsoTriState [InsertAsField=0] */
  def InsertDateTime(DateTimeFormat: PpDateTimeFormat): TextRange = js.native
  def InsertDateTime(DateTimeFormat: PpDateTimeFormat, InsertAsField: MsoTriState): TextRange = js.native
  def InsertSlideNumber(): TextRange = js.native
  /** @param Office.MsoTriState [Unicode=0] */
  def InsertSymbol(FontName: String, CharNumber: Double): TextRange = js.native
  def InsertSymbol(FontName: String, CharNumber: Double, Unicode: MsoTriState): TextRange = js.native
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Lines(): TextRange = js.native
  def Lines(Start: js.UndefOr[scala.Nothing], Length: Double): TextRange = js.native
  def Lines(Start: Double): TextRange = js.native
  def Lines(Start: Double, Length: Double): TextRange = js.native
  def LtrRun(): Unit = js.native
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Paragraphs(): TextRange = js.native
  def Paragraphs(Start: js.UndefOr[scala.Nothing], Length: Double): TextRange = js.native
  def Paragraphs(Start: Double): TextRange = js.native
  def Paragraphs(Start: Double, Length: Double): TextRange = js.native
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
    DisplayAsIcon: js.UndefOr[MsoTriState],
    IconFileName: js.UndefOr[String],
    IconIndex: js.UndefOr[Double],
    IconLabel: js.UndefOr[String],
    Link: js.UndefOr[MsoTriState]
  ): TextRange = js.native
  def RemovePeriods(): Unit = js.native
  /**
    * @param number [After=0]
    * @param Office.MsoTriState [MatchCase=0]
    * @param Office.MsoTriState [WholeWords=0]
    */
  def Replace(FindWhat: String, ReplaceWhat: String): TextRange = js.native
  def Replace(
    FindWhat: String,
    ReplaceWhat: String,
    After: js.UndefOr[scala.Nothing],
    MatchCase: js.UndefOr[scala.Nothing],
    WholeWords: MsoTriState
  ): TextRange = js.native
  def Replace(FindWhat: String, ReplaceWhat: String, After: js.UndefOr[scala.Nothing], MatchCase: MsoTriState): TextRange = js.native
  def Replace(
    FindWhat: String,
    ReplaceWhat: String,
    After: js.UndefOr[scala.Nothing],
    MatchCase: MsoTriState,
    WholeWords: MsoTriState
  ): TextRange = js.native
  def Replace(FindWhat: String, ReplaceWhat: String, After: Double): TextRange = js.native
  def Replace(
    FindWhat: String,
    ReplaceWhat: String,
    After: Double,
    MatchCase: js.UndefOr[scala.Nothing],
    WholeWords: MsoTriState
  ): TextRange = js.native
  def Replace(FindWhat: String, ReplaceWhat: String, After: Double, MatchCase: MsoTriState): TextRange = js.native
  def Replace(
    FindWhat: String,
    ReplaceWhat: String,
    After: Double,
    MatchCase: MsoTriState,
    WholeWords: MsoTriState
  ): TextRange = js.native
  def RotatedBounds(X1: Double, Y1: Double, X2: Double, Y2: Double, X3: Double, Y3: Double, x4: Double, y4: Double): Unit = js.native
  def RtlRun(): Unit = js.native
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Runs(): TextRange = js.native
  def Runs(Start: js.UndefOr[scala.Nothing], Length: Double): TextRange = js.native
  def Runs(Start: Double): TextRange = js.native
  def Runs(Start: Double, Length: Double): TextRange = js.native
  def Select(): Unit = js.native
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Sentences(): TextRange = js.native
  def Sentences(Start: js.UndefOr[scala.Nothing], Length: Double): TextRange = js.native
  def Sentences(Start: Double): TextRange = js.native
  def Sentences(Start: Double, Length: Double): TextRange = js.native
  def TrimText(): TextRange = js.native
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Words(): TextRange = js.native
  def Words(Start: js.UndefOr[scala.Nothing], Length: Double): TextRange = js.native
  def Words(Start: Double): TextRange = js.native
  def Words(Start: Double, Length: Double): TextRange = js.native
}

