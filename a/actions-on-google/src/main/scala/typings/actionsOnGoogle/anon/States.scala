package typings.actionsOnGoogle.anon

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait States extends js.Object {
  var states: ApiClientObjectMap[_] = js.native
}

object States {
  @scala.inline
  def apply(states: ApiClientObjectMap[_]): States = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[States]
  }
  @scala.inline
  implicit class StatesOps[Self <: States] (val x: Self) extends AnyVal {
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
    def setStates(value: ApiClientObjectMap[_]): Self = this.set("states", value.asInstanceOf[js.Any])
  }
  
}

