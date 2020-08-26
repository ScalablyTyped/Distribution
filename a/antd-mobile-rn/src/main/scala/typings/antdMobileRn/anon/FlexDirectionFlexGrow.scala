package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexDirectionFlexGrow extends js.Object {
  var flexDirection: String = js.native
  var flexGrow: Double = js.native
}

object FlexDirectionFlexGrow {
  @scala.inline
  def apply(flexDirection: String, flexGrow: Double): FlexDirectionFlexGrow = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionFlexGrow]
  }
  @scala.inline
  implicit class FlexDirectionFlexGrowOps[Self <: FlexDirectionFlexGrow] (val x: Self) extends AnyVal {
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
    def setFlexGrow(value: Double): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
  }
  
}

