package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexJustifyContent extends js.Object {
  var alignItems: String = js.native
  var flex: Double = js.native
  var justifyContent: String = js.native
}

object FlexJustifyContent {
  @scala.inline
  def apply(alignItems: String, flex: Double, justifyContent: String): FlexJustifyContent = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexJustifyContent]
  }
  @scala.inline
  implicit class FlexJustifyContentOps[Self <: FlexJustifyContent] (val x: Self) extends AnyVal {
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
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def setJustifyContent(value: String): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
  }
  
}

