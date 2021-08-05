package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoLanguageID
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextRange extends StObject {
  
  val ActionSettings: typings.activexPowerpoint.PowerPoint.ActionSettings = js.native
  
  def AddPeriods(): Unit = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val BoundHeight: Double = js.native
  
  val BoundLeft: Double = js.native
  
  val BoundTop: Double = js.native
  
  val BoundWidth: Double = js.native
  
  def ChangeCase(Type: PpChangeCase): Unit = js.native
  
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Characters(): TextRange = js.native
  def Characters(Start: Double): TextRange = js.native
  def Characters(Start: Double, Length: Double): TextRange = js.native
  def Characters(Start: Unit, Length: Double): TextRange = js.native
  
  def Copy(): Unit = js.native
  
  val Count: Double = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
  /**
    * @param number [After=0]
    * @param Office.MsoTriState [MatchCase=0]
    * @param Office.MsoTriState [WholeWords=0]
    */
  def Find(FindWhat: String): TextRange = js.native
  def Find(FindWhat: String, After: Double): TextRange = js.native
  def Find(FindWhat: String, After: Double, MatchCase: Unit, WholeWords: MsoTriState): TextRange = js.native
  def Find(FindWhat: String, After: Double, MatchCase: MsoTriState): TextRange = js.native
  def Find(FindWhat: String, After: Double, MatchCase: MsoTriState, WholeWords: MsoTriState): TextRange = js.native
  def Find(FindWhat: String, After: Unit, MatchCase: Unit, WholeWords: MsoTriState): TextRange = js.native
  def Find(FindWhat: String, After: Unit, MatchCase: MsoTriState): TextRange = js.native
  def Find(FindWhat: String, After: Unit, MatchCase: MsoTriState, WholeWords: MsoTriState): TextRange = js.native
  
  val Font: typings.activexPowerpoint.PowerPoint.Font = js.native
  
  var IndentLevel: Double = js.native
  
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
  
  var LanguageID: MsoLanguageID = js.native
  
  val Length: Double = js.native
  
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Lines(): TextRange = js.native
  def Lines(Start: Double): TextRange = js.native
  def Lines(Start: Double, Length: Double): TextRange = js.native
  def Lines(Start: Unit, Length: Double): TextRange = js.native
  
  def LtrRun(): Unit = js.native
  
  val ParagraphFormat: typings.activexPowerpoint.PowerPoint.ParagraphFormat = js.native
  
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Paragraphs(): TextRange = js.native
  def Paragraphs(Start: Double): TextRange = js.native
  def Paragraphs(Start: Double, Length: Double): TextRange = js.native
  def Paragraphs(Start: Unit, Length: Double): TextRange = js.native
  
  val Parent: js.Any = js.native
  
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
  
  /* private */ @JSName("PowerPoint.TextRange_typekey")
  var PowerPointDotTextRange_typekey: TextRange = js.native
  
  def RemovePeriods(): Unit = js.native
  
  /**
    * @param number [After=0]
    * @param Office.MsoTriState [MatchCase=0]
    * @param Office.MsoTriState [WholeWords=0]
    */
  def Replace(FindWhat: String, ReplaceWhat: String): TextRange = js.native
  def Replace(FindWhat: String, ReplaceWhat: String, After: Double): TextRange = js.native
  def Replace(FindWhat: String, ReplaceWhat: String, After: Double, MatchCase: Unit, WholeWords: MsoTriState): TextRange = js.native
  def Replace(FindWhat: String, ReplaceWhat: String, After: Double, MatchCase: MsoTriState): TextRange = js.native
  def Replace(
    FindWhat: String,
    ReplaceWhat: String,
    After: Double,
    MatchCase: MsoTriState,
    WholeWords: MsoTriState
  ): TextRange = js.native
  def Replace(FindWhat: String, ReplaceWhat: String, After: Unit, MatchCase: Unit, WholeWords: MsoTriState): TextRange = js.native
  def Replace(FindWhat: String, ReplaceWhat: String, After: Unit, MatchCase: MsoTriState): TextRange = js.native
  def Replace(
    FindWhat: String,
    ReplaceWhat: String,
    After: Unit,
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
  def Runs(Start: Double): TextRange = js.native
  def Runs(Start: Double, Length: Double): TextRange = js.native
  def Runs(Start: Unit, Length: Double): TextRange = js.native
  
  def Select(): Unit = js.native
  
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Sentences(): TextRange = js.native
  def Sentences(Start: Double): TextRange = js.native
  def Sentences(Start: Double, Length: Double): TextRange = js.native
  def Sentences(Start: Unit, Length: Double): TextRange = js.native
  
  val Start: Double = js.native
  
  var Text: String = js.native
  
  def TrimText(): TextRange = js.native
  
  /**
    * @param number [Start=-1]
    * @param number [Length=-1]
    */
  def Words(): TextRange = js.native
  def Words(Start: Double): TextRange = js.native
  def Words(Start: Double, Length: Double): TextRange = js.native
  def Words(Start: Unit, Length: Double): TextRange = js.native
}
