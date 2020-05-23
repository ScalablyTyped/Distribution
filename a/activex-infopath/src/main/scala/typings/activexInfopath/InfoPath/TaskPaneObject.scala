package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskPaneObject extends js.Object {
  @JSName("InfoPath.TaskPaneObject_typekey")
  var InfoPathDotTaskPaneObject_typekey: TaskPaneObject
  val Type: XdTaskPaneType
  var Visible: Boolean
}

object TaskPaneObject {
  @scala.inline
  def apply(InfoPathDotTaskPaneObject_typekey: TaskPaneObject, Type: XdTaskPaneType, Visible: Boolean): TaskPaneObject = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.TaskPaneObject_typekey")(InfoPathDotTaskPaneObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPaneObject]
  }
}

