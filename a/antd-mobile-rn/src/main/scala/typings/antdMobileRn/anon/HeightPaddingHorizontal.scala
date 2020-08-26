package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeightPaddingHorizontal extends js.Object {
  var fontSize: Double = js.native
  var height: Double = js.native
  var paddingHorizontal: Double = js.native
  var paddingVertical: Double = js.native
}

object HeightPaddingHorizontal {
  @scala.inline
  def apply(fontSize: Double, height: Double, paddingHorizontal: Double, paddingVertical: Double): HeightPaddingHorizontal = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightPaddingHorizontal]
  }
  @scala.inline
  implicit class HeightPaddingHorizontalOps[Self <: HeightPaddingHorizontal] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = this.set("paddingHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingVertical(value: Double): Self = this.set("paddingVertical", value.asInstanceOf[js.Any])
  }
  
}

