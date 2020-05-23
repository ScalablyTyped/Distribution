package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var AccentedLetters: Boolean
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var Filter: WdIndexFilter
  var HeadingSeparator: WdHeadingSeparator
  var IndexLanguage: WdLanguageID
  var NumberOfColumns: Double
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  var RightAlignPageNumbers: Boolean
  var SortBy: WdIndexSortBy
  var TabLeader: WdTabLeader
  var Type: WdIndexType
  @JSName("Word.Index_typekey")
  var WordDotIndex_typekey: Index
  def Delete(): Unit
  def Update(): Unit
}

object Index {
  @scala.inline
  def apply(
    AccentedLetters: Boolean,
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Filter: WdIndexFilter,
    HeadingSeparator: WdHeadingSeparator,
    IndexLanguage: WdLanguageID,
    NumberOfColumns: Double,
    Parent: js.Any,
    Range: Range,
    RightAlignPageNumbers: Boolean,
    SortBy: WdIndexSortBy,
    TabLeader: WdTabLeader,
    Type: WdIndexType,
    Update: () => Unit,
    WordDotIndex_typekey: Index
  ): Index = {
    val __obj = js.Dynamic.literal(AccentedLetters = AccentedLetters.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Filter = Filter.asInstanceOf[js.Any], HeadingSeparator = HeadingSeparator.asInstanceOf[js.Any], IndexLanguage = IndexLanguage.asInstanceOf[js.Any], NumberOfColumns = NumberOfColumns.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RightAlignPageNumbers = RightAlignPageNumbers.asInstanceOf[js.Any], SortBy = SortBy.asInstanceOf[js.Any], TabLeader = TabLeader.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Word.Index_typekey")(WordDotIndex_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

