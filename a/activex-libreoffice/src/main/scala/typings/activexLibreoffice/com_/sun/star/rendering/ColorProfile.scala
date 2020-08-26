package typings.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorProfile extends js.Object {
  var dummy: Double = js.native
}

object ColorProfile {
  @scala.inline
  def apply(dummy: Double): ColorProfile = {
    val __obj = js.Dynamic.literal(dummy = dummy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProfile]
  }
  @scala.inline
  implicit class ColorProfileOps[Self <: ColorProfile] (val x: Self) extends AnyVal {
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
    def setDummy(value: Double): Self = this.set("dummy", value.asInstanceOf[js.Any])
  }
  
}

