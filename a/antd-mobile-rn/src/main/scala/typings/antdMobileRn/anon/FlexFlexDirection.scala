package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexFlexDirection extends js.Object {
  var flex: Double = js.native
  var flexDirection: String = js.native
}

object FlexFlexDirection {
  @scala.inline
  def apply(flex: Double, flexDirection: String): FlexFlexDirection = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexFlexDirection]
  }
  @scala.inline
  implicit class FlexFlexDirectionOps[Self <: FlexFlexDirection] (val x: Self) extends AnyVal {
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
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexDirection(value: String): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
  }
  
}

