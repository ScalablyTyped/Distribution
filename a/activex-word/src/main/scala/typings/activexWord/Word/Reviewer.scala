package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reviewer extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Parent: js.Any
  var Visible: Boolean
  @JSName("Word.Reviewer_typekey")
  var WordDotReviewer_typekey: Reviewer
}

object Reviewer {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Visible: Boolean,
    WordDotReviewer_typekey: Reviewer
  ): Reviewer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Reviewer_typekey")(WordDotReviewer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reviewer]
  }
}

