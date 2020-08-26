package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var Borders: typings.activexWord.Word.Borders = js.native
  val Cells: typings.activexWord.Word.Cells = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  val IsFirst: Boolean = js.native
  val IsLast: Boolean = js.native
  val NestingLevel: Double = js.native
  val Next: Column = js.native
  val Parent: js.Any = js.native
  var PreferredWidth: Double = js.native
  var PreferredWidthType: WdPreferredWidthType = js.native
  val Previous: Column = js.native
  val Shading: typings.activexWord.Word.Shading = js.native
  var Width: Double = js.native
  @JSName("Word.Column_typekey")
  var WordDotColumn_typekey: Column = js.native
  def AutoFit(): Unit = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
  def SetWidth(ColumnWidth: Double, RulerStyle: WdRulerStyle): Unit = js.native
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
  ): Unit = js.native
  def SortOld(): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.UndefOr[scala.Nothing],
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.Any,
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.Any,
    CaseSensitive: js.UndefOr[scala.Nothing],
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.Any,
    CaseSensitive: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.Any,
    CaseSensitive: js.Any,
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(ExcludeHeader: js.UndefOr[scala.Nothing], SortFieldType: js.Any): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.Any,
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.UndefOr[scala.Nothing],
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.Any,
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.Any,
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.Any,
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(ExcludeHeader: js.UndefOr[scala.Nothing], SortFieldType: js.Any, SortOrder: js.Any): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.Any,
    SortOrder: js.Any,
    CaseSensitive: js.UndefOr[scala.Nothing],
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.Any,
    SortOrder: js.Any,
    CaseSensitive: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.UndefOr[scala.Nothing],
    SortFieldType: js.Any,
    SortOrder: js.Any,
    CaseSensitive: js.Any,
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(ExcludeHeader: js.Any): Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.UndefOr[scala.Nothing],
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.Any,
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(ExcludeHeader: js.Any, SortFieldType: js.UndefOr[scala.Nothing], SortOrder: js.Any): Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.Any,
    CaseSensitive: js.UndefOr[scala.Nothing],
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.Any,
    CaseSensitive: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.UndefOr[scala.Nothing],
    SortOrder: js.Any,
    CaseSensitive: js.Any,
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(ExcludeHeader: js.Any, SortFieldType: js.Any): Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.Any,
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.UndefOr[scala.Nothing],
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.Any,
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.Any
  ): Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.Any,
    SortOrder: js.UndefOr[scala.Nothing],
    CaseSensitive: js.Any,
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(ExcludeHeader: js.Any, SortFieldType: js.Any, SortOrder: js.Any): Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.Any,
    SortOrder: js.Any,
    CaseSensitive: js.UndefOr[scala.Nothing],
    LanguageID: js.Any
  ): Unit = js.native
  def SortOld(ExcludeHeader: js.Any, SortFieldType: js.Any, SortOrder: js.Any, CaseSensitive: js.Any): Unit = js.native
  def SortOld(
    ExcludeHeader: js.Any,
    SortFieldType: js.Any,
    SortOrder: js.Any,
    CaseSensitive: js.Any,
    LanguageID: js.Any
  ): Unit = js.native
}

