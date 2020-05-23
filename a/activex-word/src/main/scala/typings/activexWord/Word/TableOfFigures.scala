package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOfFigures extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Caption: String
  val Creator: Double
  val HeadingStyles: typings.activexWord.Word.HeadingStyles
  var HidePageNumbersInWeb: Boolean
  var IncludeLabel: Boolean
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
  @JSName("Word.TableOfFigures_typekey")
  var WordDotTableOfFigures_typekey: TableOfFigures
  def Delete(): Unit
  def Update(): Unit
  def UpdatePageNumbers(): Unit
}

object TableOfFigures {
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Creator: Double,
    Delete: () => Unit,
    HeadingStyles: HeadingStyles,
    HidePageNumbersInWeb: Boolean,
    IncludeLabel: Boolean,
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
    WordDotTableOfFigures_typekey: TableOfFigures
  ): TableOfFigures = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), HeadingStyles = HeadingStyles.asInstanceOf[js.Any], HidePageNumbersInWeb = HidePageNumbersInWeb.asInstanceOf[js.Any], IncludeLabel = IncludeLabel.asInstanceOf[js.Any], IncludePageNumbers = IncludePageNumbers.asInstanceOf[js.Any], LowerHeadingLevel = LowerHeadingLevel.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RightAlignPageNumbers = RightAlignPageNumbers.asInstanceOf[js.Any], TabLeader = TabLeader.asInstanceOf[js.Any], TableID = TableID.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update), UpdatePageNumbers = js.Any.fromFunction0(UpdatePageNumbers), UpperHeadingLevel = UpperHeadingLevel.asInstanceOf[js.Any], UseFields = UseFields.asInstanceOf[js.Any], UseHeadingStyles = UseHeadingStyles.asInstanceOf[js.Any], UseHyperlinks = UseHyperlinks.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TableOfFigures_typekey")(WordDotTableOfFigures_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfFigures]
  }
}

