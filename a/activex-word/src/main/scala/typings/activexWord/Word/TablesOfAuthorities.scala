package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablesOfAuthorities extends StObject {
  
  def Add(
    Range: Range,
    Category: js.UndefOr[Any],
    Bookmark: js.UndefOr[Any],
    Passim: js.UndefOr[Any],
    KeepEntryFormatting: js.UndefOr[Any],
    Separator: js.UndefOr[Any],
    IncludeSequenceName: js.UndefOr[Any],
    EntrySeparator: js.UndefOr[Any],
    PageRangeSeparator: js.UndefOr[Any],
    IncludeCategoryHeader: js.UndefOr[Any],
    PageNumberSeparator: js.UndefOr[Any]
  ): TableOfAuthorities = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var Format: WdToaFormat = js.native
  
  def Item(Index: Double): TableOfAuthorities = js.native
  
  def MarkAllCitations(ShortCitation: String): Unit = js.native
  def MarkAllCitations(ShortCitation: String, LongCitation: Any): Unit = js.native
  def MarkAllCitations(ShortCitation: String, LongCitation: Any, LongCitationAutoText: Any): Unit = js.native
  def MarkAllCitations(ShortCitation: String, LongCitation: Any, LongCitationAutoText: Any, Category: Any): Unit = js.native
  def MarkAllCitations(ShortCitation: String, LongCitation: Any, LongCitationAutoText: Unit, Category: Any): Unit = js.native
  def MarkAllCitations(ShortCitation: String, LongCitation: Unit, LongCitationAutoText: Any): Unit = js.native
  def MarkAllCitations(ShortCitation: String, LongCitation: Unit, LongCitationAutoText: Any, Category: Any): Unit = js.native
  def MarkAllCitations(ShortCitation: String, LongCitation: Unit, LongCitationAutoText: Unit, Category: Any): Unit = js.native
  
  def MarkCitation(Range: Range, ShortCitation: String): Field = js.native
  def MarkCitation(Range: Range, ShortCitation: String, LongCitation: Any): Field = js.native
  def MarkCitation(Range: Range, ShortCitation: String, LongCitation: Any, LongCitationAutoText: Any): Field = js.native
  def MarkCitation(Range: Range, ShortCitation: String, LongCitation: Any, LongCitationAutoText: Any, Category: Any): Field = js.native
  def MarkCitation(Range: Range, ShortCitation: String, LongCitation: Any, LongCitationAutoText: Unit, Category: Any): Field = js.native
  def MarkCitation(Range: Range, ShortCitation: String, LongCitation: Unit, LongCitationAutoText: Any): Field = js.native
  def MarkCitation(Range: Range, ShortCitation: String, LongCitation: Unit, LongCitationAutoText: Any, Category: Any): Field = js.native
  def MarkCitation(Range: Range, ShortCitation: String, LongCitation: Unit, LongCitationAutoText: Unit, Category: Any): Field = js.native
  
  def NextCitation(ShortCitation: String): Unit = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.TablesOfAuthorities_typekey")
  var WordDotTablesOfAuthorities_typekey: TablesOfAuthorities = js.native
}
