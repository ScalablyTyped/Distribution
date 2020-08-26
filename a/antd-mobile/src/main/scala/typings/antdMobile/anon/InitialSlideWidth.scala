package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialSlideWidth extends js.Object {
  var initialSlideWidth: Double = js.native
}

object InitialSlideWidth {
  @scala.inline
  def apply(initialSlideWidth: Double): InitialSlideWidth = {
    val __obj = js.Dynamic.literal(initialSlideWidth = initialSlideWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialSlideWidth]
  }
  @scala.inline
  implicit class InitialSlideWidthOps[Self <: InitialSlideWidth] (val x: Self) extends AnyVal {
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
    def setInitialSlideWidth(value: Double): Self = this.set("initialSlideWidth", value.asInstanceOf[js.Any])
  }
  
}

