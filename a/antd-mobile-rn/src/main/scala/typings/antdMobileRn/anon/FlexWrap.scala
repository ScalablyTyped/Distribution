package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexWrap extends js.Object {
  var flexDirection: String = js.native
  var flexWrap: String = js.native
}

object FlexWrap {
  @scala.inline
  def apply(flexDirection: String, flexWrap: String): FlexWrap = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], flexWrap = flexWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexWrap]
  }
  @scala.inline
  implicit class FlexWrapOps[Self <: FlexWrap] (val x: Self) extends AnyVal {
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
    def setFlexDirection(value: String): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexWrap(value: String): Self = this.set("flexWrap", value.asInstanceOf[js.Any])
  }
  
}

