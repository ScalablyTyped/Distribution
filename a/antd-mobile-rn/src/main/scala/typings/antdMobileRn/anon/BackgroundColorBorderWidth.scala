package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColorBorderWidth extends js.Object {
  var backgroundColor: String = js.native
  var borderWidth: Double = js.native
}

object BackgroundColorBorderWidth {
  @scala.inline
  def apply(backgroundColor: String, borderWidth: Double): BackgroundColorBorderWidth = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorBorderWidth]
  }
  @scala.inline
  implicit class BackgroundColorBorderWidthOps[Self <: BackgroundColorBorderWidth] (val x: Self) extends AnyVal {
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
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
  }
  
}

