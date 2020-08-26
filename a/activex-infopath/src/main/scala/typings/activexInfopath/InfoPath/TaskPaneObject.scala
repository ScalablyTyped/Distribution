package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskPaneObject extends js.Object {
  @JSName("InfoPath.TaskPaneObject_typekey")
  var InfoPathDotTaskPaneObject_typekey: TaskPaneObject = js.native
  val Type: XdTaskPaneType = js.native
  var Visible: Boolean = js.native
}

object TaskPaneObject {
  @scala.inline
  def apply(InfoPathDotTaskPaneObject_typekey: TaskPaneObject, Type: XdTaskPaneType, Visible: Boolean): TaskPaneObject = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.TaskPaneObject_typekey")(InfoPathDotTaskPaneObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPaneObject]
  }
  @scala.inline
  implicit class TaskPaneObjectOps[Self <: TaskPaneObject] (val x: Self) extends AnyVal {
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
    def setInfoPathDotTaskPaneObject_typekey(value: TaskPaneObject): Self = this.set("InfoPath.TaskPaneObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: XdTaskPaneType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
  
}

