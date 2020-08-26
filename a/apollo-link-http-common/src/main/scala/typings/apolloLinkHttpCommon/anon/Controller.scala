package typings.apolloLinkHttpCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controller extends js.Object {
  var controller: js.Any = js.native
  var signal: js.Any = js.native
}

object Controller {
  @scala.inline
  def apply(controller: js.Any, signal: js.Any): Controller = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
  @scala.inline
  implicit class ControllerOps[Self <: Controller] (val x: Self) extends AnyVal {
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
    def setController(value: js.Any): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignal(value: js.Any): Self = this.set("signal", value.asInstanceOf[js.Any])
  }
  
}

