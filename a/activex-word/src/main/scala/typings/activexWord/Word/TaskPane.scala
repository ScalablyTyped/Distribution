package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskPane extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var Visible: Boolean = js.native
  @JSName("Word.TaskPane_typekey")
  var WordDotTaskPane_typekey: TaskPane = js.native
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
  @scala.inline
  implicit class TaskPaneOps[Self <: TaskPane] (val x: Self) extends AnyVal {
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotTaskPane_typekey(value: TaskPane): Self = this.set("Word.TaskPane_typekey", value.asInstanceOf[js.Any])
  }
  
}

