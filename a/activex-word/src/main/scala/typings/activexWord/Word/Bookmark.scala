package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bookmark extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Column: Boolean = js.native
  val Creator: Double = js.native
  val Empty: Boolean = js.native
  var End: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  var Start: Double = js.native
  val StoryType: WdStoryType = js.native
  @JSName("Word.Bookmark_typekey")
  var WordDotBookmark_typekey: Bookmark = js.native
  def Copy(Name: String): Bookmark = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object Bookmark {
  @scala.inline
  def apply(
    Application: Application,
    Column: Boolean,
    Copy: String => Bookmark,
    Creator: Double,
    Delete: () => Unit,
    Empty: Boolean,
    End: Double,
    Name: String,
    Parent: js.Any,
    Range: Range,
    Select: () => Unit,
    Start: Double,
    StoryType: WdStoryType,
    WordDotBookmark_typekey: Bookmark
  ): Bookmark = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], Copy = js.Any.fromFunction1(Copy), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Empty = Empty.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Start = Start.asInstanceOf[js.Any], StoryType = StoryType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Bookmark_typekey")(WordDotBookmark_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookmark]
  }
  @scala.inline
  implicit class BookmarkOps[Self <: Bookmark] (val x: Self) extends AnyVal {
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
    def setColumn(value: Boolean): Self = this.set("Column", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopy(value: String => Bookmark): Self = this.set("Copy", js.Any.fromFunction1(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("Empty", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: Double): Self = this.set("Start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoryType(value: WdStoryType): Self = this.set("StoryType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotBookmark_typekey(value: Bookmark): Self = this.set("Word.Bookmark_typekey", value.asInstanceOf[js.Any])
  }
  
}

