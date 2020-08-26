package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColorStringBorderColorString extends js.Object {
  var backgroundColor: String = js.native
  var borderColor: String = js.native
}

object BackgroundColorStringBorderColorString {
  @scala.inline
  def apply(backgroundColor: String, borderColor: String): BackgroundColorStringBorderColorString = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorStringBorderColorString]
  }
  @scala.inline
  implicit class BackgroundColorStringBorderColorStringOps[Self <: BackgroundColorStringBorderColorString] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
  }
  
}

