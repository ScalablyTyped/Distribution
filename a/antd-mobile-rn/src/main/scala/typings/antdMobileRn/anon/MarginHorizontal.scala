package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginHorizontal extends js.Object {
  var marginHorizontal: Double = js.native
  var marginVertical: Double = js.native
}

object MarginHorizontal {
  @scala.inline
  def apply(marginHorizontal: Double, marginVertical: Double): MarginHorizontal = {
    val __obj = js.Dynamic.literal(marginHorizontal = marginHorizontal.asInstanceOf[js.Any], marginVertical = marginVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginHorizontal]
  }
  @scala.inline
  implicit class MarginHorizontalOps[Self <: MarginHorizontal] (val x: Self) extends AnyVal {
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
    def setMarginHorizontal(value: Double): Self = this.set("marginHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginVertical(value: Double): Self = this.set("marginVertical", value.asInstanceOf[js.Any])
  }
  
}

