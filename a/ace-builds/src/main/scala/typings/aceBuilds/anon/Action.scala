package typings.aceBuilds.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  var action: String = js.native
  var data: typings.aceBuilds.mod.Ace.Fold = js.native
}

object Action {
  @scala.inline
  def apply(action: String, data: typings.aceBuilds.mod.Ace.Fold): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: typings.aceBuilds.mod.Ace.Fold): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

