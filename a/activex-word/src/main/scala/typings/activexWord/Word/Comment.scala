package typings.activexWord.Word

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var Author: String = js.native
  val Creator: Double = js.native
  val Date: VarDate = js.native
  val Index: Double = js.native
  var Initial: String = js.native
  val IsInk: Boolean = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  val Reference: typings.activexWord.Word.Range = js.native
  val Scope: typings.activexWord.Word.Range = js.native
  var ShowTip: Boolean = js.native
  @JSName("Word.Comment_typekey")
  var WordDotComment_typekey: Comment = js.native
  def Delete(): Unit = js.native
  def Edit(): Unit = js.native
}

object Comment {
  @scala.inline
  def apply(
    Application: Application,
    Author: String,
    Creator: Double,
    Date: VarDate,
    Delete: () => Unit,
    Edit: () => Unit,
    Index: Double,
    Initial: String,
    IsInk: Boolean,
    Parent: js.Any,
    Range: Range,
    Reference: Range,
    Scope: Range,
    ShowTip: Boolean,
    WordDotComment_typekey: Comment
  ): Comment = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Edit = js.Any.fromFunction0(Edit), Index = Index.asInstanceOf[js.Any], Initial = Initial.asInstanceOf[js.Any], IsInk = IsInk.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], ShowTip = ShowTip.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Comment_typekey")(WordDotComment_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("Author", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: VarDate): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setEdit(value: () => Unit): Self = this.set("Edit", js.Any.fromFunction0(value))
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitial(value: String): Self = this.set("Initial", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInk(value: Boolean): Self = this.set("IsInk", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    @scala.inline
    def setReference(value: Range): Self = this.set("Reference", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: Range): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowTip(value: Boolean): Self = this.set("ShowTip", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotComment_typekey(value: Comment): Self = this.set("Word.Comment_typekey", value.asInstanceOf[js.Any])
  }
  
}

