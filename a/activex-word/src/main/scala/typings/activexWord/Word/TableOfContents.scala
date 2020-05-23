package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOfContents extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val HeadingStyles: typings.activexWord.Word.HeadingStyles
  var HidePageNumbersInWeb: Boolean
  var IncludePageNumbers: Boolean
  var LowerHeadingLevel: Double
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  var RightAlignPageNumbers: Boolean
  var TabLeader: WdTabLeader
  var TableID: String
  var UpperHeadingLevel: Double
  var UseFields: Boolean
  var UseHeadingStyles: Boolean
  var UseHyperlinks: Boolean
  @JSName("Word.TableOfContents_typekey")
  var WordDotTableOfContents_typekey: TableOfContents
  def Delete(): Unit
  def Update(): Unit
  def UpdatePageNumbers(): Unit
}

object TableOfContents {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    HeadingStyles: HeadingStyles,
    HidePageNumbersInWeb: Boolean,
    IncludePageNumbers: Boolean,
    LowerHeadingLevel: Double,
    Parent: js.Any,
    Range: Range,
    RightAlignPageNumbers: Boolean,
    TabLeader: WdTabLeader,
    TableID: String,
    Update: () => Unit,
    UpdatePageNumbers: () => Unit,
    UpperHeadingLevel: Double,
    UseFields: Boolean,
    UseHeadingStyles: Boolean,
    UseHyperlinks: Boolean,
    WordDotTableOfContents_typekey: TableOfContents
  ): TableOfContents = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), HeadingStyles = HeadingStyles.asInstanceOf[js.Any], HidePageNumbersInWeb = HidePageNumbersInWeb.asInstanceOf[js.Any], IncludePageNumbers = IncludePageNumbers.asInstanceOf[js.Any], LowerHeadingLevel = LowerHeadingLevel.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RightAlignPageNumbers = RightAlignPageNumbers.asInstanceOf[js.Any], TabLeader = TabLeader.asInstanceOf[js.Any], TableID = TableID.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update), UpdatePageNumbers = js.Any.fromFunction0(UpdatePageNumbers), UpperHeadingLevel = UpperHeadingLevel.asInstanceOf[js.Any], UseFields = UseFields.asInstanceOf[js.Any], UseHeadingStyles = UseHeadingStyles.asInstanceOf[js.Any], UseHyperlinks = UseHyperlinks.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TableOfContents_typekey")(WordDotTableOfContents_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfContents]
  }
}

