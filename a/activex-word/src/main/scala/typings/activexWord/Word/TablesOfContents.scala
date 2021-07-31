package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablesOfContents extends StObject {
  
  def Add(
    Range: Range,
    UseHeadingStyles: js.UndefOr[js.Any],
    UpperHeadingLevel: js.UndefOr[js.Any],
    LowerHeadingLevel: js.UndefOr[js.Any],
    UseFields: js.UndefOr[js.Any],
    TableID: js.UndefOr[js.Any],
    RightAlignPageNumbers: js.UndefOr[js.Any],
    IncludePageNumbers: js.UndefOr[js.Any],
    AddedStyles: js.UndefOr[js.Any],
    UseHyperlinks: js.UndefOr[js.Any],
    HidePageNumbersInWeb: js.UndefOr[js.Any],
    UseOutlineLevels: js.UndefOr[js.Any]
  ): TableOfContents = js.native
  
  def Add2000(
    Range: Range,
    UseHeadingStyles: js.UndefOr[js.Any],
    UpperHeadingLevel: js.UndefOr[js.Any],
    LowerHeadingLevel: js.UndefOr[js.Any],
    UseFields: js.UndefOr[js.Any],
    TableID: js.UndefOr[js.Any],
    RightAlignPageNumbers: js.UndefOr[js.Any],
    IncludePageNumbers: js.UndefOr[js.Any],
    AddedStyles: js.UndefOr[js.Any],
    UseHyperlinks: js.UndefOr[js.Any],
    HidePageNumbersInWeb: js.UndefOr[js.Any]
  ): TableOfContents = js.native
  
  def AddOld(
    Range: Range,
    UseHeadingStyles: js.UndefOr[js.Any],
    UpperHeadingLevel: js.UndefOr[js.Any],
    LowerHeadingLevel: js.UndefOr[js.Any],
    UseFields: js.UndefOr[js.Any],
    TableID: js.UndefOr[js.Any],
    RightAlignPageNumbers: js.UndefOr[js.Any],
    IncludePageNumbers: js.UndefOr[js.Any],
    AddedStyles: js.UndefOr[js.Any]
  ): TableOfContents = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var Format: WdTocFormat = js.native
  
  def Item(Index: Double): TableOfContents = js.native
  
  def MarkEntry(Range: Range): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any, EntryAutoText: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any, EntryAutoText: js.Any, TableID: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any, EntryAutoText: js.Any, TableID: js.Any, Level: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any, EntryAutoText: js.Any, TableID: Unit, Level: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any, EntryAutoText: Unit, TableID: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any, EntryAutoText: Unit, TableID: js.Any, Level: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: js.Any, EntryAutoText: Unit, TableID: Unit, Level: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: js.Any, TableID: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: js.Any, TableID: js.Any, Level: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: js.Any, TableID: Unit, Level: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: Unit, TableID: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: Unit, TableID: js.Any, Level: js.Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: Unit, TableID: Unit, Level: js.Any): Field = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.TablesOfContents_typekey")
  var WordDotTablesOfContents_typekey: TablesOfContents = js.native
}
