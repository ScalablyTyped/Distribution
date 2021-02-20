package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    Format: js.UndefOr[js.Any],
    ApplyBorders: js.UndefOr[js.Any],
    ApplyShading: js.UndefOr[js.Any],
    ApplyFont: js.UndefOr[js.Any],
    ApplyColor: js.UndefOr[js.Any],
    ApplyHeadingRows: js.UndefOr[js.Any],
    ApplyLastRow: js.UndefOr[js.Any],
    ApplyFirstColumn: js.UndefOr[js.Any],
    ApplyLastColumn: js.UndefOr[js.Any],
    AutoFit: js.UndefOr[js.Any]
  ): Unit = js.native
  
  val AutoFormatType: Double = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  var BottomPadding: Double = js.native
  
  def Cell(Row: Double, Column: Double): typings.activexWord.Word.Cell = js.native
  
  val Columns: typings.activexWord.Word.Columns = js.native
  
  def ConvertToText(): typings.activexWord.Word.Range = js.native
  def ConvertToText(Separator: js.UndefOr[scala.Nothing], NestedTables: js.Any): typings.activexWord.Word.Range = js.native
  def ConvertToText(Separator: js.Any): typings.activexWord.Word.Range = js.native
  def ConvertToText(Separator: js.Any, NestedTables: js.Any): typings.activexWord.Word.Range = js.native
  
  def ConvertToTextOld(): typings.activexWord.Word.Range = js.native
  def ConvertToTextOld(Separator: js.Any): typings.activexWord.Word.Range = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var Descr: String = js.native
  
  var ID: String = js.native
  
  var LeftPadding: Double = js.native
  
  val NestingLevel: Double = js.native
  
  val Parent: js.Any = js.native
  
  var PreferredWidth: Double = js.native
  
  var PreferredWidthType: WdPreferredWidthType = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  var RightPadding: Double = js.native
  
  val Rows: typings.activexWord.Word.Rows = js.native
  
  def Select(): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  def Sort(
    ExcludeHeader: js.UndefOr[js.Any],
    FieldNumber: js.UndefOr[js.Any],
    SortFieldType: js.UndefOr[js.Any],
    SortOrder: js.UndefOr[js.Any],
    FieldNumber2: js.UndefOr[js.Any],
    SortFieldType2: js.UndefOr[js.Any],
    SortOrder2: js.UndefOr[js.Any],
    FieldNumber3: js.UndefOr[js.Any],
    SortFieldType3: js.UndefOr[js.Any],
    SortOrder3: js.UndefOr[js.Any],
    CaseSensitive: js.UndefOr[js.Any],
    BidiSort: js.UndefOr[js.Any],
    IgnoreThe: js.UndefOr[js.Any],
    IgnoreKashida: js.UndefOr[js.Any],
    IgnoreDiacritics: js.UndefOr[js.Any],
    IgnoreHe: js.UndefOr[js.Any],
    LanguageID: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def SortAscending(): Unit = js.native
  
  def SortDescending(): Unit = js.native
  
  def SortOld(
    ExcludeHeader: js.UndefOr[js.Any],
    FieldNumber: js.UndefOr[js.Any],
    SortFieldType: js.UndefOr[js.Any],
    SortOrder: js.UndefOr[js.Any],
    FieldNumber2: js.UndefOr[js.Any],
    SortFieldType2: js.UndefOr[js.Any],
    SortOrder2: js.UndefOr[js.Any],
    FieldNumber3: js.UndefOr[js.Any],
    SortFieldType3: js.UndefOr[js.Any],
    SortOrder3: js.UndefOr[js.Any],
    CaseSensitive: js.UndefOr[js.Any],
    LanguageID: js.UndefOr[js.Any]
  ): Unit = js.native
  
  var Spacing: Double = js.native
  
  def Split(BeforeRow: js.Any): Table = js.native
  
  var Style: js.Any = js.native
  
  var TableDirection: WdTableDirection = js.native
  
  val Tables: typings.activexWord.Word.Tables = js.native
  
  var Title: String = js.native
  
  var TopPadding: Double = js.native
  
  val Uniform: Boolean = js.native
  
  def UpdateAutoFormat(): Unit = js.native
  
  @JSName("Word.Table_typekey")
  var WordDotTable_typekey: Table = js.native
}
