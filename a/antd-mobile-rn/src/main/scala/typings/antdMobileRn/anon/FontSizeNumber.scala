package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSizeNumber extends js.Object {
  var fontSize: Double = js.native
}

object FontSizeNumber {
  @scala.inline
  def apply(fontSize: Double): FontSizeNumber = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeNumber]
  }
  @scala.inline
  implicit class FontSizeNumberOps[Self <: FontSizeNumber] (val x: Self) extends AnyVal {
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
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
  }
  
}

