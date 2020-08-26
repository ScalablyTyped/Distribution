package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablesOfAuthorities extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var Format: WdToaFormat = js.native
  val Parent: js.Any = js.native
  @JSName("Word.TablesOfAuthorities_typekey")
  var WordDotTablesOfAuthorities_typekey: TablesOfAuthorities = js.native
  def Add(
    Range: Range,
    Category: js.UndefOr[js.Any],
    Bookmark: js.UndefOr[js.Any],
    Passim: js.UndefOr[js.Any],
    KeepEntryFormatting: js.UndefOr[js.Any],
    Separator: js.UndefOr[js.Any],
    IncludeSequenceName: js.UndefOr[js.Any],
    EntrySeparator: js.UndefOr[js.Any],
    PageRangeSeparator: js.UndefOr[js.Any],
    IncludeCategoryHeader: js.UndefOr[js.Any],
    PageNumberSeparator: js.UndefOr[js.Any]
  ): TableOfAuthorities = js.native
  def Item(Index: Double): TableOfAuthorities = js.native
  def MarkAllCitations(ShortCitation: String): Unit = js.native
  def MarkAllCitations(
    ShortCitation: String,
    LongCitation: js.UndefOr[scala.Nothing],
    LongCitationAutoText: js.UndefOr[scala.Nothing],
    Category: js.Any
  ): Unit = js.native
  def MarkAllCitations(ShortCitation: String, LongCitation: js.UndefOr[scala.Nothing], LongCitationAutoText: js.Any): Unit = js.native
  def MarkAllCitations(
    ShortCitation: String,
    LongCitation: js.UndefOr[scala.Nothing],
    LongCitationAutoText: js.Any,
    Category: js.Any
  ): Unit = js.native
  def MarkAllCitations(ShortCitation: String, LongCitation: js.Any): Unit = js.native
  def MarkAllCitations(
    ShortCitation: String,
    LongCitation: js.Any,
    LongCitationAutoText: js.UndefOr[scala.Nothing],
    Category: js.Any
  ): Unit = js.native
  def MarkAllCitations(ShortCitation: String, LongCitation: js.Any, LongCitationAutoText: js.Any): Unit = js.native
  def MarkAllCitations(ShortCitation: String, LongCitation: js.Any, LongCitationAutoText: js.Any, Category: js.Any): Unit = js.native
  def MarkCitation(Range: Range, ShortCitation: String): Field = js.native
  def MarkCitation(
    Range: Range,
    ShortCitation: String,
    LongCitation: js.UndefOr[scala.Nothing],
    LongCitationAutoText: js.UndefOr[scala.Nothing],
    Category: js.Any
  ): Field = js.native
  def MarkCitation(
    Range: Range,
    ShortCitation: String,
    LongCitation: js.UndefOr[scala.Nothing],
    LongCitationAutoText: js.Any
  ): Field = js.native
  def MarkCitation(
    Range: Range,
    ShortCitation: String,
    LongCitation: js.UndefOr[scala.Nothing],
    LongCitationAutoText: js.Any,
    Category: js.Any
  ): Field = js.native
  def MarkCitation(Range: Range, ShortCitation: String, LongCitation: js.Any): Field = js.native
  def MarkCitation(
    Range: Range,
    ShortCitation: String,
    LongCitation: js.Any,
    LongCitationAutoText: js.UndefOr[scala.Nothing],
    Category: js.Any
  ): Field = js.native
  def MarkCitation(Range: Range, ShortCitation: String, LongCitation: js.Any, LongCitationAutoText: js.Any): Field = js.native
  def MarkCitation(
    Range: Range,
    ShortCitation: String,
    LongCitation: js.Any,
    LongCitationAutoText: js.Any,
    Category: js.Any
  ): Field = js.native
  def NextCitation(ShortCitation: String): Unit = js.native
}

