package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderTopRightRadius extends js.Object {
  var borderBottomRightRadius: Double = js.native
  var borderTopRightRadius: Double = js.native
}

object BorderTopRightRadius {
  @scala.inline
  def apply(borderBottomRightRadius: Double, borderTopRightRadius: Double): BorderTopRightRadius = {
    val __obj = js.Dynamic.literal(borderBottomRightRadius = borderBottomRightRadius.asInstanceOf[js.Any], borderTopRightRadius = borderTopRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopRightRadius]
  }
  @scala.inline
  implicit class BorderTopRightRadiusOps[Self <: BorderTopRightRadius] (val x: Self) extends AnyVal {
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
    def setBorderBottomRightRadius(value: Double): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderTopRightRadius(value: Double): Self = this.set("borderTopRightRadius", value.asInstanceOf[js.Any])
  }
  
}

