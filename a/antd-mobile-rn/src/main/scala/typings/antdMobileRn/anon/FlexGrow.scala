package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexGrow extends js.Object {
  var alignItems: String = js.native
  var backgroundColor: String = js.native
  var flexDirection: String = js.native
  var flexGrow: Double = js.native
  var paddingLeft: Double = js.native
}

object FlexGrow {
  @scala.inline
  def apply(
    alignItems: String,
    backgroundColor: String,
    flexDirection: String,
    flexGrow: Double,
    paddingLeft: Double
  ): FlexGrow = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexGrow]
  }
  @scala.inline
  implicit class FlexGrowOps[Self <: FlexGrow] (val x: Self) extends AnyVal {
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
    def setAlignItems(value: String): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexDirection(value: String): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexGrow(value: Double): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
  }
  
}

