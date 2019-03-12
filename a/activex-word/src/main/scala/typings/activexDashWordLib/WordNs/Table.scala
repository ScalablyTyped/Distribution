package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Table")
@js.native
class Table protected () extends js.Object {
  var AllowAutoFit: scala.Boolean = js.native
  var AllowPageBreaks: scala.Boolean = js.native
  val Application: activexDashWordLib.WordNs.Application = js.native
  var ApplyStyleColumnBands: scala.Boolean = js.native
  var ApplyStyleFirstColumn: scala.Boolean = js.native
  var ApplyStyleHeadingRows: scala.Boolean = js.native
  var ApplyStyleLastColumn: scala.Boolean = js.native
  var ApplyStyleLastRow: scala.Boolean = js.native
  var ApplyStyleRowBands: scala.Boolean = js.native
  val AutoFormatType: scala.Double = js.native
  var Borders: activexDashWordLib.WordNs.Borders = js.native
  var BottomPadding: scala.Double = js.native
  val Columns: activexDashWordLib.WordNs.Columns = js.native
  val Creator: scala.Double = js.native
  var Descr: java.lang.String = js.native
  var ID: java.lang.String = js.native
  var LeftPadding: scala.Double = js.native
  val NestingLevel: scala.Double = js.native
  val Parent: js.Any = js.native
  var PreferredWidth: scala.Double = js.native
  var PreferredWidthType: WdPreferredWidthType = js.native
  val Range: activexDashWordLib.WordNs.Range = js.native
  var RightPadding: scala.Double = js.native
  val Rows: activexDashWordLib.WordNs.Rows = js.native
  val Shading: activexDashWordLib.WordNs.Shading = js.native
  var Spacing: scala.Double = js.native
  var Style: js.Any = js.native
  var TableDirection: WdTableDirection = js.native
  val Tables: activexDashWordLib.WordNs.Tables = js.native
  var Title: java.lang.String = js.native
  var TopPadding: scala.Double = js.native
  val Uniform: scala.Boolean = js.native
  var `Word.Table_typekey`: Table = js.native
  def ApplyStyleDirectFormatting(StyleName: java.lang.String): scala.Unit = js.native
  def AutoFitBehavior(Behavior: WdAutoFitBehavior): scala.Unit = js.native
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
  ): scala.Unit = js.native
  def Cell(Row: scala.Double, Column: scala.Double): activexDashWordLib.WordNs.Cell = js.native
  def ConvertToText(): Range = js.native
  def ConvertToText(Separator: js.Any): Range = js.native
  def ConvertToText(Separator: js.Any, NestedTables: js.Any): Range = js.native
  def ConvertToTextOld(): Range = js.native
  def ConvertToTextOld(Separator: js.Any): Range = js.native
  def Delete(): scala.Unit = js.native
  def Select(): scala.Unit = js.native
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
  ): scala.Unit = js.native
  def SortAscending(): scala.Unit = js.native
  def SortDescending(): scala.Unit = js.native
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
  ): scala.Unit = js.native
  def Split(BeforeRow: js.Any): Table = js.native
  def UpdateAutoFormat(): scala.Unit = js.native
}

