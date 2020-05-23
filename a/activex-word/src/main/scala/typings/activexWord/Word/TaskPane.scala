package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskPane extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Parent: js.Any
  var Visible: Boolean
  @JSName("Word.TaskPane_typekey")
  var WordDotTaskPane_typekey: TaskPane
}

object TaskPane {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Visible: Boolean,
    WordDotTaskPane_typekey: TaskPane
  ): TaskPane = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TaskPane_typekey")(WordDotTaskPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPane]
  }
}

