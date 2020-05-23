package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOfAuthorities extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Bookmark: String
  var Category: Double
  val Creator: Double
  var EntrySeparator: String
  var IncludeCategoryHeader: Boolean
  var IncludeSequenceName: String
  var KeepEntryFormatting: Boolean
  var PageNumberSeparator: String
  var PageRangeSeparator: String
  val Parent: js.Any
  var Passim: Boolean
  val Range: typings.activexWord.Word.Range
  var Separator: String
  var TabLeader: WdTabLeader
  @JSName("Word.TableOfAuthorities_typekey")
  var WordDotTableOfAuthorities_typekey: TableOfAuthorities
  def Delete(): Unit
  def Update(): Unit
}

object TableOfAuthorities {
  @scala.inline
  def apply(
    Application: Application,
    Bookmark: String,
    Category: Double,
    Creator: Double,
    Delete: () => Unit,
    EntrySeparator: String,
    IncludeCategoryHeader: Boolean,
    IncludeSequenceName: String,
    KeepEntryFormatting: Boolean,
    PageNumberSeparator: String,
    PageRangeSeparator: String,
    Parent: js.Any,
    Passim: Boolean,
    Range: Range,
    Separator: String,
    TabLeader: WdTabLeader,
    Update: () => Unit,
    WordDotTableOfAuthorities_typekey: TableOfAuthorities
  ): TableOfAuthorities = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Bookmark = Bookmark.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EntrySeparator = EntrySeparator.asInstanceOf[js.Any], IncludeCategoryHeader = IncludeCategoryHeader.asInstanceOf[js.Any], IncludeSequenceName = IncludeSequenceName.asInstanceOf[js.Any], KeepEntryFormatting = KeepEntryFormatting.asInstanceOf[js.Any], PageNumberSeparator = PageNumberSeparator.asInstanceOf[js.Any], PageRangeSeparator = PageRangeSeparator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Passim = Passim.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], TabLeader = TabLeader.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Word.TableOfAuthorities_typekey")(WordDotTableOfAuthorities_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfAuthorities]
  }
}

