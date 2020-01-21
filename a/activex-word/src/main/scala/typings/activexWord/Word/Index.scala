package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Index")
@js.native
class Index protected () extends js.Object {
  var AccentedLetters: Boolean = js.native
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Filter: WdIndexFilter = js.native
  var HeadingSeparator: WdHeadingSeparator = js.native
  var IndexLanguage: WdLanguageID = js.native
  var NumberOfColumns: Double = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  var RightAlignPageNumbers: Boolean = js.native
  var SortBy: WdIndexSortBy = js.native
  var TabLeader: WdTabLeader = js.native
  var Type: WdIndexType = js.native
  @JSName("Word.Index_typekey")
  var WordDotIndex_typekey: Index = js.native
  def Delete(): Unit = js.native
  def Update(): Unit = js.native
}

