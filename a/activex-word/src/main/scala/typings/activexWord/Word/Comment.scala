package typings.activexWord.Word

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Author: String
  val Creator: Double
  val Date: VarDate
  val Index: Double
  var Initial: String
  val IsInk: Boolean
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  val Reference: typings.activexWord.Word.Range
  val Scope: typings.activexWord.Word.Range
  var ShowTip: Boolean
  @JSName("Word.Comment_typekey")
  var WordDotComment_typekey: Comment
  def Delete(): Unit
  def Edit(): Unit
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
}

