package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bookmark extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Column: Boolean
  val Creator: Double
  val Empty: Boolean
  var End: Double
  val Name: String
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  var Start: Double
  val StoryType: WdStoryType
  @JSName("Word.Bookmark_typekey")
  var WordDotBookmark_typekey: Bookmark
  def Copy(Name: String): Bookmark
  def Delete(): Unit
  def Select(): Unit
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
}

