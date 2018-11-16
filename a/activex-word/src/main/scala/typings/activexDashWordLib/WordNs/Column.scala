package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Column")
@js.native
class Column protected () extends js.Object {
  val Application: Application = js.native
  var Borders: Borders = js.native
  val Cells: Cells = js.native
  val Creator: scala.Double = js.native
  val Index: scala.Double = js.native
  val IsFirst: scala.Boolean = js.native
  val IsLast: scala.Boolean = js.native
  val NestingLevel: scala.Double = js.native
  val Next: Column = js.native
  val Parent: js.Any = js.native
  var PreferredWidth: scala.Double = js.native
  var PreferredWidthType: WdPreferredWidthType = js.native
  val Previous: Column = js.native
  val Shading: Shading = js.native
  var Width: scala.Double = js.native
  var `Word.Column_typekey`: Column = js.native
  def AutoFit(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def SetWidth(ColumnWidth: scala.Double, RulerStyle: WdRulerStyle): scala.Unit = js.native
  def Sort(
    ExcludeHeader: js.UndefOr[js.Any],
    SortFieldType: js.UndefOr[js.Any],
    SortOrder: js.UndefOr[js.Any],
    CaseSensitive: js.UndefOr[js.Any],
    BidiSort: js.UndefOr[js.Any],
    IgnoreThe: js.UndefOr[js.Any],
    IgnoreKashida: js.UndefOr[js.Any],
    IgnoreDiacritics: js.UndefOr[js.Any],
    IgnoreHe: js.UndefOr[js.Any],
    LanguageID: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def SortOld(): scala.Unit = js.native
  def SortOld(ExcludeHeader: js.Any): scala.Unit = js.native
  def SortOld(ExcludeHeader: js.Any, SortFieldType: js.Any): scala.Unit = js.native
  def SortOld(ExcludeHeader: js.Any, SortFieldType: js.Any, SortOrder: js.Any): scala.Unit = js.native
  def SortOld(ExcludeHeader: js.Any, SortFieldType: js.Any, SortOrder: js.Any, CaseSensitive: js.Any): scala.Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.Any,
    SortOrder: js.Any,
    CaseSensitive: js.Any,
    LanguageID: js.Any
  ): scala.Unit = js.native
}

