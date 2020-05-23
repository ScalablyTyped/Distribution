package typings.activexPowerpoint.PowerPoint

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Author: String
  val AuthorIndex: Double
  val AuthorInitials: String
  val DateTime: VarDate
  val Left: Double
  val Parent: js.Any
  @JSName("PowerPoint.Comment_typekey")
  var PowerPointDotComment_typekey: Comment
  val Text: String
  val Top: Double
  def Delete(): Unit
}

object Comment {
  @scala.inline
  def apply(
    Application: Application,
    Author: String,
    AuthorIndex: Double,
    AuthorInitials: String,
    DateTime: VarDate,
    Delete: () => Unit,
    Left: Double,
    Parent: js.Any,
    PowerPointDotComment_typekey: Comment,
    Text: String,
    Top: Double
  ): Comment = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], AuthorIndex = AuthorIndex.asInstanceOf[js.Any], AuthorInitials = AuthorInitials.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Left = Left.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Comment_typekey")(PowerPointDotComment_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

