package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablesOfFigures extends StObject {
  
  def Add(
    Range: Range,
    Caption: js.UndefOr[Any],
    IncludeLabel: js.UndefOr[Any],
    UseHeadingStyles: js.UndefOr[Any],
    UpperHeadingLevel: js.UndefOr[Any],
    LowerHeadingLevel: js.UndefOr[Any],
    UseFields: js.UndefOr[Any],
    TableID: js.UndefOr[Any],
    RightAlignPageNumbers: js.UndefOr[Any],
    IncludePageNumbers: js.UndefOr[Any],
    AddedStyles: js.UndefOr[Any],
    UseHyperlinks: js.UndefOr[Any],
    HidePageNumbersInWeb: js.UndefOr[Any]
  ): TableOfFigures = js.native
  
  def AddOld(
    Range: Range,
    Caption: js.UndefOr[Any],
    IncludeLabel: js.UndefOr[Any],
    UseHeadingStyles: js.UndefOr[Any],
    UpperHeadingLevel: js.UndefOr[Any],
    LowerHeadingLevel: js.UndefOr[Any],
    UseFields: js.UndefOr[Any],
    TableID: js.UndefOr[Any],
    RightAlignPageNumbers: js.UndefOr[Any],
    IncludePageNumbers: js.UndefOr[Any],
    AddedStyles: js.UndefOr[Any]
  ): TableOfFigures = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var Format: WdTofFormat = js.native
  
  def Item(Index: Double): TableOfFigures = js.native
  
  def MarkEntry(Range: Range): Field = js.native
  def MarkEntry(Range: Range, Entry: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Any, EntryAutoText: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Any, EntryAutoText: Any, TableID: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Any, EntryAutoText: Any, TableID: Any, Level: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Any, EntryAutoText: Any, TableID: Unit, Level: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Any, EntryAutoText: Unit, TableID: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Any, EntryAutoText: Unit, TableID: Any, Level: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Any, EntryAutoText: Unit, TableID: Unit, Level: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: Any, TableID: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: Any, TableID: Any, Level: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: Any, TableID: Unit, Level: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: Unit, TableID: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: Unit, TableID: Any, Level: Any): Field = js.native
  def MarkEntry(Range: Range, Entry: Unit, EntryAutoText: Unit, TableID: Unit, Level: Any): Field = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.TablesOfFigures_typekey")
  var WordDotTablesOfFigures_typekey: TablesOfFigures = js.native
}
