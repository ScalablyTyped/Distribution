package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends StObject {
  
  var AllowAutoFit: Boolean = js.native
  
  var AllowPageBreaks: Boolean = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var ApplyStyleColumnBands: Boolean = js.native
  
  def ApplyStyleDirectFormatting(StyleName: String): Unit = js.native
  
  var ApplyStyleFirstColumn: Boolean = js.native
  
  var ApplyStyleHeadingRows: Boolean = js.native
  
  var ApplyStyleLastColumn: Boolean = js.native
  
  var ApplyStyleLastRow: Boolean = js.native
  
  var ApplyStyleRowBands: Boolean = js.native
  
  def AutoFitBehavior(Behavior: WdAutoFitBehavior): Unit = js.native
  
  def AutoFormat(
    Format: js.UndefOr[Any],
    ApplyBorders: js.UndefOr[Any],
    ApplyShading: js.UndefOr[Any],
    ApplyFont: js.UndefOr[Any],
    ApplyColor: js.UndefOr[Any],
    ApplyHeadingRows: js.UndefOr[Any],
    ApplyLastRow: js.UndefOr[Any],
    ApplyFirstColumn: js.UndefOr[Any],
    ApplyLastColumn: js.UndefOr[Any],
    AutoFit: js.UndefOr[Any]
  ): Unit = js.native
  
  val AutoFormatType: Double = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  var BottomPadding: Double = js.native
  
  def Cell(Row: Double, Column: Double): typings.activexWord.Word.Cell = js.native
  
  val Columns: typings.activexWord.Word.Columns = js.native
  
  def ConvertToText(): typings.activexWord.Word.Range = js.native
  def ConvertToText(Separator: Any): typings.activexWord.Word.Range = js.native
  def ConvertToText(Separator: Any, NestedTables: Any): typings.activexWord.Word.Range = js.native
  def ConvertToText(Separator: Unit, NestedTables: Any): typings.activexWord.Word.Range = js.native
  
  def ConvertToTextOld(): typings.activexWord.Word.Range = js.native
  def ConvertToTextOld(Separator: Any): typings.activexWord.Word.Range = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var Descr: String = js.native
  
  var ID: String = js.native
  
  var LeftPadding: Double = js.native
  
  val NestingLevel: Double = js.native
  
  val Parent: Any = js.native
  
  var PreferredWidth: Double = js.native
  
  var PreferredWidthType: WdPreferredWidthType = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  var RightPadding: Double = js.native
  
  val Rows: typings.activexWord.Word.Rows = js.native
  
  def Select(): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  def Sort(
    ExcludeHeader: js.UndefOr[Any],
    FieldNumber: js.UndefOr[Any],
    SortFieldType: js.UndefOr[Any],
    SortOrder: js.UndefOr[Any],
    FieldNumber2: js.UndefOr[Any],
    SortFieldType2: js.UndefOr[Any],
    SortOrder2: js.UndefOr[Any],
    FieldNumber3: js.UndefOr[Any],
    SortFieldType3: js.UndefOr[Any],
    SortOrder3: js.UndefOr[Any],
    CaseSensitive: js.UndefOr[Any],
    BidiSort: js.UndefOr[Any],
    IgnoreThe: js.UndefOr[Any],
    IgnoreKashida: js.UndefOr[Any],
    IgnoreDiacritics: js.UndefOr[Any],
    IgnoreHe: js.UndefOr[Any],
    LanguageID: js.UndefOr[Any]
  ): Unit = js.native
  
  def SortAscending(): Unit = js.native
  
  def SortDescending(): Unit = js.native
  
  def SortOld(
    ExcludeHeader: js.UndefOr[Any],
    FieldNumber: js.UndefOr[Any],
    SortFieldType: js.UndefOr[Any],
    SortOrder: js.UndefOr[Any],
    FieldNumber2: js.UndefOr[Any],
    SortFieldType2: js.UndefOr[Any],
    SortOrder2: js.UndefOr[Any],
    FieldNumber3: js.UndefOr[Any],
    SortFieldType3: js.UndefOr[Any],
    SortOrder3: js.UndefOr[Any],
    CaseSensitive: js.UndefOr[Any],
    LanguageID: js.UndefOr[Any]
  ): Unit = js.native
  
  var Spacing: Double = js.native
  
  def Split(BeforeRow: Any): Table = js.native
  
  var Style: Any = js.native
  
  var TableDirection: WdTableDirection = js.native
  
  val Tables: typings.activexWord.Word.Tables = js.native
  
  var Title: String = js.native
  
  var TopPadding: Double = js.native
  
  val Uniform: Boolean = js.native
  
  def UpdateAutoFormat(): Unit = js.native
  
  /* private */ @JSName("Word.Table_typekey")
  var WordDotTable_typekey: Table = js.native
}
