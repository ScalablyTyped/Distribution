package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOfFigures extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var Caption: String = js.native
  val Creator: Double = js.native
  val HeadingStyles: typings.activexWord.Word.HeadingStyles = js.native
  var HidePageNumbersInWeb: Boolean = js.native
  var IncludeLabel: Boolean = js.native
  var IncludePageNumbers: Boolean = js.native
  var LowerHeadingLevel: Double = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  var RightAlignPageNumbers: Boolean = js.native
  var TabLeader: WdTabLeader = js.native
  var TableID: String = js.native
  var UpperHeadingLevel: Double = js.native
  var UseFields: Boolean = js.native
  var UseHeadingStyles: Boolean = js.native
  var UseHyperlinks: Boolean = js.native
  @JSName("Word.TableOfFigures_typekey")
  var WordDotTableOfFigures_typekey: TableOfFigures = js.native
  def Delete(): Unit = js.native
  def Update(): Unit = js.native
  def UpdatePageNumbers(): Unit = js.native
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
  @scala.inline
  implicit class TableOfFiguresOps[Self <: TableOfFigures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setHeadingStyles(value: HeadingStyles): Self = this.set("HeadingStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidePageNumbersInWeb(value: Boolean): Self = this.set("HidePageNumbersInWeb", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeLabel(value: Boolean): Self = this.set("IncludeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludePageNumbers(value: Boolean): Self = this.set("IncludePageNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowerHeadingLevel(value: Double): Self = this.set("LowerHeadingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightAlignPageNumbers(value: Boolean): Self = this.set("RightAlignPageNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabLeader(value: WdTabLeader): Self = this.set("TabLeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableID(value: String): Self = this.set("TableID", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("Update", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdatePageNumbers(value: () => Unit): Self = this.set("UpdatePageNumbers", js.Any.fromFunction0(value))
    @scala.inline
    def setUpperHeadingLevel(value: Double): Self = this.set("UpperHeadingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseFields(value: Boolean): Self = this.set("UseFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseHeadingStyles(value: Boolean): Self = this.set("UseHeadingStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseHyperlinks(value: Boolean): Self = this.set("UseHyperlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotTableOfFigures_typekey(value: TableOfFigures): Self = this.set("Word.TableOfFigures_typekey", value.asInstanceOf[js.Any])
  }
  
}

