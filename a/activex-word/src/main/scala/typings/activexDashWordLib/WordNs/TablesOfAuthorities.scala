package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TablesOfAuthorities")
@js.native
class TablesOfAuthorities protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var Format: WdToaFormat = js.native
  val Parent: js.Any = js.native
  var `Word.TablesOfAuthorities_typekey`: TablesOfAuthorities = js.native
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
  def Item(Index: scala.Double): TableOfAuthorities = js.native
  def MarkAllCitations(ShortCitation: java.lang.String): scala.Unit = js.native
  def MarkAllCitations(ShortCitation: java.lang.String, LongCitation: js.Any): scala.Unit = js.native
  def MarkAllCitations(ShortCitation: java.lang.String, LongCitation: js.Any, LongCitationAutoText: js.Any): scala.Unit = js.native
  def MarkAllCitations(
    ShortCitation: java.lang.String,
    LongCitation: js.Any,
    LongCitationAutoText: js.Any,
    Category: js.Any
  ): scala.Unit = js.native
  def MarkCitation(Range: Range, ShortCitation: java.lang.String): Field = js.native
  def MarkCitation(Range: Range, ShortCitation: java.lang.String, LongCitation: js.Any): Field = js.native
  def MarkCitation(Range: Range, ShortCitation: java.lang.String, LongCitation: js.Any, LongCitationAutoText: js.Any): Field = js.native
  def MarkCitation(
    Range: Range,
    ShortCitation: java.lang.String,
    LongCitation: js.Any,
    LongCitationAutoText: js.Any,
    Category: js.Any
  ): Field = js.native
  def NextCitation(ShortCitation: java.lang.String): scala.Unit = js.native
}

