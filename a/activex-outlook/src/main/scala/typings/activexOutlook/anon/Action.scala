package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  val Action: js.Any = js.native
  var Cancel: Boolean = js.native
  val Response: js.Any = js.native
}

object Action {
  @scala.inline
  def apply(Action: js.Any, Cancel: Boolean, Response: js.Any): Action = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
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
    def setAction(value: js.Any): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: js.Any): Self = this.set("Response", value.asInstanceOf[js.Any])
  }
  
}

