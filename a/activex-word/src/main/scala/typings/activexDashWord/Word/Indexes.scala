package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Indexes")
@js.native
class Indexes protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var Format: WdIndexFormat = js.native
  val Parent: js.Any = js.native
  var `Word.Indexes_typekey`: Indexes = js.native
  def Add(
    Range: Range,
    HeadingSeparator: js.UndefOr[js.Any],
    RightAlignPageNumbers: js.UndefOr[js.Any],
    Type: js.UndefOr[js.Any],
    NumberOfColumns: js.UndefOr[js.Any],
    AccentedLetters: js.UndefOr[js.Any],
    SortBy: js.UndefOr[js.Any],
    IndexLanguage: js.UndefOr[js.Any]
  ): Index = js.native
  def AddOld(Range: Range): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: js.Any): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: js.Any, RightAlignPageNumbers: js.Any): Index = js.native
  def AddOld(Range: Range, HeadingSeparator: js.Any, RightAlignPageNumbers: js.Any, Type: js.Any): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: js.Any,
    RightAlignPageNumbers: js.Any,
    Type: js.Any,
    NumberOfColumns: js.Any
  ): Index = js.native
  def AddOld(
    Range: Range,
    HeadingSeparator: js.Any,
    RightAlignPageNumbers: js.Any,
    Type: js.Any,
    NumberOfColumns: js.Any,
    AccentedLetters: js.Any
  ): Index = js.native
  def AutoMarkEntries(ConcordanceFileName: String): Unit = js.native
  def Item(Index: Double): Index = js.native
  def MarkAllEntries(
    Range: Range,
    Entry: js.UndefOr[js.Any],
    EntryAutoText: js.UndefOr[js.Any],
    CrossReference: js.UndefOr[js.Any],
    CrossReferenceAutoText: js.UndefOr[js.Any],
    BookmarkName: js.UndefOr[js.Any],
    Bold: js.UndefOr[js.Any],
    Italic: js.UndefOr[js.Any]
  ): Unit = js.native
  def MarkEntry(
    Range: Range,
    Entry: js.UndefOr[js.Any],
    EntryAutoText: js.UndefOr[js.Any],
    CrossReference: js.UndefOr[js.Any],
    CrossReferenceAutoText: js.UndefOr[js.Any],
    BookmarkName: js.UndefOr[js.Any],
    Bold: js.UndefOr[js.Any],
    Italic: js.UndefOr[js.Any],
    Reading: js.UndefOr[js.Any]
  ): Field = js.native
}

