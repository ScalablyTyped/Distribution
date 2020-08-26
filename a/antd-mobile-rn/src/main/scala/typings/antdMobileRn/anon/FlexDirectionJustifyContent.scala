package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexDirectionJustifyContent extends js.Object {
  var flexDirection: String = js.native
  var justifyContent: String = js.native
}

object FlexDirectionJustifyContent {
  @scala.inline
  def apply(flexDirection: String, justifyContent: String): FlexDirectionJustifyContent = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionJustifyContent]
  }
  @scala.inline
  implicit class FlexDirectionJustifyContentOps[Self <: FlexDirectionJustifyContent] (val x: Self) extends AnyVal {
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
    def setJustifyContent(value: String): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
  }
  
}

