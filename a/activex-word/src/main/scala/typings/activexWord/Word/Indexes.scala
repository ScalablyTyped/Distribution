package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indexes extends StObject {
  
  def Add(
    Range: Range,
    HeadingSeparator: js.UndefOr[Any],
    RightAlignPageNumbers: js.UndefOr[Any],
    Type: js.UndefOr[Any],
    NumberOfColumns: js.UndefOr[Any],
    AccentedLetters: js.UndefOr[Any],
    SortBy: js.UndefOr[Any],
    IndexLanguage: js.UndefOr[Any]
  ): Index = js.native
  
  def AddOld(Range: Range): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Any): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Any, RightAlignPageNumbers: Any): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Any, RightAlignPageNumbers: Any, Type: Any): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Any, RightAlignPageNumbers: Any, Type: Any, NumberOfColumns: Any): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Any,
    RightAlignPageNumbers: Any,
    Type: Any,
    NumberOfColumns: Any,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Any,
    RightAlignPageNumbers: Any,
    Type: Any,
    NumberOfColumns: Unit,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Any, RightAlignPageNumbers: Any, Type: Unit, NumberOfColumns: Any): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Any,
    RightAlignPageNumbers: Any,
    Type: Unit,
    NumberOfColumns: Any,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Any,
    RightAlignPageNumbers: Any,
    Type: Unit,
    NumberOfColumns: Unit,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Any, RightAlignPageNumbers: Unit, Type: Any): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Any, RightAlignPageNumbers: Unit, Type: Any, NumberOfColumns: Any): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Any,
    RightAlignPageNumbers: Unit,
    Type: Any,
    NumberOfColumns: Any,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Any,
    RightAlignPageNumbers: Unit,
    Type: Any,
    NumberOfColumns: Unit,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Any, RightAlignPageNumbers: Unit, Type: Unit, NumberOfColumns: Any): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Any,
    RightAlignPageNumbers: Unit,
    Type: Unit,
    NumberOfColumns: Any,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Any,
    RightAlignPageNumbers: Unit,
    Type: Unit,
    NumberOfColumns: Unit,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Unit, RightAlignPageNumbers: Any): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Unit, RightAlignPageNumbers: Any, Type: Any): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Unit, RightAlignPageNumbers: Any, Type: Any, NumberOfColumns: Any): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Unit,
    RightAlignPageNumbers: Any,
    Type: Any,
    NumberOfColumns: Any,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Unit,
    RightAlignPageNumbers: Any,
    Type: Any,
    NumberOfColumns: Unit,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Unit, RightAlignPageNumbers: Any, Type: Unit, NumberOfColumns: Any): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Unit,
    RightAlignPageNumbers: Any,
    Type: Unit,
    NumberOfColumns: Any,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Unit,
    RightAlignPageNumbers: Any,
    Type: Unit,
    NumberOfColumns: Unit,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Unit, RightAlignPageNumbers: Unit, Type: Any): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: Unit, RightAlignPageNumbers: Unit, Type: Any, NumberOfColumns: Any): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Unit,
    RightAlignPageNumbers: Unit,
    Type: Any,
    NumberOfColumns: Any,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Unit,
    RightAlignPageNumbers: Unit,
    Type: Any,
    NumberOfColumns: Unit,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Unit,
    RightAlignPageNumbers: Unit,
    Type: Unit,
    NumberOfColumns: Any
  ): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Unit,
    RightAlignPageNumbers: Unit,
    Type: Unit,
    NumberOfColumns: Any,
    AccentedLetters: Any
  ): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: Unit,
    RightAlignPageNumbers: Unit,
    Type: Unit,
    NumberOfColumns: Unit,
    AccentedLetters: Any
  ): Index = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def AutoMarkEntries(ConcordanceFileName: String): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var Format: WdIndexFormat = js.native
  
  def Item(Index: Double): Index = js.native
  
  def MarkAllEntries(
    Range: Range,
    Entry: js.UndefOr[Any],
    EntryAutoText: js.UndefOr[Any],
    CrossReference: js.UndefOr[Any],
    CrossReferenceAutoText: js.UndefOr[Any],
    BookmarkName: js.UndefOr[Any],
    Bold: js.UndefOr[Any],
    Italic: js.UndefOr[Any]
  ): Unit = js.native
  
  def MarkEntry(
    Range: Range,
    Entry: js.UndefOr[Any],
    EntryAutoText: js.UndefOr[Any],
    CrossReference: js.UndefOr[Any],
    CrossReferenceAutoText: js.UndefOr[Any],
    BookmarkName: js.UndefOr[Any],
    Bold: js.UndefOr[Any],
    Italic: js.UndefOr[Any],
    Reading: js.UndefOr[Any]
  ): Field = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.Indexes_typekey")
  var WordDotIndexes_typekey: Indexes = js.native
}
