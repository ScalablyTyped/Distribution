package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeightMarginLeft extends js.Object {
  var height: Double = js.native
  var marginLeft: Double = js.native
  var width: Double = js.native
}

object HeightMarginLeft {
  @scala.inline
  def apply(height: Double, marginLeft: Double, width: Double): HeightMarginLeft = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightMarginLeft]
  }
  @scala.inline
  implicit class HeightMarginLeftOps[Self <: HeightMarginLeft] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

