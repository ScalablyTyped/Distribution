package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarTintColor extends js.Object {
  var barTintColor: String = js.native
  var tintColor: String = js.native
  var unselectedTintColor: String = js.native
}

object BarTintColor {
  @scala.inline
  def apply(barTintColor: String, tintColor: String, unselectedTintColor: String): BarTintColor = {
    val __obj = js.Dynamic.literal(barTintColor = barTintColor.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], unselectedTintColor = unselectedTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarTintColor]
  }
  @scala.inline
  implicit class BarTintColorOps[Self <: BarTintColor] (val x: Self) extends AnyVal {
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
    def setBarTintColor(value: String): Self = this.set("barTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnselectedTintColor(value: String): Self = this.set("unselectedTintColor", value.asInstanceOf[js.Any])
  }
  
}

